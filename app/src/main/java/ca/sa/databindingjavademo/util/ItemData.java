package ca.sa.databindingjavademo.util;

import java.math.BigDecimal;
import java.util.HashMap;

import ca.sa.databindingjavademo.R;
import ca.sa.databindingjavademo.models.Item;

/**
 * Created by samandeep on 22,February,2019
 */
public class ItemData {
    public Item[] ITEMS={ITEM1,ITEM2,ITEM3,ITEM4,ITEM5,ITEM6};

    HashMap<String, Item> ITEMS_MAP=new HashMap<>();

    public ItemData() {
        for(Item item:ITEMS){
            ITEMS_MAP.put(String.valueOf(item.getSerial_number()),item);
        }
    }

    public static final Item ITEM1 = new Item("ITEM 1", "Demo descriprion item 1 ",
            R.drawable.ic_launcher_foreground, new BigDecimal(40.37), new BigDecimal(8.50),
            234, new BigDecimal(3.5), 4576231);
    public static final Item ITEM2 = new Item("ITEM 2", "Demo descriprion item 2 ",
            R.drawable.ic_launcher_foreground, new BigDecimal(30.37), new BigDecimal(3.50),
            645, new BigDecimal(2.3), 2735964);
    public static final Item ITEM3 = new Item("ITEM 3", "Demo descriprion item 3 ",
            R.drawable.ic_launcher_foreground, new BigDecimal(50.37), new BigDecimal(5.44),
            234, new BigDecimal(5.0), 7456387);
    public static final Item ITEM4 = new Item("ITEM 4", "Demo descriprion item 4 ",
            R.drawable.ic_launcher_foreground, new BigDecimal(10.37), new BigDecimal(2.50),
            522, new BigDecimal(4.0), 7834264);
    public static final Item ITEM5=new Item("ITEM 5","Demo description item 5 lla",
            R.drawable.ic_launcher_foreground,new BigDecimal(34.56),
            new BigDecimal(0.00),456,new BigDecimal(3.00),4664376);
    public static final Item ITEM6=new Item("ITEM 6","Demo description item 6 lla",
            R.drawable.ic_launcher_foreground,new BigDecimal(26.72),
            new BigDecimal(3.40),325,new BigDecimal(5.00),1285634);

}
