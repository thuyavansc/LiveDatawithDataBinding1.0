package au.com.softclient.livedatawithdatabinding1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import au.com.softclient.livedatawithdatabinding1.MyViewModel;
import au.com.softclient.livedatawithdatabinding1.R;
import au.com.softclient.livedatawithdatabinding1.databinding.ActivityMainBinding;
import au.com.softclient.livedatawithdatabinding1.databinding.FragmentFirstBinding;
import au.com.softclient.livedatawithdatabinding1.viewmodels.FirstFragViewModel;
import au.com.softclient.livedatawithdatabinding1.viewmodels.UserViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FirstFragViewModel firstFragViewModel;
    private MyViewModel myViewModel;
    private UserViewModel userViewModel;
    private FragmentFirstBinding firstFragBinding;


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FirstFragment newInstance(String param1, String param2) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false);

        // Inflate the layout for this fragment
        firstFragBinding = FragmentFirstBinding.inflate(inflater, container, false);
        View view = firstFragBinding.getRoot();

        // Obtain the ViewModel
        //firstFragViewModel = new ViewModelProvider(this).get(FirstFragViewModel.class);
        //myViewModel = new ViewModelProvider(this).get(MyViewModel.class);
        //userViewModel = new ViewModelProvider(requireActivity()).get(UserViewModel.class);
        firstFragViewModel = new ViewModelProvider(requireActivity()).get(FirstFragViewModel.class);

        // Set the ViewModel and the lifecycle owner
        //firstFragBinding.setViewModel(firstFragViewModel);
        //firstFragBinding.setViewModel(myViewModel);
        //firstFragBinding.setViewModel(userViewModel);
        //firstFragBinding.setUserViewModel(userViewModel);
        firstFragBinding.setFrag1ViewModel(firstFragViewModel);
        firstFragBinding.setLifecycleOwner(this);

        firstFragBinding.textInputEditText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //myViewModel.setMessage(s.toString());
                //firstFragViewModel.setMessage(s.toString());
                //userViewModel.setMessage(s.toString());
                firstFragViewModel.setMessage(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        return view;


    }
}