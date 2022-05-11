package com.akechiko.demo1;

public class phone {
    private String brand;
    private  int price;
    private  String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void  call(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机打电话。。。");
    }

    public  void sendMessage(){
        System.out.println("正在使用价格为"+price+"元"+color+"的"+brand+"手机发短信。。。");
    }

    public phone(){}
}
