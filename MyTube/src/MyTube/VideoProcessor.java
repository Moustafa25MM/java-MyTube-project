package MyTube;

public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private Notfication notfication;

    public VideoProcessor(VideoEncoder encoder, VideoDatabase database, Notfication notfication) {
        this.encoder = encoder;
        this.database = database;
        this.notfication = notfication;
    }
    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notfication.sendEmail(video.getUser());
    }
}

