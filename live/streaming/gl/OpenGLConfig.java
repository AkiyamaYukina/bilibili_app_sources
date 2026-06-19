package com.bilibili.live.streaming.gl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/gl/OpenGLConfig.class */
public class OpenGLConfig {
    private boolean supportBt2020Pq = false;
    private boolean supportSMPTE2086Metadata = false;

    public boolean isBt2020PqSupported() {
        return this.supportBt2020Pq;
    }

    public boolean isSMPTE2086MetadataSupported() {
        return this.supportSMPTE2086Metadata;
    }

    public void setBt2020PqSupported(boolean z6) {
        this.supportBt2020Pq = z6;
    }

    public void setSMPTE2086MetadataSupported(boolean z6) {
        this.supportSMPTE2086Metadata = z6;
    }
}
