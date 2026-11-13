class factorial {
    public static void main(String[] args) {

        int n = 1;

        while (n <= 10) {
            int fact = 1;
            int i = n;

            while (i > 0) {
                fact = fact * i;
                i--;
            }

            System.out.println(n + "! = " + fact);
            n++;
        }
    }
}
