package Week6.LT;
/*
mảng : 1, n + 1, 2, n + 2, 3, n + 3, ... ,n, 2n   length = 2n

+ Selection sort:
luôn thực hiện số phép so sánh cố định ko phụ thuộc vào tình trạng ban đầu mảng. Với mảng có độ 
dài N thuật toán sẽ thực hiện: (N - 1) + (N - 2) + ... + 1  = N * (N - 1) / 2
---> với độ dài mảng là 2n thì ---> N = 2n --> số phép so sánh là: 2n x (2n - 1) / 2 = 2n^2 - n
~ 2n^2

+ Insertion sort: ~ 1/2 n^2

+ merge sort:
2nlog(2n) = 2nlogn + 2n ~ 2nlogn

*/