public class NumberToWords {
    public static void numberToWords (int number){
        String snum;
        snum = String.valueOf(number);
        String a,b;
        a = "0";
        b = "0";
        int sum = 0;
        int aux = 0;
        if (number<0) System.out.println("Invalid Value");
        else {
            for (int i = 0; i < snum.length(); i++) {
                    a = snum.substring(i, i + 1);
                    //aux = Integer.parseInt(a);
                    if (a.equals("0")) System.out.println("Zero");
                    else if (a.equals("1")) System.out.println("One");
                    else if (a.equals("2")) System.out.println("Two");
                    else if (a.equals("3")) System.out.println("Tree");
                    else if (a.equals("4")) System.out.println("Four");
                    else if (a.equals("5")) System.out.println("Five");
                    else if (a.equals("6")) System.out.println("Six");
                    else if (a.equals("7")) System.out.println("Seven");
                    else if (a.equals("8")) System.out.println("Eight");
                    else if (a.equals("9")) System.out.println("Nine");
            }
        }
    }
}
