package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class basic_stats_info {
    public static void main(String[] args){
        // here, I'm using arraylist instead of array because I am prompting the user to input numbers
        // and I don't know how many numbers that the user will input
        java.util.ArrayList<Float> data = new ArrayList<Float>();
        System.out.println("Please input data as floats");
        float data_point;
        do{
            Scanner scanner = new Scanner(System.in);
            data_point = scanner.nextFloat();
            data.add(data_point);
        } while(data_point != -0);
        float mean = 0, variance = 0; int n = data.size();
        for(Float d_point : data) mean += d_point;
        mean /= n;
        for(Float d_point : data) variance += (d_point-mean)*(d_point-mean);
        variance /= n;
        double std_dev = Math.sqrt(variance);
        Collections.sort(data);
        Float median = n % 2 == 1 ? data.get((n+1)/2 - 1) :
                data.get((n/2 - 1)) + data.get(n/2);
        System.out.printf(("The mean is %f\nThe median is %f\n The variance is " +
                "%f\n The standard deviation is %f"), mean, median, variance, std_dev);
    }
}
