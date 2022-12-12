package fundamental.design.patterns.creational.factory.concrete;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

    public static void main(String args[])throws IOException {
        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Enter the name of plan for which the bill will be generated: ");
        System.out.println("1 : DOMESTIC");
        System.out.println("2 : COMMERCIAL");
        System.out.println("3 : INSTITUTIONAL");
        System.out.print("Choice : ");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int planId=Integer.parseInt(br.readLine());
        System.out.print("Enter the number of units for bill will be calculated: ");
        int units=Integer.parseInt(br.readLine());

        Plan p = planFactory.getPlan(planId);
        //call getRate() method and calculateBill()method of DomesticPlan.

        System.out.print("Bill amount for "+planId+" of  "+units+" units is: ");
        p.getRate();
        p.calculateBill(units);
    }

}
