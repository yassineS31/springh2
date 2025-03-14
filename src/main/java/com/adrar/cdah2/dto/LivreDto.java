package com.adrar.cdah2.dto;

public record LivreDto(
        Integer id,
        String titre,
        String auteur,
        String datePublication,
        String maisonEdition,
        String email
) {
}
