public class MusicPlayer implements Player {

    private boolean onOff;
    private String[] musicList;
    private String currentSong;
    private int volume, currentSongIndex;

    public MusicPlayer(String[] musicList) {
        onOff = false;
        this.musicList = musicList;
        this.currentSong = "";
        this.volume = 0;
        this.currentSongIndex = 0;
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public String getCurrentSong() {
        return this.currentSong;
    }

    public int getVolume() {
        return this.volume;
    }

    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            currentSong = musicList[0];
            currentSongIndex = 0;
        }
    }

    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            currentSong = "";
            currentSongIndex = -1;
        }
    }

    @Override
    public void volumeUp() {
        ++volume;
    }

    @Override
    public void volumeDown() {
        --volume;
    }

    public void next() {
        currentSong = musicList[++currentSongIndex];
    }

    public void previous() {
        currentSong = musicList[--currentSongIndex];
    }

}