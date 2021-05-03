package org.firstinspires.ftc.teamcode.OnBotCopy;

/**
 * Condition monitor that enables monitoring additional condition while performing an
 * operation. The operation ensures that it can be continued only if this condition
 * permits it.
 *
 * @author Harshal Bharatia
 */
public interface ConditionMonitor
{
    /**
     * Check if the current condition allows the operation to continue.
     *
     * @return  True if the current condition allows the operation to continue, false if
     *   the current condition requires operation be preempted.
     */
    public boolean canContinue();
}