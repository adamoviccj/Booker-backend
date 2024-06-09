package booker.BookingApp.dto.users;

import booker.BookingApp.model.users.UserReport;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

public @Data class CreateReportUserDTO {
    @NotNull
    private String reportedId;
    @NotNull
    private String reporterId;
    @NotEmpty
    private String reason;

    public CreateReportUserDTO() {
    }

    public CreateReportUserDTO(UserReport userReport) {
        this(userReport.getReportedId(), userReport.getReporterId(), userReport.getReason());
    }

    public CreateReportUserDTO(String reportedId, String reporterId, String reason) {
        this.reportedId = reportedId;
        this.reporterId = reporterId;
        this.reason = reason;
    }


}
