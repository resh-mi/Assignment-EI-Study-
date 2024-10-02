
package structural.adapter;

public class MediaAdapter implements MediaPlayer {
    private MP3Player mp3Player;

    public MediaAdapter() {
        mp3Player = new MP3Player();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            mp3Player.playMP3(fileName);
        } else {
            System.out.println("Invalid media type.");
        }
    }
}
