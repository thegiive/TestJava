SELECT concat(Name,'(',Substring(Occupation,1,1),')') as a FROM occupations ORDER BY a; 
SELECT concat('There are a total of ',count(Occupation),' ',lower(Occupation),'s.') FROM occupations GROUP BY Occupation ORDER BY count(Occupation) , Occupation; 

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
    
