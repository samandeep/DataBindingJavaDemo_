package ca.sa.databindingjavademo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ca.sa.databindingjavademo.databinding.FragmentViewProductBinding;
import ca.sa.databindingjavademo.models.Item;
import ca.sa.databindingjavademo.util.ItemData;

/**
 * Created by samandeep on 22,February,2019
 */
public class ViewProductFragment extends Fragment {
    private static final String TAG="ViewProductFragment";

    //Data Binding
    FragmentViewProductBinding mBinding;
    //variables
    private Item mItem;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        if(bundle != null) {
            mItem = bundle.getParcelable(getString(R.string.intent_Item));
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding=FragmentViewProductBinding.inflate(inflater);

        mBinding.setItem(mItem);
        mBinding.setQty(1);

        return mBinding.getRoot();
    }
}
