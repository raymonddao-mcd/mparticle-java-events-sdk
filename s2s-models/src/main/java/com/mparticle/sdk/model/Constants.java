package com.mparticle.sdk.model;

public class Constants {

    public static final String US_ENDPOINT = "https://s2s.mparticle.com";
    public static final String EU_ENDPOINT = "https://s2s.eu1.mparticle.com";

    public interface MessageTypes {
        String CUSTOM_EVENT = "custom_event";
        String SESSION_START = "session_start";
        String SESSION_END = "session_end";
        String SCREEN_VIEW = "screen_view";
        String ERROR = "crash_report";
        String OPT_OUT = "opt_out";
        String FIRST_RUN = "first_run";
        String PUSH_REGISTRATION = "push_registration";
        String STATE_TRANSITION = "application_state_transition";
        String PUSH_MESSAGE = "push_message";
        String NETWORK_PERFORMANCE = "network_performance";
        String BREADCRUMB = "breadcrumb";
    }

    public interface UserAttributes {
        String AGE = "$age";
        String GENDER = "$gender";
        String COUNTRY = "$country";
        String ZIPCODE = "$zip";
        String CITY = "$city";
        String STATE = "$state";
        String ADDRESS = "$address";
        String FIRST_NAME = "$firstname";
        String LAST_NAME = "$lastname";
        String MOBILE = "$mobile";
    }
}
