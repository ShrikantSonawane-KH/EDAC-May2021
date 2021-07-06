-- PL Assignment-3 ----------------------------

show databases;
use sqlassignment1;
show tables;


CREATE table PLAssignment3(

a int,
b int,
str1 varchar(20),
str2 varchar(20)
);
select * from PLAssignment3;
-- --------------------------------------------------------------------------------------------------------------------------------------------
/*
1. Write a program containing a loop that iterates from 1 to 1000 using a variable I, 
which is incremented each time around the loop. The program should output the 
value of I every hundred iterations (i.e., the output should be 100, 200, etc.). 
*/

delimiter //
create procedure loop1()
begin 
		declare I int default 1;
        declare cnt int default 1; 
        while I < 1001 do
        
			if(cnt = 100) then
				insert into PLAssignment3 values (i,0,'','');
				set cnt=0;
            end if;
			set cnt=cnt+1;
			set i=i+1;
		end while;
end; //
delimiter ;

call loop1();

select * from PLAssignment3;

delete from PLAssignment3;
-- ------------------------------------------------------------------------------------------------------------------------------------------------

/* 
2. Write a program that examines all the numbers from 1 to 999, displaying all those 
for which the sum of the cubes of each digits is equal the number itself. 
*/

delimiter //
create procedure Armstrong()
begin 
		declare I int default 1;
        declare temp int;
        declare cnt int default 0; 
        
         while I < 10 do
			set temp = i;
			while temp != 0 do
				set temp = temp/10;
                set cnt=cnt+1;
            end while;
            
            insert into PLAssignment3 values (i,cnt,'','');
            set cnt=0;
            set i =i+1;
            
		end while;
end; //
delimiter ;

call Armstrong();

select * from PLAssignment3;

drop procedure Armstrong;

delete from PLAssignment3;

/* 
3. Write a program that Selects from any table a minimum and maximum value for a 
radius, along with an increment factor, and generates a series of radii by repeatedly 
adding the increment to the minimum until the maximum is reached. For each value 
of the radius, compute and display the circumference, area, and volume of the 
sphere. (Be sure to include both the maximum and the minimum values.). 
 
4. A palindrome is a word that is spelled the same forward and backward, such as 
level, radar, etc. Write a program to Selects from any table a five letter word and 
determine whether it is a palindrome. 
 
5. Modify the above program to Select from any table a variable length word. This 
requires determining how many characters are read in. 
*/