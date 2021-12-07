package me.delusidiot.gof.creational_patterns.builder.other;

import java.time.LocalDate;

public interface TourPlanBuilder {
    TourPlanBuilder getInstance();
    TourPlanBuilder title(String title);
    TourPlanBuilder nightsAndDays(int nights, int days);
    TourPlanBuilder startDate(LocalDate localDate);
    TourPlanBuilder whereToStay(String whereToStay);
    TourPlanBuilder addPlan(int day, String plan);
    TourPlan getPlan();
}
