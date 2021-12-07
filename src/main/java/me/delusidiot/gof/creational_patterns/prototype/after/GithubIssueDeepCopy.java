package me.delusidiot.gof.creational_patterns.prototype.after;

import java.util.Objects;

public class GithubIssueDeepCopy implements Cloneable {
    private int id;
    private String title;
    private GithubRepository repository;

    public GithubIssueDeepCopy(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public void setRepository(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl(){
        return String.format("https://github.com/%s/%s/issues/%d", repository.getUser(), repository.getName(), this.getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssueDeepCopy that = (GithubIssueDeepCopy) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        GithubIssueDeepCopy githubIssue = new GithubIssueDeepCopy(repository);
        githubIssue.setId(this.getId());
        githubIssue.setTitle(this.getTitle());
        return githubIssue;
    }
}
