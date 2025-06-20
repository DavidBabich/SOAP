package com.example.webka;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.ws.soap.MTOM;
import jakarta.activation.DataHandler;

@WebService
@MTOM
public interface ImageService {
    @WebMethod
    void uploadImage(DataHandler image);

    @WebMethod
    DataHandler downloadImage();
}