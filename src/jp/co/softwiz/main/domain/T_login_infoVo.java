package jp.co.softwiz.main.domain;

/* Code Generator Information.
 * generator Version 1.0.0 release 2007/10/10
 * generated Date Wed Apr 02 13:34:14 JST 2014
 */
import java.io.Serializable;

/**
 * T_login_infoVo.
 * @author gtc-yun
 * @version 1.0 
 * history 
 * Symbol	Date		Person		Note
 * [1]		2014/04/02	gtc-yun		Generated.
 */
public class T_login_infoVo implements Serializable{

	public static final String TABLE = "T_LOGIN_INFO";

	/**
	 * siteid:bpchar(3) <Primary Key>
	 */
	private String siteid;

	/**
	 * userid:varchar(20) <Primary Key>
	 */
	private String userid;

	/**
	 * password:varchar(200)
	 */
	private String password;

	/**
	 * usercode:varchar(50)
	 */
	private String usercode;

	/**
	 * roles:varchar(100)
	 */
	private String roles;

	/**
	 * userregday:varchar(8)
	 */
	private String userregday;

	/**
	 * sessionid:varchar(50)
	 */
	private String sessionid;

	/**
	 * connectip:varchar(30)
	 */
	private String connectip;

	/**
	 * connectdate:timestamp(29,6)
	 */
	private java.sql.Timestamp connectdate;

	/**
	 * createdate:timestamp(29,6)
	 */
	private java.sql.Timestamp createdate;

	/**
	 * createuser:varchar(30)
	 */
	private String createuser;

	/**
	 * modifydate:timestamp(29,6)
	 */
	private java.sql.Timestamp modifydate;

	/**
	 * modifyuser:varchar(30)
	 */
	private String modifyuser;

	/**
	 * deleteflag:bpchar(1)
	 */
	private String deleteflag;

	/**
	 * deletedate:timestamp(29,6)
	 */
	private java.sql.Timestamp deletedate;

	/**
	 * deleteuser:varchar(30)
	 */
	private String deleteuser;

	/**
	* Constractor
	*/
	public T_login_infoVo(){}

	/**
	* Constractor
	* @param <code>siteid</code>
	* @param <code>userid</code>
	*/
	public T_login_infoVo(String siteid, String userid){
		this.siteid = siteid;
		this.userid = userid;
	}

	public String getSiteid(){ return this.siteid; }

	public void setSiteid(String siteid){ this.siteid = siteid; }

	public String getUserid(){ return this.userid; }

	public void setUserid(String userid){ this.userid = userid; }

	public String getPassword(){ return this.password; }

	public void setPassword(String password){ this.password = password; }

	public String getUsercode(){ return this.usercode; }

	public void setUsercode(String usercode){ this.usercode = usercode; }

	public String getRoles(){ return this.roles; }

	public void setRoles(String roles){ this.roles = roles; }

	public String getUserregday(){ return this.userregday; }

	public void setUserregday(String userregday){ this.userregday = userregday; }

	public String getSessionid(){ return this.sessionid; }

	public void setSessionid(String sessionid){ this.sessionid = sessionid; }

	public String getConnectip(){ return this.connectip; }

	public void setConnectip(String connectip){ this.connectip = connectip; }

	public java.sql.Timestamp getConnectdate(){ return this.connectdate; }

	public void setConnectdate(java.sql.Timestamp connectdate){ this.connectdate = connectdate; }

	public java.sql.Timestamp getCreatedate(){ return this.createdate; }

	public void setCreatedate(java.sql.Timestamp createdate){ this.createdate = createdate; }

	public String getCreateuser(){ return this.createuser; }

	public void setCreateuser(String createuser){ this.createuser = createuser; }

	public java.sql.Timestamp getModifydate(){ return this.modifydate; }

	public void setModifydate(java.sql.Timestamp modifydate){ this.modifydate = modifydate; }

	public String getModifyuser(){ return this.modifyuser; }

	public void setModifyuser(String modifyuser){ this.modifyuser = modifyuser; }

	public String getDeleteflag(){ return this.deleteflag; }

	public void setDeleteflag(String deleteflag){ this.deleteflag = deleteflag; }

	public java.sql.Timestamp getDeletedate(){ return this.deletedate; }

	public void setDeletedate(java.sql.Timestamp deletedate){ this.deletedate = deletedate; }

	public String getDeleteuser(){ return this.deleteuser; }

	public void setDeleteuser(String deleteuser){ this.deleteuser = deleteuser; }

	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append("[T_login_infoVo:");
		buffer.append(" siteid: ");
		buffer.append(siteid);
		buffer.append(" userid: ");
		buffer.append(userid);
		buffer.append(" password: ");
		buffer.append(password);
		buffer.append(" usercode: ");
		buffer.append(usercode);
		buffer.append(" roles: ");
		buffer.append(roles);
		buffer.append(" userregday: ");
		buffer.append(userregday);
		buffer.append(" sessionid: ");
		buffer.append(sessionid);
		buffer.append(" connectip: ");
		buffer.append(connectip);
		buffer.append(" connectdate: ");
		buffer.append(connectdate);
		buffer.append(" createdate: ");
		buffer.append(createdate);
		buffer.append(" createuser: ");
		buffer.append(createuser);
		buffer.append(" modifydate: ");
		buffer.append(modifydate);
		buffer.append(" modifyuser: ");
		buffer.append(modifyuser);
		buffer.append(" deleteflag: ");
		buffer.append(deleteflag);
		buffer.append(" deletedate: ");
		buffer.append(deletedate);
		buffer.append(" deleteuser: ");
		buffer.append(deleteuser);
		buffer.append("]");
		return buffer.toString();
	}

}
