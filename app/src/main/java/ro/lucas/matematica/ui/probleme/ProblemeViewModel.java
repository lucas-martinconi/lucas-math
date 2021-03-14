package ro.lucas.matematica.ui.probleme;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProblemeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProblemeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ecran Probleme");
    }

    public LiveData<String> getText() {
        return mText;
    }
}