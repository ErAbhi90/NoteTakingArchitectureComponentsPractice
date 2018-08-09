package abhi.mobiledev.in.notetaking_architecturecomponentspractice.utilities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import abhi.mobiledev.in.notetaking_architecturecomponentspractice.database.NoteEntity;

public class SampleData {

    private static final String Sample_Text_1 = "A simple Note";

    private static final String Sample_Text_2 = "A simple Note with next \n feed";

    private static final String Sample_Text_3 = "A simple Note with next \n feed.A simple Note with next feed" +
            "A simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feed" +
            "A simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feed" +
            "A simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feedA simple Note with next feed" +
            "A simple Note with next feedA simple Note with next feedA simple Note with next feed" +
            "A simple Note with next feedA simple Note with next feed\n\n" +
            "A simple Note with next feedA simple Note with next feedA simple Note with next feed" +
            "A simple Note with next feed" +
            "A simple Note with next feed?";

    private static Date getDate(int diff){
        GregorianCalendar cal = new GregorianCalendar();
        cal.add(Calendar.MILLISECOND, diff);
        return cal.getTime();
    }

    public static List<NoteEntity> getNotes(){
        List<NoteEntity> notes = new ArrayList<>();
        notes.add(new NoteEntity(1,getDate(0),Sample_Text_1));
        notes.add(new NoteEntity(2,getDate(-1),Sample_Text_2));
        notes.add(new NoteEntity(3,getDate(-2),Sample_Text_3));
        return notes;
    }

}
