package Week6.LT;
/*
public static void mysterySort(Comparable[] a) {
    int n = a.length;
    for (int i = 0; i < n; i++) { 
        boolean exchanged = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (less(a[j+1], a[j])) {
            exch(a, j+1, j); exchanged = true;
            }
        }
        if (!exchanged) break;  	// no exchanges, already sorted
    }
}

a.
+ i phần tử cuối cùng được sắp xếp đúng thứ tự trong mảng 
+ i phần tử cuối cùng trong mảng là i phần tử lớn nhất

b.
Đây là thuật toán sắp xếp tại chỗ vì thuật toán chỉ sử dụng thêm các biến phụ
để hoán đổi chứu ko dùng đến các mảng phụ hay bộ nhớ ngoài để hoán đổi

c.
đây là thuật toán sắp xếp ổn định vì khi hai phần tử bằng nhau thì vẫn giữ nguyên 
như ban đầu chứ ko hoán đổi.

d.
số lần gọi exch() để sắp xếp mảng là 0
vì đây là mảng tăng dần [2, 3, 4, ....., n-1, n]
do exchanged giữu giá trị false nên nó sẽ ko gọi exch()

số lần gọi less ~ n trong trường hợp tốt nhất là mảng đã sắp xếp
vòng lặp j sẽ chạy từ 0 đến n - 2 (tổng là n - 1) lần chạy đối với vòng i = 0
và sẽ break vì lúc này exchange vẫn là false nên sẽ dừng vòng i
--> gọi less n - 1 lần ~ n

số lần gọi less tồi nhất là trong trường hợp mảng sắp xếp theo thứ tự giảm dần 
lúc này tổng số lần gọi less là (n - 1) + (n- 2) + (n - 3) + .... + 1 ~ 1/2 * n^2

*/