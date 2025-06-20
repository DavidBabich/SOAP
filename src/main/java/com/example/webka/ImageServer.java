package com.example.webka;
import jakarta.xml.ws.Endpoint;

public class ImageServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ImageService", new ImageServiceImpl());
        System.out.println("SOAP запущен по адресу на http://localhost:8080/ImageService");
    }
}