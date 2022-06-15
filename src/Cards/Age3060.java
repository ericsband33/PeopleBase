package Cards;
//семейное положение, дети
public class Age3060 extends Age1830 {
    boolean family;
    int kids;

    Age3060(String p, String surname, int gr, String school, String work, boolean family, int kids){
        super(p, surname, gr, school, work);
        this.family = family;
        this.kids = kids;
    }
}
