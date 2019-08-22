public class prima {
    public static void main(String[] args) {
        int bilangan, pembagi;
        for (bilangan = 1; bilangan <= 100; bilangan++) {
            int x = 0;
        for (pembagi = 2; pembagi <= bilangan; pembagi++) {
 
                if (bilangan % pembagi == 0) {
                    if (bilangan != pembagi) {
                        x = 1;
                    }
                    if (x != 1 && bilangan == pembagi) {
                        System.out.println(bilangan);
                    }
                }
            }
        }
 
    }
}
