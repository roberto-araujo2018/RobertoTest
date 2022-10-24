public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        CharSequence snum1;
        CharSequence snum2;
        CharSequence snum3;
        int ldnum1, ldnum2, ldnum3;
        if (num1 <10 || num1 >1000 || num2 <10 || num2 >1000 || num3 <10 || num3 >1000)
            return false;
        else {
            snum1 = String.valueOf(num1);
            snum2 = String.valueOf(num2);
            snum3 = String.valueOf(num3);

            snum1 = snum1.subSequence(snum1.length()-1, snum1.length());
            snum2 = snum2.subSequence(snum2.length()-1, snum2.length());
            snum3 = snum3.subSequence(snum3.length()-1, snum3.length());
            if (!snum1.equals(snum2) && !snum2.equals(snum3) && !snum1.equals(snum3)) return false;
            else return true;
        }
    }
    public static boolean isValid(int num){
        if (num<10 || num>1000) return false;
        else return true;
    }
}
