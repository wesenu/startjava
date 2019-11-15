\c jaegers

CREATE TABLE Jaegers(
	id SERIAL PRIMARY KEY,
	modelName TEXT,
	mark TEXT,
	height REAL,
	weight REAL,
	status TEXT,
	origin TEXT,
	launch DATE,
	kaijuKill INT
	);

INSERT INTO jaegers(modelName, mark, height, weight, status, origin, launch, kaijuKill)
	VALUES
		('Gipsy Danger',       'Mark-3', '260', '1.980', 'Destroyed',   'United States of America', 'July 10, 2017',     '9' ),
		('Striker Eureka',     'Mark-5', '250', '1.850', 'Destroyed',   'Australia',                'November 2, 2019',  '11'),
		('Cherno Alpha',       'Mark-1', '280', '2.412', 'Destroyed',   'Russia',                   'January 01 2015',   '6' ),
		('Gipsy Avenger',      'Mark-6', '268', '2.004', 'Destroyed',   'Norway',                   'January 12, 2034',  '1' ),
		('Obsidian Fury',      'Mark-4', '247', '2.120', 'Destroyed',   'France',                   'February, 1, 2020', '4' ),
		('Coyote Tango',       'Mark-1', '280', '2.312', 'Destroyed',   'Japan',                    'December 30, 2015', '2' ),
		('Brawler Yukon',      'Mark-1', '233', '2.036', 'Destroyed',   'United States of America', 'July 10, 2017',     '2' ),
		('Experimental Boom',  'Mark-3', '350', '3.211', 'Functioning', 'Russia',                   'March 10, 2018',    '2' ),
		('Potato Shot',        'Mark-2', '370', '3.515', 'Functioning', 'Republic of Belarus',      'October 10, 2019',  '2' ),
		('Onion Crush',        'Mark-1', '330', '2.910', 'Functioning', 'Republic of Belarus',      'November 14, 2017', '2' );