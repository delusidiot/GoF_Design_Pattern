package me.delusidiot.gof.creational_patterns.decorator.before;

public class Client {

    private CommentService commentService;

    private boolean enabledSpamFilter;

    private boolean enabledTrimming;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new TrimmingCommentService());
        client.writeComment("오징어 게임");
        client.writeComment("보는게 하는것보다 재미있을 수 없지...");
    }
}
