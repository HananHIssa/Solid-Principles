
package com.mycompany.dependencyinversionprinciple;
public class DependencyInversionPrinciple {
interface VersionControl {
    void commit(String message);
    void push();
    void pull();
}

static class GitVersionControl implements VersionControl {
    @Override
    public void commit(String message) {
        System.out.println("Committing changes to Git with message: " + message);
    }

    @Override
    public void push() {
        System.out.println("Pushing changes to remote Git repository.");
    }

    @Override
    public void pull() {
        System.out.println("Pulling changes from remote Git repository.");
    }
}

static class DevelopmentTeam {
    private VersionControl versionControl;

    public DevelopmentTeam(VersionControl versionControl) {
        this.versionControl = versionControl;
    }

    public void makeCommit(String message) {
        versionControl.commit(message);
    }

    public void performPush() {
        versionControl.push();
    }

    public void performPull() {
        versionControl.pull();
    }
}

public class Main {
    public static void main(String[] args) {
        GitVersionControl git = new GitVersionControl();
        DevelopmentTeam team = new DevelopmentTeam(git);

        team.makeCommit("Initial commit");
        team.performPush();
        team.performPull();
    }
}
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
