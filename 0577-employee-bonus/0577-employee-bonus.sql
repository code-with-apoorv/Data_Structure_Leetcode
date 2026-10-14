# Write your MySQL query statement below
SELECT e.name,
       b.bonus 
       FROM Employee e
       LEFT JOIN bonus b
       ON e.empId = b.empId
       Where bonus is NULL or b.bonus < 1000;
