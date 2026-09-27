/*
a, cứ 3 thao tác sẽ in ra nội dung Queue
1: enqueue(0) : Queue[0]
2: enqueue(1) : Queue[0, 1]
3: dequeue() : Queue[1] (in ra 1)
4: enqueue(2) : Queue[1, 2]
5: enqueue(3) : Queue[1, 2, 3]
6: dequeue() : Queue[2, 3] (in ra 2, 3)
7: enqueue(4) : Queue[2, 3, 4]
8: enqueue(5) : Queue[2, 3, 4, 5]
9: dequeue() : Queue[3, 4, 5] (in ra 3, 4, 5)
10: enqueue(6) : Queue[3, 4, 5, 6]
11: enqueue(7) : Queue[3, 4, 5, 6, 7]
12: dequeue(): Queue[4, 5, 6, 7] in ra 4, 5, 6, 7

đáp án in ra: 1 2 3 3 4 5 4 5 6 7

b,thao tác chen vào danh sách liên kết là O(1) tuy nhiên bài này sau 3
thao tác sẽ phải in ra toàn queue nên trường hợp tồi nhất là thao tác
enqueue rơi vào thao tác thứ 3 lúc này in ra sẽ phải duyệt N phần tử 
trong queue dẫn đến tốn O(n)

c,
lần in 1(thao tác 3) in ra 3 phần tử (chi phí 3)
lần in 2(thao tác 6) in ra 6 phần tử (chi phí 6)
....
lần in thứ m(thao tác n/3) in ra 3m phần tử 

tổng:
3 + 6 + 9 + ... + 3m
= 3 * (1 + 2 + ...+ m)
m = n / 3

---> 3 * ((n /3) * (n / 3 + 1)) / 2
tổng chi phí cho n thao tác trong trường hợp xấu nhất là O(n**2) 
--> Do đó thời gian trung bình trên mỗi thao tác là O(n**2) / n = O(n)
 


 */