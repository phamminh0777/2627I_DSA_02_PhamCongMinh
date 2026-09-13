/* [5, 6, 0, 4, 0, 5, 0, 5, 6, 7]


  + 0 là gốc của 2, 4, 6 
    4 là cha của 3 (kích thước 2)
    6 là cha của 1 và 8 (kích thước 3)
    tổng kích thước là 1(0) + 1(2) + 2(4) + 3(6) = 7

  + 5 là gốc của 0, 5, 7
    7 chứa nút 9 kích thước 2
    tổng kích thước cây 5 trước khi gộp với gốc 0 là 1(5) + 2(7) = 3
    theo weigth quick union thì cây kích cỡ nhỏ phải trỏ vào cây kích cỡ lớn nên gốc 5 phải trỏ vào gốc 0
    nhưng đề bài lại ngược lại nên biểu diễn trên ko phải cấu trúc dữ liệu của một weigth quick union
    
 */