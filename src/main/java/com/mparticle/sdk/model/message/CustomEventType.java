package com.mparticle.sdk.model.message;

public enum CustomEventType {
    NAVIGATION, LOCATION, SEARCH, TRANSACTION, USER_CONTENT, USER_PREFERENCE, SOCIAL, OTHER;

    public String toString() {
        return name();
    }
}
