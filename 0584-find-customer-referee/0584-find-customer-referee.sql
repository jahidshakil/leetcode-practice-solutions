# Write your MySQL query statement below

 # SELECT name FROM Customer WHERE id NOT IN (SELECT id FROM Customer WHERE referee_id =2);


select name from customer where id not in (select id from Customer where referee_id =2);
