package com.example.webka;

import jakarta.jws.WebService;
import jakarta.activation.DataHandler;
import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
@WebService(endpointInterface = "com.example.webka.ImageService")
public class ImageServiceImpl implements ImageService {
    private final File file = new File("uploaded_image.jpg");

    @Override
    public void uploadImage(DataHandler image) {
        try (OutputStream os = new FileOutputStream("uploaded_image.jpg")) {
            image.writeTo(os);
            System.out.println("Изображение успешно загружено на сервер.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public DataHandler downloadImage() {
        DataSource source = new FileDataSource(file);
        return new DataHandler(source);
    }
}