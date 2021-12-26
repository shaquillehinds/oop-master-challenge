package bb.main;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("regular", "beef");
        System.out.println(hamburger.getTotal());
        hamburger.addAdditional("lettuce");
        hamburger.addAdditional("tomato");
        System.out.println(hamburger.getTotal());
        hamburger.addAdditional("pickles");
        hamburger.addAdditional("cheese");
        System.out.println(hamburger.getTotal());
        hamburger.addAdditional("ketchup");
        hamburger.addAdditional("ketchup");
        System.out.println(hamburger.getOrderSummary());

        HealthyHamburger healthyHamburger = new HealthyHamburger("pork");
        healthyHamburger.addAdditional("tomato");
        healthyHamburger.addAdditional("pickles");
        healthyHamburger.addAdditional("cheese");
        System.out.println(healthyHamburger.getOrderSummary());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Regular", "beef");
        deluxeHamburger.addAdditional("cheese");
        System.out.println(deluxeHamburger.getOrderSummary());
    }
}
