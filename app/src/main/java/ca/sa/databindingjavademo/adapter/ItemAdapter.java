package ca.sa.databindingjavademo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.List;

import ca.sa.databindingjavademo.R;
import ca.sa.databindingjavademo.databinding.ItemHomeLayoutBinding;
import ca.sa.databindingjavademo.interfaces.IMainActivity;
import ca.sa.databindingjavademo.models.Item;


/**
 * Created by samandeep on 25,February,2019
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.BindingHolder> {

    /**
     * items list and context variables
     */
    private List<Item> mItems;
    private Context mContext;

    public ItemAdapter(Context context, List<Item> mItems) {
        this.mItems = mItems;
        this.mContext = context;
    }

    public void refreshList(List<Item> items){
        mItems.clear();
        mItems.addAll(items);
        notifyDataSetChanged();
    }

    @Override
    public BindingHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        ItemHomeLayoutBinding mBinding=DataBindingUtil.inflate(
                LayoutInflater.from(mContext), R.layout.item_home_layout, viewGroup, false);

        return new BindingHolder(mBinding.getRoot());

    }

    @Override
    public void onBindViewHolder(BindingHolder bindingHolder, final int position) {
        Item item = mItems.get(position);

        bindingHolder.itemLayoutBinding.setIMainActivity((IMainActivity)mContext);
        bindingHolder.itemLayoutBinding.setItem(item);
        bindingHolder.itemLayoutBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class BindingHolder extends RecyclerView.ViewHolder{
        ItemHomeLayoutBinding itemLayoutBinding;
        public BindingHolder(View itemView) {
            super(itemView);
            itemLayoutBinding= DataBindingUtil.bind(itemView);
        }
    }
}
