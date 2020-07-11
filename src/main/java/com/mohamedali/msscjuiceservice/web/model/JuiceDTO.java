package com.mohamedali.msscjuiceservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by mohamed ali on 2020-1-20
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JuiceDTO {
    @Null
    private UUID uuid;

    @Null
    private Integer version;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private String juiceName;

    @NotNull
    private JuiceStyleEnum juiceStyle;

    @NotNull
    @Positive
    private Long upc;

    private Integer quantityOnHand;

    @Positive
    @NotNull
    private Integer price;

}
