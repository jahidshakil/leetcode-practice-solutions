# Write your MySQL query statement below
# SELECT firstName, lastName, city, state from Person
# LEFT JOIN Address ON Person.personId = Address.personId;

SELECT firstName, lastName, city, state from Address
RIGHT JOIN Person ON Person.personId = Address.personId;