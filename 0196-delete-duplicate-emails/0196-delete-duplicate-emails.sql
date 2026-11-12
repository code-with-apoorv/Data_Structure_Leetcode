# Write your MySQL query statement below
DELETE P2
FROM Person P1 INNER JOIN Person P2
WHERE P1.email = P2.email
AND P1.id < P2.id;