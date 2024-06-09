package booker.BookingApp.service.interfaces;
import booker.BookingApp.model.business.Report;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public interface IReportService {
    ArrayList<Report> getIntervalReport(String ownerId, String from, String to) throws ParseException;

    ArrayList<Report> getAccommodationReport(String ownerId, Long accommodationId, int year) throws ParseException;
}
