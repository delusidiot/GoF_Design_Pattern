package me.delusidiot.gof.creational_patterns.decorator.before;

public class SpamFilteringCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        if (!isSpam(comment))
            super.addComment(comment);
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
