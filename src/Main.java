//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Employee e=new Employee("abc",123);

        //mod 2 is done to ensure result is either 0 or 1
        int check=(int)(Math.random()*10)%2;

        if(check==0){
            e.attendance=false;
        }
        else{
            e.attendance=true;
        }

        if(e.attendance){
            e.workhour=8;
            System.out.println("Employee is Present");
        }
        else{
            System.out.println("Employee is Absent");
        }

        Main m_obj=new Main();
        System.out.println("The salary of employee is :"+m_obj.calculateWage(e));


    }
    double calculateWage(Employee e1){
        return e1.workhour*e1.wageperhour;
    }
}