package bb.main;

import java.util.ArrayList;
import java.util.List;

public class Hamburger {
    private String breadRollType;
    private String meat;
    private String name;
    private List<BurgerAdditional> burgerAdditionals = new ArrayList<BurgerAdditional>();
    private int maxAdditionals = 4;
    private double price;

    public Hamburger(String breadRollType, String meat){
        this(breadRollType, meat, "Regular Hamburger");
    }

    public Hamburger(String breadRollType, String meat, String name){
        this(breadRollType, meat,10, name);
    }


    public Hamburger(String breadRollType, String meat,double price, String name){
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public void addAdditional(String additional){
        if(burgerAdditionals.size() >= getMaxAdditionals()) {
            System.out.println("I'm sorry you can only choose " + getMaxAdditionals() + " additionals");
        }else{
           burgerAdditionals.add(burgerAdditionals.size(), new BurgerAdditional(additional));
        }
    }
    public void addAdditional(String additional, double price){
        if(burgerAdditionals.size() >= getMaxAdditionals()) {
            System.out.println("I'm sorry you can only choose " + getMaxAdditionals() + " additionals");
        }else{
           burgerAdditionals.add(burgerAdditionals.size(), new BurgerAdditional(additional, price));
        }
    }

    private void setMaxAdditionals(int max){
        maxAdditionals = max;
    }

    protected void setName(String nameOfBurger){
        name = nameOfBurger;
    }

    public double getTotal(){
        double sum = price;
        int numOfAdditions = burgerAdditionals.size();
        if(numOfAdditions < 1) return price;
        for (int i = 0; i < numOfAdditions; i++){
            sum+=burgerAdditionals.get(i).getPrice();
        }
        return sum;
    }

    public String getOrderSummary(){
        String summary = ""+name+"\nBase Price: $" + price + "\n";
        int numOfAdditions = burgerAdditionals.size();
        double sum = price;
        if(numOfAdditions > 0){
            summary+="Toppings: \n";
            for (int i = 0; i < numOfAdditions; i++){
                BurgerAdditional additional = burgerAdditionals.get(i);
                String name = additional.getName();
                sum+=additional.getPrice();
                double additionPrice =additional.getPrice();
                summary += (String.format("%s $%s \n",name, additionPrice));
            }
        }
        summary+=("Total: $"+sum);
        return summary;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public String getName() {
        return name;
    }

    public int getMaxAdditionals() {
        return maxAdditionals;
    }

    public double getPrice() {
        return price;
    }
}

class BurgerAdditional {
    private String name;
    private double price;

    public BurgerAdditional(String name){
        this(name, 2);

    }

    public BurgerAdditional(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

