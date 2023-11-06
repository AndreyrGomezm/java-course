package model;

public class Report extends Sheet implements IPrintable {
    private final Person author;
    private final Person reviewer;

    public Report(Person author, Person reviewer, String content) {
        super(content);
        this.author = author;
        this.reviewer = reviewer;
    }

    @Override
    public String print() {
        return "Report written by: " + author + "\n" +
                "Reviewed by: " + reviewer + "\n" +
                content + "\n";
    }
}