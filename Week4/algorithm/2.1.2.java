package Week4.algorithm;

/*
ở thuật toán selection sort một phần tử đổi chỗ bất kì cần tối đa n - 1
lần đổi chỗ để vào đúng vị trí. Ở mỗi bước i phần tử nhỏ nhất trong đoạn chưa sắp
xếp A [i,..., N -1] sẽ đượi đổi chỗ với phần tử i. Một phần tử có giá trị lớn có thể liên 
tục bị đẩy sang phải 1 vị trí sau 1 vòng lặp cho đến vị trí cuối cùng.

ví dụ A[4, 1, 2, 3]

i   min     0 1 2 3 
            4 1 2 3
0   1       1 4 2 3  
1   2       1 2 4 3
2   3       1 2 3 4
3   3       1 2 3 4
            1 2 3 4


Mỗi phép swap trong selection sort cần N - 1 thao tác. Với mỗi thao tác tác động đến 2 phần tử
nên tổng số thao tác là 2 * (N - 1) 
trung bình số phép hoán đổi :  2(N-1) / N  ~ 2 - 2 / N        



*/