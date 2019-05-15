package io.digdag.spi.ac;

import org.immutables.value.Value;

import java.util.List;

@Value.Immutable
public interface ListTasksOperationResult
{
    String getAttemptId();
    WorkflowTarget getWorkflowTarget();
    List<String> getTaskNames();
}
