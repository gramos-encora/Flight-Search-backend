package com.gramos.flight_search.entity.flight_offer.itinerary;

import com.gramos.flight_search.entity.flight_offer.itinerary.segment.Segment;

import java.util.List;

public class Itinerary {
    private String duration;
    private List<Segment> segments;

    public Itinerary(String duration, List<Segment> segments) {
        this.duration = duration;
        this.segments = segments;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }
}
