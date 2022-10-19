import java.lang.*;
public class NumberPalindrome {
    public static boolean isPalindrome (int num){
        String snum;
        if (num <0) num= num * -1;
        snum = String.valueOf(num);
        String a;
        String b;
        int intFim = snum.length() -1;
        boolean isEqual = true;
        for (int i=0; i < snum.length(); i++) {
            //System.out.println("a "+snum.substring(i,i +1));
            a = snum.substring(i,i +1);
            b = snum.substring(intFim,intFim +1);

            if (!a.equals(b)) {
                //System.out.println("a."  + a + ".b." + b + ".");
                isEqual = false;
            }
                //System.out.println("i " + i + " intfim " + intFim + " num " +snum.substring(intFim,intFim +1));
            intFim--;
        }

        return isEqual;
    }
}
