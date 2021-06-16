package oops_master_challenge;

public class hamburger {
    private String rollType,meat,nameBurger;
    private int lettuce=0, tomato=0, carrot=0;
    private int basePrice = 20, lettucePrice = 5, tomatoPrice = 5, carrotPrice = 5, additions = 0;
    private int finalPrice;

    public hamburger(String rollType, String meat, String nameBurger, int basePrice) {
        this.rollType = rollType;
        this.meat = meat;
        this.nameBurger = nameBurger;
        this.basePrice = basePrice;
    }

    public void setLettuce(int n){
        while(additions <= 4) {
            this.lettuce += 1;
            n--;
        }
    }

    public void setTomato(int n) {
        while(additions <= 4){
            this.tomato += 1;
            n--;
        }
    }

    public void setCarrot(int n) {
        while(additions <= 4){
            this.carrot += 1;
            n--;
        }
    }

    public void setFinalPrice() {
        this.finalPrice = lettuce*lettucePrice + tomato*tomatoPrice + carrotPrice*carrot;
    }

    public int getFinalPrice() {
        return finalPrice;
    }
}
