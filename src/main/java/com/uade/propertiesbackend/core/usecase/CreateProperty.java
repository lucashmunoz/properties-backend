package com.uade.propertiesbackend.core.usecase;

import com.uade.propertiesbackend.core.domain.dto.PropertyDto;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import java.util.List;
import java.util.function.Function;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;

@FunctionalInterface
public interface CreateProperty extends Function<CreateProperty.Model, PropertyDto> {

  @Getter
  @Builder
  class Model {
    private Integer beds;
    private Integer bathrooms;
    private String country;
    private String city;
    private String state;
    private Integer rooms;
    private Double surface;
    private String title;
    private String description;
    private Double latitude;
    private Double longitude;
    private List<String> images;
    private Long userId;
    private String street;
    private Integer streetNumber;
    private Integer storeys;
    private Double price;
  }
}
