/**
 * Routine report used for regular updates.
 */
public class RoutineReport implements Report {
    private final String content;

    /**
     * @param content the body of the report
     */
    public RoutineReport(String content) { this.content = content; }

    @Override
    public String getContent() {
        return getType() + ": " + content;
    }
    @Override
    public String getType() { return "RoutineReport"; }
}
