package Cards;
//образование, место работы
//добавить метод выбора образования: начальное, среднее, высшее и др.
public class Age1830 extends Basic, Creating{
    String school, work;

    Age1830(String p, String surname, int gr, String school, String work){
        super(p, surname, gr);
        this.school = school;
        this.work = work;
    }
}
