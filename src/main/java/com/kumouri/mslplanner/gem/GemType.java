package com.kumouri.mslplanner.gem;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class GemType {
    @Id
    private UUID id;
    private String name;
    private boolean percent;
    private Integer bonus;

}
