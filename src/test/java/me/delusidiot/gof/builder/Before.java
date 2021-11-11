package me.delusidiot.gof.builder;

import me.delusidiot.gof.builder.before.TourPlan;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class Before {
    @Test
    void nonBuilder() {
        TourPlan tourPlan = new TourPlan();
        tourPlan.setTitle("USA tour");
        tourPlan.setNights(2);
        tourPlan.setDays(3);
        tourPlan.setStartDate(LocalDate.of(2022, 3, 19));
        tourPlan.setWhereToStay("hotel");
        tourPlan.addPlans(0, "checkin");
        tourPlan.addPlans(0, "dinner");
        tourPlan.addPlans(1, "breakfast");
        tourPlan.addPlans(1, "stroll");
        tourPlan.addPlans(1, "lunch");
        tourPlan.addPlans(1, "swim");
        tourPlan.addPlans(1, "dinner");
        tourPlan.addPlans(2, "breakfast");
        tourPlan.addPlans(2, "checkout");
        Assertions.assertThat(tourPlan).isInstanceOf(TourPlan.class);
    }
}
