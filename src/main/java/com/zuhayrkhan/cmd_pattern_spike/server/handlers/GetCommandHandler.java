package com.zuhayrkhan.cmd_pattern_spike.server.handlers;

import ratpack.core.handling.Context;
import ratpack.core.handling.Handler;

public class GetCommandHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        context.render("TODO");
    }
}
