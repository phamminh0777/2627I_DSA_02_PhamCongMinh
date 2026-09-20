package Week2;
import java.util.Arrays;

class BinarySearchFirst{
    public static int indexOf(int[] a, int key) {
        int l = 0;
        int r = a.length - 1;
        int result = -1;

        while(l <= r) {
            int mid = (l + r) / 2;
            if(key < a[mid]) {
                r = mid - 1;
            } else if(key > a[mid]) {
                l = mid + 1;
            } else {
                
                result = mid; // lưu vịtris xuất hiện
                r = mid -1; // Thu hẹp về bên trái để tìm vị trí nhỏ hơn

            }

            /* else {
                while(mid > 0 && a[mid-1] == key) { 
                        mid--;
                    }
                } 
                    return mid;*/  // thuật toán này là O(N), vòng lặp While tuyến tính
                
        }
        return result;

    }
}

