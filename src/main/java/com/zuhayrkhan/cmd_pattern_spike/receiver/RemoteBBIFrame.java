package com.zuhayrkhan.cmd_pattern_spike.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteBBIFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteBBIFrame.class);

    public String issueSubmitAuthCommand() {
        return """
                Build JS
                * Build BB Submit Auth-IFrame
                  * Send event to Main-IFrame to get data from each Field-IFrame
                """;
    }

    @Override
    public String toString() {
        return "RemoteBBIFrame{}";
    }

}
