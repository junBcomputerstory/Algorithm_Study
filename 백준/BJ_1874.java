import java.io.*;
import java.util.ArrayList;

public class BJ_1874 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        ArrayList<Integer> stack=new ArrayList<>();
        ArrayList<String> answer=new ArrayList<>();
        int num;
        stack.add(0);
        int idx=0;
        for(int i=0;i<n;i++){
            num=Integer.parseInt(br.readLine());
            if(num<stack.get(stack.size()-1)){
                answer.clear();
                answer.add("NO");
                break;
            }
            while(stack.get(stack.size()-1)<num){
                stack.add(idx+1);
                idx+=1;
                answer.add("+");
            }
            if(stack.get(stack.size()-1)==num){
                stack.remove(stack.size()-1);
                answer.add("-");
            }
        }
        for(int i=0;i< answer.size();i++)
            System.out.println(answer.get(i));


    }
}
