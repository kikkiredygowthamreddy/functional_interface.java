@FunctionalInterface
interface  a{
     void show();

    }

public class laptop{
    public static void main(String[] args) {
        a obj = new a(){
            public  void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
}