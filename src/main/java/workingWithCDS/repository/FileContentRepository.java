package workingWithCDS.repository;

//import cds.gen.catalogservice.FileContent;
import workingWithCDS.model.FileContent;

public interface FileContentRepository {
    void save(FileContent fileContent);
}
