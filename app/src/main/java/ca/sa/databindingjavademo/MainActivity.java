package ca.sa.databindingjavademo;

import android.databinding.DataBindingUtil;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import ca.sa.databindingjavademo.databinding.ActivityMainBinding;
import ca.sa.databindingjavademo.interfaces.IMainActivity;
import ca.sa.databindingjavademo.models.Item;

public class MainActivity extends AppCompatActivity implements IMainActivity {
    private static final String TAG = "MainActivity";
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        init();
    }

    private void init(){
        HomeFragment viewProductFragment=new HomeFragment();
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.activity_main_container,viewProductFragment, getString(R.string.home_fragment));
        fragmentTransaction.commit();
    }

    @Override
    public void inflateViewItemFragment(Item item) {
        Log.d(TAG, "inflateViewProductFragment: called.");

        ViewProductFragment fragment = new ViewProductFragment();

        Bundle bundle = new Bundle();
        bundle.putParcelable(getString(R.string.intent_Item), item);
        fragment.setArguments(bundle);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.activity_main_container, fragment, getString(R.string.view_product_fragment));
        transaction.addToBackStack(getString(R.string.view_product_fragment));
        transaction.commit();
    }
}
