CREATE OR REPLACE PROCEDURE UpdateSalary(
  p_EmployeeID IN NUMBER,
  p_Percent IN NUMBER
) AS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_Percent / 100)
  WHERE EmployeeID = p_EmployeeID;

  IF SQL%ROWCOUNT = 0 THEN
    RAISE_APPLICATION_ERROR(-20002, 'Employee ID not found.');
  END IF;

  COMMIT;
EXCEPTION
  WHEN OTHERS THEN
    DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
    ROLLBACK;
END;
/
