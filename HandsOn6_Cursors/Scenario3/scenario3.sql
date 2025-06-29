DECLARE
  CURSOR loan_cursor IS
    SELECT LoanID, InterestRate FROM Loans;

  v_loanID Loans.LoanID%TYPE;
  v_rate Loans.InterestRate%TYPE;
BEGIN
  OPEN loan_cursor;
  LOOP
    FETCH loan_cursor INTO v_loanID, v_rate;
    EXIT WHEN loan_cursor%NOTFOUND;

    UPDATE Loans
    SET InterestRate = v_rate + 0.5
    WHERE LoanID = v_loanID;
  END LOOP;
  CLOSE loan_cursor;
  COMMIT;
END;
/
