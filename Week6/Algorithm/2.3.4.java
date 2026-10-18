package Week6.Algorithm;

/*
trường hợp xấu nhất của quicksort xảy ra khi ở mỗi bước phân hoạch pivot luôn là phần tử nhỏ nhất hoặc phần tử lớn nhất 
khiến một mảng con có độ dài là N - 1 và mảng còn lại có độ dài là 0

6 mảng có độ dài 10 mà thuộc trường hợp tệ nhất là :
1 2 3 4 5 6 7 8 9 10 (Mảng đã sắp xếp tăng dần)

10 9 8 7 6 5 4 3 2 1 (Mảng sắp xếp giảm dần)

1 10 9 8 7 6 5 4 3 2

10 1 2 3 4 5 6 7 8 9

2 3 4 5 6 7 8 9 10 1

9 8 7 6 5 4 3 2 1 10



*/