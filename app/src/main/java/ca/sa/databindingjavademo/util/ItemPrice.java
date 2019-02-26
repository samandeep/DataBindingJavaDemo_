package ca.sa.databindingjavademo.util;

import java.math.BigDecimal;
import java.util.HashMap;

import ca.sa.databindingjavademo.models.Item;

/**
 * Created by samandeep on 22,February,2019
 */
public class ItemPrice {
    public static final HashMap<String, BigDecimal> ITEM_PRICES;
    static {
        ITEM_PRICES= new HashMap<String, BigDecimal>();
        ItemData itemData=new ItemData();
        for (Item item: itemData.ITEMS){
            ITEM_PRICES.put(String.valueOf(item.getSerial_number()),item.getPrice());
        }

    }
    public static HashMap<String, BigDecimal> getItemPrices(){
        return ITEM_PRICES;
    }
}
