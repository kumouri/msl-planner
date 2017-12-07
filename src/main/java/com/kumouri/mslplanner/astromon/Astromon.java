package com.kumouri.mslplanner.astromon;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class Astromon {
    @Id
    private UUID id;

    private String name;
    private String species;
    private Integer level;
    private Integer ascensionLevel;
    private Integer evolutionLevel;

    private Integer experience;
    private Integer experienceToLevel;

    private Integer health;
    private Integer attack;
    private Integer defense;
    private Integer recovery;
    private Double critChance;
    private Integer critMulti;
}
