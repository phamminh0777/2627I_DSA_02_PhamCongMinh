package Week3.algorithm;
import java.util.*;
class parentheses{
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == '[' || ch == '{' || ch == '('){
                stack.push(ch);
            }else if(ch == ']' || ch == '}' || ch == ')'){
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if((ch == ']' && top != '[') ||
                   (ch == '}' && top != '{') ||
                   (ch == ')' && top != '(')){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        System.out.println(isBalanced("[{()}]"));
        System.out.println(isBalanced("[{()])}]"));

    }
}