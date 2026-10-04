package Week4.algorithm;

/*

A = [4, 3, 2, 1]

+ i = 0  min = 0 ---> A[min] = 4  


j = 1  A[1] = 3 < 4 --- cập nhật min = 1
j = 2  A[2] = 2 < 3  --- cập nhật min = 2
j = 3  A[3] = 1 < 2 ---- cập nhật min = 3
số lần cập nhật min = 3 lần
A[0] đổi chỗ A[3] -- A[1, 3, 2, 4]

+ i = 1 min = 1 --- A[min] = 3  xét mảng [3, 2, 4]

j = 2 A[2] = 2 < 3 -- min = 2
j = 3 A[3] = 4 > 2 -- ko cập nhật

đổi chỗ A[1] cho A[2] -- A[1, 2, 3, 4]

+ i = 2  xét đoạn [3,4] sắp xếp xong 

Mảng sắp xếp giảm dần làm cho các phần tử đứng sau ở lượt duyệt đầu tiên luôn nhỏ hơn giá trị nhỏ 
nhất vừa tìm được trước đó, dẫn đến số lần cập nhật chỉ số min đạt giá trị cực đại.

*/