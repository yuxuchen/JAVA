
public class Cal {
    public static void main(String[] args) {
        double pi = 0;
        double a =0;
        boolean adding = true;
        for (double i=1;i<5000;i++) {
            if(i%2 != 0){
                a = adding? a+(1/i) : a-(1/i);
                adding = adding ? false: true;
            }

        }
        pi = 4 * a;
        System.out.println(pi);
    }
}
