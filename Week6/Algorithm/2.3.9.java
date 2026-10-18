package Week6.Algorithm;

/*
Hiện tượng xảy ra khi chạy Quicksort cho mảng chỉ có 2 hoặc 3 giá trị phân biệt
Với 2 giá trị phân biệt: Quicksort tiêu chuẩn sẽ thực hiện rất nhiều phép tráo đổi (exchange) không cần thiết giữa các phần tử có giá trị bằng nhau.
Tuy nhiên, nó vẫn chia đôi mảng cân bằng nên thời gian chạy vẫn là NlogN
Với 3 giá trị phân biệt: Vẫn xảy ra hiện tượng hoán đổi vô ích lặp đi lặp lại.
Khắc phục: Để khắc phục vấn đề này, người ta sử dụng thuật toán Quicksort phân hoạch 3 đường (3-way Partitioning - Dijkstra) 
để gom tất cả các phần tử bằng chốt vào giữa, giúp độ phức tạp giảm xuống $O(N)$ đối với mảng có ít giá trị phân biệt.

*/