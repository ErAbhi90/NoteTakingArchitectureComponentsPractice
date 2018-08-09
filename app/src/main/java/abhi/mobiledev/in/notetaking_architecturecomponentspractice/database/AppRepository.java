package abhi.mobiledev.in.notetaking_architecturecomponentspractice.database;

import android.content.Context;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import abhi.mobiledev.in.notetaking_architecturecomponentspractice.utilities.SampleData;

public class AppRepository {

    private static AppRepository ourInstance;
    public List<NoteEntity> mNotes;
    private AppDatabase mDb;
    private Executor executor = Executors.newSingleThreadExecutor();

    private AppRepository(Context context) {

        mNotes = SampleData.getNotes();
        mDb = AppDatabase.getInstance(context);
    }

    public static AppRepository getInstance(Context context) {
        if (ourInstance == null) {
            ourInstance = new AppRepository(context);
        }
        return ourInstance;
    }

    public void addSampleData() {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                mDb.noteDao().insertAll(SampleData.getNotes());
            }
        });
    }
}
