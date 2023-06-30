import java.util.Stack;

public class ValidParentheses {

    public static void main(String args[]){

        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        Stack st = new Stack();
        boolean isValid = true;
        boolean flag = true;
        for(int i =0;i<s.length();i++){
            if (s.charAt(i) =='{' || s.charAt(i)=='[' || s.charAt(i)=='(') {
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) =='}'){
                if(st.isEmpty()){
                    isValid=false;
                    break;
                }
                else {
                    char p = (char) st.peek();
                    if (p != '{') {
                        isValid = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            else if(s.charAt(i) ==']'){
                if(st.isEmpty()){
                    flag=false;
                    isValid=false;
                    break;
                }
                else {
                    char p = (char) st.peek();
                    if (p != '[') {
                        isValid = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            else if(s.charAt(i) ==')'){
                if(st.isEmpty()){
                    flag=false;
                    isValid=false;
                    break;
                }
                else {
                    char p = (char) st.peek();
                    if (p != '(') {
                        flag=false;
                        isValid = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
        }
        if(st.isEmpty() && flag){
            isValid=true;
        }
        else{
            isValid=false;
        }
        return  isValid;
    }

}
