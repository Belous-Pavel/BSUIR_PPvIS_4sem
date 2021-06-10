package org.bsuir.task.entity.impl;

import org.bsuir.task.entity.Author;
import org.bsuir.task.entity.Document;
import org.bsuir.task.entity.Folder;
import org.bsuir.task.exception.CustomException;

import java.time.LocalDate;

public class AuthorImpl implements Author {

    private final String name;

    public AuthorImpl(String name) {
        this.name = name;
    }

    @Override
    public synchronized void updateHeader(Document document, String newHeader) {
        document.setHeader(newHeader);
    }

    @Override
    public synchronized Document createDocument(Folder folder, String header, String context) throws CustomException {
        LocalDate currentDate = LocalDate.now();
        return new Document(folder, header, currentDate, this.name, context);
    }

    @Override
    public synchronized void updateContext(Document document, String newContext) {
        document.setContext(newContext);
    }
}
