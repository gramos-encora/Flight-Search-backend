package com.gramos.flight_search.entity;

import java.util.List;

public class PricingOptions {
    private List<String> fareType;
    private boolean includedCheckedBagsOnly;

    public PricingOptions(List<String> fareType, boolean includedCheckedBagsOnly) {
        this.fareType = fareType;
        this.includedCheckedBagsOnly = includedCheckedBagsOnly;
    }

    public List<String> getFareType() {
        return fareType;
    }

    public void setFareType(List<String> fareType) {
        this.fareType = fareType;
    }

    public boolean isIncludedCheckedBagsOnly() {
        return includedCheckedBagsOnly;
    }

    public void setIncludedCheckedBagsOnly(boolean includedCheckedBagsOnly) {
        this.includedCheckedBagsOnly = includedCheckedBagsOnly;
    }
}
