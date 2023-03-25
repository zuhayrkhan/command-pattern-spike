package com.zuhayrkhan.cmd_pattern_spike.invoker;

import com.zuhayrkhan.cmd_pattern_spike.command.remote.RemoteIFrameOperation;

import java.util.ArrayList;
import java.util.List;

public class RemoteIFrameOperationExecutor {

    private final List<RemoteIFrameOperation> remoteIFrameOperations = new ArrayList<>();

    public String executeOperation(RemoteIFrameOperation remoteIFrameOperation) {
        remoteIFrameOperations.add(remoteIFrameOperation);
        return remoteIFrameOperation.execute();
    }
}
