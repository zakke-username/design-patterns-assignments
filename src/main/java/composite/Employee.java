package composite;

public class Employee extends Component {
    private double salary;

    public Employee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void addChild(Component child) {
        throw new UnsupportedOperationException("Cannot add child to leaf.");
    }

    public String getMarkup(int indent) {
        return "    ".repeat(indent) + "<employee>" + this.name + "</employee>";
    }
}
