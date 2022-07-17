package org.launchcode.techjobs.persistent.models.dto;

import org.launchcode.techjobs.persistent.models.Employer;
import org.launchcode.techjobs.persistent.models.Skill;

import javax.validation.constraints.NotNull;

public class EmployerDTO {

    @NotNull
    private Employer employer;

    @NotNull
    private Skill skill;
}

