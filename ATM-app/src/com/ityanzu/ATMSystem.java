package com.ityanzu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * ATM入口类
 */

public class ATMSystem {
    public static void main(String[] args) {
        //1.创建用户类
        //2.创建用户类集合
        ArrayList<Account> accounts = new ArrayList<>();

        //3.首页
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("=================ATM首页==================");
            System.out.println("1、用户登录");
            System.out.println("2、用户注册");
            System.out.println("选择需要办理的业务：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //用户登录
                    System.out.println("=================用户登录==================");
                    login(accounts, sc);
                    break;
                case 2:
                    //用户注册
                    register(accounts);
                    break;
                default:
                    System.out.println("输入的指令错，请重新输入~~");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        //先进行集合空判断
        if (accounts.size() == 0) {
            System.out.println("当前无账户，请先开通账户~~");
            return;
        }

        //1.输入卡号，寻找用户
        while (true) {
            System.out.println("请输入您的卡号：");
            String cardId = sc.next();

            //2.在用户集合类中寻找卡号，判断是否存在
            Account acc = getAccount(accounts, cardId);

            //3.输入该账号密码
            while (true) {
                System.out.println("请输入你的密码：");
                String passWord = sc.next();
                if (acc.getPassWord().equals(passWord)) {
                    System.out.println("用户密码输入正确~~");
                    showUserCommand(accounts, acc, sc);
                    return;
                }
                System.out.println("密码输入错误，请重新输入~~");
            }
        }
    }

    private static void showUserCommand(ArrayList<Account> accounts, Account acc, Scanner sc) {
        while (true) {
            System.out.println("===========用户操作首页===========");
            System.out.println("1.查询");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("选择操作：");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    //查询
                    showAccount(acc);
                    break;
                case 2:
                    //存款
                    setMoney(acc, sc);
                    break;
                case 3:
                    //取款
                    drawMoney(acc, sc);
                    break;
                case 4:
                    //转账
                    transferMoney(accounts, acc, sc);
                    break;
                case 5:
                    //修改密码
                    updatePassWord(acc, sc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功~~");
                    return;
                case 7:
                    //注销账户
                    deleteAccunt(accounts, acc, sc);
                    return;
            }
        }
    }

    private static void deleteAccunt(ArrayList<Account> accounts, Account acc, Scanner sc) {
        System.out.println("==============用户销户=================");
        System.out.println("是否进行销户（y/n）：");
        String rs = sc.next();
        switch (rs) {
            case "y":
                if (acc.getMoney() > 0){
                    System.out.println("还剩余额"+acc.getMoney()+"元，请先取完再注销~~");
                } else {
                    System.out.println("销户成功~~");
                    accounts.remove(acc);
                }
                break;
            default:
                System.out.println("销户已取消~~");
        }
    }

    /**
     * 修改用户密码
     *
     * @param acc 当前登录用户
     * @param sc  扫描器
     */
    private static void updatePassWord(Account acc, Scanner sc) {
        System.out.println("=========用户密码修改=========");
        while (true) {
            System.out.println("请输入用户原密码：");
            String passWord = sc.next();
            if (acc.getPassWord().equals(passWord)) {
                while (true) {
                    System.out.println("请输入要修改的密码：");
                    String updatePassWord = sc.next();
                    System.out.println("请重新输入新的密码：");
                    String okPassWord = sc.next();
                    if (updatePassWord.equals(okPassWord)) {
                        System.out.println("密码修改成功~~");
                        acc.setPassWord(updatePassWord);
                        return;
                    }
                    System.out.println("两次输入密码不一致，请重新输入要修改的密码~~");
                }
            } else {
                System.out.println("原密码输入错误，请重新输入~~");
            }
        }
    }

    /**
     * 转账
     *
     * @param accounts 用户集合
     * @param acc      用户
     * @param sc       扫描器
     */
    private static void transferMoney(ArrayList<Account> accounts, Account acc, Scanner sc) {
        //1.判断用户集合中是否有两个以上的账户
        if (accounts.size() < 2) {
            System.out.println("用户量少于2，请先开户~~");
            return;
        }
        //2.判断自己账户是否有钱
        if (acc.getMoney() == 0) {
            System.out.println("该账户余额为零，不能转账~~");
            return;
        }
        //3.输入对方卡号，判断是否存在
        while (true) {
            System.out.println("请输入需要转账的卡号：");
            String cardId = sc.next();
            Account account = getAccount(accounts, cardId);
            if (acc.getCardId().equals(cardId)) {
                System.out.println("用户不能给自己转账，请重新输入卡号~~");
                continue;
            }
            //4.确认对方姓氏
            String tap = "*" + account.getUserName().substring(1);
            while (true) {
                System.out.println("请确认需要转账的用户信息[" + tap + "]，输入姓氏进行确认：");
                String preName = sc.next();
                if (account.getUserName().startsWith(preName)) {
                    System.out.println("输入正确");
                    while (true) {
                        System.out.println("请输入转账金额：");
                        double money = sc.nextDouble();
                        //判断转账金额是否大于自己余额
                        if (money > acc.getMoney()) {
                            System.out.println("转账金额超过余额，余额为" + acc.getMoney());
                            continue;
                        }
                        acc.setMoney(acc.getMoney() - money);
                        account.setMoney(account.getMoney() + money);
                        showAccount(acc);
                        return;
                    }
                } else {
                    System.out.println("输入错误，请重新输入~~");
                }
            }
        }

    }

    /**
     * 取款
     *
     * @param acc
     * @param sc
     */
    private static void drawMoney(Account acc, Scanner sc) {
        //a.判断用户余额是否大于100
        if (acc.getMoney() < 100) {
            System.out.println("用户余额小于100，请到前台取款~~");
            return;
        }
        while (true) {
            System.out.println("请输入取款金额：");
            double money = sc.nextDouble();
            if (money > acc.getQutaMoney()) {
                System.out.println("单次取款金额超过额度，每次限额只能取" + acc.getQutaMoney() + "元，请重新输入取款金额~~");
                continue;
            }
            if (money > acc.getMoney()) {
                System.out.println("取款金额超过余额，余额为" + acc.getMoney() + "元，请重新输入取款金额~~");
                continue;
            }
            acc.setMoney(acc.getMoney() - money);
            showAccount(acc);
            return;
        }


    }

    /**
     * 存款
     *
     * @param acc 用户类
     * @param sc  扫描器
     */
    private static void setMoney(Account acc, Scanner sc) {
        System.out.println("===============存款==================");
        System.out.println("请输入你要存款的金额：");
        double money = sc.nextDouble();
        //更新余额
        acc.setMoney(money + acc.getMoney());
        //展示用户信息
        showAccount(acc);
    }

    /**
     * 展示用户信息
     *
     * @param acc 用户对象
     */
    private static void showAccount(Account acc) {
        System.out.println("===========用户信息============");
        System.out.println("卡号：" + acc.getCardId());
        System.out.println("户主：" + acc.getUserName());
        System.out.println("余额：" + acc.getMoney());
        System.out.println("限额：" + acc.getQutaMoney());
    }

    /**
     * 根据卡号查询客户信息
     *
     * @param accounts 客户集合
     * @param cardId   输入的卡号
     * @return 客户对象
     */
    private static Account getAccount(ArrayList<Account> accounts, String cardId) {
        if (accounts.size() == 0) {
            System.out.println("无账户~~");
            return null;
        }
        for (int i = 0; i < accounts.size(); i++) {
            Account acc = accounts.get(i);
            if (acc.getCardId().equals(cardId)) {
                return acc;
            }
        }
        System.out.println("无该账户，请重新输入卡号~~");
        return null;
    }

    private static void register(ArrayList<Account> accounts) {
        //1.创建类封装姓名，密码，单次取款额度，卡号
        Account account = new Account();

        //2.键盘输入姓名，取款额度和密码
        Scanner sc = new Scanner(System.in);
        System.out.println("=================用户注册==================");
        System.out.println("输入用户名：");
        String username = sc.next();
        account.setUserName(username);

        //密码需要输入两次进行对比确定
        while (true) {
            System.out.println("输入用户密码：");
            String passWord = sc.next();
            System.out.println("请重新输入用户密码：");
            String okPassWord = sc.next();
            if (okPassWord.equals(passWord)) {
                System.out.println("密码设置完成~~");
                account.setPassWord(passWord);
                break;
            } else {
                System.out.println("两次输入不一致，请重新输入~~");
            }
        }
        System.out.println("请输入单次取款额度");
        double quotaMoney = sc.nextDouble();
        account.setQutaMoney(quotaMoney);

        //随机生成8位数的卡号
        String cardId = getRandomCardId(accounts);
        account.setCardId(cardId);
        System.out.println("恭喜你" + account.getUserName() + "先生/女士,您的账户已注册成功，你的卡号为：" + cardId);
        accounts.add(account);

    }

    /**
     * 为用户生成一个随机8位数的卡号且不重复
     *
     * @param accounts 用户类集合
     * @return 8位数卡号
     */
    private static String getRandomCardId(ArrayList<Account> accounts) {
        String cardId = "";
        Random r = new Random();
        while (true) {
            for (int i = 0; i < 8; i++) {
                cardId += r.nextInt(10);
            }
            //查询生成的卡号用户集合中的卡号是否唯一
            if (isOnlyAccountCardId(accounts, cardId)) {
                return cardId;
            }
        }

    }

    /**
     * 判断卡号是否重复
     *
     * @param accounts 用户类集合
     * @param cardId   生成的卡号
     * @return true | false
     */
    private static boolean isOnlyAccountCardId(ArrayList<Account> accounts, String cardId) {
        boolean flag = true;
        //遍历用户集合
        if (accounts == null) {
            return flag;
        } else {

            for (int i = 0; i < accounts.size(); i++) {
                Account acc = accounts.get(i);
                if (acc.getCardId().equals(cardId)) {
                    flag = false;
                    return flag;
                }
            }
            return flag;
        }
    }
}
