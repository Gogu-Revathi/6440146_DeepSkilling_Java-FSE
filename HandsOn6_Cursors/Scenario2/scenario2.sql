DECLARE
  CURSOR acc_cursor IS
    SELECT AccountID, Balance FROM Accounts;

  v_accID Accounts.AccountID%TYPE;
  v_balance Accounts.Balance%TYPE;
  v_fee CONSTANT NUMBER := 100;
BEGIN
  OPEN acc_cursor;
  LOOP
    FETCH acc_cursor INTO v_accID, v_balance;
    EXIT WHEN acc_cursor%NOTFOUND;

    UPDATE Accounts
    SET Balance = Balance - v_fee,
        LastModified = SYSDATE
    WHERE AccountID = v_accID;
  END LOOP;
  CLOSE acc_cursor;
  COMMIT;
END;
/
