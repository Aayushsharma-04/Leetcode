# Write your MySQL query statement below
Select Max(salary) as SecondHighestSalary from Employee where salary < (Select Max(Salary) From Employee);