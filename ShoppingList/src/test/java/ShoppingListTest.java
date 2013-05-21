package test.java;

import main.java.Item;
import main.java.ShoppingList;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ShoppingListTest {

    @Test
    public void shouldHoldASingleItem(){
        Item item = new Item("bread");
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(item);
        assertThat(shoppingList.contains(item), is(true));
    }

    @Test
    public void shouldHoldMultipleItems(){
        Item item = new Item("bread");
        Item item2 = new Item("milk");
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(item).add(item2);
        assertThat(shoppingList.contains(item, item2), is(true));
    }

    @Test
    public void shouldHaveAmountsOfEachItem(){
        Item item = new Item("bread");
        ShoppingList shoppingList = new ShoppingList();
        shoppingList.add(item);
        assertThat(shoppingList.quantityOf(item), is(1));
    }
}
