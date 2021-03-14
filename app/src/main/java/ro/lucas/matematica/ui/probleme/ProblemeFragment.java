package ro.lucas.matematica.ui.probleme;

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

public class ProblemeFragment extends Fragment {

    private ProblemeViewModel problemeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        problemeViewModel =
                new ViewModelProvider(this).get(ProblemeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_probleme, container, false);
        final TextView textView = root.findViewById(R.id.text_probleme);
        problemeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
