package com.java.study.week4.dashboard;

import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GithubAPI {
    private final GitHub gitHub;
    private final GHRepository repository;

    public GithubAPI(String accessToken, String repoName) {
        this.gitHub = connect(accessToken);
        this.repository = getRepo(repoName);
    }

    private GitHub connect(String accessToken) {
        try{
            return new GitHubBuilder().withOAuthToken(accessToken).build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private GHRepository getRepo(String repoName) {
        try{
            return this.gitHub.getRepository(repoName);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Set<String> getCommenterBy(int issueName){
        Set<String> commenter = new HashSet<>();
        List<GHIssueComment> comments = getComments(issueName);

        if(comments == null){
            return null;
        }

        for (GHIssueComment comment : comments) {
            try{
                commenter.add(comment.getUser().getLogin());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return commenter;
    }

    private List<GHIssueComment> getComments(int issueName) {
        try {
            return repository.getIssue(issueName).getComments();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
