public class StarHeads extends Creature implements Possibilities {


    public StarHeads() {

    }

    public StarHeads(String _name) {
        super(_name);
        this.name = _name;
    }

    public void die() {
        System.out.println(this.name + " " + "почил в ледяной мгле");
    }

    public void lie() {
        System.out.println(this.name + " " + "лежит");
    }


}
