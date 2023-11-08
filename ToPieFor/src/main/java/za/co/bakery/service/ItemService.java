package za.co.bakery.service;

import java.util.List;
import za.co.bakery.model.Item;

public interface ItemService {

    public List<Item> getAllItems();

    public List<Item> getAllActiveItems();

    public List<Item> getAllItemsByCategory(int categoryId);

    public List<Item> getAllItemsByPrice(float price);

    public Item getItemById(int itemId);
    
    public Item getItemNameById(int itemId);

    public Item getItemByName(String itemName);

    public boolean addItem(Item item);

    public boolean editItem(Item item);

    public boolean activateItem(Item item);
}
