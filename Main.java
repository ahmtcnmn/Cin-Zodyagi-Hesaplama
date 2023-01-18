import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int yil;
        out.print("Çin Zodyağı hesaplamaya hoşgeldiniz.\nDoğum Yılınızı giriniz lütfen : ");
        yil = (input.nextInt()) % 12;
        switch (yil) {
            case 0:
                out.printf("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                out.printf("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                out.printf("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                out.printf("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 4:
                out.printf("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                out.printf("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                out.printf("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                out.printf("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 8:
                out.printf("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                out.printf("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                out.printf("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                out.printf("Çin Zodyağı Burcunuz : Koyun");
                break;


        }

    }
}