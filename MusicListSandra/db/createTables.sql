CREATE TABLE db.User
(
	userID			integer	not null PRIMARY KEY AUTOINCREMENT,
	firtsName		varchar(50)	 not null,
	lastName	varchar(50)  not null,
	email		varchar(100) null
	
);

CREATE TABLE db.UserMusic
(
	userMusicID		integer	not null PRIMARY KEY AUTOINCREMENT,
	userID			integer not null,
	listName		varchar(255) null,
	description		TEXT null, -- description	of	the	list
	theme			varchar(255) null,
	motivation		varchar(255) null, -- explaining	their	overall	motivation	of	creating	this	list
	significance 	varchar(255) null, -- its	significance	to	them	or	its	musical	significance	
	FOREIGN KEY (userID) REFERENCES User(userID) --Foreign key from user table
);

CREATE TABLE db.Music
(
	musicID 			integer	not null PRIMARY KEY AUTOINCREMENT,
	userMusciId			integer not null,
	songName			varchar(255) null,
	artist				varchar(150) null,
	yearPublished		datetime,
	songUrl				varchar(255) null,
	description 		TEXT null,-- description	regarding	the	song
	why 				varchar(255) null,-- why	this	song	is	in	the	list reflecting	back	to	the	theme	of	the	list.	
	parentAnotation		varchar(255) null,
	FOREIGN KEY (userMusciId) REFERENCES UserMusic(userMusciId)	--foreign key from UserMusic table
);