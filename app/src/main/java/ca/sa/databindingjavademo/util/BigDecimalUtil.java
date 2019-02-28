package ca.sa.databindingjavademo.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by samandeep on 22,February,2019
 */
public class BigDecimalUtil {
    public static String getValue(BigDecimal value){
        DecimalFormat decimalFormat=new DecimalFormat("###,###,###.00");
        return String.valueOf(decimalFormat);
    }

    /*
    * float value
    */
    public static float getFloat(BigDecimal value){
        return value.floatValue();
    }
}
