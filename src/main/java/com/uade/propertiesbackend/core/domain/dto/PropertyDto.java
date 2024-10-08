package com.uade.propertiesbackend.core.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.uade.propertiesbackend.core.domain.PropertyType;
import java.time.LocalDateTime;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PropertyDto {

  private Long id;
  private Integer beds;
  private Integer bathrooms;
  private String country;
  private String city;
  private String state;
  private Integer rooms;
  @JsonProperty("surface_covered")
  private Double surfaceCovered;
  @JsonProperty("surface_total")
  private Double surfaceTotal;
  private String title;
  private String description;
  private Double latitude;
  private Double longitude;
  private List<String> images;
  @JsonProperty("user_id")
  private Long userId;
  private String address;
  private Integer storeys;
  private Double price;
  private Integer garages;
  private PropertyType type;
  @JsonProperty("created_at")
  private LocalDateTime createdAt;
  private boolean active;
}
