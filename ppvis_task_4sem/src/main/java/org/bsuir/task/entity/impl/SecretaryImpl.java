package org.bsuir.task.entity.impl;

import org.bsuir.task.entity.Document;
import org.bsuir.task.entity.Folder;
import org.bsuir.task.entity.Secretary;
import org.bsuir.task.exception.CustomException;

import java.util.List;

public class SecretaryImpl implements Secretary {

    @Override
    public synchronized boolean addDocument(Folder folder, Document document) throws CustomException {
        return folder.addDocument(document);
    }

    @Override
    public synchronized Document searchDocumentByHeader(Folder currentFolder, String header) {
        List<Folder> foldersInCurrentFolder = List.copyOf(currentFolder.getFolders());

        for (Folder folder : foldersInCurrentFolder) {
            List<Document> documentsInFolder = List.copyOf(folder.getDocuments());
            for (Document document : documentsInFolder) {
                if (document.getHeader().equals(header)) {
                    return document;
                }
            }
        }
        return null;
    }

    @Override
    public synchronized Document searchDocumentByAuthor(Folder currentFolder, String author) {
        List<Folder> foldersInCurrentFolder = List.copyOf(currentFolder.getFolders());

        for (Folder folder : foldersInCurrentFolder) {
            List<Document> documentsInFolder = List.copyOf(folder.getDocuments());
            for (Document document : documentsInFolder) {
                if (document.getAuthor().equals(author)) {
                    return document;
                }
            }
        }
        return null;
    }
}
