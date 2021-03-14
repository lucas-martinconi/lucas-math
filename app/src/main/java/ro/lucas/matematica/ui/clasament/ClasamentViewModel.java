package ro.lucas.matematica.ui.clasament;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClasamentViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClasamentViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ecran Clasament");
    }

    public LiveData<String> getText() {
        return mText;
    }
}