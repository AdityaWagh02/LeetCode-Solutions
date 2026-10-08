select max(sub.ans) as num
from (select num as ans from MyNumbers group by num having count(num)=1 )as sub;