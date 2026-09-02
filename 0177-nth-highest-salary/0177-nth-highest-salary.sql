CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
Declare M INT;
Set M = N -1;
  RETURN (
     Select Distinct salary 
     from employee
     order by salary desc
     Limit 1 Offset M

  );
END