package au.com.softclient.livedatawithdatabinding1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import au.com.softclient.livedatawithdatabinding1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
    private MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // To Define relevant Layout for this Activity using -> Data Binding
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        //Creating Instance of ViewModel using -> ViewModelProvider
        myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        // To Archive Live Dat Update
        mainBinding.setViewModel(myViewModel);
        mainBinding.setLifecycleOwner(this);

        mainBinding.textInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                myViewModel.setMessage(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        myViewModel.getMessage().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String message) {
                if ("Hello".equals(message)) {
                    Toast.makeText(getApplicationContext(), "Bye", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}