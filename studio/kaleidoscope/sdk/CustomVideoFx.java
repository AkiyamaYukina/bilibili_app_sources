package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomVideoFx.class */
public interface CustomVideoFx {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomVideoFx$RenderContext.class */
    public interface RenderContext {
        long getEffectStartTime();

        long getEffectTime();

        VideoFrameInfo getInputBuddyVideoFrameInfo();

        ByteBuffer getInputBuddyVideoFramebuffer();

        VideoFrame getInputVideoFrame();

        long getMediaStreamTime();

        VideoFrame getOutputVideoFrame();

        Object getRenderContext();

        void setEffectStartTime(long j7);

        void setEffectTime(long j7);

        void setInputBuddyVideoFrameInfo(VideoFrameInfo videoFrameInfo);

        void setInputBuddyVideoFramebuffer(ByteBuffer byteBuffer);

        void setInputVideoFrame(VideoFrame videoFrame);

        void setMediaStreamTime(long j7);

        void setOutputVideoFrame(VideoFrame videoFrame);

        void setRenderContext(Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomVideoFx$Renderer.class */
    public interface Renderer {
        @Nullable
        String getInnerName();

        void onCleanup();

        void onInit();

        void onPreloadResources();

        void onRender(RenderContext renderContext);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/CustomVideoFx$VideoFrame.class */
    public interface VideoFrame {
        int getHeight();

        boolean getIsUpsideDownTexture();

        int getTexId();

        Object getVideoFrame();

        int getWidth();

        void setHeight(int i7);

        void setIsUpsideDownTexture(boolean z6);

        void setTexId(int i7);

        void setVideoFrame(Object obj);

        void setWidth(int i7);
    }

    Object getCustomVideoFx();

    void setCustomVideoFx(Object obj);
}
