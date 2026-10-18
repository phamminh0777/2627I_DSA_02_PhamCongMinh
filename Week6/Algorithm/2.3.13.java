package Week6.Algorithm;

/*
độ sâu gọi đệ quy của quicksort là:
Trường hợp tốt nhất (Best-case): $O(\log N)$ — khi mỗi bước phân hoạch chia mảng thành 2 nửa bằng nhau.
Trường hợp trung bình (Average-case): $O(\log N)$ — với xác định phân hoạch ngẫu nhiên tương đối cân bằng.
Trường hợp tồi nhất (Worst-case):Bản tiêu chuẩn (không tối ưu đệ quy đuôi): $O(N)$ — khi phân hoạch luôn bị lệch $1$ và $N-1$.
Bản tối ưu (luôn gọi đệ quy cho mảng con nhỏ hơn trước): Tối đa $O(\log N)$ không gian bộ nhớ stack.


*/