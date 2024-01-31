//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Employee e=new Employee("abc",123,20);
        e.EmployeeResult();

        System.out.println("Total salary is :"+ e.TotalSalary());

        System.out.println("Total wage is : "+ e.TotalWage());


}}