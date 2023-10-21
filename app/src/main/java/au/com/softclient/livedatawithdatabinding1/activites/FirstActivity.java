package au.com.softclient.livedatawithdatabinding1.activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import au.com.softclient.livedatawithdatabinding1.R;
import au.com.softclient.livedatawithdatabinding1.databinding.ActivityFirstBinding;
import au.com.softclient.livedatawithdatabinding1.fragments.FirstFragment;
import au.com.softclient.livedatawithdatabinding1.fragments.SecondFragment;

public class FirstActivity extends AppCompatActivity {
    ActivityFirstBinding firstBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firstBinding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(firstBinding.getRoot());

        firstBinding.buttonF1.setOnClickListener(v -> {
            // Replace the current fragment with FirstFragment
            //Way -1
            /*
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(firstBinding.fragmentContainer.getId(), new FirstFragment());
            transaction.addToBackStack(null);
            transaction.commit();
             */
            //Way-2
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(firstBinding.fragmentContainer.getId(), new FirstFragment())
                    .addToBackStack(null)
                    .commit();

        });

        firstBinding.buttonF2.setOnClickListener(v -> {
            // Replace the current fragment with FirstFragment
            //Way-2
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(firstBinding.fragmentContainer.getId(), new SecondFragment())
                    .addToBackStack(null)
                    .commit();

        });
    }
}