public class VideoPlayer implements Player {

    private boolean onOff;
    private String video;
    private int currentTime, volume;

    public VideoPlayer(String video) {
        this.onOff = false;
        this.video = video;
        this.currentTime = 0;
        this.volume = 0;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public boolean getOnOff() {
        return onOff;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public int getVolume() {
        return this.volume;
    }

    public String getVideo() {
        return this.video;
    }

    @Override
    public void start() {
        if (!onOff) onOff = true;
    }

    @Override
    public void stop() {
        if (onOff) onOff = false;
    }

    @Override
    public void volumeUp() {
        volume += 5;
    }

    @Override
    public void volumeDown() {
        volume -= 5;
    }

    public void fastForward() {
        currentTime += 5;
    }

    public void rewind() {
        currentTime -= 5;
    }

}