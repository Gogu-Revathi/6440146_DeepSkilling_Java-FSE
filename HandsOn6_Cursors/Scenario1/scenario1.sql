DECLARE
  CURSOR txn_cursor IS
    SELECT c.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
    FROM Customers c
    JOIN Accounts a ON c.CustomerID = a.CustomerID
    JOIN Transactions t ON a.AccountID = t.AccountID
    WHERE TRUNC(t.TransactionDate, 'MM') = TRUNC(SYSDATE, 'MM')
    ORDER BY c.CustomerID, t.TransactionDate;

  v_custID Customers.CustomerID%TYPE;
  v_name Customers.Name%TYPE;
  v_date DATE;
  v_amount NUMBER;
  v_type VARCHAR2(10);
BEGIN
  OPEN txn_cursor;
  LOOP
    FETCH txn_cursor INTO v_custID, v_name, v_date, v_amount, v_type;
    EXIT WHEN txn_cursor%NOTFOUND;
    DBMS_OUTPUT.PUT_LINE('Customer: ' || v_name || ' | Date: ' || v_date || 
                         ' | ' || v_type || ' | Amount: ' || v_amount);
  END LOOP;
  CLOSE txn_cursor;
END;
/
