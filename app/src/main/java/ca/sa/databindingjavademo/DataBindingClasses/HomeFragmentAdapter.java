package ca.sa.databindingjavademo.DataBindingClasses;

import android.databinding.BindingAdapter;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

import ca.sa.databindingjavademo.adapter.ItemAdapter;
import ca.sa.databindingjavademo.models.Item;

/**
 * Created by samandeep on 25,February,2019
 */
public class HomeFragmentAdapter {

    private static final int NUM_COLUMNS = 2;

    @BindingAdapter("itemsList")
    public static void setItemsList(RecyclerView view, List<Item> items){
        if(items == null){
            return;
        }

        RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
        if(layoutManager == null){
            view.setLayoutManager(new GridLayoutManager(view.getContext(), NUM_COLUMNS));
        }

        ItemAdapter adapter = (ItemAdapter) view.getAdapter();
        if(adapter == null){
            adapter = new ItemAdapter(view.getContext(),items);
            view.setAdapter(adapter);
        }
    }

}
