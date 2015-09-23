package org.podcastpedia.core.user;

import org.podcastpedia.common.domain.User;
import org.podcastpedia.core.contact.ContactForm;

public interface EmailNotificationService {

	public void sendUserRegistrationNotification(User user);

    void sendRegistrationEmailConfirmation(User user);
}