package com.macho199.board.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Board(
        @Id
        int id,
        String title

) {
}
