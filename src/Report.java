/**
 * Base interface for all reports.
 */
public interface Report {
    /** @return the full textual content of the report */
    String getContent();

    /** @return logical type of the report */
    String getType();
}
