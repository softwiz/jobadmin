package jp.co.softwiz.main.domain;

import java.util.Date;

public class TBoardInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.boardno
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Long boardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.siteid
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String siteid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.usercode
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String usercode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.boardid
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String boardid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.groupno
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Long groupno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.groupnum
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Long groupnum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.groupcount
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Integer groupcount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.name
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.email
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.title
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.content
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.yyyymmdd
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String yyyymmdd;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.createdate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Date createdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.createuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String createuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.modifydate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.modifyuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String modifyuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.deleteflag
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String deleteflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.deletedate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private Date deletedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_board_info.deleteuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    private String deleteuser;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.boardno
     *
     * @return the value of t_board_info.boardno
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Long getBoardno() {
        return boardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.boardno
     *
     * @param boardno the value for t_board_info.boardno
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setBoardno(Long boardno) {
        this.boardno = boardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.siteid
     *
     * @return the value of t_board_info.siteid
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getSiteid() {
        return siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.siteid
     *
     * @param siteid the value for t_board_info.siteid
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.usercode
     *
     * @return the value of t_board_info.usercode
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.usercode
     *
     * @param usercode the value for t_board_info.usercode
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.boardid
     *
     * @return the value of t_board_info.boardid
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getBoardid() {
        return boardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.boardid
     *
     * @param boardid the value for t_board_info.boardid
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setBoardid(String boardid) {
        this.boardid = boardid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.groupno
     *
     * @return the value of t_board_info.groupno
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Long getGroupno() {
        return groupno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.groupno
     *
     * @param groupno the value for t_board_info.groupno
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setGroupno(Long groupno) {
        this.groupno = groupno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.groupnum
     *
     * @return the value of t_board_info.groupnum
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Long getGroupnum() {
        return groupnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.groupnum
     *
     * @param groupnum the value for t_board_info.groupnum
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setGroupnum(Long groupnum) {
        this.groupnum = groupnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.groupcount
     *
     * @return the value of t_board_info.groupcount
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Integer getGroupcount() {
        return groupcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.groupcount
     *
     * @param groupcount the value for t_board_info.groupcount
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setGroupcount(Integer groupcount) {
        this.groupcount = groupcount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.name
     *
     * @return the value of t_board_info.name
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.name
     *
     * @param name the value for t_board_info.name
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.email
     *
     * @return the value of t_board_info.email
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.email
     *
     * @param email the value for t_board_info.email
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.title
     *
     * @return the value of t_board_info.title
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.title
     *
     * @param title the value for t_board_info.title
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.content
     *
     * @return the value of t_board_info.content
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.content
     *
     * @param content the value for t_board_info.content
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.yyyymmdd
     *
     * @return the value of t_board_info.yyyymmdd
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getYyyymmdd() {
        return yyyymmdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.yyyymmdd
     *
     * @param yyyymmdd the value for t_board_info.yyyymmdd
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setYyyymmdd(String yyyymmdd) {
        this.yyyymmdd = yyyymmdd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.createdate
     *
     * @return the value of t_board_info.createdate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Date getCreatedate() {
        return createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.createdate
     *
     * @param createdate the value for t_board_info.createdate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.createuser
     *
     * @return the value of t_board_info.createuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getCreateuser() {
        return createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.createuser
     *
     * @param createuser the value for t_board_info.createuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.modifydate
     *
     * @return the value of t_board_info.modifydate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.modifydate
     *
     * @param modifydate the value for t_board_info.modifydate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.modifyuser
     *
     * @return the value of t_board_info.modifyuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getModifyuser() {
        return modifyuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.modifyuser
     *
     * @param modifyuser the value for t_board_info.modifyuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setModifyuser(String modifyuser) {
        this.modifyuser = modifyuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.deleteflag
     *
     * @return the value of t_board_info.deleteflag
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getDeleteflag() {
        return deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.deleteflag
     *
     * @param deleteflag the value for t_board_info.deleteflag
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setDeleteflag(String deleteflag) {
        this.deleteflag = deleteflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.deletedate
     *
     * @return the value of t_board_info.deletedate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public Date getDeletedate() {
        return deletedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.deletedate
     *
     * @param deletedate the value for t_board_info.deletedate
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setDeletedate(Date deletedate) {
        this.deletedate = deletedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_board_info.deleteuser
     *
     * @return the value of t_board_info.deleteuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public String getDeleteuser() {
        return deleteuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_board_info.deleteuser
     *
     * @param deleteuser the value for t_board_info.deleteuser
     *
     * @mbggenerated Fri Apr 25 10:48:29 JST 2014
     */
    public void setDeleteuser(String deleteuser) {
        this.deleteuser = deleteuser;
    }
}