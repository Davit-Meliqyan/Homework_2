package homework_21.task_2;

public class Parent {

    int max(int a,int b){
        return Math.max(a, b);
    }

    int max(int a,int b,int c){
        return Math.max(a, Math.max(b,c));
    }

    void voice(){
        System.out.println("Parent");
    }
}
