package Cards;
import java.util.Scanner;

public class Creating {

        public static Age60100 basic (int gr){
            Scanner enter = new Scanner(System.in);
            System.out.println("Введите пол ");
            String p = enter.next();
            System.out.println("Введите фамилию ");
             String surname = enter.next();
             Age60100 bass = new Age60100(p, surname, gr, null, null, false, 0, 0, 0);
             return bass;
        }

    public static Age60100 age1830 (int gr){
        Age60100 bass = basic (gr);
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите образование ");
        String school = enter.next();
        System.out.println("Введите место работы ");
        String work = enter.next();
        Age60100 age1830 = new Age60100(bass.p, bass.surname, bass.gr, school, work, false, 0, 0, 0);
        return age1830;
    }

    public static Age60100 age3060 (int gr){
            Age60100 bass = age1830(gr);
            boolean family;
        Scanner enter = new Scanner(System.in);
        System.out.println("Наличие семьи 1 - да, 2 - нет ");
        int fam = enter.nextInt();
                if (fam == 1) family = true;
                else family = false;
        System.out.println("Введите количество детей ");
        int kids = enter.nextInt();
        Age60100 age3060 = new Age60100(bass.p, bass.surname, bass.gr, bass.school, bass.work, family, kids, 0, 0);
        return age3060;
        }

        public static Age60100 age60100 (int gr){
            Age60100 bass = age3060(gr);
            Scanner enter = new Scanner(System.in);
            System.out.println("Введите количество внуков ");
            int kids2 = enter.nextInt();
            System.out.println("Ваш трудовой стаж составляет ");
            int workage = enter.nextInt();
         Age60100 age60100 = new Age60100(bass.p, bass.surname, bass.gr, bass.school, bass.work, bass.family, bass.kids, kids2, workage);
         return age60100;
        }


}
