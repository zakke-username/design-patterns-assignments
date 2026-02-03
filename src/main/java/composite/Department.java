package composite;

import java.util.*;

public class Department extends Component {
    private List<Component> children = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    @Override
    public double getSalary() {
        double total = 0.0;
        for (Component c : children) {
            total += c.getSalary();
        }
        return total;
    }

    public void addChild(Component child) {
        children.add(child);
    }

    public String getMarkup(int indent) {
        String markup = "    ".repeat(indent) + "<department name='" + this.name + "'>\n";
        for (Component c : children) {
            markup += c.getMarkup(indent + 1) + "\n";
        }
        markup += "    ".repeat(indent) + "</department>";
        return markup;
    }
}
