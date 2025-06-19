/**
 * Decorator that adds an "URGENT" tag at the beginning of the report.
 */
public class UrgentReportDecorator extends ReportDecorator {

    /**
     * @param report the report to decorate
     */
    public UrgentReportDecorator(Report report) {
        super(report);
    }

    @Override
   public String getContent() {
        return "[URGENT] " + super.getContent();
    }


}
