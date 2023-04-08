package com.zuhayrkhan.cmd_pattern_spike.client;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.BB.IssueSubmitAuthOperation;
import com.zuhayrkhan.cmd_pattern_spike.command.remote.btc.GetResultOfSubmitAuthOperation;
import com.zuhayrkhan.cmd_pattern_spike.command.remote.btc.IssueGetAuthInstructionOperation;
import com.zuhayrkhan.cmd_pattern_spike.invoker.RemoteIFrameOperationExecutor;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteBBIFrame;
import com.zuhayrkhan.cmd_pattern_spike.receiver.RemoteBTCIFrame;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RemoteIFrameApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(RemoteIFrameApplication.class);

    public static void main(String[] args) {

        RemoteBBIFrame remoteBBIFrame = new RemoteBBIFrame();
        RemoteBTCIFrame remoteBTCIFrame = new RemoteBTCIFrame();

        IssueGetAuthInstructionOperation issueGetAuthInstructionOperation =
                new IssueGetAuthInstructionOperation(remoteBTCIFrame);

        IssueSubmitAuthOperation issueSubmitAuthOperation =
                new IssueSubmitAuthOperation(remoteBBIFrame);

        GetResultOfSubmitAuthOperation getResultOfSubmitAuthOperation =
                new GetResultOfSubmitAuthOperation(remoteBTCIFrame);

        RemoteIFrameOperationExecutor remoteIFrameOperationExecutor = new RemoteIFrameOperationExecutor();

        LOGGER.info(remoteIFrameOperationExecutor.executeOperation(issueGetAuthInstructionOperation));
        LOGGER.info(remoteIFrameOperationExecutor.executeOperation(issueSubmitAuthOperation));
        LOGGER.info(remoteIFrameOperationExecutor.executeOperation(getResultOfSubmitAuthOperation));

    }
}
