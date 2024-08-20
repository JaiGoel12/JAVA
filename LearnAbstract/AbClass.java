package LearnAbstract;

//abstract class ChefRules {
//    abstract void bake();
//    abstract int cook(int spices);
//}
//
//class TajChef extends ChefRules {
//    @Override
//    void bake() {
//        System.out.println("bake cake");
//    }
//
//    @Override
//    int cook(int spices) {
//        return spices;
//    }
//}
//
//public class AbClass {
//    public static void main(String[] args) {
//        TajChef c1 = new TajChef();
//        c1.bake();
//        System.out.println(c1.cook(4));
//    }
//}





interface Employee{
    void id();
    void name();
    default void breathe(){
        System.out.println("Breathing");
    }
}

class Trainer implements Employee{

    @Override
    public void id(){
        System.out.println("1234");
    }

    @Override
    public void name(){
        System.out.println("Neeraj");
    }

    public void breathe(){
        System.out.println("Trainer is breathing");
    }
}

public class AbClass {
    public static void main(String[] args) {
        //     TajChef c1 = new TajChef();
        //     c1.bake();
        //     System.out.println(c1.cook(4));
        Trainer t1 = new Trainer();
        t1.name();
        t1.id();
        t1.breathe();

    }
}