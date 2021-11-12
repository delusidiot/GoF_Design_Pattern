package me.delusidiot.gof.prototype;

import me.delusidiot.gof.prototype.after.GithubIssue;
import me.delusidiot.gof.prototype.after.GithubIssueDeepCopy;
import me.delusidiot.gof.prototype.after.GithubRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class After {
    @Test
    void afterPrototype() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("delusidiot");
        repository.setName("gof");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("Prototype Pattern");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());
        Assertions.assertThat(githubIssue).isNotSameAs(clone);
        Assertions.assertThat(githubIssue).isEqualTo(clone);
        Assertions.assertThat(githubIssue.getClass()).isSameAs(clone.getClass());
        Assertions.assertThat(githubIssue.getRepository()).isSameAs(clone.getRepository());
        /*
        TODO GithubRepository is the same
        What Java provides by default is shallow copy
        To change to deep copy, you need to change the clone method
         */

    }

    @Test
    void afterPrototypeDeepCopy() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("delusidiot");
        repository.setName("gof");
        GithubIssueDeepCopy githubIssue = new GithubIssueDeepCopy(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("Prototype Pattern");

        GithubIssueDeepCopy clone = (GithubIssueDeepCopy) githubIssue.clone();
        System.out.println(clone.getUrl());
        Assertions.assertThat(githubIssue).isNotSameAs(clone);
        Assertions.assertThat(githubIssue).isNotEqualTo(clone);
        Assertions.assertThat(githubIssue.getClass()).isSameAs(clone.getClass());
        Assertions.assertThat(githubIssue.getRepository()).isNotSameAs(clone.getRepository());
    }
}
