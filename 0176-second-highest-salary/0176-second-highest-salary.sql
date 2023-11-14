# Write your MySQL query statement below
# SELECT DISTINCT salary AS SecondHighestSalary FROM Employee ORDER BY salary DESC LIMIT 1, 1;

select max(salary) as SecondHighestSalary from Employee where salary < (select max(salary) from Employee) ;