import java.util.Objects;

public class Character extends Creature implements Skills {
    String inf;
    int age;
    String brave = "Храбрый";

    @Override
    public String toString() {
        return "Character{" +
                "age=" + age +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return age == character.age;
    }

    public Character() {
    }

    public String getinf() {
        return inf;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }


    public Character(String name) {
        super(name);
        this.name = name;

    }

    public Character(String _name, int _age) {
        super(name);
        this.name = name;
        this.age = age;


    }

    public Character(String name, int age, String inf) {
        super(name);
        this.name = name;
        this.age = age;
        this.inf = inf;


    }

    public void usedto() {
        System.out.println(this.name + " " + "должен привыкнуть спокойнее реагировать, но");
    }

    

    public void feel(Feelings Fl) {
        String s = " ";
        switch (Fl) {
            case WORRY:
                s = "переживания, которые  ранят его и без того покалеченное сердце ";
                break;
            case PAIN:
                s = "боль";
            case HORROR:
                s = "ужааас";
                break;
        }


        System.out.println(brave + " " + this.name + " " + "испытывает" + " " + s);

    }

    public void walk() {
        System.out.println(brave + " " + this.name + " " + "подошел поближе");
    }

    public void watch() {

        System.out.println(this.name + " " + "увидел препятствие");


    }
Place place;
    public  Place getPlace(){
        return this.place;
                     
    }

    public void  setPlace(Place p){
        this.place = p;               
       p.add(this);
        System.out.println(this.name + " находится здесь");

    }

}
