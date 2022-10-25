public class AudioPost extends MediaPost {
    private int sampleRate;
    private int bitDepth;

    public AudioPost(String author, String[] tags, String url, int size, int sampleRate, int bitDepth) {
        super(author, tags, url, size);
        this.sampleRate = sampleRate;
        this.bitDepth = bitDepth;
        setType("audio");
    }

    public String play() {
        return "Playing video... with a samplerate of " + this.sampleRate + " kHz"; 
    }

    public String getInfoString() {
        return (
            super.getInfoString() + ", SampleRate: " + this.sampleRate + " kHz, BitDepth: " + this.bitDepth 
        );  
    }
}
