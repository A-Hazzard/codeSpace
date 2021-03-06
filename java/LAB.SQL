SELECT DRIVER#, DNAME FROM DRIVER WHERE DSALARY < 1800;
SELECT CNAME FROM CLEANER WHERE CNAME LIKE 'J%';
SELECT * FROM DRIVER WHERE DSALARY BETWEEN 2000 AND 4000;
SELECT REGISTRATION#, BMODEL FROM BUS WHERE VT# = 2 AND NOT DEPOT# = 101;
SELECT * FROM BUS WHERE BMODEL LIKE 'Volvo%' OR BMODEL LIKE 'Mercedes%';
SELECT DISTINCT DEPOT# FROM BUS;

SELECT MAX(DSALARY) AS MAXSALARY,
MIN(DSALARY) AS MINSALARY,
AVG(DSALARY) AS AVERAGE_SALARY FROM DRIVER;

SELECT i.DEPOT_NAME, SUM(o.DSALARY)
FROM DRIVER o
INNER JOIN DEPOT i
ON o.DEPOT# = i.DEPOT#
GROUP BY DEPOT_NAME;

SELECT DRIVER#, DNAME, (DSALARY * 12.10) AS YEARLY_BONUS FROM DRIVER;

SELECT Driver#, Dname
FROM Driver
WHERE Depot# IS NULL;//TODO 12

SELECT o.Dname, o.Driver#, i.Route#, i.Route_Descrip
FROM Driver o
INNER JOIN Route i
ON o.Depot# = i.Depot#
ORDER BY Driver#;

SELECT o.Driver#, j.Dname,  i.V_Description
FROM Training o
INNER JOIN Vehicle_Type i
ON (o.VT# = i.VT#)
INNER JOIN Driver j
ON (o.Driver# = j.Driver#);

SELECT * FROM DRIVER;
SELECT * FROM DEPOT;

