package com.macho199.board.controller.dto.res;

import java.time.Instant;

public record BoardRes(
        int id,
        String title,
        String content,
        Instant createdAt,
        Instant updatedAt
) {
}
