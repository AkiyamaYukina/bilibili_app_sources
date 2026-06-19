package com.bilibili.opengldecoder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opengldecoder/IjkPlayerDecoderFactory.class */
public class IjkPlayerDecoderFactory extends AbsDecoderFactory {
    private boolean autoStart;
    private boolean rawAudio;

    public IjkPlayerDecoderFactory(boolean z6, boolean z7) {
        this.autoStart = z6;
        this.rawAudio = z7;
    }

    @Override // com.bilibili.opengldecoder.AbsDecoderFactory
    public IDecoder build() {
        return new IjkPlayer(this.autoStart, this.rawAudio);
    }
}
