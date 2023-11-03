package co.agomez.app.model;

import java.util.Date;

public interface IBook {
    Date getPublicationDate();

    String getAuthor();

    String getTitle();

    String getPublisher();
}
