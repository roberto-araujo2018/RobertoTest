public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        String snum;
        snum = String.valueOf(number);
        String a,b;
        a = "0";
        b = "0";
//        a = snum.substring(0,1);
//        b = snum.substring(snum.length()-1,snum.length());
        for (int i=0; i < snum.length(); i++) {
            if (i ==0) a = snum.substring(i,i +1);
             b = snum.substring(i,i +1);
            //System.out.println("i " + i + "--a " + a + " b " + b);
        }
        //System.out.println("a " + a + " b " + b);
        if (number<0) return -1;
        else return Integer.parseInt(a) + Integer.parseInt(b);
    }
}
