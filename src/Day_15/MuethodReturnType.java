package Day_15;

public class MuethodReturnType {
    public static void main(String[] args) {

        // System.out.println(sonRakamKontrol(12,144));
        // System.out.println(sonRakamKontrol(23,33));
        //boolean bl = sonRakamKontrol(12, 444);
        //System.out.println("bl = " + bl);

        // System.out.println(primeNumber(33));
        //System.out.println(primeNumber(14));
        //System.out.println(convertToPozitif(-15));
        //System.out.println(convertToPozitif(-5));
        //System.out.println(gecmeNotu(105,95,100));
        //System.out.println(gecmeNotu5(95,55,99)); benim çözüm


    }

    public static boolean sonRakamKontrol(int a, int b) {
        return a % 10 == b % 10;
    }

    public static boolean primeNumber(int num) {
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int convertToPozitif(int a) {
        //return Math.abs(a);
        return a > 0 ? a : -a;
    }

    public static char gecmeNotu(double not1, double not2, double not3) {
        double ortalama = (not1 + not2 + not3) / 3;
        if (ortalama >= 76 && ortalama <= 100) {
            return 'A';
        } else if (ortalama >= 51 && ortalama <= 75) {
            return 'B';
        } else if (ortalama >= 0 && ortalama <= 50) {
            return 'C';
        }
        return 'D';
    }
// 2. yöntem

    public static char gecmeNotu1(double not1, double not2, double not3) {
        double ortalama = (not1 + not2 + not3) / 3;
        char not ='x';

        if (ortalama >= 76 && ortalama <= 100) {
            not = 'A';
        } else if (ortalama >= 51 && ortalama <= 75) {
            not = 'B';
        } else if (ortalama >= 0 && ortalama <= 50) {
            not = 'C';
        }
        return not;
    }

// my solution is here...
    public static char gecmeNotu5(double a, double b, double c) {
        double ort=(a+b+c)/3;
        if (ort >= 76 && ort <= 100) {
            return 'A';
        } else if (ort>= 51 && ort <= 75) {
            return 'B';
        } else if(ort>=0&& ort<=50){
            return 'C';
        }
        return 'X';
    }


}
