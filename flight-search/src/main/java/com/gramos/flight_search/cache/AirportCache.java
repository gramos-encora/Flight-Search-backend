package com.gramos.flight_search.cache;
import com.gramos.flight_search.dto.AirportDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class AirportCache {

    private final Map<String, List<AirportDTO>> cache = new ConcurrentHashMap<>();

    public List<AirportDTO> getByKeyword(String keyword) {
        return cache.get(keyword.toLowerCase());
    }

    public void put(String keyword, List<AirportDTO> airports) {
        cache.put(keyword.toLowerCase(), airports);
    }

    public boolean contains(String keyword) {
        return cache.containsKey(keyword.toLowerCase());
    }
}
