public class CommanderTagReportDecorator extends ReportDecorator {
    public CommanderTagReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getContent() {
        return super.getContent() + " [TO COMMANDER]";
    }
}