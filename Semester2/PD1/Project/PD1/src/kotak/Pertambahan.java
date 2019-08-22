package kotak;

class Pertambahan{
    public void tambah1(){
        int a = 5; int b = 10;
        System.out.println("Hasil dari method tambah ke-1 = "+(a+b));
    }
    public void tambah1(int x, int y){
        System.out.println("Hasil Pertambahan dari method tambah1 ke-2 = "+(x+y));
    }
    public static void main(String[] args) {
        Pertambahan pp;
        pp = new Pertambahan();
        pp.tambah1();//tambah ke-1
        pp.tambah1(5,5);//tambah1 ke-2
    }
}