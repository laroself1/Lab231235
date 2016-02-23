
public class Main {
    public static void main(String[] args) {
      /* create 5 objects
        MyWindow L = new MyWindow(193.2,89.0,1,"blue",true);
        MyWindow M = new MyWindow(123.8,78.9,3,"white",true);
        MyWindow S = new MyWindow(34.6,65.9,2,"green",true);
        MyWindow F = new MyWindow(56.8,78.7,1,"transparent",true);
        MyWindow H = new MyWindow(56.8,78.7,1,"transparent",false);*/

        MyWindow MyWindows[] = new MyWindow[2];

        MyWindow A = new MyWindow();
        A.SetDef();
        MyWindow B = new MyWindow();
        B.Set(193.2,89.0,1,"blue",true);
        MyWindow C = new MyWindow();
        C.Set2(67,7.9);

        MyWindows[0]= A;
        MyWindows[1]=B;
//        MyWindows[2]=C; why doesn't work

        A.printFields();
        B.printFields();
        C.printFields();}}
