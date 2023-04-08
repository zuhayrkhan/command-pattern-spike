package com.zuhayrkhan.cmd_pattern_spike.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteBTCIFrame {

    private static final Logger LOGGER = LoggerFactory.getLogger(RemoteBTCIFrame.class);

    public String issueGetAuthInstructionsCommand() {
        return """
                Call API to get Auth-Instructions (n)
                Build JS
                * For each Auth-Instruction
                  * Create IFrame
                * Build BB Main IFrame
                  * Expecting n x values
                """;
    }

    public String issueGetResultOfSubmitAuth() {
        return """
                Call API to get Auth-Instructions (n)
                * Block until submit-auth completes (TODO link to submit-auth id?)
                Build JS
                * For each Auth-Instruction
                  * Create IFrame
                * Build BB Main IFrame
                  * Expecting n x values
                """;
    }

    @Override
    public String toString() {
        return "RemoteBTCIFrame{}";
    }

}
