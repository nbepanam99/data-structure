package design_patterns.creational.factory.concrete;

public class GetPlanFactory {
    public Plan getPlan(int planType){
        if(!(planType > 0)){
            return null;
        }
        if(planType == 1) {
            return new DomesticPlan();
        }
        else if(planType == 2){
            return new CommercialPlan();
        }
        else if(planType == 3) {
            return new InstitutionalPlan();
        }
        return null;
    }
}
