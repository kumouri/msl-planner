package com.kumouri.mslplanner.passiveskill;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.UUID;

@Data
public class PassiveSkill {
    @Id
    private UUID id;


}
