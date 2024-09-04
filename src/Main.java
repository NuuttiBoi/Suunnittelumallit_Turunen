public class Main {
    public static void main(String[] args) {

        UIFactory factoryA = new AFactory();

        Button buttonA = factoryA.createButton("OK");
        TextField textFieldA = factoryA.createTextField("Hei");
        Checkbox checkboxA = factoryA.createCheckbox("Miten menee");

        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        buttonA.setText("Vaihdetaan teksti");
        textFieldA.setText(" ++++++++++++++++ ");
        checkboxA.setText(" ---------------  ");

        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        UIFactory factoryB = new BFactory();

        Button buttonB = factoryB.createButton("Ok");
        TextField textFieldB = factoryB.createTextField(" ^^^^^^^^^^^^ ");
        Checkbox checkboxB = factoryB.createCheckbox(" ????????????????? ");

        buttonB.display();
        textFieldB.display();
        checkboxB.display();

        buttonB.setText("Sulje");
        textFieldB.setText("Etsi");
        checkboxB.setText(" ========= ");

        buttonB.display();
        textFieldB.display();
        checkboxB.display();
    }
}
