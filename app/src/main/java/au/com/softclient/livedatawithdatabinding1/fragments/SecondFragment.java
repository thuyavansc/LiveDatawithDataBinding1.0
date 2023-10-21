package au.com.softclient.livedatawithdatabinding1.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import au.com.softclient.livedatawithdatabinding1.R;
import au.com.softclient.livedatawithdatabinding1.databinding.FragmentFirstBinding;
import au.com.softclient.livedatawithdatabinding1.databinding.FragmentSecondBinding;
import au.com.softclient.livedatawithdatabinding1.viewmodels.FirstFragViewModel;
import au.com.softclient.livedatawithdatabinding1.viewmodels.SecondFragViewModel;
import au.com.softclient.livedatawithdatabinding1.viewmodels.UserViewModel;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private FragmentSecondBinding secondFragBinding;
    private UserViewModel userViewModel;
    private SecondFragViewModel secondFragViewModel;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SecondFragment newInstance(String param1, String param2) {
        SecondFragment fragment = new SecondFragment();
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
        //return inflater.inflate(R.layout.fragment_second, container, false);
        // Inflate the layout for this fragment
        secondFragBinding = FragmentSecondBinding.inflate(inflater, container, false);
        View view = secondFragBinding.getRoot();

        // Obtain the ViewModel
        //secondFragViewModel = new ViewModelProvider(requireActivity()).get(SecondFragViewModel.class);
        secondFragViewModel = new ViewModelProvider(requireActivity()).get(SecondFragViewModel.class);
        secondFragBinding.setFrag2ViewModel(secondFragViewModel);
        secondFragBinding.setLifecycleOwner(this);

        return view;
    }
}