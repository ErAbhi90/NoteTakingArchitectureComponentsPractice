package abhi.mobiledev.in.notetaking_architecturecomponentspractice.viewModel;

import android.app.Application;

import java.util.List;

import abhi.mobiledev.in.notetaking_architecturecomponentspractice.database.AppRepository;
import abhi.mobiledev.in.notetaking_architecturecomponentspractice.database.NoteEntity;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MainViewModel extends AndroidViewModel {

    public List<NoteEntity> mNotes;
    private AppRepository mRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);

        mRepository = AppRepository.getInstance(application.getApplicationContext());
        mNotes = mRepository.mNotes;
    }

    public void addSampleData() {
        mRepository.addSampleData();
    }
}
