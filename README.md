# SOAP Image Service

Простой SOAP-сервис на Java для передачи изображений с использованием Jakarta JAX-WS и MTOM.

### Описание

Проект состоит из:

- `ImageService` — SOAP-интерфейс для загрузки и скачивания изображений.
- `ImageServiceImpl` — реализация сервиса.
- `ImageServer` — запуск SOAP-сервера на `http://localhost:8080/ImageService`.
- `ImageClient` — клиент, отправляющий и получающий изображение.

Технологии:
- Java SE
- Jakarta JAX-WS
- Jakarta Activation
- MTOM

### Запуск
Сперва запускаем сервер, он запускает пространство.Потом запускаем клиента и передаем изображение на хост и получаем.