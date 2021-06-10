package org.bsuir.task.entity.impl;

import org.bsuir.task.entity.Administrator;
import org.bsuir.task.entity.Document;
import org.bsuir.task.entity.Folder;

import java.util.List;

public class AdministratorImpl implements Administrator {
    @Override
    public synchronized boolean removeDocument(Folder folder, Document document) {
        List<Document> documents = folder.getDocuments();
        return documents.remove(document);
    }

    @Override
    public synchronized Folder createFolder(String name) {
        return new Folder(name);
    }

    @Override
    public synchronized boolean moveTo(Folder sourceFolder, Folder targetFolder, Document documentToMove) {
        List<Document> sourceFolderDocuments = sourceFolder.getDocuments();
        if (sourceFolderDocuments.remove(documentToMove)) {
            List<Document> targetFolderDocuments = targetFolder.getDocuments();
            return targetFolderDocuments.add(documentToMove);
        }
        return false;
    }
}
