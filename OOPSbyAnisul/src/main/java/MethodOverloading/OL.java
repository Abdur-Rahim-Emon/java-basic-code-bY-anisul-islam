/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MethodOverloading;

/**
 *
 * @author Lenovo
 */
public class OL {
    void show(){
        System.out.println("nothing to show ");
    }
    void show(double a,double b){
        System.out.println(a+b);
    }
    void show(int a, int  b,int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        OL r1=new OL();
        r1.show();
        r1.show( 10.34f,1067);
        r1.show(10,30,40);
    }
}
