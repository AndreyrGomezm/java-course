package model;

public class Page extends Sheet implements IPrintable {

    public Page(String content) {
        super(content);
    }

    @Override
    public String print() {
        return content;
    }

}
