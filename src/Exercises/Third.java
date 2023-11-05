package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//A simple project on earnings made in a particular shop

public class Third {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<String> list = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
    static ArrayList<Integer> sList = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Start adding");
        addEarnings();
        while(true){
            System.out.println("Choose what to do : \n\n1-Show the earnings for each day \n2-Show the average earning for this week \n3-Show the days that earned above average \n4-Show the days that earned below average \n5-Quit the system");
            int a = scan.nextInt();
            if(a==1){
                showTheEarnings();
            }else if(a==2){
                System.out.println(getTheAverageEarnings());
                System.out.println();
            }else if(a==3){
                showTheDaysAboveTheAverage();
            }else if(a==4){
                showTheDaysBelowTheAverage();
            }else if(a==5){
                break;
            }else{
                System.out.println("There is no such an option!");
            }
        }
        System.out.println("Thank you for using our system :)");
    }
    static void addEarnings(){
        for (String s : list) {
            System.out.print("Earning for the day " + s + " is  : ");
            int y = scan.nextInt();
            sList.add(y);
        }
    }
    static void showTheEarnings(){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i)+" = "+sList.get(i));
        }
        System.out.println();
    }
    static double getTheAverageEarnings(){
        int sum = 0;
        for(Integer w : sList){
            sum+=w;
        }
        return (double) sum/sList.size();
    }
    static void showTheDaysAboveTheAverage(){
        double av = getTheAverageEarnings();
        for(int i = 0; i< sList.size(); i++){
            if(sList.get(i)>av){
                System.out.println(list.get(i)+" with "+sList.get(i));
            }
        }
        System.out.println();
    }
    static void showTheDaysBelowTheAverage(){
        double av = getTheAverageEarnings();
        for(int i = 0; i< sList.size(); i++){
            if(sList.get(i)<av){
                System.out.println(list.get(i)+" with "+sList.get(i));
            }
        }
        System.out.println();
    }
}
