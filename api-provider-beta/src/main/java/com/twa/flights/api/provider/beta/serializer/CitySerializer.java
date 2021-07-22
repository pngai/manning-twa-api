package com.twa.flights.api.provider.beta.serializer;

import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.stereotype.Service;

import com.twa.flights.api.provider.beta.dto.CityDTO;

@Service
public class CitySerializer implements RedisSerializer<CityDTO> {

    @Override
    public byte[] serialize(CityDTO clusterSearch) {
        return JsonSerializer.serialize(clusterSearch);
    }

    @Override
    public CityDTO deserialize(byte[] bytes) {
        return JsonSerializer.deserialize(bytes, CityDTO.class);
    }
}
