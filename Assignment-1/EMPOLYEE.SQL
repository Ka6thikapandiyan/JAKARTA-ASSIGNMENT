CREATE TABLE EMPLOYEE (
    Emp_id INT PRIMARY KEY,
    Emp_Name VARCHAR(100),
    Emp_Address VARCHAR(255),
    Emp_designation VARCHAR(100),
    Emp_department VARCHAR(100),
    Emp_Phone_No VARCHAR(20),
    Emp_BasicPay DECIMAL(10, 2),
    Emp_HRA DECIMAL(10, 2),
    Emp_DA DECIMAL(10, 2),
    Emp_TA DECIMAL(10, 2),
    Emp_Salary DECIMAL(10, 2)
);
UPDATE EMPLOYEE
SET Emp_HRA = Emp_BasicPay * 0.10,
    Emp_DA = Emp_BasicPay * 0.02,
    Emp_TA = Emp_BasicPay * 0.02,
    Emp_Salary = Emp_BasicPay + Emp_HRA + Emp_DA + Emp_TA;
SELECT Emp_Name, Emp_department, Emp_Salary
FROM EMPLOYEE
WHERE Emp_Salary = (
    SELECT MAX(Emp_Salary)
    FROM EMPLOYEE
    WHERE Emp_department = EMPLOYEE.Emp_department
);
