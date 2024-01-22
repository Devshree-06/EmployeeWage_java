public class Employee {
    String name;
    Integer id;

    Integer workhour=0;
    Integer wageperhour=20;
    Integer attendance;
    Integer Month;

    Employee(String n,Integer i,Integer w){
        this.name=n;
        this.id=i;
        this.wageperhour=w;
    }
}
