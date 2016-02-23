
public class MyWindow {
   private double width;
    private double height;
    private int numberOfGlass;
     private String color;
   private  boolean isOpen;

    /*Constructors one from another
public MyWindow(double width, double height){
this.width=width;
this.height=height;}

public  MyWindow(double width, double height,int numberOfGlass){
this(width,height);
this.numberOfGlass=numberOfGlass;}

public  MyWindow(double width, double height,int numberOfGlass,String color,boolean isOpen){
this(width,height,numberOfGlass);
this.color=color;
this.isOpen=isOpen;}*/

    public void printFields(){
        System.out.println("W: "+width+" H: "+height+" G: "+numberOfGlass+" "+color+" "+isOpen);}

        public void SetDef(){
        this.width=0.0;
        this.height=0.0;
        this.numberOfGlass=0;
        this.color="transparent";
        this.isOpen = false;}

    public void Set(double width,double height,int numberOfGlass,String color,boolean isOpen)
    {this.width = width; this.height = height; this.numberOfGlass = numberOfGlass;this.color = color; this.isOpen = isOpen;}

    public void Set2(double width,double height){this.width = width; this.height = height;}

    public void get(){ System.out.println("W: "+width+" H: "+height+" G: "+numberOfGlass+" "+color+" "+isOpen); }}
