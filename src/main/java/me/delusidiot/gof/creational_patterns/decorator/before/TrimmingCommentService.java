package me.delusidiot.gof.creational_patterns.decorator.before;

public class TrimmingCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    public String trim(String comment) {
        return comment.replace("...", "");
    }
}
