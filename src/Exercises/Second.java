package Exercises;

import java.util.HashMap;

//The code to print out the number of occurrence of all the letters in a sentence given

public class Second {
    public static void main(String[] args) {
        String a = "I took it away from you".toLowerCase().replaceAll("[^a-z]","");
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i = 0; i<a.length(); i++){
            Integer x = h.get(a.charAt(i));
            if(x==null){
                h.put(a.charAt(i),1);
            }else{
                h.replace(a.charAt(i),x+1);
            }
        }
        System.out.println(h);
    }
}
