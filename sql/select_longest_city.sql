-- Query the two cities in STATION with the shortest and longest CITY names, as well as their respective lengths (i.e.: number of characters in the name). If there is more than one smallest or largest city, choose the one that comes first when ordered alphabetically.

SELECT CITY,length(CITY) FROM STATION ORDER BY length(CITY) DESC,CITY DESC LIMIT 1;
SELECT CITY,length(CITY) FROM STATION ORDER BY length(CITY) ASC,CITY ASC LIMIT 1;

-- Query the list of CITY names starting with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE LEFT(CITY , 1) in ('a','e','i','o','u') ;
-- Query the list of CITY names ending with vowels (i.e., a, e, i, o, or u) from STATION. Your result cannot contain duplicates.
SELECT DISTINCT CITY FROM STATION WHERE RIGHT(CITY,1) in ('a','e','i','o','u')

