import java.io.*;
import java.util.*;

public class BJ_10828 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int order=Integer.parseInt(br.readLine());
        ArrayList stack=new ArrayList<Integer>();
        String instruction;
        int num=0;
        for(int i=0;i<order;i++){
            st=new StringTokenizer(br.readLine());
            instruction=st.nextToken();
            switch(instruction){
                case "push":
                    num=Integer.parseInt(st.nextToken());
                    stack.add(num);
                    break;
                case "pop":
                    if(stack.size()==0)
                        System.out.println("-1");
                    else{
                        System.out.println(stack.get(stack.size()-1));
                        stack.remove(stack.size()-1);
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "top":
                    if(stack.isEmpty())
                        System.out.println("-1");
                    else
                        System.out.println(stack.get(stack.size()-1));
                    break;

            }
        }

    }
}
