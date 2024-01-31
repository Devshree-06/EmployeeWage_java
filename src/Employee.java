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
    void EmployeeResult(){
        int totalworkhour=0;
        int totaldays=0;
        while(totalworkhour<100 || totaldays<20) {
            //mod 2 is done to ensure result is either 0 or 1
            int check = (int) (Math.random() * 10) % 3;


            if (check == 0) {
                attendance = 0;
            } else if (check == 1) {
                attendance = 1;
            } else {
                attendance = 2;
            }

        /*if(e.attendance==1){
            e.workhour=8;
            System.out.println("Employee is Present");
        }
        else if(e.attendance==0){
            System.out.println("Employee is Absent");
        }
        else{
            e.workhour=4;
            System.out.println("Employee did part time");
        }*/
            switch (attendance) {
                case 1:
                    workhour = 8;
                    System.out.println("Employee is Present");
                    break;
                case 2:
                    System.out.println("Employee is Absent");
                    break;
                default:
                    workhour = 4;
                    System.out.println("Employee did Part-time");
                    break;

            }
            totaldays++;
            totalworkhour+=workhour;
        }

        System.out.println("Total number of days:"+totaldays+"Total number of hours: "+totalworkhour);
    }
    double TotalSalary(){
        return workhour*workhour*20;
    }
    double TotalWage(){
        return workhour*wageperhour;
    }



}
