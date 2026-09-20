package Week2;
class LocalMinimumMatrix {
    public static int[] findLocalMin(int[][] a) {
        return search(a, 0, a.length - 1, 0, a.length - 1);
    }

    private static int[] search(int[][] a, int r1, int r2, int c1, int c2) {
        int midRow = r1 + (r2 - r1) / 2;
        int midCol = c1 + (c2 - c1) / 2;

        // 1. Tìm phần tử nhỏ nhất trên chữ thập (hàng midRow và cột midCol)
        int minR = midRow, minC = midCol;
        for (int j = c1; j <= c2; j++) {
            if (a[midRow][j] < a[minR][minC]) { minR = midRow; minC = j; }
        }
        for (int i = r1; i <= r2; i++) {
            if (a[i][midCol] < a[minR][minC]) { minR = i; minC = midCol; }
        }

        // 2. So sánh với các ô kề cạnh xung quanh
        int val = a[minR][minC];
        int nextR = minR, nextC = minC;

        if (minR > 0 && a[minR - 1][minC] < val) { val = a[minR - 1][minC]; nextR = minR - 1; nextC = minC; }
        if (minR < a.length - 1 && a[minR + 1][minC] < val) { val = a[minR + 1][minC]; nextR = minR + 1; nextC = minC; }
        if (minC > 0 && a[minR][minC - 1] < val) { val = a[minR][minC - 1]; nextR = minR; nextC = minC - 1; }
        if (minC < a.length - 1 && a[minR][minC + 1] < val) { val = a[minR][minC + 1]; nextR = minR; nextC = minC + 1; }

        // 3. Nếu không ô kề nào nhỏ hơn -> Dừng
        if (nextR == minR && nextC == minC) return new int[]{minR, minC};

        // 4. Đệ quy vào 1 trong 4 góc phần tư chứa ô nhỏ hơn
        if (nextR < midRow && nextC < midCol) return search(a, r1, midRow - 1, c1, midCol - 1);
        if (nextR < midRow && nextC > midCol) return search(a, r1, midRow - 1, midCol + 1, c2);
        if (nextR > midRow && nextC < midCol) return search(a, midRow + 1, r2, c1, midCol - 1);
        return search(a, midRow + 1, r2, midCol + 1, c2);
    }
}