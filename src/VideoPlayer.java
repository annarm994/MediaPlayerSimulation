public class VideoPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("VideoPlayer: No title provided, cannot play.");
        } else {
            System.out.println("VideoPlayer: Playing video - " + title);
        }
    }

    @Override
    public void pause() {
        System.out.println("VideoPlayer: Video paused.");
    }

    @Override
    public void stop() {
        System.out.println("VideoPlayer: Video stopped.");
    }
}
