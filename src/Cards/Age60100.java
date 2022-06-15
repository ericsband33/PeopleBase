package Cards;
//внуки, трудовой стаж
public class Age60100 extends Age3060 {
    int kids2, workage;

    Age60100(String p, String surname, int gr, String school, String work, boolean family, int kids, int kids2, int workage){
        super(p, surname, gr, school, work, family, kids);
        this.kids2 = kids2;
        this.workage = workage;
    }
}
