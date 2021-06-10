package org.bsuir.task.validator;

import org.bsuir.task.entity.Document;

import java.util.List;

public class CustomValidator {

    private CustomValidator() {

    }

    public static boolean isHeaderTaken(List<Document> documents, String header) {

        for (Document document : documents) {
            if (document.getHeader().equals(header)) {
                return true;
            }
        }
        return false;
    }
}
