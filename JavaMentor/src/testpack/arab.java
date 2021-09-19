package testpack;

public class arab {
  public static int Arab(int a, int b, char c){   //тут просто калькулятор
        int res=0;
        switch (c){
            case '-':
                res=a-b;
                break;
            case '+':
                res=a+b;
                break;
            case '*':
                res=a*b;
                break;
            case '/':
                res=a/b;
                break;
        }
        return res;
    }
}
