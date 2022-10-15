package com.ityanzu.createobject.demo;

// 设计对象于=与使用

import com.ityanzu.createobject.demo.Goods;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        //1.定义商品类
        //2.定义购物车对象
        Goods[] shopCar = new Goods[100];
        //3.搭架指令框架
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您选择以下命令进行操作：");
            System.out.println("添加商品到购物车（add）：");
            System.out.println("查询购物车中的商品（query）：");
            System.out.println("修改商品的购买数量（update）：");
            System.out.println("结算购物车中的商品（pay）：");
            String command = sc.next();
            switch (command) {
                case "add":
                    //添加
                    addGoods(shopCar, sc);
                    break;
                case "query":
                    //查询并打印
                    qureyGoods(shopCar);
                    break;
                case "update":
                    //修改数量
                    updateGoods(shopCar, sc);
                    break;
                case "pay":
                    //结算
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("输入指令错误~~");
            }
        }

    }

    public static void payGoods(Goods[] shopCar) {
        //a.先对购物车进行遍历
        double sumPrice = 0;
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                sumPrice += shopCar[i].price * shopCar[i].buyNumber;
            } else {
                System.out.println("购物车中物品总价为：" + sumPrice);
                break;
            }
        }
    }

    public static void updateGoods(Goods[] shopCar, Scanner sc) {
        //输入商品名称进行数量修改
        System.out.println("输入需要修改的商品id：");
        int id = sc.nextInt();
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                if (shopCar[i].id == id) {
                    System.out.println("需要修改的数量为：");
                    int buyNumber = sc.nextInt();
                    shopCar[i].buyNumber = buyNumber;
                    break;
                } else {
                    //没找到
                    System.out.println("购物车中没有此商品1~~");
                    break;
                }
            } else {
                //没找到
                System.out.println("购物车中没有此商品2~~");
                break;
            }
        }
    }

    public static void qureyGoods(Goods[] shopCar) {
        System.out.println("===============查询购物车信息如下===============");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] != null) {
                System.out.println(shopCar[i].id + "\t\t" + shopCar[i].name + "\t\t" + shopCar[i].price + "\t\t" + shopCar[i].buyNumber);
            } else {
                //遍历结束
                break;
            }
        }
    }

    public static void addGoods(Goods[] shopCar, Scanner sc) {
        //1.录入用户输入的商品信息
        System.out.println("请你输入商品编号（不重复）：");
        int id = sc.nextInt();
        System.out.println("请输入商品名称：");
        String name = sc.next();
        System.out.println("请输入商品价格：");
        double price = sc.nextDouble();
        System.out.println("请输入购买商品的数量：");
        int buyNumber = sc.nextInt();

        //2.将录入的信息进行封装
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.price = price;
        g.buyNumber = buyNumber;

        //3.将封装好的信息添加到购物车
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品" + g.name + "添加到购物车成功~~");
    }
}
