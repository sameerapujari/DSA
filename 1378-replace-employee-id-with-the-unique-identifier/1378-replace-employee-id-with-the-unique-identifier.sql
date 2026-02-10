# Write your MySQL query statement below
select eu.unique_id, e.name 
from EmployeeUNI AS eu RIGHT JOIN Employees as e ON eu.id=e.id;