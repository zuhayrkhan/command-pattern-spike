package com.zuhayrkhan.cmd_pattern_spike.command.remote.btc;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.RemoteIFrameOperation;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteBTCIFrame;

public class GetResultOfSubmitAuthOperation implements RemoteIFrameOperation {

    private final RemoteBTCIFrame remoteBTCIFrame;

    public GetResultOfSubmitAuthOperation(RemoteBTCIFrame remoteBTCIFrame) {
        this.remoteBTCIFrame = remoteBTCIFrame;
    }

    @Override
    public String execute() {
        return remoteBTCIFrame.issueGetResultOfSubmitAuth();
    }

}
