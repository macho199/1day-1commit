package com.macho199.board.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/board")
public class BoardController {

    @GetMapping("/{id}")
    public String get() {
        return "get";
    }

    @GetMapping
    public String getList() {
        return "getList";
    }

    @PostMapping
    public String add() {
        return "post";
    }

    @PutMapping
    public String modify() {
        return "put";
    }

    @DeleteMapping
    public String delete() {
        return "delete";
    }

}
