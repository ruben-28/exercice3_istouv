import java.util.List;

public class ReportFactory {
    public static Report createReport(String type, String content, List<Character> decoratorCodes) {
        Report report;
        switch (type) {
            case "1":
                report = new IncidentReport(content);
                break;
            case "2":
                report = new MovementReport(content);
                break;
            case "3":
                report = new ContactReport(content);
                break;
            case "4":
                report = new RoutineReport(content);
                break;
            default:
                throw new IllegalArgumentException("Unknown report type: " + type);
        }
        // Wrap with decorators in sequence
        for (char code : decoratorCodes) {
            switch (code) {
                case 'u':
                    report = new UrgentReportDecorator(report);
                    break;
                case 'c':
                    report = new ClassifiedReportDecorator(report);
                    break;
                case 't':
                    report = new CommanderTagReportDecorator(report);
                    break;
                case 'a':
                    report = new AudioAttachmentReportDecorator(report);
                    break;
                default:
                    // ignore unknown codes or throw
                    throw new IllegalArgumentException("Unknown decorator code: " + code);
            }
        }
        return report;
    }}
