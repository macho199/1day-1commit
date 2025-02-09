package com.macho199.board.model;

public record BoardRes(
    int id,
    String title,
    String content,
    String createdAt,
    String updatedAt
) {
}
