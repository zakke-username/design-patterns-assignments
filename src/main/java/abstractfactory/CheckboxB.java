package abstractfactory;

public class CheckboxB extends Checkbox {
    public void display() {
        System.out.println();
        System.out.println("  //====//");
        System.out.println(" //    //  " + this.text);
        System.out.println("//====//");
    }
}
