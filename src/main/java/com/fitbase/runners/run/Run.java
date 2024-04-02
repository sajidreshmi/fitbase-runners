package com.fitbase.runners.run;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotEmpty;

public record Run(
        Integer id,
        // notempty using jakarta validation add import
        @NotEmpty String title,
        LocalDateTime startedOn,
        LocalDateTime completedOn,
        Integer miles,
        Location location) {
    public Run {
        if (!completedOn.isAfter(startedOn)) {
            throw new IllegalArgumentException("completedOn must be after startedOn");
        }
    }
}
