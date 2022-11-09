package workingWithCDS.repository;

import com.sap.cds.ql.Insert;
import com.sap.cds.services.persistence.PersistenceService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import workingWithCDS.model.FileInfo;

import java.util.HashMap;
import java.util.Map;

@Repository
@RequiredArgsConstructor
public class FileInfoRepositoryImpl implements FileInfoRepository{

    private final PersistenceService persistenceService;

    @Override
    public void save(FileInfo fileInfo) {
        Map<String, Object> fileInfoMap = new HashMap<>();
        fileInfoMap.put("ID", fileInfo.getId());
        fileInfoMap.put("name", fileInfo.getName());
        fileInfoMap.put("size", fileInfo.getSize());
        fileInfoMap.put("date", fileInfo.getDate());
        Insert insert = Insert.into("my.files.FileInfo").entry(fileInfoMap);
        persistenceService.run(insert);
    }
}
