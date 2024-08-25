package com.uade.propertiesbackend.router;

import com.uade.propertiesbackend.core.domain.dto.PropertyDto;
import com.uade.propertiesbackend.core.usecase.RemoveFavoriteProperty;
import com.uade.propertiesbackend.router.exception.ApiError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "Properties", description = "Operations related to properties")
public class RemoveFavoritePropertyRouter {

  private final RemoveFavoriteProperty removeFavoriteProperty;

  public RemoveFavoritePropertyRouter(RemoveFavoriteProperty removeFavoriteProperty) {
    this.removeFavoriteProperty = removeFavoriteProperty;
  }

  @Operation(summary = "Remove favorite property")
  @ApiResponses(value = {
      @ApiResponse(responseCode = "200", description = "Property removed", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = PropertyDto.class))}),
      @ApiResponse(responseCode = "400", description = "Bad request", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))}),
      @ApiResponse(responseCode = "404", description = "Not found", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))}),
      @ApiResponse(responseCode = "424", description = "Failed dependency", content = {
          @Content(mediaType = "application/json", schema = @Schema(implementation = ApiError.class))})})
  @DeleteMapping("/properties/{propertyId}/favorites")
  public ResponseEntity<Void> removeFavoriteProperty(@PathVariable Long propertyId,
      @RequestParam Long userId) {
    removeFavoriteProperty.accept(
        RemoveFavoriteProperty.Model.builder().propertyId(propertyId).userId(userId).build());
    return ResponseEntity.ok().build();
  }
}
