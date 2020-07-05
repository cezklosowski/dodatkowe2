public class CountSort {

    public static void main(String[] args) {
        short[] tab = {1, 3, 5, 2, 4, 2, 4, 6, 12, 14, 53, 533, 255, 2, 533, 22, 90, 900, 144, 0, 209};
        printTab(tab);
        short[] tab2 = countSort(tab);
        printTab(tab2);

    }


    public static short[] countSort(short[] tab) {
        // max value in tab
        short maxValue = Short.MIN_VALUE;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > maxValue) {
                maxValue = tab[i];
            }
        }

        // count
        short[] counterTab = new short[maxValue + 1];
        for (int i = 0; i < tab.length; i++) {
            counterTab[tab[i]]++;
        }

        // print
        short[] resultTab = new short[tab.length];
        int index = 0;
        for (int i = 0; i < counterTab.length; i++) {
            for (int j = 0; j < counterTab[i]; j++) {
                resultTab[index++] = (short) i;
            }
        }
        return resultTab;
    }

    public static void printTab(short[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + ", ");
        }
        System.out.println();
    }
}
