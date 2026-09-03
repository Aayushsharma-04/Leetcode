# Write your MySQL query statement below
select  Department.name as Department, Employee.name as Employee,Employee.salary as Salary  from employee
inner join department 
on employee.departmentId = department.id
WHERE (employee.departmentId, employee.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);
