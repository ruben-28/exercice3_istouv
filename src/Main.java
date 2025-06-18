import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.util.stream.Collectors.toMap;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose from the following options:\n" +
                "a: Art\n" +
                "r: Reports");
        String choice = scanner.nextLine();
        if (choice.equals("a")){
            artMenu(scanner);
        }
        if (choice.equals("r")){
            reportsMenu(scanner);
        }
    }
    public static Painting readElementDetails(String path) throws IOException {
        Painting painting = new Painting();
        Map<String, Element> files = new HashMap();

        Files.lines(Paths.get(path))
                .map(str -> ElementDetailsFactory.getPaintingElement(str))
                .forEach(e-> painting.addElement(e));
        return painting;
    }
    public static void artMenu(Scanner scanner) throws IOException {
        ElementVisit elementVisit = new ElementVisit();
        ShortPrint shortPrint = new ShortPrint();
        TotalArea totalArea = new TotalArea();
        LongPrint longPrint = new LongPrint();
        System.out.println("Enter the path of the painting description");
        String path=scanner.nextLine();
        Painting root= readElementDetails(path);
        System.out.println("Choose from the following options:\n" +
                "q: quit\n" +
                "c: count elements\n" +
                "lp: long print\n" +
                "sh: short print\n" +
                "ta: total area");
        String myString;
        while (!(myString = scanner.nextLine()).equals("q")) {
            switch (myString) {
                case "c":
                    //TODO: Add counting behavior
                    for (Element element : root.elementList) {
                        element.accept(elementVisit);
                    }
                    System.out.println(elementVisit.elementCounter);
                    break;
                case "sh":
                    //TODO: Add short representation behavior
                    for (Element element : root.elementList) {
                        element.accept(shortPrint);
                    }
                    break;
                case "ta":
                    //TODO: Add area calculation behavior
                    for (Element element : root.elementList) {
                        element.accept(totalArea);
                    }
                    System.out.println(Math.round(+ totalArea.totalAreaCounter));
                    break;
                case "lp":
                    //TODO: Add long representation behavior
                    for (Element element : root.elementList) {
                        element.accept(longPrint);
                    }
                    System.out.println(longPrint.longPrint);
                    break;


            }

        }
    }

    public static void reportsMenu(Scanner sc){
        System.out.println("Choose report type:");
        System.out.println("1 - Incident");
        System.out.println("2 - Movement");
        System.out.println("3 - Contact");
        System.out.println("4 - Routine");

        // TODO: Add logic to create the report according to the user choices
        String type = sc.nextLine().trim();
        System.out.println("Enter the report content:");
        String content = sc.nextLine();
        System.out.println("Add decorators one by one (enter code). Type 's' to submit and print the report:");
        System.out.println("u - Urgent ([URGENT] at the start)");
        System.out.println("c - Classified ([CLASSIFIED] at the end)");
        System.out.println("t - To Commander ([TO COMMANDER] at the end)");
        System.out.println("a - Audio Attachment ([AUDIO ATTACHED] at the end)");
        List<Character> decoratorCodes = new ArrayList<>();
        while (true) {
            String dec = sc.nextLine().trim();
            if (dec.equals("s")) break;
            if (dec.length() == 1 && "ucta".contains(dec)) {
                decoratorCodes.add(dec.charAt(0));
            } else {
                System.out.println("Invalid decorator code. Please enter one of: u, c, t, a or 's' to submit.");
            }
        }
        // TODO: Add a Report Factory and use it to create a report based on the type and decorators
        Report report = null;
        try{
            report = ReportFactory.createReport(type, content, decoratorCodes);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        if (report != null)
            System.out.println(report.getContent());
        else
            System.out.println("Report construction failed. Check implementation.");
    }
}
