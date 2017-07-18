package ru.homepurse.loggers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    private Client client;
    private EventLogger eventLogger;

    App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("app.xml");
        App app = context.getBean(App.class);
        Client client = context.getBean(Client.class);
        app.logEvents(context);
        context.close();
    }

    private void logEvents(ApplicationContext context) throws IOException {
        Event event = context.getBean(Event.class);
        logEvent(event, "Event for 1");
        event = context.getBean(Event.class);
        logEvent(event, "Another Event for 1");
        event = context.getBean(Event.class);
        logEvent(event, "Event for 1");
        event = context.getBean(Event.class);
        logEvent(event, "MMMEvent for 1");
        event = context.getBean(Event.class);
        logEvent(event, "XXXEvent for 1");
        event = context.getBean(Event.class);
        logEvent(event, "Event for 1");
        event = context.getBean(Event.class);
        logEvent(event, "ZZZEvent for 1");
    }

    private void logEvent(Event event, String s) throws IOException {
        String message = s.replaceAll(client.getId(), client.getName());
        event.setMsg(message);
        eventLogger.logEvent(event);
    }
}
