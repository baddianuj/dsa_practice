package introduction.inheritance.multilevel;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//        System.out.println(box.l + " " +box.w + " " + box.h);
//
//        Box  cube = new Box(4);
//        System.out.println(cube.l + " " +cube.w + " " + cube.h);
//
//
//        Box  box2 = new Box(4.3 , 32.4, 23.2);
//        System.out.println(box2.l + " " +box2.w + " " + box2.h);


//        type of the reference variable that determines what can be accessed
//        this ill not work  below

//        Box box  = new Boxweight(1,2,3,4);
//        System.out.println(box.weight);


//        no child referenmce and parent obj not allowed
//        Boxweight box  = new Box(1,2,3,4);
//        System.out.println(box.weight);

        BoxPrice box = new BoxPrice();
        System.out.println(box.l);
        System.out.println(box.w);
        System.out.println(box.h);
        System.out.println(box.weight);
        System.out.println(box.cost);

    }
}
