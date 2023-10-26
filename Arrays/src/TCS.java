public class TCS {
    void work(){
        System.out.println("Working");
    }
}
class Tata extends TCS{
    void work(){
        System.out.println("Working on AI");
    }
}
class Consultancy extends TCS{
    void work(){
        System.out.println("Working on ML");
    }
}
class Services extends TCS{
    void work(){
        System.out.println("Working on Tech");
    }
}
class Polly{
    public static void main(String[] args) {
        TCS t;
        t = new Tata();
        t.work();
        t = new Consultancy();
        t.work();
        t = new Services();
        t.work();
    }
}