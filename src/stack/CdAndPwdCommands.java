package stack;

import java.util.Scanner;
import java.util.Stack;

public class CdAndPwdCommands {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        int numberOfCommands = obj.nextInt();
        Stack<String> stack = new Stack<>();
        stack.push("/");
        while (numberOfCommands-- > 0) {
            String command = obj.next();
            if(command.equals("pwd")){
                for(String dir :stack){
                    System.out.print(dir);
                }
                System.out.println();
            } else if(command.equals("cd")){

                String path = obj.next();
                if(path.startsWith("/")) {
                    stack.clear();
                    stack.push("/");
                }
                String[] dirs = path.split("/");
                for (String dir : dirs) {
                    if(dir.isEmpty()) {
                        continue;
                    }
                    if(dir.equals("..")) {
                        stack.pop();
                        stack.pop();
                    }else{
                        stack.push(dir);
                        stack.push("/");
                    }

                }
            }
        }
    }
}
