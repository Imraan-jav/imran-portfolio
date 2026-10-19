package com.imran.portfolio;

import java.util.List;

public record Project(
        String title,
        String role,
        String year,
        String summary,
        List<String> tech,
        String link) {
}
