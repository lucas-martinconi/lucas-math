package ro.lucas.matematica.ui.concurs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import ro.lucas.matematica.R;

public class ConcursFragment extends Fragment {

    private ConcursViewModel concursViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        concursViewModel =
                new ViewModelProvider(this).get(ConcursViewModel.class);
        View root = inflater.inflate(R.layout.fragment_concurs, container, false);
        final TextView textView = root.findViewById(R.id.text_concurs);
        concursViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}