CREATE OR REPLACE PROCEDURE TransferFunds(
  p_FromAccountID IN NUMBER,
  p_ToAccountID IN NUMBER,
  p_Amount IN NUMBER
) AS
  v_FromBalance NUMBER;
BEGIN
  SELECT Balance INTO v_FromBalance FROM Accounts WHERE AccountID = p_FromAccountID;

  IF v_FromBalance < p_Amount THEN
    RAISE_APPLICATION_ERROR(-20003, 'Insufficient balance.');
  END IF;

  UPDATE Accounts SET Balance = Balance - p_Amount WHERE AccountID = p_FromAccountID;
  UPDATE Accounts SET Balance = Balance + p_Amount WHERE AccountID = p_ToAccountID;

  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/
