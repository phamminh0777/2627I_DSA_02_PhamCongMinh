/*
+ thuật toán ThreeSum sử dụng 3 vòng lặp để lồng nhau 
để kiểm tra 3 phần tử a[i], a[j], a[k]

tổng số bộ ba phần tử được kiểm tra là tổ hợp chập 3 của N

+ phép so sánh == 0 thực hiện đúng 1 lần cho mỗi bội ba:
số phép so sánh ~ N^3 / 6

+ phép cộng mỗi bộ 3 thực hiện hai phép cộng :
số phép cộng = 2 * (N^3 / 6) = (N^3 / 3)

+ số lần truy cập mảng mỗi bộ 3 (a[i], a[j], a[k]) là 3:
số lần truy cập mảng = 3 * (N^3 / 6) = (N^3 / 2)

--> Độ phức tạp thuật toán là O(N^3)
 */