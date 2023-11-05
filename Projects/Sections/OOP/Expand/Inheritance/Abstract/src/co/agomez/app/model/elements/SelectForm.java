package co.agomez.app.model.elements;

import java.util.ArrayList;
import java.util.List;

import co.agomez.app.model.elements.select.Option;

public class SelectForm extends FormElement {
    private List<Option> options;

    public SelectForm(String name) {
        super(name);
        options = new ArrayList<>();
    }

    public SelectForm(String name, List<Option> options) {
        super(name);
        this.options = options;
    }

    public SelectForm addOption(Option option) {
        options.add(option);
        return this;
    }

    @Override
    public String drawHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='").append(name).append("'>");

        for (Option option : options) {
            sb.append("\n<option value='").append(option.getValue()).append("'");
            if (option.isSelected()) {
                sb.append(" selected");
                value = option.getValue();
            }
            sb.append(">").append(option.getName()).append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
