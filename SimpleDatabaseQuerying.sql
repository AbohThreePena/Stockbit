select user.ID, user.UserName, x.UserName
from USER user
left join (select id, UserName from USER) x on user.ID = x.ID;