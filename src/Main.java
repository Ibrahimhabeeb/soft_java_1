public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Learning learn = new Learning("Oracle Tutorial", "Waz");
        learn.logresult();
        Learning cl = new childlearn("Polymorphism", "Wazir");
        Learning branchin = new childlearn("merge conflicts", 'Habeebranch');
        branchin.logresult();
        branchin.getClass();
    }
}