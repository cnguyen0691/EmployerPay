package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your hour: ");
        double hour = input.nextInt();
        System.out.println("Enter your pay rate: ");
        double rate = input.nextInt();
        double pay=0.0;
        if (hour >60 || rate >25 ){
            System.out.println("Out of rang!!");
        }else if (hour<=60 && hour>35 && rate<25){
            pay = ((35*rate) + (hour-35)*(rate*1.5));
        }else if(hour<=35 && rate<25){
            pay = (hour*rate);

        }

        System.out.println("Tota: "+ pay);
    }
}
