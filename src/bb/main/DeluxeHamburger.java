package bb.main;

public class DeluxeHamburger extends Hamburger{
    private int maxAdditionals=2;

    public DeluxeHamburger(String breadRollType, String meat) {
        super(breadRollType, meat, "Deluxe Hamburger");
        addAdditional("chips", 5);
        addAdditional("drink", 3);
    }

    @Override
    public int getMaxAdditionals(){
        return maxAdditionals;
    }
}
