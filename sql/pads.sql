SELECT concat(Name,'(',Substring(Occupation,1,1),')') as a FROM occupations ORDER BY a; 
SELECT concat('There are a total of ',count(Occupation),' ',lower(Occupation),'s.') FROM occupations GROUP BY Occupation ORDER BY count(Occupation) , Occupation; 



-- Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.
-- Note: Print NULL when there are no more names corresponding to an occupation.

-- After subquery 

    SELECT 
        CASE Occupation
            WHEN 'Doctor' THEN @docktorRowNum := @docktorRowNum + 1 
            WHEN 'Professor' THEN @professorRowNum := @professorRowNum + 1 
            WHEN 'Singer' THEN @singerRowNum := @singerRowNum + 1 
            WHEN 'Actor' THEN @actorRowNum := @actorRowNum + 1 
        END as row, 
        IF (Occupation = 'Doctor',Name,NULL) as Doctor , 
        IF (Occupation = 'Professor',Name,NULL) as Professor ,
        IF (Occupation = 'Singer',Name,NULL) as Singer , 
        IF (Occupation = 'Actor',Name,NULL) as Actor
    FROM OCCUPATIONS
    ORDER BY NAME  
-- RESULT WILL BE 
-- 1 Aamina NULL NULL NULL 
-- 1 NULL Ashley NULL NULL 
-- 2 NULL Belvet NULL NULL 
-- 3 NULL Britney NULL NULL 
-- 1 NULL NULL Christeen NULL 
-- 1 NULL NULL NULL Eve 
-- 2 NULL NULL Jane NULL 
-- 2 NULL NULL NULL Jennifer 
-- 3 NULL NULL Jenny NULL 
-- 2 Julia NULL NULL NULL 
-- 3 NULL NULL NULL Ketty 
-- 4 NULL NULL Kristeen NULL 
-- 4 NULL Maria NULL NULL 
-- 5 NULL Meera NULL NULL 
-- 6 NULL Naomi NULL NULL 
-- 3 Priya NULL NULL NULL 
-- 7 NULL Priyanka NULL NULL 
-- 4 NULL NULL NULL Samantha 

-- And group by row , find min 

SET @docktorRowNum = 0 , @professorRowNum = 0 , @singerRowNum = 0 , @actorRowNum = 0; 
SELECT MIN(Doctor) , MIN(Professor) , MIN(Singer), MIN(Actor)
FROM (
    SELECT 
        CASE Occupation
            WHEN 'Doctor' THEN @docktorRowNum := @docktorRowNum + 1 
            WHEN 'Professor' THEN @professorRowNum := @professorRowNum + 1 
            WHEN 'Singer' THEN @singerRowNum := @singerRowNum + 1 
            WHEN 'Actor' THEN @actorRowNum := @actorRowNum + 1 
        END as row, 
        IF (Occupation = 'Doctor',Name,NULL) as Doctor , 
        IF (Occupation = 'Professor',Name,NULL) as Professor ,
        IF (Occupation = 'Singer',Name,NULL) as Singer , 
        IF (Occupation = 'Actor',Name,NULL) as Actor
    FROM OCCUPATIONS
    ORDER BY NAME  
) tmp 
GROUP BY row ; 
    
-- RESULT WILL BE 
-- Aamina Ashley Christeen Eve 
-- Julia Belvet Jane Jennifer 
-- Priya Britney Jenny Ketty 
-- NULL Maria Kristeen Samantha 
-- NULL Meera NULL NULL 
-- NULL Naomi NULL NULL 
-- NULL Priyanka NULL NULL 