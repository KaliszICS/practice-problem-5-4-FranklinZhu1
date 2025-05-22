public class RadioPlayer implements Player {

    private boolean onOff;
    private double[] stationList;
    public int volume, stationIndex;
    public double station;

    public RadioPlayer(double[] stationList) {
        this.onOff = false;
        this.stationList = stationList;
        this.volume = 0;
        this.station = 0;
        this.stationIndex = 0;
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public int getVolume() {
        return this.volume;
    }

    public double getStation() {
        return this.station;
    }

    @Override
    public void start() {
        if (!onOff) {
            onOff = true;
            station = stationList[0];
            stationIndex = 0;
        }
    }

    @Override
    public void stop() {
        if (onOff) {
            onOff = false;
            station = 0;
            stationIndex = -1;
        }
    }

    @Override
    public void volumeUp() {
        volume += 2;
    }

    @Override
    public void volumeDown() {
        volume -= 2;
    }

    public void next() {
        station = stationList[++stationIndex];
    }

    public void previous() {
        station = stationList[--stationIndex];
    }

}