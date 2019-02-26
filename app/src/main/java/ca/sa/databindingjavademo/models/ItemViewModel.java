package ca.sa.databindingjavademo.models;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


/**
 * Created by samandeep on 26,February,2019
 */
public class ItemViewModel extends BaseObservable {
    private Item item;

   @Bindable
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
//        notifyPropertyChanged(BR.item);
    }
}
