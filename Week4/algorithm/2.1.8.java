package Week4.algorithm;
/*
thời gian chạy cuản insertion sỏt tỷ lệ thuật với phép nghịch thế 
đối với một mảng ngẫu nhiên gồm n phần tử chỉ nhận 3 giá trị khác nhau (giả sử mỗi giá trị xuất hiện với xác suất 1/3)
tổng số cặp (i, j) với i < j là N*(N-1)/2
xác suất để một cặp bất kì tạo thành một nghịch thế(a[i] > a[j]) là 1/3
số lượng nghịch thế kì vọng trong mảng là:
1/3 * N(N-1)/2 ~  N^2/6

số lượng nghịch thế vẫn tăng O(N^2) nên thời gian chạy của insertion sort là O(n^2);


*/