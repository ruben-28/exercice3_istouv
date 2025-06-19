/**
 * Decorator that appends a note about an audio attachment to the report
 * content.
 */
public class AudioAttachmentReportDecorator extends ReportDecorator {
    /**
     * Creates the decorator for the given base report.
     *
     * @param report the report to decorate
     */
    public AudioAttachmentReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getContent() {
        return super.getContent() + " [AUDIO ATTACHED]";
    }
}