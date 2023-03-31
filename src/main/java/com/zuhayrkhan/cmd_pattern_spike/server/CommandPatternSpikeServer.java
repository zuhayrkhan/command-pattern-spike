package com.zuhayrkhan.cmd_pattern_spike.server;

import com.zuhayrkhan.cmd_pattern_spike.server.handlers.GetCommandHandler;
import ratpack.core.server.BaseDir;
import ratpack.core.server.RatpackServer;
import ratpack.core.server.RatpackServerSpec;
import ratpack.func.Action;

import static ratpack.core.handling.Handlers.redirect;

public class CommandPatternSpikeServer {

    private final GetCommandHandler commandGetHandler;

    private RatpackServer ratpackServer;

    private final Action<RatpackServerSpec> webServerDefinition;

    public CommandPatternSpikeServer() {

        commandGetHandler = new GetCommandHandler();

        webServerDefinition = server -> server

                .serverConfig(config -> config
                        .baseDir(BaseDir.find(".ratpack").toAbsolutePath())
                        .port(5678))

                .handlers(chain -> chain

                        .prefix("cmd", cmdChain -> cmdChain
                                .get(commandGetHandler)
                        )

                        .files()

                        .get(redirect(301, "/html/index.html"))

                );
    }

    public void start() throws Exception {
        ratpackServer = RatpackServer.start(webServerDefinition);
    }

    public void stop() throws Exception {
        if (ratpackServer != null) {
            ratpackServer.stop();
        }
    }

}
