package com.adrar.cdah2.exception;

import com.adrar.cdah2.model.Livre;

public class SaveLivreExistException extends RuntimeException {
    public SaveLivreExistException(Livre livre) {
        super("Le livre : " + livre.getTitre() + ", " + livre.getDescription() + " existe déjà");
    }
}
