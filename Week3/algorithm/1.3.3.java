package Week3.algorithm;
/*
push từ 0 -> 9 và pop tự do.
các chuỗi ko thể là output:
b, 4 6 8 7 5 3 2 9 0 1
push(0, 1, 2, 3, 4) - stack[0, 1, 2, 3, 4]; pop() -> 4; stack[0, 1, 2, 3]
push(5, 6) - stack[0, 1, 2, 3, 5, 6]; pop() -> 6; stack[0, 1, 2, 3, 5]
push(7, 8) - stack[0, 1, 2, 3, 5, 7, 8];pop() -> 8, 7, 5, 3, 2; stack[0, 1]
push(9) - stack[0, 1, 9];pop() -> 9, 1, 0
---> chuỗi b1: 4 6 8 7 5 3 2 9 1 0 != b -> sai
f, 0 4 6 5 3 8 1 7 2 9
push(0) - stack[0];pop() -> 0; stack[]
push(1, 2, 3, 4) - stack[1, 2, 3, 4]; pop() -> 4;stack[1, 2, 3]
push(5, 6) - stack[1, 2, 3, 5, 6];pop() -> 6, 5, 3; stack[1, 2]
push(7, 8) - stack[1, 2, 7, 8];pop() -> 8, 7, 2, 1; stack[]
push(9) pop() -> 9;
chuỗi f1 = 0 4 6 5 3 8 7 2 1 9 != f --> sai

g, 1 4 7 9 8 6 5 3 0 2
push(0, 1);  pop() -> 1 - stack[0]
push(2, 3, 4);  pop() -> 4 -stack[0, 2, 3]
push(5, 6, 7);  pop() -> 7 -stack[0, 2, 3, 5, 6]
push(8, 9);  pop() -> 9, 8, 6, 5, 3, 2, 0
---> g1: 1 4 7 9 8 6 5 3 2 0 != g --> sai


 */