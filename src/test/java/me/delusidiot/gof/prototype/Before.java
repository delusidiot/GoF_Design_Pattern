package me.delusidiot.gof.prototype;

import me.delusidiot.gof.prototype.before.GithubIssue;
import me.delusidiot.gof.prototype.before.GithubRepository;
import org.junit.jupiter.api.Test;

public class Before {
    @Test
    void beforePrototypeTest(){
        GithubRepository repository = new GithubRepository();
        repository.setUser("delusidiot");
        repository.setName("gof");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("Prototype Pattern");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue githubIssue2 = new GithubIssue(repository);
        githubIssue2.setId(2);
        githubIssue2.setTitle("Builder Pattern");
        System.out.println(githubIssue2.getUrl());
    }
}
