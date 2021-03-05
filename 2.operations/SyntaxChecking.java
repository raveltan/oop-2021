import java.util.Scanner;

import java.util.*; 
  
public class SyntaxChecking { 
  
    // function to check if brackets are balanced 
    static boolean balanced(String expr) 
    { 

        Deque<Character> stack 
            = new ArrayDeque<Character>(); 

        for (int i = 0; i < expr.length(); i++)  
        { 
            char x = expr.charAt(i); 
  
            if (x == '(' || x == '[' || x == '{')  
            { 
                stack.push(x); 
                continue; 
            } 

            if (stack.isEmpty()) 
                return false; 

            char check; 

            switch (x) { 
                case ')': 
                    check = stack.pop(); 
                    if (check == '{' || check == '[') 
                        return false; 
                    break; 
    
                case '}': 
                    check = stack.pop(); 
                    if (check == '(' || check == '[') 
                        return false; 
                    break; 
    
                case ']': 
                    check = stack.pop(); 
                    if (check == '(' || check == '{') 
                        return false; 
                    break; 
                } 
        } 
  
        // Check Empty Stack 
        return (stack.isEmpty()); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        int counter = 0;
        while(counter<3){
            String expr = "";
            System.out.println("Please provide a string to be checked: ");
            expr = obj.nextLine();
            // Function call 
            if (balanced(expr)) 
                System.out.println("Balanced "); 
            else
                System.out.println("Not Balanced "); 

            counter++;
        }

    } 
} 