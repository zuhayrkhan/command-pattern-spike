package com.zuhayrkhan.cmd_pattern_spike;

import com.zuhayrkhan.cmd_pattern_spike.server.CommandPatternSpikeServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandPatternSpikeLauncher {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommandPatternSpikeLauncher.class);

    private final CommandPatternSpikeServer commandPatternSpikeServer;

    public CommandPatternSpikeLauncher() {
        commandPatternSpikeServer = new CommandPatternSpikeServer();
    }

    public static void main(String[] args) {

        CommandPatternSpikeLauncher commandPatternSpikeLauncher = new CommandPatternSpikeLauncher();

        Thread shutdownHookThread = new Thread(() -> {
            try {
                commandPatternSpikeLauncher.stop();
            } catch (Exception e) {
                LOGGER.error("Exception while stopping CommandPatternSpikeServer", e);
            }
        });

        try {
            Runtime.getRuntime().addShutdownHook(shutdownHookThread);
            commandPatternSpikeLauncher.start();
        } catch (Exception e) {
            LOGGER.error("Exception while starting CommandPatternSpikeServer", e);
            Runtime.getRuntime().removeShutdownHook(shutdownHookThread);
        }

    }

    private void start() throws Exception {
        commandPatternSpikeServer.start();
    }

    private void stop() throws Exception {
        commandPatternSpikeServer.stop();
    }

}