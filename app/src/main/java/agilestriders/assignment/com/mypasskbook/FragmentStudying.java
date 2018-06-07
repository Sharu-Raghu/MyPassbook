package agilestriders.assignment.com.mypasskbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Sharanya on 2/06/2018.
 */

public class FragmentStudying extends Fragment {
    View view;
    public FragmentStudying() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_studying, container, false);
        return view;

    }
}