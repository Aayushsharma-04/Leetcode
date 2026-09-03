# Write your MySQL query statement below
select email from person as Email where email is not null 
group by email 
having count(*) >1;