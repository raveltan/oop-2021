package com.company;
import java.util.Stack;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Infix_Postfix{
    public static void main(String[] args){
        Stack<Character> stack = new Stack<>();
        final Scanner input = new Scanner(System.in);
        final Pattern infix_pattern = Pattern.compile("[A-Z0-9](?:[*/+^-][A-Z])*", Pattern.CASE_INSENSITIVE);
        final Pattern oprd = Pattern.compile("[A-Z0-9]");
        main_opt(input, infix_pattern, oprd, stack);
    }
    public static void main_opt(final Scanner input, final Pattern infix_pattern, final Pattern oprd, Stack<Character> stack){
        String inp = input.nextLine();
        Matcher matcher = infix_pattern.matcher(inp);
        boolean match = matcher.find();
        if(match){
            for(int i = 0; i < inp.length(); ++i){
                Character curr = inp.charAt(i);
                Matcher m_oprd = oprd.matcher(curr.toString());
                boolean curr_low = isLowP(curr);
                boolean curr_high = isHighP(curr), curr_highest = isHighestP(curr);
                boolean operand = m_oprd.find(), operator = curr_low || curr_high || curr_highest;
                if(operand){
                    System.out.print(curr);
                }
                else if(operator){
                    if(!stack.isEmpty()){
                        char top = stack.peek();
                        if(curr_highest){
                            stack.push(curr);
                        }
                        else if(curr_high){
                            while(isHighestP(top)){
                                System.out.print(top);
                                stack.pop();
                                top = stack.peek();
                            }
                            stack.push(curr);
                        }
                        else{
                            while(isHighP(top) || isHighestP(top)){
                                System.out.print(top);
                                stack.pop();
                                top = stack.peek();
                            }
                            stack.push(curr);
                        }
                    }
                    else stack.push(curr);
                }
            }
            while(!stack.isEmpty()){
                System.out.print(stack.peek());
                stack.pop();
            }
        }
    }
    public static boolean isLowP(char curr){
        return curr == '-' || curr == '+';
    }
    public static boolean isHighP(char curr){
        return curr == '*' || curr == '/';
    }
    public static boolean isHighestP(char curr){
        return curr == '^';
    }

}
