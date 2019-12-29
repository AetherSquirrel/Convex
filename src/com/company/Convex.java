package com.company;

import java.awt.*;
import java.util.Scanner;

public class Convex {
    private Figure fig;
    private int xcircle,ycircle,rcircle;
    public Convex() {
        fig = new Void();
    }
    public void add(R2Point p) {
        fig = fig.add(p);
    }
    public double area() {
        return fig.area();
    }
    public double perimeter() {
        return fig.perimeter();
    }
    public void draw(Graphics g){
        fig.draw(g);
    }

    public void addPointCircle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координату х для центра круга");
        xcircle = scan.nextInt();
        System.out.println("Введите координату у для центра круга");
        ycircle = scan.nextInt();
        System.out.println("Введите радиус для круга");
        rcircle = scan.nextInt();
    }
    /*
    public double radiusMinCircle(){
        return fig.radiusMinCircle(xcircle, ycircle);
    }*/
    public void drawCircle(Graphics g){
        fig.drawCircle(g, xcircle, ycircle, rcircle);
    }

}
