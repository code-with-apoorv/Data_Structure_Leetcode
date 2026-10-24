# Write your MySQL query statement below
SELECT contest_id,Round((Count(distinct user_id))*100/(SELECT Count(User_id) FROM Users),2)
AS percentage
FROM Register
GROUP BY contest_id
ORDER BY percentage DESC, contest_id;