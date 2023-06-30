import java.math.BigInteger;

public class PlusOne {


    public static void main(String args[]){


    }

    public int[] plusOne(int[] digits) {

        int n = digits.length;
        String str = "";
        for(int i = 0;i<digits.length;i++){
            str = str +String.valueOf(digits[i]);
            System.out.println(str);
        }

        BigInteger temp = new BigInteger(str);
       // long temp = Long.valueOf(str);
        BigInteger a = BigInteger.valueOf(1);
        BigInteger res1 =  temp.add(a);
        //System.out.println("temp "+temp);
        //temp = temp +1;
        String resStr = res1.toString();
        //String resStr = String.valueOf(temp);
        int res[] = new int[resStr.length()];
        for(int i =0;i<res.length;i++){
            res[i] = Integer.valueOf(Character.toString(resStr.charAt(i)));
        }
        return res;

    }
}
