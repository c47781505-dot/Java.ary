class newone {
    public static void main(String args[]) {

        int n = 21;

        while (n != 1) {

            System.out.println(n);

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
        }

        System.out.println(n);
    }
}
 