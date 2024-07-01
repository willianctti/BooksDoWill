package com.livrosDoWill.LivrosDoWill.book;

import jakarta.persistence.*;
import java.util.UUID;

@Table(name = "books")
@Entity(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    private String image;
    private String description;

}
