package com.cognizant.spring_learn.controller;

import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START - authenticate()");
        LOGGER.debug("Authorization header: {}", authHeader);

        String user = extractUsername(authHeader);
        String token = generateJwt(user);

        Map<String, String> response = new HashMap<>();
        response.put("token", token);

        LOGGER.info("END - authenticate()");
        return response;
    }

    private String extractUsername(String authHeader) {
        LOGGER.info("START - extractUsername()");
        // Remove "Basic " prefix and decode credentials
        String encodedCredentials = authHeader.substring("Basic ".length());
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);
        String decodedCredentials = new String(decodedBytes);
        LOGGER.debug("Decoded credentials: {}", decodedCredentials);

        String username = decodedCredentials.split(":")[0];
        LOGGER.info("Extracted username: {}", username);
        return username;
    }

    private String generateJwt(String user) {
        LOGGER.info("START - generateJwt()");

        // Use a secure 32+ byte key
        String secret = "my-super-secret-key-for-jwt-token-signing-1234"; // 44 characters = 352 bits
        SecretKey key = Keys.hmacShaKeyFor(secret.getBytes());

        String token = Jwts.builder()
                .setSubject(user)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000)) // 20 mins
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();

        LOGGER.debug("Generated JWT: {}", token);
        return token;
    }
}
