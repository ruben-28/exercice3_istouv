/**
 * Report describing an incident.
 */
public class IncidentReport implements Report {
    private final String content;

    /**
     * @param content the body of the report
     */
    public IncidentReport(String content) { this.content = content; }

    @Override
    public String getContent() {
        return getType() + ": " + content;
    }
    @Override
    public String getType() { return "IncidentReport"; }
}
