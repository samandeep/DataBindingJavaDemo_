package ca.sa.databindingjavademo.util;

/**
 * Created by samandeep on 22,February,2019
 */
public class StringUtil {
    public static String convertIntToString(int val){
        return String.valueOf(val);
    }

    public static String getQuantityString(int quantity){
        return ("Qty: "+String.valueOf(quantity));
    }
}
