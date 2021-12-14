package me.delusidiot.gof.creational_patterns.decorator.after;

public class DefaultCommentService implements CommentService{

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
