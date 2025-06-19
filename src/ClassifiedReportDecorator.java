/**
 * Decorator that marks a report as classified.
 */
public class ClassifiedReportDecorator extends ReportDecorator {

    /**
     * @param report the report to decorate
     */
    public ClassifiedReportDecorator(Report report) {super(report);}
    @Override
    public String getContent() {
        return super.getContent() + " [CLASSIFIED]";
    }

}
