package Week3.algorithm;

/* 
Stack<String> stack = new Stack<String>();
while (!q.isEmpty())  stack.push(q.dequeue());
while (!stack.isEmpty())  q.enqueue(stack.pop());

đoạn code này thể hiện dảo ngược q
minh họa Queue q = ["A", "B", "C"]
stack = []

kiểm tra q ko rỗng stack = ["A"] --- q = ["B", "C"]
------------------ stack = ["A", "B"] --- q = ["C"]
------------------ stack = ["A", "B", "C"] --- q = []
q rỗng thoát vòng lặp

kiểm tra stack ko rỗng q = ["C"] -- stack = ["A", "B"]
---------------------- q = ["C", "B"] -- stack = ["A"]
---------------------- q = ["C", "B", "A"] -- stack = []

kết quả cuối cùng thu dc q = ["C", "B", "A"]

*/