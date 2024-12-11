public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("AudioPlayer: No title provided, cannot play.");
        } else {
            System.out.println("AudioPlayer: Playing audio - " + title);
        }
    }

    @Override
    public void pause() {
        System.out.println("AudioPlayer: Audio paused.");
    }

    @Override
    public void stop() {
        System.out.println("AudioPlayer: Audio stopped.");
    }
}
