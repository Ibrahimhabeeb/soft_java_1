public class Learning implements  iLearning {
    private String course;
    private String Author;
    private int duration;

    Learning(String course, String Author){
        this.course = course;
        this.Author  = Author;

    }


    public void logresult (){
        System.out.println("Learning git");
    }



}
