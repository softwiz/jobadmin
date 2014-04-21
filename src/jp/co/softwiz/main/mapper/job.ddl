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
/* テーブル名: サイト情報 */
/**********************************/
CREATE TABLE T_SITE_INFO(
		siteId CHARACTER(3) NOT NULL,
		siteName VARCHAR(50) NOT NULL
);

/**********************************/
/* テーブル名: ユーザ情報 */
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
/* テーブル名: ログイン情報 */
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
/* テーブル名: ログイン履歴情報 */
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
/* テーブル名: テスト情報 */
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
/* テーブル名: 共通項目大分類 */
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
/* テーブル名: 共通項目中分類 */
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
/* テーブル名: 企業情報 */
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
/* テーブル名: お問い合わせ情報 */
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
/* テーブル名: お知らせ情報 */
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
/* テーブル名: 掲示板マスタ情報 */
/**********************************/
CREATE TABLE T_BOARD_MASTER_INFO(
		boardId CHARACTER(3) NOT NULL,
		boardName VARCHAR(100) NOT NULL
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

