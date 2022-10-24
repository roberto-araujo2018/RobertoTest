public class EvenDigitSum {
    public static int getEvenDigitSum (int number){
        String snum;
        snum = String.valueOf(number);
        String a,b;
        a = "0";
        b = "0";
        int sum = 0;
        int aux = 0;
        if (number<0) return -1;
        else {
            for (int i = 0; i < snum.length(); i++) {
                a = snum.substring(i, i + 1);
                aux = Integer.parseInt(a);
                if (aux % 2 == 0) sum = sum + aux;
            }
            return sum;
        }

    }
}
