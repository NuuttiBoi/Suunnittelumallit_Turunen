abstract class TextField {
    protected String text;

    public TextField(String text) {
        this.text = text;
    }

    public abstract void display();

    // setText kannattaa asettaa ylemmällä luokkatasolla, jolloin alemmat luokat perivät sen
    public void setText(String text) {
        this.text = text;
    }
}