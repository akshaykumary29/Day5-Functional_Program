package com.Bridgelabz.functionalprograms;

/**
 * WAP to calcute Distance
 * calculate distance using this formula = sqrt(x*x + y*y)
 */
public class Distance {
    public static void main(String[] args) {

        // Declare variable using command line argument
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean Distance of points from origin(0,0)= " + String.format("%.4f", distance));

    }

}


