package org.bsuir.task.entity;

import org.bsuir.task.exception.CustomException;

public interface Secretary {
    boolean addDocument(Folder folder, Document document) throws CustomException;

    Document searchDocumentByHeader(Folder folder, String header);

    Document searchDocumentByAuthor(Folder folder, String writer);
}
