
 class A{
    int x=10;
    void m(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        A obj=new A();
        System.out.println(obj.x);
        obj.m();
    }
}