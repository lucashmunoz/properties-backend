package com.uade.propertiesbackend.core.usecase;

import com.uade.propertiesbackend.core.domain.Property;
import com.uade.propertiesbackend.core.domain.PropertyType;
import java.util.Optional;
import java.util.function.Function;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.jpa.domain.Specification;

public interface RetrievePropertySpecs extends
    Function<RetrievePropertySpecs.Model, Specification<Property>> {

  @Getter
  @Builder
  class Model {
    private Optional<Double> minPrice;
    private Optional<Double> maxPrice;
    private Optional<Integer> minRooms;
    private Optional<Integer> maxRooms;
    private Optional<Integer> rooms;
    private Optional<Integer> minBeds;
    private Optional<Integer> maxBeds;
    private Optional<Integer> beds;
    private Optional<Integer> minBathrooms;
    private Optional<Integer> maxBathrooms;
    private Optional<Integer> bathrooms;
    private Optional<Integer> minGarages;
    private Optional<Integer> maxGarages;
    private Optional<Integer> garages;
    private Optional<Integer> minStoreys;
    private Optional<Integer> maxStoreys;
    private Optional<Integer> storeys;
    private Optional<Double> minSurfaceCovered;
    private Optional<Double> maxSurfaceCovered;
    private Optional<Double> minSurfaceTotal;
    private Optional<Double> maxSurfaceTotal;
    private Optional<PropertyType> propertyType;
  }
}
