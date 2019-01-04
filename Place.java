public class Place extends IPlace {
    Boolean Flashlight;
    Boolean f;

    public Place() {
    }

    public Place(String name) {
        super(name);
        this.name = name;
        System.out.println(" " + this.name);
    }

    public Place(String name, Double x, Double y) {
        super(name, x, y);
        this.name = name;
        this.x = x;
        this.y = y;
        System.out.println(this.name + " " + "с координатами" + " " + this.x + " " + "|" + " " + this.y);
    }

    public void flash(Boolean flashlight) {
        if (flashlight) {
            System.out.println("фонарики горят" + " " + "в месте " + " " + this.name);
        } else {
            System.out.println("фонарики не горят в" + " " + "месте" + " " + this.name);
        }

    }


        public void add(Character c){
          people.add(c);
        }                              

    ArrayList<Character> people = new ArrayList<Character>();

           public ArrayList<Character> getPeople(){
               return this.people;                               }


}
