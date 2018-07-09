package com.aditep.workout.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import com.aditep.workout.R;
import com.aditep.workout.adapter.MuscleTypeListAdapter;

import com.aditep.workout.dao.WorkoutTypeDao;
import com.aditep.workout.databinding.FragmentMainBinding;
import com.inthecheesefactory.thecheeselibrary.manager.Contextor;


/**
 * Created by nuuneoi on 11/16/2014.
 */
public class MainFragment extends Fragment {
    //Variables
    FragmentMainBinding binding;
    MuscleTypeListAdapter listAdapter;
    WorkoutTypeDao workoutTypeDao;

    /*******************
     * Functions
     *******************/
    public MainFragment() {
        super();
    }

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init(savedInstanceState);
        if (savedInstanceState != null)
            onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_main, container, false);
        View rootView = binding.getRoot();
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    @SuppressWarnings("UnusedParameters")
    private void init(Bundle savedInstanceState) {
        // Init Fragment level's variable(s) here
    }

    @SuppressWarnings("UnusedParameters")
    private void initInstances(View rootView, final Bundle savedInstanceState) {
        // Init 'View' instance(s) with rootView.findViewById here
        // Note: State of variable initialized here could not be saved
        //       in onSavedInstanceState
        workoutTypeDao = new WorkoutTypeDao();
        listAdapter = new MuscleTypeListAdapter(getActivity().getApplicationContext(), workoutTypeDao.getName(), workoutTypeDao.getImge());
        binding.listView.setAdapter(listAdapter);
        binding.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int id = i;
                switch (id) {
                    case 0:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();
                        getActivity().getSupportFragmentManager().beginTransaction()
                                .replace(R.id.contentContainer, ExerciseFragment.newInstance())
                                .addToBackStack(null)
                                .commit();
                    case 1:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();
                    case 2:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();
                    case 3:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();
                    case 4:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();
                    case 5:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();
                    case 6:
                        Toast.makeText(getActivity().getApplicationContext(), "" + workoutTypeDao.getName()[i], Toast.LENGTH_SHORT).show();

                }


            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance (Fragment level's variables) State here
    }

    @SuppressWarnings("UnusedParameters")
    private void onRestoreInstanceState(Bundle savedInstanceState) {
        // Restore Instance (Fragment level's variables) State here
    }

    private void showToast(String text) {
        Toast.makeText(Contextor.getInstance().getContext(),
                text,
                Toast.LENGTH_SHORT).show();
    }

    /**************
     *  Listener Zone
     **************/

    /*************
     *  Inner Class
     *************/
}