/**
 * Report describing a contact with another entity.
 */
public class ContactReport implements Report {
    private final String content;

    /**
     * @param content the body of the report
     */
    public ContactReport(String content) { this.content = content; }

    @Override
    public String getContent() {
        return getType() + ": " + content;
    }

    @Override
    public String getType() { return "ContactReport"; }

}
