package co.agomez.app.client;

public class Report extends Sheet implements IPrintable {
    private Person author;
    private Person reviewer;

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