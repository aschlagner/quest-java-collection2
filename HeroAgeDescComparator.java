import java.util.Comparator;

public class HeroAgeDescComparator implements Comparator<Hero> {
    
    @Override
    public int compare(Hero myHero1, Hero myHero2) {
        if (myHero1.getAge() > myHero2.getAge()) return -1;
        if (myHero1.getAge() < myHero2.getAge()) return 1;
        return 0;
    }
}
