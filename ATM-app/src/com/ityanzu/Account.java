package com.ityanzu;

/**
 * 用户类
 */

public class Account {
    private String cardId;//卡号
    private String userName;//用户名
    private String passWord;//密码
    private double money;//余额
    private double qutaMoney;//单次取款额度

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getQutaMoney() {
        return qutaMoney;
    }

    public void setQutaMoney(double qutaMoney) {
        this.qutaMoney = qutaMoney;
    }
}
