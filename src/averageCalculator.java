import java.util.Scanner;
public class averageCalculator {
    public static void main(String[] args) {
        float math, phys, turk, chem, music, dersSayisi = 0f, total = 0f, ZeroOrH = 0f, notTotal = 0;
        Scanner not = new Scanner(System.in);
        System.out.println("Matematik dersinize ait notunuzu yaziniz:    ");
        math = not.nextFloat();
        if (math >= 0 && math <= 100) {
            total += math;
            dersSayisi++;
            notTotal += math;
        }
        else System.out.println("Girdiginiz degeri kontrol edin. Aksi taktirde not ortalamaniz " +
                "hesaplanamaz ve basarisiz gozukursunuz.");
        System.out.println("Fizik dersinize ait notunuzu yaziniz:    ");
        phys = not.nextFloat();
        if (phys >= 0 && phys <= 100) {
            total += phys;
            dersSayisi++;
            notTotal += phys;
        }
        else System.out.println("Girdiginiz degeri kontrol edin. Aksi taktirde not ortalamaniz " +
                "hesaplanamaz ve basarisiz gozukursunuz.");
        System.out.println("Turkce dersinize ait notunuzu yaziniz:    ");
        turk = not.nextFloat();
        if (turk >= 0 && turk <= 100) {
            total += turk;
            dersSayisi++;
            notTotal += turk;
        }
        else System.out.println("Girdiginiz degeri kontrol edin. Aksi taktirde not ortalamaniz " +
                "hesaplanamaz ve basarisiz gozukursunuz.");
        System.out.println("Kimya dersinize ait notunuzu yaziniz:    ");
        chem = not.nextFloat();
        if (chem >= 0 && chem <= 100) {
            total += chem;
            dersSayisi++;
            notTotal += chem;
        }
        else System.out.println("Girdiginiz degeri kontrol edin. Aksi taktirde not ortalamaniz " +
                "hesaplanamaz ve basarisiz gozukursunuz.");
        System.out.println("Muzik dersinize ait notunuzu yaziniz:    ");
        music = not.nextFloat();
        if (music >= 0 && music <= 100) {
            total += music;
            dersSayisi++;
            notTotal += music;
        }
        else System.out.println("Girdiginiz degeri kontrol edin. Aksi taktirde not ortalamaniz " +
                "hesaplanamaz ve basarisiz gozukursunuz.");
        float average = total / dersSayisi;
        if (notTotal == 0 || average < 55) {
            System.out.println("Basarisiz.");
        } else if (notTotal >= 55) {
            System.out.println("Basarili");
        }
        System.out.println("Not ortalamaniz=    " + average);

    }
}
