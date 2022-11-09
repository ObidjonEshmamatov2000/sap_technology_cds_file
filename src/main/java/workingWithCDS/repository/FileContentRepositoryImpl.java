package workingWithCDS.repository;

//import cds.gen.catalogservice.FileContent;
import com.sap.cds.ql.Insert;
import com.sap.cds.services.persistence.PersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import java.util.HashMap;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class FileContentRepositoryImpl implements FileContentRepository{

    private final PersistenceService persistenceService;

    @Override
    public void save(workingWithCDS.model.FileContent fileContent) {
        Map<String, Object> fileContentMap = new HashMap<>();
        fileContentMap.put("ID", fileContent.getId());
        fileContentMap.put("content", fileContent.getContent());
        Insert insert = Insert.into("my.files.FileContent").entry(fileContentMap);
        persistenceService.run(insert);
    }
}
