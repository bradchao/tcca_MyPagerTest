package com.example.administrator.mypagertest;


import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Page1 extends Fragment {
    private MainActivity activity;
    private Resources res;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        activity = (MainActivity)context;
        activity.mesg.setText("Hello, Brad");

        res = context.getResources();

        Log.i("brad", "page1:onAttach");


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.page1, container, false);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("brad", "page1:onDetach");

    }
}
