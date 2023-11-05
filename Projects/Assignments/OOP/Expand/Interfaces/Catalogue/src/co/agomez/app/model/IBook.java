package co.agomez.app.client;

import java.util.Date;

public interface IBook {
    Date getPublicationDate();

    String getAuthor();

    String getTitle();

    String getPublisher();
}
