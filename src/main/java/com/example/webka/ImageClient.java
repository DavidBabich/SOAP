package com.example.webka;

import jakarta.xml.ws.Service;
import jakarta.activation.DataHandler;
import jakarta.activation.FileDataSource;
import java.net.URL;
import javax.xml.namespace.QName;

public class ImageClient {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/ImageService?wsdl");
        QName qname = new QName("http://webka.example.com/", "ImageServiceImplService");
        Service service = Service.create(url, qname);
        ImageService imageService = service.getPort(ImageService.class);

        DataHandler dataHandler = new DataHandler(new FileDataSource("uploaded_image.jpg"));
        imageService.uploadImage(dataHandler);
        System.out.println("Изображение отправлено на сервер.");

        DataHandler received = imageService.downloadImage();
        received.writeTo(new java.io.FileOutputStream("uploaded_image.jpg"));
        System.out.println("Изображение получено с сервера.");
    }
}