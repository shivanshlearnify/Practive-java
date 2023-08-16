
public class spiral {
    public static void main(String args[]) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        print(arr);
    }

    public static void print(int arr[][]) {
        int startRow = 0;
        int endRow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;

        while (startRow <= endRow && startcol <= endcol) {

            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startRow][j] + " ");
            }
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(arr[i][endcol]+" ");
            }
            for (int j = endcol - 1; j >= startcol; j--) {
                System.out.print(arr[endRow][j] + " ");
            }
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(arr[i][startcol]+" ");
            }
            startRow++;
            endRow--;
            startcol++;
            endcol--;

        }

    }
}
