package org.lessons.java;

public class Gift {
    private String recipient;
    private String description;

    public Gift(String recipient, String description) {
        this.recipient = recipient;
        this.description = description;
    }

    @Override
    public String toString() {
        return "******************************* \n"  +
                "recipient: " + recipient + '\n' +
                "description: " + description + '\n';
    }
}
