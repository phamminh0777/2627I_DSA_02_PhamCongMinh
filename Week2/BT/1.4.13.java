/*
a) Accumulator
double mu(8 bytes), double sum(8 bytes), int n (4 bytes)
overhead = 16 bytes, 4 bytes bộ nhớ đệm
tổng = 40 bytes

b) transaction
String who (8 bytes), Date when(8 bytes), double amount(8 bytes)

tổng = 16(overhead) + 8 + 8 + 8 = 40 bytes
c) FixedCapacityStackOfString
đối tượng stack: 16(overhead) + 8(tham chiếu mảng) + 4(int N) = 28bytes -> làm tròn 32bytes
mảng String[] sức chứa C: 24(overhead) + 8c(chứa C tham chiếu) = 24 + 8C bytes
N đối tượng String trong stack:40N bytes
tổng = 32 + (24 + 8C) + 40N = 56 + 8C + 40N bytes

d) Point2D

double x = 8 bytes
double y = 8 bytes
tổng = 16(overhead) + 8 + 8 = 32bytes
các biến X_ORDER,Y_ORDER,R_ORDER là static nên 0 bytes

e) Interval1D 
tổng = 16(overhead) + 8(double min) + 8(double max) = 32 bytes
các comparator và static tốn 0 bytes

f) Interval2D
Interval1D x : 8 bytes
Interval1D y : 8 bytes
dung lượng nông = 16(overhead) + 8 + 8 = 32
tổng = 32(bản thân) + 2 * 32(2 đối tượng Interval1D) = 96 bytes

g) Double
double value (8 bytes)
tổng = 16(overhead) + 8 = 24 bytes



*/