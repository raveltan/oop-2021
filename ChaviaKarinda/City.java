package com.java.learn;

import java.util.Scanner;

public class City{

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
 
        list1.add("JADE");
 
        list1.add("JAU");
 
        list1.add("JAMAICA");
 
        list1.add("SERVLETS");
 
        list1.add("STRUTS");
 
        System.out.println(list1);      //Output : [JADE, JAU, JAMAICA, SERVLETS, STRUTS]
 
        //getting an array containing all elements of the list
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
         
        list2.add(JAIPUR);
         
        list2.add(JACKSON);
         
        list2.add(JEJU);
         
        list2.add(JOHOR);
 
        System.out.println(list2);    
         
        //Combining list1 and list2
         
        list1.addAll(list2);
         
        System.out.println(list1);   
    }
}
        Object[] array = list.toArray();
 
        //Printing the elements of the returned array
        //This method returns an array containing all elements of the ArrayList
 
        for (Object object : array)
        {
            System.out.println(object);
        }
 
//      Output :
 
//      JADE
//      JAU
//      JAMAICA
//      SERVLETS
//      STRUTS
//      JAIPUR
//      JACKSON
//      JEJU
//      JOHOR
    }
}