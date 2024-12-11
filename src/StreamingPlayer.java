public class StreamingPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("StreamingPlayer: No title provided, cannot stream.");
        } else {
            System.out.println("StreamingPlayer: Streaming media - " + title);
        }
    }

    @Override
    public void pause() {
        System.out.println("StreamingPlayer: Stream paused.");
    }

    @Override
    public void stop() {
        System.out.println("StreamingPlayer: Stream stopped.");
    }
}
