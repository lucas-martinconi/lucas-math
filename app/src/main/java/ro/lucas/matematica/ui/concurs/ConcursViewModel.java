package ro.lucas.matematica.ui.concurs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConcursViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConcursViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ecran concurs");
    }

    public LiveData<String> getText() {
        return mText;
    }
}