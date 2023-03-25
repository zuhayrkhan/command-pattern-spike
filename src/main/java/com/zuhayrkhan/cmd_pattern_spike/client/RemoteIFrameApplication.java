package com.zuhayrkhan.cmd_pattern_spike.client;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.btc.GetResultOfSubmitAuthOperation;
import com.zuhayrkhan.cmd_pattern_spike.command.remote.btc.IssueGetAuthInstructionOperation;
import com.zuhayrkhan.cmd_pattern_spike.command.remote.db.IssueSubmitAuthOperation;
import com.zuhayrkhan.cmd_pattern_spike.invoker.RemoteIFrameOperationExecutor;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteBTCIFrame;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteDBIFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteIFrameApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(RemoteIFrameApplication.class);

    public static void main(String[] args) {

        RemoteDBIFrame remoteDBIFrame = new RemoteDBIFrame();
        RemoteBTCIFrame remoteBTCIFrame = new RemoteBTCIFrame();

        IssueGetAuthInstructionOperation issueGetAuthInstructionOperation =
                new IssueGetAuthInstructionOperation(remoteBTCIFrame);

        IssueSubmitAuthOperation issueSubmitAuthOperation =
                new IssueSubmitAuthOperation(remoteDBIFrame);

        GetResultOfSubmitAuthOperation getResultOfSubmitAuthOperation =
                new GetResultOfSubmitAuthOperation(remoteBTCIFrame);

        RemoteIFrameOperationExecutor remoteIFrameOperationExecutor = new RemoteIFrameOperationExecutor();

        LOGGER.info(remoteIFrameOperationExecutor.executeOperation(issueGetAuthInstructionOperation));
        LOGGER.info(remoteIFrameOperationExecutor.executeOperation(issueSubmitAuthOperation));
        LOGGER.info(remoteIFrameOperationExecutor.executeOperation(getResultOfSubmitAuthOperation));

    }
}
