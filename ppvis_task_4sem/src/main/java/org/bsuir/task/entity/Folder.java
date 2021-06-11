package org.bsuir.task.entity;

import org.bsuir.task.exception.CustomException;
import org.bsuir.task.validator.CustomValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Folder {
    private static final Folder rootFolder = new Folder();

    private String name;
    private List<Document> documents;
    private List<Folder> folders;

    {
        documents = new ArrayList<>();
        folders = new ArrayList<>();
    }

    private Folder(){

    }

    public Folder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public boolean addDocument(Document document) throws CustomException {
        if (!CustomValidator.isHeaderTaken(documents, document.getHeader())) {
            documents.add(document);
        } else {
            throw new CustomException("Couldn't set folder. The header is already taken! Header: " + document.getHeader());
        }
        return documents.add(document);
    }

    public boolean addFolder(Folder folder) {
        return folders.add(folder);
    }

    public static Folder getRootFolder() {
        return rootFolder;
    }
}
