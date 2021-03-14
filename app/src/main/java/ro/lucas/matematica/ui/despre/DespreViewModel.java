package ro.lucas.matematica.ui.despre;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DespreViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DespreViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Ecran Despre");
    }

    public LiveData<String> getText() {
        return mText;
    }
}