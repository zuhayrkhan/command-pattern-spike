package com.zuhayrkhan.cmd_pattern_spike.command.remote.btc;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.RemoteIFrameOperation;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteBTCIFrame;

public class IssueGetAuthInstructionOperation implements RemoteIFrameOperation {

    private final RemoteBTCIFrame remoteBTCIFrame;

    public IssueGetAuthInstructionOperation(RemoteBTCIFrame remoteBTCIFrame) {
        this.remoteBTCIFrame = remoteBTCIFrame;
    }

    @Override
    public String execute() {
        return remoteBTCIFrame.issueGetAuthInstructionsCommand();
    }

}
