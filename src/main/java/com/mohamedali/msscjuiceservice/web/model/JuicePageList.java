package com.mohamedali.msscjuiceservice.web.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class JuicePageList extends PageImpl<JuiceDTO> {
    public JuicePageList(List<JuiceDTO> content, Pageable pageable, long total) {
        super(content, pageable, total);
    }

    public JuicePageList(List<JuiceDTO> content) {
        super(content);
    }
}
