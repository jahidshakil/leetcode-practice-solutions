# Write your MySQL query statement below
 select EmployeeUNI.unique_id, Employees.name from Employees  left join EmployeeUNI on Employees.id = EmployeeUNI.id;
 
 
 
#  select 
# eu.unique_id as unique_id, e.name as name
# from Employees e left join EmployeeUNI eu on e.id = eu.id