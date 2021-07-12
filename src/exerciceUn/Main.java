package exerciceUn;

import java.util.Arrays;

public class Main {

    public int[] get2Min(int tab[]) {
        Arrays.sort(tab);
        if (tab.length < 2) {
            return tab;
        }
        return new int[]{tab[0], tab[1]};
    }

    public static void main(String[] args) {

    }
}
