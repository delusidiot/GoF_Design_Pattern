package me.delusidiot.gof.builder;

import me.delusidiot.gof.creational_patterns.builder.other.DefaultTourBuilder;
import me.delusidiot.gof.creational_patterns.builder.other.TourPlan;
import me.delusidiot.gof.creational_patterns.builder.other.TourPlanBuilder;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Other {
    @Test
    void otherBuilder() {
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
}
