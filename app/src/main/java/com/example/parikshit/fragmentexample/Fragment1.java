package com.example.parikshit.fragmentexample;

/**
 * Created by parikshit on 12/14/2015.
 */


        import android.app.Fragment;
        import android.os.Bundle;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;

        public class Fragment1 extends Fragment {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                              Bundle savedInstanceState) {
                // TODO Auto-generated method stub
                return inflater.inflate(R.layout.fragment1,container, false);
            }

            }
