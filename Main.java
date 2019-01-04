public class Main {

    public static void main(String[] args) {
        System.out.println("Вот снова слова застывают на губах");
        Character man = new Character("Герой", 25, «потрясен зрелищем");
        man.usedto();
        man.feel(Feelings.HORROR);
        man.walk();
        man.watch();

        Place place = new Place("Препятствие", 123.05, 12.1);
        Place place1 = new Place( "Ловушка");
        StarHeads Head = new StarHeads("Звездоголовый");
        Head.lie();
        Head.die();
        Penguin bird = new Penguin("Пингвин");
        bird.behavior();
        bird.beak();
     
        place.flash(false);
        man.setPlace(place1);




    }
}
