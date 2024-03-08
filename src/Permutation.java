public class Permutation {

    public static void func_print(int[] p, int sz) {
        System.out.println();

        for (int i = 0; i < sz; ++i) {
            System.out.printf(" %2d", p[i]);
        }

    }

    public static void func_exch(int[] p, int i, int n) {
        int tmp = p[i];
        p[i] = p[n];
        p[n] = tmp;
    }

    public static void func_permHeap(int sz, int[] p, int n) {

        if (n == 1) {
            func_print(p, sz);
            return;
        }

        func_permHeap(sz, p, n - 1);

        for (int i = 0; i < (n - 1); ++i) {

            if (n % 2 == 0) {
                func_exch(p, i, n - 1);
            } else {
                func_exch(p, 0, n - 1);
            }

            func_permHeap(sz, p, n - 1);

        }

    }

    public static void func_perm(int sz, int[] p, int n) {

        if (n == sz) {
            func_print(p, sz);
            return;
        }

        for (int i = n; i < sz; ++i) {
            func_exch(p, n, i);
            func_perm(sz, p, n + 1);
            func_exch(p, i, n);
        }

    }

}
