package christmas.model.menu.appetizer;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.*;
import static christmas.model.menu.utils.MenuPrice.*;

public class Tapas {

    private final String name = TAPAS.getMenu();
    private final int price = TAPAS_PRICE.getPrice();
    private int count;

    public Tapas() {
        this.count++;
        addAppetizer();
        addPayment();
    }

    private void addAppetizer() {
        MenuCount menuCount = MenuCount.getInstance();
        menuCount.addAppetizerCount();
    }

    private void addPayment() {
        MenuAllPrice menuAllPrice = MenuAllPrice.getInstance();
        menuAllPrice.addPayment(price);
    }
}
