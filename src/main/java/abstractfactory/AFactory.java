package abstractfactory;

public class AFactory extends UIFactory {
    public Button createButton(String text) {
        Button btn = new ButtonA();
        btn.setText(text);
        return btn;
    }

    public Checkbox createCheckbox(String text) {
        Checkbox cb = new CheckboxA();
        cb.setText(text);
        return cb;
    }

    public TextField createTextField(String text) {
        TextField tf = new TextFieldA();
        tf.setText(text);
        return tf;
    }
}
