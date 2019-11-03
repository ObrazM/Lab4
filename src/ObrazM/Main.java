package ObrazM;

public class Main {
    public static void main(String[] args) {
        Abiturs abiturs = new Abiturs();
        abiturs.Add(new Abitur(1, "Obraz","Mary", "Evgenyevna", 1999, 189,197,180, 11.9));
        abiturs.Add(new Abitur(1, "Baranov","Maksim", "Vladimirovich", 1999, 199,197,190, 10));
        System.out.println(abiturs.toString());

        abiturs.Save("abiturs.txt");
        abiturs.Clear();

        abiturs.Load("abiturs.txt");
        System.out.println("\n\nDeserialized abiturs: ...");
        System.out.println(abiturs.toString());
    }
}
