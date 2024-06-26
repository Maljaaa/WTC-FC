package christmas.model.menu.appetizer;

import christmas.model.menu.MenuAllPrice;
import christmas.model.menu.MenuCount;

import static christmas.model.menu.utils.MenuName.CAESAR_SALAD;
import static christmas.model.menu.utils.MenuPrice.CAESAR_SALAD_PRICE;

public class CaesarSalad {

    private final String name = CAESAR_SALAD.getMenu();
    private final int price = CAESAR_SALAD_PRICE.getPrice();
    private int count;

    public CaesarSalad() {
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
