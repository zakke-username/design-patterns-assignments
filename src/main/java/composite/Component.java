package composite;

public abstract class Component {
    protected String name;
    protected int indent = 0;

    public Component(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public abstract void addChild(Component child);

    public abstract String getMarkup(int indent);
}
