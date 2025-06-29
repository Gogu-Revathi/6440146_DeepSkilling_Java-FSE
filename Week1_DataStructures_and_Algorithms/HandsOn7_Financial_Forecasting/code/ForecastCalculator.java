public class ForecastCalculator {

    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) return principal;
        return (1 + rate) * calculateFutureValue(principal, rate, years - 1);
    }

    public static double calculateFutureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];
        memo[years] = (1 + rate) * calculateFutureValueMemo(principal, rate, years - 1, memo);
        return memo[years];
    }
}
