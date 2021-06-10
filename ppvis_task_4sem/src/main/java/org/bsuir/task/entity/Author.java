package org.bsuir.task.entity;

import org.bsuir.task.exception.CustomException;

public interface Author {
    Document createDocument(Folder folder, String header, String context) throws CustomException;

    void updateHeader(Document document, String newHeader);

    void updateContext(Document document, String newContext);
}
