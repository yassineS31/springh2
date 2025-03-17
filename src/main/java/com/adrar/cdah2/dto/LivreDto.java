package com.adrar.cdah2.dto;

import com.adrar.cdah2.model.MaisonEdition;
import com.adrar.cdah2.model.Genre;

import java.util.ArrayList;
import java.util.List;

public record LivreDto(
        Integer id,
        String titre,
        String content,
        String libele,
        String maisonEdition,
        String datePublication,
        ArrayList genres
) {

}
