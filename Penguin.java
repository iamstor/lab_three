public class Penguin extends Creature {


    public Penguin() {

    }

    public Penguin(String _name) {
        super(_name);
        this.name = _name;
    }

    String state = "Напуганный";

    public void behavior() {
        System.out.println(state + " " + this.name + " " + "ведет себя мирно");
    }

    public void beak() {
        System.out.println(state + " " + this.name + " " + "разъяренно щелкает клювом");
    }

}

