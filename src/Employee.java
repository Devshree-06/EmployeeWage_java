import org.w3c.dom.ls.LSOutput;
import java.util.*;

public class Employee {
    String name;
    Integer id;
    public static final int Part_time=1;
    public static final int Full_time=2;


    Integer workhour=0;
    Integer wageperhour=20;
    Integer attendance;
    Integer Month;
    Map<String,List<Integer>>Savewage=new HashMap<>();

    public void EmployeeResult(int ehours,String cname,int totalworkdays,int maxmomnthhours){

        List<Integer>everydaywages=new ArrayList<>();
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
            everydaywages.add(totalworkhour*ehours);
        }

        System.out.println("Total number of days: "+totaldays+" Total number of hours: "+totalworkhour);
        int res=totalworkhour*ehours;
        System.out.println("Total wage of the employee of company "+cname+" is "+res);
        Savewage.put(cname,everydaywages);


    }
    public int Companytotalwage(String cname){
        List<Integer>wages=Savewage.get(cname);
        return wages!=null?wages.stream().mapToInt(Integer::intValue).sum():0;
    }




}
