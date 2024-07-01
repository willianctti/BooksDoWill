package com.livrosDoWill.LivrosDoWill.book;

import java.util.UUID;

public record BookResponseDTO(UUID id, String title, String image, String description){
    public BookResponseDTO(Book book) {
        this(book.getId(), book.getTitle(), book.getImage(), book.getDescription());
    }
}
