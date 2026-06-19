package com.bilibili.studio.kaleidoscope.sdk;

import com.bilibili.studio.kaleidoscope.sdk.extension.CustomAudioFxRenderContextEx;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomAudioFx.class */
public interface CustomAudioFx {
    public static final int CUSTOME_AUDIO_FX_OTHER = 0;
    public static final int CUSTOM_AUDIO_FX_DENOISE = 2;
    public static final int CUSTOM_AUDIO_FX_VOICE_CHANGE = 1;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomAudioFx$RenderContext.class */
    public interface RenderContext extends Ex<CustomAudioFxRenderContextEx> {
        AudioSampleBuffers getInputAudioSample();

        Object getRenderContext();

        void setInputAudioSample(AudioSampleBuffers audioSampleBuffers);

        void setRenderContext(Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomAudioFx$Renderer.class */
    public interface Renderer {
        int getType();

        void onCleanup();

        AudioSampleBuffers onFlush();

        void onInit();

        AudioSampleBuffers onRender(RenderContext renderContext);

        int querySupportedInputAudioSampleFormat();
    }

    Object getCustomAudioFx();

    void setCustomAudioFx(Object obj);
}
