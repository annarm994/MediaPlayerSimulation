public class Main {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        MediaPlayer videoPlayer = new VideoPlayer();
        MediaPlayer streamingPlayer = new StreamingPlayer();

        System.out.println("=== Normal Cases ===");
        audioPlayer.play("Song.mp3");
        audioPlayer.pause();
        audioPlayer.stop();

        videoPlayer.play("Movie.mp4");
        videoPlayer.pause();
        videoPlayer.stop();

        streamingPlayer.play("Live Stream");
        streamingPlayer.pause();
        streamingPlayer.stop();

        System.out.println("\n=== Edge Cases ===");
        audioPlayer.play("");
        videoPlayer.play("Unknown_Format.xyz");
        streamingPlayer.play(null);
    }
}
