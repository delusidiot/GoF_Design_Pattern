package me.delusidiot.gof.prototype.etc;

import me.delusidiot.gof.prototype.after.GithubIssue;
import me.delusidiot.gof.prototype.after.GithubRepository;
import org.modelmapper.ModelMapper;

public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("delusidiot");
        repository.setName("gof");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("Prototype Pattern");

        //TODO ModelMapper: java reflection
        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData map = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println("map = " + map);
    }
}
