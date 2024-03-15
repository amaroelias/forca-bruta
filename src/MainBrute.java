public class MainBrute {

    public static void main(String[] args) {

        int sz = 4;

        if (args.length < 1) {
            return;
        }

        sz = Integer.parseInt(args[0]);

        if (sz < 1) {
            sz = 4;
        }

        int[] p = new int[sz];

        for (int i = 0; i < sz; ++i) {
            p[i] = i + 1;
        }

        Permutation.func_perm(sz, p, 0);
        System.out.println("\n");

    }

}
