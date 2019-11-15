SELECT * FROM jaegers ORDER BY mark;

SELECT * FROM jaegers WHERE status = 'Destroyed' ORDER BY mark;

SELECT * FROM jaegers WHERE mark IN ('Mark-1','Mark-6') ORDER BY mark;

SELECT * FROM jaegers WHERE launch = (SELECT MIN(launch) FROM jaegers);

SELECT * FROM jaegers WHERE kaijuKill = (SELECT MAX(kaijuKill) FROM jaegers);

SELECT * FROM jaegers WHERE kaijuKill = (SELECT MIN(kaijuKill) FROM jaegers);

SELECT AVG(weight) FROM jaegers;

UPDATE jaegers SET kaijuKill = kaijuKill + 1 WHERE status != 'Destroyed';

DELETE FROM jaegers WHERE status = 'Destroyed';

SELECT * FROM jaegers ORDER BY mark;