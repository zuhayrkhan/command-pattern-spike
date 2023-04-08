package com.zuhayrkhan.cmd_pattern_spike.command.remote.BB;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.RemoteIFrameOperation;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteBBIFrame;

public class IssueSubmitAuthOperation implements RemoteIFrameOperation {

    private final RemoteBBIFrame remoteBBIFrame;

    public IssueSubmitAuthOperation(RemoteBBIFrame remoteBBIFrame) {
        this.remoteBBIFrame = remoteBBIFrame;
    }

    @Override
    public String execute() {
        return remoteBBIFrame.issueSubmitAuthCommand();
    }

}
