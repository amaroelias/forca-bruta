public class MainPermutationHeap {

    public static void main(String[] args) {

        long inicio = System.nanoTime();
        int sz = 4;

        if (args.length < 1) {
            return;
        }

        try {
            sz = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            return;
        }

        if (sz < 1) {
            sz = 4;
        }

        int[] p = new int[sz];

        for (int i = 0; i < sz; ++i) {
            p[i] = i + 1;
        }

        Permutation.func_permHeap(sz, p, sz);
        long fim = System.nanoTime();
        long tempoExecucao = (fim - inicio) / 1_000_000;

        System.out.println(" \n");
        System.out.println(tempoExecucao + " ms");

    }

}

