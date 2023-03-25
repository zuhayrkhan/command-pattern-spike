package com.zuhayrkhan.cmd_pattern_spike.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteDBIFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteDBIFrame.class);

    public String issueSubmitAuthCommand() {
        return """
                Build JS
                * Build DB Submit Auth-IFrame
                  * Send event to Main-IFrame to get data from each Field-IFrame
                """;
    }

    @Override
    public String toString() {
        return "RemoteDBIFrame{}";
    }

}
