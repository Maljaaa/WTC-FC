package christmas.model.menu.main;

import christmas.model.menu.MenuCount;

import static christmas.model.menu.MenuName.*;
import static christmas.model.menu.MenuPrice.*;

public class ChristmasPasta {

    private final String name = CHRISTMAS_PASTA.getMenu();
    private final int price = CHRISTMAS_PASTA_PRICE.getPrice();
    private int count;

    public ChristmasPasta() {
        this.count++;
        addMain();
    }

    private void addMain() {
        MenuCount menuCount = new MenuCount();
        menuCount.addMainCount();
    }
}
