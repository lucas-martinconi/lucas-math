package ro.lucas.matematica.ui.clasament;

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
import ro.lucas.matematica.ui.home.HomeViewModel;

public class ClasamentFragment extends Fragment {

    private ClasamentViewModel clasamentViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        clasamentViewModel =
                new ViewModelProvider(this).get(ClasamentViewModel.class);
        View root = inflater.inflate(R.layout.fragment_clasament, container, false);
        final TextView textView = root.findViewById(R.id.text_clasament);
        clasamentViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}