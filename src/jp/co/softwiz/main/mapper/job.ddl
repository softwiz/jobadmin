DROP TABLE IF EXISTS T_AREA_INFO;
DROP TABLE IF EXISTS T_COMPANY_PAID_SERVICE_HISTORY_INFO;
DROP TABLE IF EXISTS T_COMPANY_PAID_SERVICE_INFO;
DROP TABLE IF EXISTS T_BOARD_FILE_INFO;
DROP TABLE IF EXISTS T_BOARD_INFO;
DROP TABLE IF EXISTS T_BOARD_MASTER_INFO;
DROP TABLE IF EXISTS T_NEWS_INFO;
DROP TABLE IF EXISTS T_TOIAWASE_INFO;
DROP TABLE IF EXISTS T_COMPANY_INFO;
DROP TABLE IF EXISTS T_CATE_SUB;
DROP TABLE IF EXISTS T_CATE_MAIN;
DROP TABLE IF EXISTS T_TEST_INFO;
DROP TABLE IF EXISTS T_LOGIN_HIST;
DROP TABLE IF EXISTS T_LOGIN_INFO;
DROP TABLE IF EXISTS T_USER_INFO;
DROP TABLE IF EXISTS T_SITE_INFO;

/**********************************/
/* �e�[�u����: �T�C�g��� */
/**********************************/
CREATE TABLE T_SITE_INFO(
		siteId CHARACTER(3) NOT NULL,
		siteName VARCHAR(50) NOT NULL
);

/**********************************/
/* �e�[�u����: ���[�U��� */
/**********************************/
CREATE TABLE T_USER_INFO(
		siteId CHARACTER(3) NOT NULL,
		userCode VARCHAR(50) NOT NULL,
		userName VARCHAR(100),
		userNameKana VARCHAR(200),
		birthday VARCHAR(8),
		gender CHARACTER(1),
		zipCode VARCHAR(8),
		address VARCHAR(500),
		address2 VARCHAR(500),
		nearStation VARCHAR(100),
		telnum VARCHAR(14),
		celPhone VARCHAR(14),
		mailAddress VARCHAR(200),
		imageUrl VARCHAR(200),
		etcDesc VARCHAR(300),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ���O�C����� */
/**********************************/
CREATE TABLE T_LOGIN_INFO(
		siteId CHARACTER(3) NOT NULL,
		userId VARCHAR(20) NOT NULL,
		password VARCHAR(200) NOT NULL,
		userCode VARCHAR(50),
		roles VARCHAR(100),
		userRegDay VARCHAR(8),
		sessionId VARCHAR(50),
		connectIp VARCHAR(30),
		connectDate TIMESTAMP,
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ���O�C��������� */
/**********************************/
CREATE TABLE T_LOGIN_HIST(
		loginNo SERIAL,
		siteId CHARACTER(3) NOT NULL,
		userId VARCHAR(20) NOT NULL,
		roles VARCHAR(100),
		yearMonthDay VARCHAR(8),
		loginDiv CHARACTER(1),
		flagSuccess CHARACTER(1),
		sessionId VARCHAR(50),
		connectIp VARCHAR(30),
		createDate TIMESTAMP
);

/**********************************/
/* �e�[�u����: �e�X�g��� */
/**********************************/
CREATE TABLE T_TEST_INFO(
		testNo VARCHAR(50) NOT NULL,
		testName VARCHAR(100),
		yearMonthDay VARCHAR(8),
		detailContent TEXT,
		imagePath VARCHAR(200),
		filePath VARCHAR(200),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ���ʍ��ڑ啪�� */
/**********************************/
CREATE TABLE T_CATE_MAIN(
		mainCode CHARACTER(3) NOT NULL,
		mainName VARCHAR(100),
		useDiv CHARACTER(1) NOT NULL,
		etcDesc VARCHAR(300),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ���ʍ��ڒ����� */
/**********************************/
CREATE TABLE T_CATE_SUB(
		mainCode CHARACTER(3) NOT NULL,
		subCode CHARACTER(3) NOT NULL,
		subName VARCHAR(100),
		subValue VARCHAR(100),
		subValue2 VARCHAR(100),
		subValue3 VARCHAR(100),
		viewOrder INTEGER NOT NULL,
		useDiv CHARACTER(1) NOT NULL,
		etcDesc VARCHAR(300),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ��Ə�� */
/**********************************/
CREATE TABLE T_COMPANY_INFO(
		siteId CHARACTER(3) NOT NULL,
		companyCode VARCHAR(50) NOT NULL,
		companyName VARCHAR(100),
		realName VARCHAR(200),
		zipCode CHARACTER(8),
		gender VARCHAR(10),
		address VARCHAR(500),
		address2 VARCHAR(500),
		nearStation VARCHAR(100),
		telnum VARCHAR(14),
		celPhone VARCHAR(14),
		mailAddress VARCHAR(200),
		password VARCHAR(200),
		imageUrl VARCHAR(200),
		etcDesc VARCHAR(300),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ���₢���킹��� */
/**********************************/
CREATE TABLE T_TOIAWASE_INFO(
		toiNo SERIAL,
		siteId CHARACTER(3) NOT NULL,
		name VARCHAR(100) NOT NULL,
		email VARCHAR(200),
		homepage VARCHAR(500),
		tel VARCHAR(13),
		title VARCHAR(500),
		content TEXT,
		replyContent TEXT,
		yyyymmdd VARCHAR(8),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ���m�点��� */
/**********************************/
CREATE TABLE T_NEWS_INFO(
		newsNo SERIAL NOT NULL,
		siteId CHARACTER(3) NOT NULL,
		title VARCHAR(500),
		content TEXT,
		yyyymmdd VARCHAR(8),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: �f���}�X�^��� */
/**********************************/
CREATE TABLE T_BOARD_MASTER_INFO(
		boardId CHARACTER(3) NOT NULL,
		boardName VARCHAR(100) NOT NULL,
		boardType CHARACTER(1),
		useDiv CHARACTER(1)
);

/**********************************/
/* �e�[�u����: �f����� */
/**********************************/
CREATE TABLE T_BOARD_INFO(
		boardNo BIGSERIAL NOT NULL,
		siteId CHARACTER(3) NOT NULL,
		userCode VARCHAR(50),
		boardId CHARACTER(3),
		group BIGINT,
		groupNum BIGINT,
		groupCount INTEGER,
		name VARCHAR(100) NOT NULL,
		email VARCHAR(200),
		title VARCHAR(500),
		content TEXT,
		yyyymmdd VARCHAR(8),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: �f���Y�t�t�@�C����� */
/**********************************/
CREATE TABLE T_BOARD_FILE_INFO(
		fileNo BIGSERIAL NOT NULL,
		boardNo BIGINT NOT NULL,
		originFileName VARCHAR(200) NOT NULL,
		saveFileName VARCHAR(200),
		fileSize BIGINT,
		mimeType VARCHAR(200),
		filePath VARCHAR(500),
		useDiv CHARACTER(1),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ��ƗL���T�[�r�X��� */
/**********************************/
CREATE TABLE T_COMPANY_PAID_SERVICE_INFO(
		siteId CHARACTER(3) NOT NULL,
		companyCode VARCHAR(50),
		serviceCode CHARACTER(3),
		useDiv CHARACTER(1),
		startDay CHARACTER(8),
		endDay CHARACTER(8),
		paymentDiv CHARACTER(1),
		etc VARCHAR(500),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: ��ƗL���T�[�r�X������� */
/**********************************/
CREATE TABLE T_COMPANY_PAID_SERVICE_HISTORY_INFO(
		historyNo SERIAL NOT NULL,
		siteId CHARACTER(3) NOT NULL,
		companyCode VARCHAR(50) NOT NULL,
		serviceCode CHARACTER(3),
		useDiv CHARACTER(1),
		startDay CHARACTER(8),
		endDay CHARACTER(8),
		paymentDiv CHARACTER(1),
		etc VARCHAR(500),
		registDay CHARACTER(8),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);

/**********************************/
/* �e�[�u����: �s���{����� */
/**********************************/
CREATE TABLE T_AREA_INFO(
		areaNo SERIAL NOT NULL,
		areaDiv CHARACTER(3),
		useDiv CHARACTER(1) NOT NULL,
		areaName VARCHAR(300),
		etc VARCHAR(500),
		createDate TIMESTAMP,
		createUser VARCHAR(30),
		modifyDate TIMESTAMP,
		modifyUser VARCHAR(30),
		deleteFlag CHARACTER(1),
		deleteDate TIMESTAMP,
		deleteUser VARCHAR(30)
);


ALTER TABLE T_SITE_INFO ADD CONSTRAINT IDX_T_SITE_INFO_PK PRIMARY KEY (siteId);

ALTER TABLE T_USER_INFO ADD CONSTRAINT IDX_T_USER_INFO_PK PRIMARY KEY (siteId, userCode);
ALTER TABLE T_USER_INFO ADD CONSTRAINT IDX_T_USER_INFO_FK0 FOREIGN KEY (siteId) REFERENCES T_SITE_INFO (siteId);

ALTER TABLE T_LOGIN_INFO ADD CONSTRAINT IDX_T_LOGIN_INFO_PK PRIMARY KEY (siteId, userId);
ALTER TABLE T_LOGIN_INFO ADD CONSTRAINT IDX_T_LOGIN_INFO_FK0 FOREIGN KEY (siteId,userCode) REFERENCES T_USER_INFO (siteId,userCode);

ALTER TABLE T_LOGIN_HIST ADD CONSTRAINT IDX_T_LOGIN_HIST_PK PRIMARY KEY (loginNo);
ALTER TABLE T_LOGIN_HIST ADD CONSTRAINT IDX_T_LOGIN_HIST_FK0 FOREIGN KEY (siteId,userId) REFERENCES T_LOGIN_INFO (siteId,userId);

ALTER TABLE T_TEST_INFO ADD CONSTRAINT IDX_T_TEST_INFO_PK PRIMARY KEY (testNo);

ALTER TABLE T_CATE_MAIN ADD CONSTRAINT IDX_T_CATE_MAIN_PK PRIMARY KEY (mainCode);

ALTER TABLE T_CATE_SUB ADD CONSTRAINT IDX_T_CATE_SUB_PK PRIMARY KEY (mainCode, subCode);
ALTER TABLE T_CATE_SUB ADD CONSTRAINT IDX_T_CATE_SUB_FK0 FOREIGN KEY (mainCode) REFERENCES T_CATE_MAIN (mainCode);

ALTER TABLE T_COMPANY_INFO ADD CONSTRAINT IDX_T_COMPANY_INFO_PK PRIMARY KEY (siteId, companyCode);
ALTER TABLE T_COMPANY_INFO ADD CONSTRAINT IDX_T_COMPANY_INFO_FK0 FOREIGN KEY (siteId) REFERENCES T_SITE_INFO (siteId);

ALTER TABLE T_TOIAWASE_INFO ADD CONSTRAINT IDX_T_TOIAWASE_INFO_PK PRIMARY KEY (toiNo);
ALTER TABLE T_TOIAWASE_INFO ADD CONSTRAINT IDX_T_TOIAWASE_INFO_FK0 FOREIGN KEY (siteId) REFERENCES T_SITE_INFO (siteId);

ALTER TABLE T_NEWS_INFO ADD CONSTRAINT IDX_T_NEWS_INFO_PK PRIMARY KEY (newsNo);

ALTER TABLE T_BOARD_MASTER_INFO ADD CONSTRAINT IDX_T_BOARD_MASTER_INFO_PK PRIMARY KEY (boardId);

ALTER TABLE T_BOARD_INFO ADD CONSTRAINT IDX_T_BOARD_INFO_PK PRIMARY KEY (boardNo);
ALTER TABLE T_BOARD_INFO ADD CONSTRAINT IDX_T_BOARD_INFO_FK0 FOREIGN KEY (boardId) REFERENCES T_BOARD_MASTER_INFO (boardId);

ALTER TABLE T_BOARD_FILE_INFO ADD CONSTRAINT IDX_T_BOARD_FILE_INFO_PK PRIMARY KEY (fileNo);
ALTER TABLE T_BOARD_FILE_INFO ADD CONSTRAINT IDX_T_BOARD_FILE_INFO_FK0 FOREIGN KEY (boardNo) REFERENCES T_BOARD_INFO (boardNo);

ALTER TABLE T_COMPANY_PAID_SERVICE_INFO ADD CONSTRAINT IDX_T_COMPANY_PAID_SERVICE_INFO_PK PRIMARY KEY (siteId);
ALTER TABLE T_COMPANY_PAID_SERVICE_INFO ADD CONSTRAINT IDX_T_COMPANY_PAID_SERVICE_INFO_FK0 FOREIGN KEY (siteId,companyCode) REFERENCES T_COMPANY_INFO (siteId,companyCode);

ALTER TABLE T_COMPANY_PAID_SERVICE_HISTORY_INFO ADD CONSTRAINT IDX_T_COMPANY_PAID_SERVICE_HISTORY_INFO_PK PRIMARY KEY (historyNo);
ALTER TABLE T_COMPANY_PAID_SERVICE_HISTORY_INFO ADD CONSTRAINT IDX_T_COMPANY_PAID_SERVICE_HISTORY_INFO_FK0 FOREIGN KEY (siteId) REFERENCES T_COMPANY_PAID_SERVICE_INFO (siteId);

ALTER TABLE T_AREA_INFO ADD CONSTRAINT IDX_T_AREA_INFO_PK PRIMARY KEY (areaNo);

