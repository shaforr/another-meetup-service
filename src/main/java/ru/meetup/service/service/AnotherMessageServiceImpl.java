package ru.meetup.service.service;

import ru.java.meetup.starter.service.MessageService;

//@Service
public class AnotherMessageServiceImpl implements MessageService {

    @Override
    public String getMessage() {
        return "Hello from another service";
    }
}
