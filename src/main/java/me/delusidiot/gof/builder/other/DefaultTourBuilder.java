package me.delusidiot.gof.builder.other;

import me.delusidiot.gof.builder.before.DetailPlan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder implements TourPlanBuilder {
    TourPlan tourPlan;

    @Override
    public TourPlanBuilder getInstance() {
        tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate localDate) {
        this.tourPlan.setStartDate(localDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null) {
            this.tourPlan.setPlans(new ArrayList<>());
        }
        this.tourPlan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan() {
        return tourPlan;
    }
}
