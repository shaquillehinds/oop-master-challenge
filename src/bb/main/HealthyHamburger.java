package bb.main;

public class HealthyHamburger extends Hamburger{
    private int maxAdditionals=2;

    public HealthyHamburger(String meat) {
        super("Brown Rye", meat, "Healthy Hamburger");
    }

    @Override
    public int getMaxAdditionals(){
        return maxAdditionals;
    }
}
