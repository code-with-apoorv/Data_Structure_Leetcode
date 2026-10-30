# Write your MySQL query statement below
SELECT class 
From Courses
Group by class
Having count(student) >= 5;