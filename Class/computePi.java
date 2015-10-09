public class computePi {
        public static void main(String args[]) {
            double pie=0;
            int p;
            for (p=1;p<=50000;p=p+4) {
                pie=pie+(1/p)-(1/p+2);
            }
            System.out.println(4*pie);
        }
}