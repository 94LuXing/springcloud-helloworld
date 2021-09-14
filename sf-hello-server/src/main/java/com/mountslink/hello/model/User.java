package com.mountslink.hello.model;

import java.time.LocalDateTime;

/**
 * @author lu'xing
 * @title: User
 * @projectName hello-world
 * @description: TODO
 * @date 2021/9/1315:18
 */

public class User {

    private static final long serialVersionUID = 1L;

    private String userId;

    //用户编码
    private String userCode;

    /** 真实名称 */
    private String realName;

    /** 昵称 */
    private String nickName;

    /** 用户名 */
    private String userName;

    /** 密码 */
    private String password;

    /** 手机 */
    private String phone;

    /**  邮箱 */
    private String email;

    //qq号
    private String qq;

    //微信号
    private String wechat;

    /** 头像 */
    private String avatar;

    /** 状态，1启用，0禁用 */
    private Integer enableFlag;

    /** 最后登录时间 */
    private LocalDateTime lastLoginDate;

    /** 注册时间 */
    private LocalDateTime registerDate;

    /** 区分哪端注册的用户 */
    private String registerType;

    //审核状态（01待提交02待审核03审核通过04审核驳回）
    private String auditStatus;

    /**  备注 */
    private String remark;


    private Integer loginNum;

    //@ApiModelProperty("身份证")
    private String idCard;

    // @ApiModelProperty("性别")
    private String sex;

    /** 安全等级 */
    private String safeLevel;

    private String openId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Integer getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(Integer enableFlag) {
        this.enableFlag = enableFlag;
    }

    public LocalDateTime getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDateTime lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    public String getRegisterType() {
        return registerType;
    }

    public void setRegisterType(String registerType) {
        this.registerType = registerType;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getLoginNum() {
        return loginNum;
    }

    public void setLoginNum(Integer loginNum) {
        this.loginNum = loginNum;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSafeLevel() {
        return safeLevel;
    }

    public void setSafeLevel(String safeLevel) {
        this.safeLevel = safeLevel;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userCode='" + userCode + '\'' +
                ", realName='" + realName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", wechat='" + wechat + '\'' +
                ", avatar='" + avatar + '\'' +
                ", enableFlag=" + enableFlag +
                ", lastLoginDate=" + lastLoginDate +
                ", registerDate=" + registerDate +
                ", registerType='" + registerType + '\'' +
                ", auditStatus='" + auditStatus + '\'' +
                ", remark='" + remark + '\'' +
                ", loginNum=" + loginNum +
                ", idCard='" + idCard + '\'' +
                ", sex='" + sex + '\'' +
                ", safeLevel='" + safeLevel + '\'' +
                ", openId='" + openId + '\'' +
                '}';
    }
}
