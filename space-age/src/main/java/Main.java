public class Main {
    public static void main(String[] args) {
        SpaceAge ruiSpaceAge = new SpaceAge(915170400);
        SpaceAge linzSpaceAge = new SpaceAge(820497600);

        print(ruiSpaceAge);
        System.out.println("-----------------");
        print(linzSpaceAge);
    }

    public static void print(SpaceAge spaceAge){
        System.out.println("Earth       " + spaceAge.onEarth());
        System.out.println("Mercury     " + spaceAge.onMercury());
        System.out.println("Venus       " + spaceAge.onVenus());
        System.out.println("Mars        " + spaceAge.onMars());
        System.out.println("Jupiter     " + spaceAge.onJupiter());
        System.out.println("Saturn      " + spaceAge.onSaturn());
        System.out.println("Uranus      " + spaceAge.onUranus());
        System.out.println("Neptune     " + spaceAge.onNeptune());
    }
}
