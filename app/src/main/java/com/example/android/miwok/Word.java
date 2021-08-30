package com.example.android.miwok;

public class Word {
    private String miwokText;
    private String defaultText;
    private int image = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioResource;

    public Word(String defaultt, String miwok, int image, int audioResource){
        this.defaultText = defaultt;
        this.miwokText = miwok;
        this.image = image;
        this.audioResource = audioResource;
    }

    public String getDefaultText() {
        return defaultText;
    }

    public String getMiwokText(){
        return miwokText;
    }

    public int getImage() {return image;}

    public boolean hasImage() {return image != NO_IMAGE_PROVIDED;}

    public int getAudioResource() {return audioResource;}
}
