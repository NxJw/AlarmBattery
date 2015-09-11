package com.example.nx.alarmbattery;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import android.support.v4.app.Fragment;
import com.rey.material.widget.Slider;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Fragment_Configure.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Fragment_Configure#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Configure extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private static final String CONFIGURE_BATTERY ="CONFIGURE_BATTERY";
    private static final String STATUS_ALARM = "STATUS_ALARM";
    private static final String ALARM_TYPE = "ALARM_TYPE";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private Slider SliderType;

    private TextView tvSnooze;
    private TextView tvVibration;
    private TextView tvAlarm;


    private SharedPreferences sharedValue;


    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Setup.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Configure newInstance(String param1, String param2) {
        Fragment_Configure fragment = new Fragment_Configure();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public Fragment_Configure() {

        // Required empty public constructor


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sharedValue = getActivity().getSharedPreferences(CONFIGURE_BATTERY, Context.MODE_PRIVATE);

        if (getArguments() != null) {

            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


         View rootView = inflater.inflate(R.layout.fragment_fragment__setup,container,false);

         SliderType = (Slider) rootView.findViewById(R.id.sliderType);
         tvAlarm = (TextView) rootView.findViewById(R.id.tvSound);
         tvSnooze = (TextView) rootView.findViewById(R.id.tvSnooze);
         tvVibration =  (TextView)rootView.findViewById(R.id.tvVibration);



        SliderType.setOnPositionChangeListener(new Slider.OnPositionChangeListener() {

            @Override
            public void onPositionChanged(Slider slider, boolean b, float oldPosition, float newPosition, int oldvalue, int newValue) {

                if(newValue <= 25){

                    tvSnooze.setTextColor(getResources().getColor(R.color.highlight));
                    tvVibration.setTextColor(getResources().getColor(android.R.color.primary_text_dark));
                    tvAlarm.setTextColor(getResources().getColor(android.R.color.primary_text_dark));

                }
                else if(newValue  <= 75){

                    tvSnooze.setTextColor(getResources().getColor(android.R.color.primary_text_dark));
                    tvVibration.setTextColor(getResources().getColor(R.color.highlight));
                    tvAlarm.setTextColor(getResources().getColor(android.R.color.primary_text_dark));

                }else{

                    tvSnooze.setTextColor(getResources().getColor(android.R.color.primary_text_dark));
                    tvVibration.setTextColor(getResources().getColor(android.R.color.primary_text_dark));
                    tvAlarm.setTextColor(getResources().getColor(R.color.highlight));

                }

            }
        });

        return rootView;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnFragmentInteractionListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
