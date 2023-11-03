package co.agomez.app.elements.select;

public class Option {
    private String value;
    private String name;
    private boolean selected;

    public Option() {
    }

    public Option(String value, String name) {
        this.value = value;
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public Option setSelected() {
        this.selected = true;
        return this;
    }
}
