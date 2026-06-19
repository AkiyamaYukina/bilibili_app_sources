package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageCustomVideoFx;
import com.bilibili.montage.avinfo.MontageVideoFrameInfo;
import com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx;
import com.bilibili.studio.kaleidoscope.sdk.VideoFrameInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomVideoFxImpl.class */
public final class MonCustomVideoFxImpl implements CustomVideoFx {
    private MontageCustomVideoFx mMontageCustomVideoFx;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomVideoFxImpl$MonRenderContextImpl.class */
    public static final class MonRenderContextImpl implements CustomVideoFx.RenderContext {
        private MontageCustomVideoFx.RenderContext mRenderContext;

        private MonRenderContextImpl(@NonNull MontageCustomVideoFx.RenderContext renderContext) {
            this.mRenderContext = renderContext;
        }

        @NonNull
        public static CustomVideoFx.RenderContext box(@NonNull MontageCustomVideoFx.RenderContext renderContext) {
            return new MonRenderContextImpl(renderContext);
        }

        @NonNull
        public static MontageCustomVideoFx.RenderContext unbox(@NonNull CustomVideoFx.RenderContext renderContext) {
            return (MontageCustomVideoFx.RenderContext) renderContext.getRenderContext();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public long getEffectStartTime() {
            return this.mRenderContext.effectStartTime;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public long getEffectTime() {
            return this.mRenderContext.effectTime;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public VideoFrameInfo getInputBuddyVideoFrameInfo() {
            MontageVideoFrameInfo montageVideoFrameInfo = this.mRenderContext.inputBuddyVideoFrameInfo;
            return montageVideoFrameInfo != null ? MonVideoFrameInfoImpl.box(montageVideoFrameInfo) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public ByteBuffer getInputBuddyVideoFramebuffer() {
            return this.mRenderContext.inputBuddyVideoFramebuffer;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public CustomVideoFx.VideoFrame getInputVideoFrame() {
            MontageCustomVideoFx.VideoFrame videoFrame = this.mRenderContext.inputVideoFrame;
            if (videoFrame != null) {
                return MonVideoFrameImpl.box(videoFrame);
            }
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public long getMediaStreamTime() {
            return this.mRenderContext.mediaStreamTime;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public CustomVideoFx.VideoFrame getOutputVideoFrame() {
            MontageCustomVideoFx.VideoFrame videoFrame = this.mRenderContext.outputVideoFrame;
            if (videoFrame != null) {
                return MonVideoFrameImpl.box(videoFrame);
            }
            return null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public Object getRenderContext() {
            return this.mRenderContext;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setEffectStartTime(long j7) {
            this.mRenderContext.effectStartTime = j7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setEffectTime(long j7) {
            this.mRenderContext.effectTime = j7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setInputBuddyVideoFrameInfo(VideoFrameInfo videoFrameInfo) {
            this.mRenderContext.inputBuddyVideoFrameInfo = videoFrameInfo != null ? MonVideoFrameInfoImpl.unbox(videoFrameInfo) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setInputBuddyVideoFramebuffer(ByteBuffer byteBuffer) {
            this.mRenderContext.inputBuddyVideoFramebuffer = byteBuffer;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setInputVideoFrame(CustomVideoFx.VideoFrame videoFrame) {
            this.mRenderContext.inputVideoFrame = videoFrame != null ? MonVideoFrameImpl.unbox(videoFrame) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setMediaStreamTime(long j7) {
            this.mRenderContext.mediaStreamTime = j7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setOutputVideoFrame(CustomVideoFx.VideoFrame videoFrame) {
            this.mRenderContext.outputVideoFrame = videoFrame != null ? MonVideoFrameImpl.unbox(videoFrame) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.RenderContext
        public void setRenderContext(Object obj) {
            this.mRenderContext = (MontageCustomVideoFx.RenderContext) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomVideoFxImpl$MonVideoFrameImpl.class */
    public static final class MonVideoFrameImpl implements CustomVideoFx.VideoFrame {
        private MontageCustomVideoFx.VideoFrame mVideoFrame;

        private MonVideoFrameImpl(@NonNull MontageCustomVideoFx.VideoFrame videoFrame) {
            this.mVideoFrame = videoFrame;
        }

        @NonNull
        public static CustomVideoFx.VideoFrame box(@NonNull MontageCustomVideoFx.VideoFrame videoFrame) {
            return new MonVideoFrameImpl(videoFrame);
        }

        @NonNull
        public static MontageCustomVideoFx.VideoFrame unbox(@NonNull CustomVideoFx.VideoFrame videoFrame) {
            return (MontageCustomVideoFx.VideoFrame) videoFrame.getVideoFrame();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public int getHeight() {
            return this.mVideoFrame.height;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public boolean getIsUpsideDownTexture() {
            return this.mVideoFrame.isUpsideDownTexture;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public int getTexId() {
            return this.mVideoFrame.texId;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public Object getVideoFrame() {
            return this.mVideoFrame;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public int getWidth() {
            return this.mVideoFrame.width;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public void setHeight(int i7) {
            this.mVideoFrame.height = i7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public void setIsUpsideDownTexture(boolean z6) {
            this.mVideoFrame.isUpsideDownTexture = z6;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public void setTexId(int i7) {
            this.mVideoFrame.texId = i7;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public void setVideoFrame(Object obj) {
            this.mVideoFrame = (MontageCustomVideoFx.VideoFrame) obj;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx.VideoFrame
        public void setWidth(int i7) {
            this.mVideoFrame.width = i7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomVideoFxImpl$a.class */
    public static final class a implements MontageCustomVideoFx.Renderer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomVideoFx.Renderer f108388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CustomVideoFx.RenderContext f108389b;

        public a(@NonNull CustomVideoFx.Renderer renderer) {
            this.f108388a = renderer;
        }

        @Override // com.bilibili.montage.FX.MontageCustomVideoFx.Renderer
        public final void onCleanup() {
            this.f108388a.onCleanup();
        }

        @Override // com.bilibili.montage.FX.MontageCustomVideoFx.Renderer
        public final void onInit() {
            this.f108388a.onInit();
        }

        @Override // com.bilibili.montage.FX.MontageCustomVideoFx.Renderer
        public final void onPreloadResources() {
            this.f108388a.onPreloadResources();
        }

        @Override // com.bilibili.montage.FX.MontageCustomVideoFx.Renderer
        public final void onRender(MontageCustomVideoFx.RenderContext renderContext) {
            CustomVideoFx.RenderContext renderContext2 = this.f108389b;
            if (renderContext2 == null) {
                this.f108389b = MonRenderContextImpl.box(renderContext);
            } else {
                renderContext2.setRenderContext(renderContext);
            }
            this.f108388a.onRender(this.f108389b);
        }
    }

    private MonCustomVideoFxImpl(@NonNull MontageCustomVideoFx montageCustomVideoFx) {
        this.mMontageCustomVideoFx = montageCustomVideoFx;
    }

    @NonNull
    public static CustomVideoFx box(@NonNull MontageCustomVideoFx montageCustomVideoFx) {
        return new MonCustomVideoFxImpl(montageCustomVideoFx);
    }

    @NonNull
    public static MontageCustomVideoFx unbox(@NonNull CustomVideoFx customVideoFx) {
        return (MontageCustomVideoFx) customVideoFx.getCustomVideoFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx
    public Object getCustomVideoFx() {
        return this.mMontageCustomVideoFx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx
    public void setCustomVideoFx(Object obj) {
        this.mMontageCustomVideoFx = (MontageCustomVideoFx) obj;
    }
}
