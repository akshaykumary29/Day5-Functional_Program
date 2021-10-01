package com.Bridgelabz;

/**
 * Calculate the Wind Chill
 */
public class WindChill {
    public static void main(String[] args) {

        // Declare variable using command line argument
        Double t = Double.parseDouble(args[0]);
        Double v = Double.parseDouble(args[1]);

        Double w = 0.0;

        w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);

        System.out.println("Wind chill is : " + w);
    }
}
