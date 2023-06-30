import java.util.*;

public class ValidParenthesis {

    public static void main(String args[]){
        System.out.println(validCheck("{{{{}}}"));


    }

    public static boolean validCheck(String str){
        boolean res = false;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i)=='{' || str.charAt(i)=='[' || str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else{
                if( stack.size()==0){
                    res = false;
                    break;
                }
                Character top = stack.peek();
                if((top == '{' && str.charAt(i)=='}') || (top == '(' && str.charAt(i)==')') || (top == '[' && str.charAt(i)==']') ){
                    stack.pop();
                    if(stack.size()==0){
                        res=true;
                    }
                }
                else{
                    res = false;
                    break;
                }

            }
        }

        return res;
    }

}
