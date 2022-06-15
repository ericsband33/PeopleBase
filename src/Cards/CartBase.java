package Cards;

//import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// картотека общая с массивом объектов Age60100
public class CartBase {
    public Age60100[] carts = new Age60100[10];
    int n = 0;

    //метод проверки наличия свободных ячеек картотеки
    public void newUser (){
        Scanner enter = new Scanner(System.in);
        try {
            //n++;
           // carts[n].p = "0"; carts[n].gr = 0; carts[n].surname = "0"; carts[n].school = "0"; carts[n].work = "0";
            //carts[n].family = false; carts[n].kids = 0; carts[n].kids2 = 0; carts[n].workage = 0;

            System.out.println("Введите возраст ");
            int gr = enter.nextInt();
            creating(gr);
            n++;
        }catch (Exception e){
            System.out.println("ERROR " + e);
        }
        enter.close();
    }

    //метод создания записи
    public void creating (int gr){
        int grInd;//индикатор возрастного промежутка
        if (gr < 18){grInd = 1;}
        else if (gr < 30){grInd = 2;}
        else if (gr < 60){grInd = 3;}
        else grInd = 4;
        switch (grInd){
            case 1: {carts[n] = Creating.basic(gr);}
                    break;
            case 2: {carts[n] = Creating.age1830(gr);}
                    break;
            case 3: {carts[n] = Creating.age3060(gr);}
                    break;
            case 4: {carts[n] = Creating.age60100(gr);}
            break;
        }
    }

    //удаление записи
    public void delete(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите номер удаляемой записи ");
        int del = input.nextInt();
        Age60100 delt;
        try {
            carts[(del-1)] = null;
            for (int x = del; x < carts.length; x++){
                delt = carts[x];
                carts[x] = null;
                carts[x-1] = delt;
            }
        }catch (Exception e) {System.out.println("Ошибка " + e + "... Попробуйте снова");}
        input.close();
    }

    //вывод картотеки
    public void show(){
        for (int x = 0; x < carts.length; x++){
            System.out.print((x+1) + " ---- ");
            try {
                System.out.println("Пол " + carts[x].p + " -- Возраст " + carts[x].gr + " -- Фамилия " + carts[x].surname + " -- Образование " + carts[x].school + " -- Работа " + carts[x].work + " -- Семья " + carts[x].family + " -- Дети " + carts[x].kids + " -- Внуки " + carts[x].kids2 + " -- Стаж " + carts[x].workage);
            }catch (NullPointerException e){
                System.out.println(" FREE ---");
            }
        }
    }

}
