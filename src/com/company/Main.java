package com.company;

public class Main
{
    public <T> void disp(T arr[])
{
    System.out.println("this array has following element:");
    for(T ele:arr)
    {
        System.out.println(ele);
    }
    System.out.println(" ");
}
    public static void main(String[] args) {
    Integer num[]=new Integer[]{85,25,75,52};
    String names[]=new String[]{"nitya","nandini","neha"};
    Main m=new Main();
    m.disp(num);
    m.disp(names);

	// write your code here
    }
}
