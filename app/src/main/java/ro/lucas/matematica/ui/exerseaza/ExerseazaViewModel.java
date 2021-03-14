package ro.lucas.matematica.ui.exerseaza;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ExerseazaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ExerseazaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ecran Exerseaza");
    }

    public LiveData<String> getText() {
        return mText;
    }
}