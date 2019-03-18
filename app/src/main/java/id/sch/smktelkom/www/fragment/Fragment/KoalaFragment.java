package id.sch.smktelkom.www.fragment.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.sch.smktelkom.www.fragment.R;

/**
 * Created by arifin on 02/22/2018.
 */
public class KoalaFragment extends Fragment {

    public KoalaFragment() {

    }

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {

        View rootView =
                inflater.inflate(R.layout.activity_multiple_koala, container, false);

        return rootView;

    }
}