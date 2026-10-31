# Write your MySQL query statement below
SELECT MAX(num) AS num
From MyNumbers
WHERE num IN(
    SELECT num
    FROM MyNumbers
    GROUP by num
    HAving COUNT(num) = 1
)