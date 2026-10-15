select e.name as Employee
from Employee e
inner join Employee e1
on e1.id=e.managerId
where e.salary>e1.salary;