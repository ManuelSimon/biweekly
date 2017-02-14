package principal;

import biweekly.Biweekly;
import biweekly.ICalendar;
import biweekly.component.VEvent;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Manuel on 14/02/2017.
 */
public class Principal {
    public static void main(String[] args) {
        File file = new File("2017-2.ics");
        try {
            List<ICalendar> icals = Biweekly.parse(file).all();
            //System.out.println(icals.toString());
            for (ICalendar ical : icals) {
                List<VEvent> events = ical.getEvents();
                for(VEvent event : events){
                    System.out.println(event.getSummary().getValue());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
