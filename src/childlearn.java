public class childlearn extends  Learning {


    childlearn(String course, String Author){
        super(course, Author);
    }

//method overloadingggg
    public void learnstashing(int times) {
        System.out.println("Stashing " + times + " times");
    }

    public void learnstashing(String message) {
        System.out.println("Message: " + message);
    }

    public void learnstashing(int times, String message) {
        System.out.println("Stashing " + times + " times with message: " + message);
    }

    public String learnrebase(){
        return "rebaseee";
    }



}
