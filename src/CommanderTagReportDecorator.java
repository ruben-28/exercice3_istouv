/**
 * Decorator that appends a "TO COMMANDER" tag to the report content.
 */
public class CommanderTagReportDecorator extends ReportDecorator {
    /**
     * @param report the report to decorate
     */
    public CommanderTagReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getContent() {
        return super.getContent() + " [TO COMMANDER]";
    }
}