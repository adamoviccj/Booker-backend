package booker.BookingApp.dto.users;

import booker.BookingApp.model.users.UserReport;
import lombok.Data;

import java.util.Date;

public @Data class UserReportDTO {
    private Long id;
    private String reportedId;
    private String reporterId;
    private String reason;
    private Date date;

    public UserReportDTO() {
    }

    public UserReportDTO(UserReport userReport) {
        this(userReport.getId(), userReport.getReportedId(), userReport.getReporterId(), userReport.getReason(), userReport.getDate());
    }

    public UserReportDTO(Long id, String reportedId, String reporterId, String reason, Date date) {
        this.id = id;
        this.reportedId = reportedId;
        this.reporterId = reporterId;
        this.reason = reason;
        this.date = date;
    }

    public static UserReportDTO createFromUserReport(UserReport userReport) {
        return new UserReportDTO(userReport.getId(),
                                userReport.getReportedId(),
                                userReport.getReporterId(),
                                userReport.getReason(),
                                userReport.getDate());
    }
}
