package Week4.algorithm;

/*
ở các mảng có key bằng nhau thì thuật toán insertion sort chạy nhanh hơn vì mỗi phép so sánh a[j] < a[j-1]
sẽ trả về false ngay lần đầu tiên nên thuật toán chỉ mất N - 1 phép so sánh.Thời gian chạy tuyến tính O(n).

còn selection sort luôn phải duyệt qua toàn các phần tử mảng chưa sắp xếp để tìm giá trị nhỏ nhất nó ko
phụ thuộc vào giá trị của phần tử.Tổng phép so sánh luôn là N(N-1)/2 . Thời gian chạy thuật toán là O(N^2)


*/