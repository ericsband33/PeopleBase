package Operations;

import Cards.*;

import java.util.Scanner;

// вводный класс, приветствие, выбор действия
public class Intro {
    public static void main(String[] args) {
        CartBase base = new CartBase();
        Scanner inp = new Scanner(System.in);
        int choise;
        do {
            System.out.println("*** --- HELLO, Dolly --- *** ");
            System.out.println("Выберите действие ");
            System.out.println("1. Внести данные ");
            System.out.println("2. Удалить данные ");
            System.out.println("3. Просмотр картотеки ");
            choise = inp.nextInt();
            switch (choise){
                case 1 : {base.newUser();} break;
                case 2 : {base.delete();} break;
                case 3 : {base.show();} break;
            }
        } while (choise < 4);
        System.out.println("Всего доброго.");
    }
}
