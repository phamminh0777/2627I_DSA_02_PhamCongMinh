package Week6.Algorithm;
/*
Nếu mảng được sắp xếp tăng dần mọi nửa trái và mọi nửa phải được chia ra đều được sắp xếp thì:
+ Tại mỗi bước đệ quy thì điều kiện a[mid] <= a[mid+ 1] luôn đúng 
+ Do đó lệnh merge bị bỏ qua hoàn toàn nên ko tốn bất kì thêm một phép so sánh nào 
+ so sánh duy nhất được thực hiện là phép a[mid] < = a[mid + 1] tại mỗi node của cây đệ quy
+ cây đệ quy  của mergesort chia đôi N phần tử có tổng cộng N - 1 node

-----> có tổng cộng N - 1 phép so sánh độ phức tạp thời gian là tuyến tính O(N)


*/