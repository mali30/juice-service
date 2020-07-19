package com.mohamedali.msscjuiceservice.mappers;

import com.mohamedali.msscjuiceservice.domain.JuiceEntity;
import com.mohamedali.msscjuiceservice.web.model.JuiceDTO;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface JuiceMapper {

    JuiceEntity juiceEntityToJuiceDTO(JuiceDTO juiceDTO);
    JuiceDTO juiceDTOToJuiceEntity(JuiceEntity juiceEntity);
}
