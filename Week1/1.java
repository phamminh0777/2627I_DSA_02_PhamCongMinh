package Week1;
class QuickFind {
    private int[] leader;

    public QuickFind (int n) {
        leader = new int[n];
        for (int i = 0; i < n; i++) {
            leader[i] = i;
        }
    }

    public int find(int p) {
        return leader[p];
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        for (int i = 0; i < leader.length; i++) {
            if (leader[i] == leader[p]) {
                leader[i] = leader[q];
            }
        }
        // lỗi là leader[p] bị thay đổi trong quá trình chạy vòng lặp 
        // khi vòng lặp i = p thì leader[i] == leader[p] luôn đúng nên khi đó leader[p] sẽ bị gán thành leader[q]
        // kể từ vòng lặp tiếp theo thì leader[i] sẽ so sánh với giá trị leader[p] mới chứ ko phải giá trị p ban đầu
        // nên các phần tử nắm sau p mà vốn dĩ đã cùng chung với gốc với q sẽ ko được cập nhập sang leader mới .
    }



    // fix
    /*  public void union(int p, int q) { 
            int leadp = leader[p];
            int leadq = leader[q];

            for (int i = 0; i < leader.length; i++) {
                if (leader[i] == leaderp) {
                    leader[i] = leaderq;
                }
            }
    */
    
}