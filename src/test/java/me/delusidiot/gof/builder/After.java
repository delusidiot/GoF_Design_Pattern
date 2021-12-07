package me.delusidiot.gof.builder;

import me.delusidiot.gof.creational_patterns.builder.after.DefaultTourBuilder;
import me.delusidiot.gof.creational_patterns.builder.after.TourDirector;
import me.delusidiot.gof.creational_patterns.builder.after.TourPlan;
import me.delusidiot.gof.creational_patterns.builder.after.TourPlanBuilder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class After {
    @Test
    void afterBuilder(){
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("tour")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2021, 12, 9))
                .whereToStay("hotel")
                .addPlan(0, "checkin")
                .addPlan(0, "dinner")
                .getPlan();
        Assertions.assertThat(plan).isInstanceOf(TourPlan.class);
    }

    @Test
    void director(){
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.packageA();
        Assertions.assertThat(tourPlan).isInstanceOf(TourPlan.class);
    }
}
