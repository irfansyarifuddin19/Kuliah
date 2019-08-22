class Kucing {
    String nama;
    Kucing ibu;
}

public class ArrayTest {

    public static void traverse(Kucing kucing) {
        while(kucing != null) {
            System.out.println(kucing.nama);
            kucing = kucing.ibu;
        }
    }

    public static void addAncestor(Kucing kucing, String ancestorName) {
        // DO something here
    }

    public static void main(String[] args) {
        Kucing shadowCat = new Kucing();
        shadowCat.nama = "Amanda";
        addAncestor(shadowCat, "Betty");
        addAncestor(shadowCat, "Cindy");
        traverse(shadowCat);
    }
}
