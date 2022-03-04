package homework_20.task_2;

public class ProgrammingLanguage implements Language{

    @Override
    public void getName( String str){
        System.out.println("ProgrammingLanguage");
        System.out.println(str);
    }
}
