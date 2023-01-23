package co.pragra.learning.firstspringproject.business;

import co.pragra.learning.firstspringproject.domain.IRateofInterest;
import co.pragra.learning.firstspringproject.domain.RateType;

public class FirstTimeBuyerProvider implements IRateofInterest {
    @Override
    public double getInterestRte(RateType rateType) {
        return 3.5;
    }
}
