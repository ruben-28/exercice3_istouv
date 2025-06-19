/**
 * Report describing a movement of units or resources.
 */
public class MovementReport implements Report {
    private final String content;

    /**
     * @param content the body of the report
     */
    public MovementReport(String content) { this.content = content; }

    @Override
    public String getContent() {
        return getType() + ": " + content;
    }
    @Override
    public String getType() { return "MovementReport"; }

}
