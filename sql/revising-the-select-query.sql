
select * from CITY where COUNTRYCODE='USA' and POPULATION > 100000 

-- Query the names of all American cities in CITY with populations larger than 120000. The CountryCode for America is USA.

select name from CITY where COUNTRYCODE='USA' and POPULATION > 120000 ;

-- Query all columns (attributes) for every row in the CITY table.


select * from CITY; 