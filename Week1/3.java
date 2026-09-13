/* vì lệnh union gần nhất nên sẽ liên quan đến các cạnh nối trực tiếp với gốc là (4 hoặc 8)
   + xét union(4, 0) vì lúc này cây 4 và cây 0 có cùng kích thước nên gốc 0 sẽ trỏ vào gốc 4 khớp với hình ảnh
   + xét union(5, 0) cũng có thể là lệnh gần nhất vì gốc của 5 là 4 và gốc 0 là 0 và có cùng kích thước 4 nên
   gốc 0 sẽ trỏ vào gốc của 5 là 4 cũng khớp với hình 
   + union(4, 5) cây 4 lúc này có kích thước 6 gốc 4 và cây 5 có kích thước 2 gốc 5 suy ra gốc 5 trỏ vào gốc 4
   khớp với hình
   + union(6, 4) cây 6 chứ kích thước là 1 cây 4 chứa kích thước 7 nên cây 6 trỏ vào cây 4 khớp hình
   + union(8, 9) cây 8 với cây 9 kích thước bằng nhau nên cây 9 trỏ vào cây 8 khớp hình vẽ
 */