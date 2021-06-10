package org.bsuir.task.entity;

public interface Administrator {
    boolean removeDocument(Folder folder, Document document);

    Folder createFolder(String name);

    boolean moveTo(Folder sourceFolder, Folder targetFolder, Document documentToMove);
}
