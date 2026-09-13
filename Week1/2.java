/*  a) có 1 thành phần liên thông vì phép union(0, i) kết nối các phần tử từ 1 đến n -1 với 0 
    b) vì ko thay đổi leader[q] nên thuật toán sẽ cập nhật những phần tử đang có cùng giá
    trị là leader với p
    union(0, 1) cập nhật 1 phần tử đổi leader[0] = leader[1]
    union(0, 2) cập nhật 2 phần tử đổi leader[0], leader[1] thành leader[2]
    union(0, 3) cập nhật 3 phần tử đổi leader[0], leader[1], leader[2] thành leader[3]
    .....
    union(0, n - 1) cập nhật n - 1 phần tử ... 
    tông só lần cập nhật mảng là 1 + 2 +3 + .. + (n - 1) ~ n**2/ 2

    c)số lần truy cập của find(0) thì thuật toán sẽ lần ngược từ 0 đến gốc (n-1)
    suy ra đi qua n đỉnh số lần truy cập là n
    d)trong thuật toán weighted quick union sẽ thay đổi gốc của q nêu hai cây có 
    chiều cao bằng nhau, gốc q sẽ trỏ vào gốc p
    union(0, 1) 1 trỏ vào 0
    union(0, 2) 1(kích thước 2) và 2 (kích thước 1) cây 2 trỏ vào 0
    ...
    các cây sẽ trỏ trực tiếp đến cây 0 
    khi gọi hàn find(0) sẽ chỉ tốn 1 lần truy cập tới gốc độ phức tạp là O(1)


*/