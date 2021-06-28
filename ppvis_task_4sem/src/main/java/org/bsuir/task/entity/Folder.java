package org.bsuir.task.entity;

import org.bsuir.task.exception.CustomException;
import org.bsuir.task.validator.CustomValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public interface Folder {
    List<Document> getDocuments();
    List<Folder> getFolders();
    boolean addDocument(Document document) throws CustomException;
}
