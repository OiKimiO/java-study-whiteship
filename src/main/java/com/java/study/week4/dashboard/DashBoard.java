package com.java.study.week4.dashboard;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DashBoard {

    public static final String repoPath = "whiteship/live-study";
    public static final String token = "";

    public static GitHub github;
    public static GHRepository repository;

    public static void main(String[] args) {
        try{
            connect();
            Map<String, Integer> members = getMembers();
            printMemberAttendRate(members);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void connect() throws IOException {
        github = new GitHubBuilder().withOAuthToken(token).build();
        repository = github.getRepository(repoPath);
    }

    private static Map<String, Integer> getMembers() throws IOException {
        Map<String, Integer> members = new HashMap<>();

        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);

        for (GHIssue issue : issues) {
            for (GHIssueComment comment : issue.getComments()) {
                String id = comment.getUser().getLogin();
                members.put(id, members.getOrDefault(id, 0) + 1);
            }
        }

        return members;
    }

    private static void printMemberAttendRate(Map<String, Integer> members) {
        Set<String> users = members.keySet();

        for (String user : users) {
            double integer = ((members.get(user)*10000) / 18) / 100.0;
            System.out.println(user +": " + integer);
        }
    }

}
