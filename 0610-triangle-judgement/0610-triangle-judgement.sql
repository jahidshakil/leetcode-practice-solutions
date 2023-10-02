# Write your MySQL query statement below
# SELECT * , IF(x+y>z AND y+z>x AND x+z>y , "Yes", "No") as triangle
# FROM Triangle; 


SELECT x, y, z, (CASE WHEN x + y > z and y + z > x and x + z > y THEN 'Yes' Else 'No' END) AS triangle
FROM Triangle