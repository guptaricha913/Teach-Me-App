package com.teach.me.app.ServiceImpl;

import com.teach.me.app.Service.UploadFileService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@Component
public class UploadFileServiceImpl implements UploadFileService {

    private String rootPath = "F:\\Advanced Software Engineering Concepts\\Final Project\\Teach-Me-App\\src\\main\\resources\\uploads";
    private final Path rootLocation = Paths.get(rootPath);


    @Override
    public void saveFile(MultipartFile file) {
        try{
            Files.copy(file.getInputStream(), this.rootLocation.resolve(Objects.requireNonNull(file.getOriginalFilename())));
            System.out.println(this.rootLocation.resolve(file.getOriginalFilename()).toString());
        } catch (Exception e) {
            throw new RuntimeException("Error occurred in saving the file");
        }
    }
}