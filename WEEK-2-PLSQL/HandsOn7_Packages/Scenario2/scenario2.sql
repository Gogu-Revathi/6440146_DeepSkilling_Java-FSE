-- Package Specification
CREATE OR REPLACE PACKAGE EmployeeManagement AS
  PROCEDURE HireEmployee(p_EID NUMBER, p_Name VARCHAR2, p_Position VARCHAR2,
                         p_Salary NUMBER, p_Dept VARCHAR2, p_HireDate DATE);
  PROCEDURE UpdateEmployee(p_EID NUMBER, p_Salary NUMBER, p_Dept VARCHAR2);
  FUNCTION GetAnnualSalary(p_EID NUMBER) RETURN NUMBER;
END EmployeeManagement;
/
-- Package Body
CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS

  PROCEDURE HireEmployee(p_EID NUMBER, p_Name VARCHAR2, p_Position VARCHAR2,
                         p_Salary NUMBER, p_Dept VARCHAR2, p_HireDate DATE) IS
  BEGIN
    INSERT INTO Employees(EmployeeID, Name, Position, Salary, Department, HireDate)
    VALUES(p_EID, p_Name, p_Position, p_Salary, p_Dept, p_HireDate);
  END;

  PROCEDURE UpdateEmployee(p_EID NUMBER, p_Salary NUMBER, p_Dept VARCHAR2) IS
  BEGIN
    UPDATE Employees
    SET Salary = p_Salary, Department = p_Dept
    WHERE EmployeeID = p_EID;
  END;

  FUNCTION GetAnnualSalary(p_EID NUMBER) RETURN NUMBER IS
    v_Salary NUMBER;
  BEGIN
    SELECT Salary INTO v_Salary FROM Employees WHERE EmployeeID = p_EID;
    RETURN v_Salary * 12;
  EXCEPTION
    WHEN NO_DATA_FOUND THEN
      RETURN NULL;
  END;
END EmployeeManagement;
/
