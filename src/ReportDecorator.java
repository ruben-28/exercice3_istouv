/**
 * Base decorator class for {@link Report} implementations.
 */
public abstract class ReportDecorator implements Report {
    /** The wrapped report. */
    protected final Report report;

    /**
     * @param report the report to decorate
     */
    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public String getContent() {
        return report.getContent();
    }

    @Override
    public String getType() {
        return report.getType();
    }
}
