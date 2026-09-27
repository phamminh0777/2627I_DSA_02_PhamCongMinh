package Week3.BT;
public class BalancedBrackets{
    public static String isBalance(String s){
        Mystack<Character> stack = new Mystack<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')'){
                if(stack.isEmpty()) return "No";

                char top = stack.pop();

                if((ch == '}' && top != '{') ||
                   (ch == ']' && top != '[') ||
                   (ch == ')' && top != '(')) {
                    return "No";
                }

            }

        }

        if(stack.isEmpty()){
            return "Yes";

        }else {
            return "No";
        }
    }

    public static void main(String[] args) {
        System.out.println(isBalance("{[()]}"));
        System.out.println(isBalance("{[()[]}"));
    }
}