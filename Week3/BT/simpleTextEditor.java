package Week3.BT;
import java.util.*;

public class simpleTextEditor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(!sc.hasNextInt()) return;

        int q = sc.nextInt();
        StringBuilder text = new StringBuilder();
        Mystack<String> history = new Mystack<>();

        for(int i = 0; i < q; i++){
            int type = sc.nextInt();
            switch(type){
                case 1:
                    String w = sc.next();
                    history.push(text.toString());
                    text.append(w);
                    break;
                case 2:
                    int k = sc.nextInt();
                    history.push(text.toString());
                    text.delete(text.length() - k, text.length());
                    break;
                case 3:
                    int index = sc.nextInt();
                    System.out.println(text.charAt(index - 1));
                    break;
                case 4:
                    if(!history.isEmpty()){
                        text = new StringBuilder(history.pop());
                    }
                    break;
            }
        }
        sc.close();

    }
}
