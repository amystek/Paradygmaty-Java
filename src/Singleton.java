public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static void main(String[] args) {
        Singleton s1 = new Singleton();
        System.out.println(s1);
    }
}