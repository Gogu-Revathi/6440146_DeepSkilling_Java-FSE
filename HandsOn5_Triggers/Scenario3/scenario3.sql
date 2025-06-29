CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT ON Transactions
FOR EACH ROW
DECLARE
  v_Balance NUMBER;
BEGIN
  SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = :NEW.AccountID;

  IF :NEW.TransactionType = 'Withdrawal' AND :NEW.Amount > v_Balance THEN
    RAISE_APPLICATION_ERROR(-20004, 'Insufficient balance for withdrawal.');
  ELSIF :NEW.TransactionType = 'Deposit' AND :NEW.Amount <= 0 THEN
    RAISE_APPLICATION_ERROR(-20005, 'Deposit amount must be positive.');
  END IF;
END;
/
