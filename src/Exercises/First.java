package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//The code to print out the number of occurrence of each word in a sentence given

public class First {
    public static void main(String[] args) {
        String a = "Java is easy. Java is OOP. OOP makes java easy";
        String[]b = a.toLowerCase().replaceAll("[^0-9a-z ]","").split(" ");
        Arrays.sort(b);
        Map<String, Integer> c = new HashMap<>();

        for(String w : b){
            Integer x = c.get(w);
            if(x==null){
                c.put(w,1);
            }else{
                c.replace(w,x+1);
            }
        }
        System.out.println(c);
    }
}
