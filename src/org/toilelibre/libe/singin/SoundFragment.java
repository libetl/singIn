package org.toilelibre.libe.singin;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SoundFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate (R.layout.channels, container, false);
        return rootView;
    }

    @Override
    public void onAttach (Activity activity) {
        super.onAttach (activity);
    }

}
