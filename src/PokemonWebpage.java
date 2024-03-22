public class PokemonWebpage extends Webpage{
    public PokemonWebpage(String name, String content) {
        super(name, content);
    }

    public void display() {
        String[] pokemon = new String[3];
        pokemon[0] = "Charizard";
        pokemon[1] = "Magic Carp";
        pokemon[2] = "Snorlax";
        int ran = ((int) (Math.random() * 2)) + 1;
        System.out.println("You found an " + pokemon[ran]);
    }
}
