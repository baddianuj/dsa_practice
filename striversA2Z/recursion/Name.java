public class Name {
    public static void main(String[] args) {
        String name = "anuj";
        int count=5;
        print(name,count);

    }
    public static void print(String name, int count){
        if(count>0){
            System.out.println(name);
            print(name, count-1);
        }
        
    }
}
