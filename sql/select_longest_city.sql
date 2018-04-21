-- Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

SELECT CITY,length(CITY) FROM STATION ORDER BY length(CITY) DESC,CITY DESC LIMIT 1;
SELECT CITY,length(CITY) FROM STATION ORDER BY length(CITY) ASC,CITY ASC LIMIT 1;

-- Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE LEFT(CITY , 1) in ('a','e','i','o','u') ;
-- Query the list of CITY names ending with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) in ('a','e','i','o','u')

-- Query the list of CITY names from STATION which have vowels (i.e., a, e, i, o, and u) as both their first and last characters. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) in ('a','e','i','o','u') AND LEFT(CITY , 1) in ('a','e','i','o','u'); 

-- Query the list of CITY names from STATION that do not start with vowels. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE LEFT(CITY , 1) not in ('a','e','i','o','u'); 

-- Query the list of CITY names from STATION that do not end with vowels. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) not in ('a','e','i','o','u');

-- Query the list of CITY names from STATION that either do not start with vowels or do not end with vowels. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) not in ('a','e','i','o','u') or LEFT(CITY , 1) not in ('a','e','i','o','u'); 

-- Query the list of CITY names from STATION that do not start with vowels and do not end with vowels. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) not in ('a','e','i','o','u') and LEFT(CITY , 1) not in ('a','e','i','o','u'); 


