package com.bilibili.montage.FX;

import com.bilibili.montage.avinfo.MontageAudioSampleBuffers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomAudioFx.class */
public class MontageCustomAudioFx {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomAudioFx$RenderContext.class */
    public static class RenderContext {
        public long effectEndTime;
        public long effectStartTime;
        public long effectTime;
        public MontageAudioSampleBuffers inputAudioSample;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomAudioFx$Renderer.class */
    public interface Renderer {
        void onCleanup();

        MontageAudioSampleBuffers onFlush();

        void onInit();

        MontageAudioSampleBuffers onRender(RenderContext renderContext);

        int querySupportedInputAudioSampleFormat();
    }
}
