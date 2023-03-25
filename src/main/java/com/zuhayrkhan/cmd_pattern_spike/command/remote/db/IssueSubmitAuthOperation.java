package com.zuhayrkhan.cmd_pattern_spike.command.remote.db;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.RemoteIFrameOperation;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteDBIFrame;

public class IssueSubmitAuthOperation implements RemoteIFrameOperation {

    private final RemoteDBIFrame remoteDBIFrame;

    public IssueSubmitAuthOperation(RemoteDBIFrame remoteDBIFrame) {
        this.remoteDBIFrame = remoteDBIFrame;
    }

    @Override
    public String execute() {
        return remoteDBIFrame.issueSubmitAuthCommand();
    }

}
