
select * from CITY where COUNTRYCODE='USA' and POPULATION > 100000 

-- Query the names of all American cities in CITY with populations larger than 120000. The CountryCode for America is USA.

select name from CITY where COUNTRYCODE='USA' and POPULATION > 120000 ;

-- Query all columns (attributes) for every row in the CITY table.
select * from CITY; 
-- Query all columns for a city in CITY with the ID 1661.
select * from CITY where ID=1661 

-- Query all attributes of every Japanese city in the CITY table. The COUNTRYCODE for Japan is JPN.
select * from CITY where COUNTRYCODE='JPN' 

-- Query the names of all the Japanese cities in the CITY table. The COUNTRYCODE for Japan is JPN.
select NAME from CITY where COUNTRYCODE='JPN' 

-- Query a list of CITY and STATE from the STATION table.
select CITY,STATE from STATION

-- Query a list of CITY names from STATION with even ID numbers only. You may print the results in any order, but must exclude duplicates from your answer.
select DISTINCT CITY from STATION where ID % 2 = 0 
