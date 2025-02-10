package com.macho199.board.controller.dto.req;

import java.time.Instant;

public record BoardReq(
        int id,
        String title,
        String content,
        Instant createdAt,
        Instant updatedAt
) {
}
