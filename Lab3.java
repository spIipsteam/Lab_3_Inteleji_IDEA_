public class Lab3 {
    public static void main(String[] args) {
        int[][] array = {
                {3, 2, 1},
                {9, 8, 7},
                {6, 5, 4}
        };

        for (int i = 0; i < array.length; i++) {
            bubbleSort(array[i]);
        }

        printArray(array);
    }

    public static void bubbleSort(int[] row) {
        int n = row.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (row[j] > row[j + 1]) {
                    // Меняем местами
                    int temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
