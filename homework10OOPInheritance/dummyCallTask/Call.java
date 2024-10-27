package homework10OOPInheritance.dummyCallTask;

import homework10OOPInheritance.People;
import homework10OOPInheritance.PeoplesList;

public class Call {
    private long callStartTime;
    private long callEndTime;
    private PeoplesList callMembersList;

    public Call(PeoplesList callMembersList) {
        setCallMembersList(callMembersList);
        setCallStartTime(getCurrentTimeInSeconds());
    }

    public Call(People[] callMembers) {
        this(new PeoplesList(callMembers));
    }

    public void setCallStartTime(long callStartTime) {
        this.callStartTime = callStartTime;
    }

    public void setCallEndTime(long callEndTime) {
        this.callEndTime = callEndTime;
    }

    public void setCallMembersList(PeoplesList callMembersList) {
        this.callMembersList = callMembersList;
    }

    public long getCallTime() {
        return callEndTime-callStartTime;
    }

    public void end() {
        setCallEndTime(getCurrentTimeInSeconds());
    }

    private long getCurrentTimeInSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public boolean isCallInProgress() {
        return callEndTime == 0;
    }
}
