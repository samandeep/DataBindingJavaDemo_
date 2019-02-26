package ca.sa.databindingjavademo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import ca.sa.databindingjavademo.adapter.ItemAdapter;
import ca.sa.databindingjavademo.databinding.FragmentHomeBinding;
import ca.sa.databindingjavademo.models.Item;
import ca.sa.databindingjavademo.util.ItemData;

/**
 * Created by samandeep on 25,February,2019
 */
public class HomeFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {

    FragmentHomeBinding fragmentHomeBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentHomeBinding= FragmentHomeBinding.inflate(inflater);
        fragmentHomeBinding.swipeToRefresh.setOnRefreshListener(this);
        setItemsList();
        return fragmentHomeBinding.getRoot();
    }

    private void setItemsList() {
        ItemData items = new ItemData();
        List<Item> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(items.ITEMS));
        fragmentHomeBinding.setItems(productList);
    }

    @Override
    public void onRefresh() {
        ItemData items = new ItemData();
        List<Item> productList = new ArrayList<>();
        productList.addAll(Arrays.asList(items.ITEMS));
        ((ItemAdapter)fragmentHomeBinding.recylerViewItems.getAdapter()).refreshList(productList);
        onItemsLoadComplete();
    }

    void onItemsLoadComplete() {
        (fragmentHomeBinding.recylerViewItems.getAdapter()).notifyDataSetChanged();
        fragmentHomeBinding.swipeToRefresh.setRefreshing(false);
    }
}
