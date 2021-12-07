package me.delusidiot.gof.creational_patterns.builder.after;

import java.time.LocalDate;

public class TourDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder){
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan packageA(){
        return tourPlanBuilder.title("tourA")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 12, 9))
                .whereToStay("hotel")
                .addPlan(0, "checkin")
                .addPlan(0, "dinner")
                .getPlan();
    }

    public TourPlan packageB(){
        return tourPlanBuilder.title("tourB")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 12, 11))
                .whereToStay("hotel")
                .addPlan(0, "breakfast")
                .getPlan();
    }
}
