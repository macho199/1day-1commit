package com.macho199.board.model;

import java.time.Instant;

public record Board(
        int id,
        String title,
        String content,
        Instant createdAt,
        Instant updatedAt

) {
}
