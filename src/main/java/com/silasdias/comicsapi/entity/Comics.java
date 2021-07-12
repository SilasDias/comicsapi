package com.silasdias.comicsapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Comics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comicId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String price;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false, unique = true)
    private int isbn;

    @Column(nullable = false)
    private String descricao;

}
