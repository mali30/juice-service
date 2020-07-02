package com.mohamedali.msscjuiceservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by mohamed ali on 2020-1-20
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JuiceDTO {
    private UUID uuid;
    private Integer version;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;
    private String juiceName;
    private JuiceStyleEnum juiceStyle;
    private Long upc;
    private Integer quantityOnHand;

}
