package Week4.algorithm;

/*
for (int j = i; j > 0 && less(a[j], a[j-1]); j--)


+ điều kiện 1 (j > 0) luôn false khi kết thúc vòng lặp
  ví dụ : 
  A[5, 4, 3, 2, 1] mảng sắp xếp giảm dần 
   Tại mỗi bước i, phần tử a[i] luôn nhỏ hơn tất cả các phần tử đứng trước nó. Do đó, điều kiện a[j] < a[j-1] luôn true với mọi j > 0.
   Vòng lặp chỉ dừng lại khi j bị giảm liên tục về 0, khiến điều kiện j > 0 chuyển sang false


   + điều kiện 2 (j > 0) luôn false khi vòng lặp kết thúc
   ví dụ:
   A[1, 2, 3, 4] mảng đã sắp xếp theo thứ tự tăng dần
   Tại mỗi bước i , kiểm tra đầu tiên khi j = i luôn thu được a[i] >= a[i-1].
   Điều này khiến a[j] < a[j-1] bị false ngay lập tức (trong khi j > 0 vẫn đang true) và kết thúc vòng lặp.

*/