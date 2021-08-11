package com.ram.com.ram.utility;

public class Utilityflipcoin {
    public void coinface(int num) {
        int head = 0;
        int tail = 0;

        for (int i = 1; i <= num; i++) {
            double x = Math.random(); //random between 0 and 1
            if (x >= 0.5) {
                System.out.println("Head");
                head += 1;
            } else {
                System.out.println("Tails");
                tail += 1;
            }
        }

        System.out.println("head count " + head);
        System.out.println("tail count " + tail);
        float percentagehead = (float) ((head * 100) / num);
        System.out.println("The Percentage of head :" + percentagehead);
        float percentagetail = (float) ((tail * 100) / num);
        System.out.println("The Percentage of tail :" + percentagetail);
    }
}
