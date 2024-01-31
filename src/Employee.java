import org.w3c.dom.ls.LSOutput;

public class Employee {
    String name;
    Integer id;
    public static final int Part_time=1;
    public static final int Full_time=2;


    Integer workhour=0;
    Integer wageperhour=20;
    Integer attendance;
    Integer Month;

    int EmployeeResult(int ehours,String cname,int totalworkdays,int maxmomnthhours){

        int totalworkhour=0;
        int totaldays=0;
        int emphr=0;
        while(totalworkhour<=maxmomnthhours || totaldays<=totalworkdays) {
            //mod 2 is done to ensure result is either 0 or 1
            int check = (int) (Math.random() * 10) % 3;
            switch(check){
                case Part_time:
                    emphr=4;
                    break;
                case Full_time:
                    emphr=8;
                    break;
                default:
                    emphr=0;


            }
            totaldays++;
            totalworkhour+=emphr;
        }

        System.out.println("Total number of days: "+totaldays+" Total number of hours: "+totalworkhour);
        int res=totalworkhour*ehours;
        System.out.println("Total wage of the employee of company "+cname+" is "+res);

        return res;

    }



}
