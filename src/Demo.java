public class Demo {
    public static void main(String[] args) {
        Worier fire=new FireFoghter();
        fire.getWorier();
        fire.relax();
        fire.work();
        System.out.println("==========================================");
        Worier Lumber = new LumberJack();
        Lumber.work();
        Lumber.relax();
        Lumber.getWorier();
        System.out.println("======================================================");
        Worier postman = new PostMan();
        postman.getWorier();
        postman.relax();
        postman.work();
        System.out.println("====================================================");
        Worier manager = new Manager();
        manager.getWorier();
        manager.work();
        manager.relax();
    }
}
