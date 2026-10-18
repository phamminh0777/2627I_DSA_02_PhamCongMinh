package Week6.Algorithm;

/*
N = 39
top-down merge quá trình chia đôi 39 phần tử đệ quy xuống các kích thước 
nhỏ rồi gộp lên. Kích thước của các lần gọi là: 2, 3, 4, 5, 9, 10, 19, 20, 39

bottom-up ko chia đệ quy mà nó thực hiện các vòng lặp quét qua toàn bộ mảng. Ở mỗi 
vòng lặp nó gộp các phần tử kề nhau theo kích thước tăng dẫn lũy thừa của hai: 1, 2, 4, 8, 
16, 32, 39
*/