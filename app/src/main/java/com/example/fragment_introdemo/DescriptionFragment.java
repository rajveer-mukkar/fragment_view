package com.example.fragment_introdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DescriptionFragment extends Fragment {
    private long position_id;

    public void setPosition_id(long position_id) {
        this.position_id = position_id;
    }

    public DescriptionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_description, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("TAGGGGG", "onStart: " + position_id);
        View view = getView();
        if (view != null){
            TextView title_text = view.findViewById(R.id.title_position);
            TextView description_text = view.findViewById(R.id.description_position);
            Position position = Position.position[(int) position_id];
            title_text.setText(position.getTitle());
            description_text.setText(position.getDescription());
        }
    }
}
