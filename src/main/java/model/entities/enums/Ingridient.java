package model.entities.enums;

public enum Ingridient {
    Dough(10),
    TomatoSauce(9),
    Tomato(5),
    Mushrooms(3),
    Pepperoni(4),
    Parmezan(5),
    Mozarella(4),
    Rokfor(0),
    Gauda(3);

    private int amount;

    Ingridient(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
