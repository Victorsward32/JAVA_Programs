package OOPS;


interface Interface {
    public void show();
    

}
 class Test implements Interface{
    public void show(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Test n=new Test();
        n.show();
    }

}
