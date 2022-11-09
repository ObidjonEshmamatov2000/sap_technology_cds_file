package workingWithCDS.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import workingWithCDS.model.FileContent;
import workingWithCDS.model.FileInfo;
import workingWithCDS.repository.FileContentRepository;
import workingWithCDS.repository.FileInfoRepository;

import java.io.IOException;

@Service
@RequiredArgsConstructor
public class FileService {
    private final FileContentRepository contentRepository;
    private final FileInfoRepository infoRepository;

    public void save(MultipartFile file) {
        FileInfo fileInfo = new FileInfo();
        fileInfo.setName(file.getOriginalFilename());
        fileInfo.setSize(file.getSize());

        FileContent fileContent = new FileContent();
        fileContent.setId(fileInfo.getId());
        try {
            fileContent.setContent(file.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        contentRepository.save(fileContent);
        infoRepository.save(fileInfo);
    }
}
