package composite;

public class Main {
    static void main() {
        Component org = new Department("Organization");
        org.addChild(new Employee("Iso Pomonen", 25000));

        // HR
        Component hr = new Department("Human resources");
        hr.addChild(new Employee("Matti Meikäläinen", 3000));
        hr.addChild(new Employee("Pertti", 1000));
        org.addChild(hr);

        // Accounting
        Component acc = new Department("Accounting");
        acc.addChild(new Employee("Maija Mallikas", 3150));
        Component tax = new Department("Tax");
        tax.addChild(new Employee("Joni Nieminen", 4200));
        tax.addChild(new Employee("Mari Virtanen", 5470));
        acc.addChild(tax);
        org.addChild(acc);

        // IT
        Component it = new Department("Information technology");
        it.addChild(new Employee("Essi Henkilö", 7500));
        Component sec = new Department("Security");
        sec.addChild(new Employee("Einari Korhonen", 3750));
        sec.addChild(new Employee("Tom Cruise", 8900));
        Component help = new Department("Helpdesk");
        help.addChild(new Employee("Barack Obama", 2300));
        help.addChild(new Employee("Tarja Halonen", 2900));
        it.addChild(sec);
        it.addChild(help);
        org.addChild(it);

        // Get salary
        double totalSalary = org.getSalary();
        System.out.println("Total company salary: " + totalSalary);

        // Print structure as XML
        String structure = org.getMarkup(0);
        System.out.println(structure);
    }
}
