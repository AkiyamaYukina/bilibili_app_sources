package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageCustomAudioFx;
import com.bilibili.montage.avinfo.MontageAudioSampleBuffers;
import com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers;
import com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx;
import com.bilibili.studio.kaleidoscope.sdk.extension.CustomAudioFxRenderContextEx;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomAudioFxImpl.class */
public final class MonCustomAudioFxImpl implements CustomAudioFx {
    private static final String TAG = "Mon.CAF.Impl";
    private MontageCustomAudioFx mMonCustomAudioFx;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomAudioFxImpl$MonRenderContextImpl.class */
    public static final class MonRenderContextImpl implements CustomAudioFx.RenderContext {
        private final CustomAudioFxRenderContextEx mCustomAudioFxRenderContextExImpl = new Object();
        private AudioSampleBuffers mInputAudioSample;
        private MontageCustomAudioFx.RenderContext mRenderContext;

        /* JADX WARN: Type inference failed for: r1v0, types: [com.bilibili.studio.kaleidoscope.sdk.extension.CustomAudioFxRenderContextEx, java.lang.Object] */
        private MonRenderContextImpl(@NonNull MontageCustomAudioFx.RenderContext renderContext) {
            this.mRenderContext = renderContext;
        }

        @NonNull
        public static CustomAudioFx.RenderContext box(@NonNull MontageCustomAudioFx.RenderContext renderContext) {
            return new MonRenderContextImpl(renderContext);
        }

        @NonNull
        public static MontageCustomAudioFx.RenderContext unbox(@NonNull CustomAudioFx.RenderContext renderContext) {
            return (MontageCustomAudioFx.RenderContext) renderContext.getRenderContext();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
        public CustomAudioFxRenderContextEx getExtension() {
            return this.mCustomAudioFxRenderContextExImpl;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx.RenderContext
        public AudioSampleBuffers getInputAudioSample() {
            AudioSampleBuffers audioSampleBuffers = this.mInputAudioSample;
            if (audioSampleBuffers == null) {
                this.mInputAudioSample = MonAudioSampleBuffersImpl.box(this.mRenderContext.inputAudioSample);
            } else {
                audioSampleBuffers.setAudioSampleBuffers(this.mRenderContext.inputAudioSample);
            }
            return this.mInputAudioSample;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.Ex
        public long getObjHashCode() {
            return this.mRenderContext.hashCode();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx.RenderContext
        public Object getRenderContext() {
            return this.mRenderContext;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx.RenderContext
        public void setInputAudioSample(AudioSampleBuffers audioSampleBuffers) {
            this.mRenderContext.inputAudioSample = MonAudioSampleBuffersImpl.unbox(audioSampleBuffers);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx.RenderContext
        public void setRenderContext(Object obj) {
            this.mRenderContext = (MontageCustomAudioFx.RenderContext) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonCustomAudioFxImpl$a.class */
    public static final class a implements MontageCustomAudioFx.Renderer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CustomAudioFx.Renderer f108386a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public CustomAudioFx.RenderContext f108387b;

        public a(CustomAudioFx.Renderer renderer) {
            this.f108386a = renderer;
        }

        @Override // com.bilibili.montage.FX.MontageCustomAudioFx.Renderer
        public final void onCleanup() {
            this.f108386a.onCleanup();
        }

        @Override // com.bilibili.montage.FX.MontageCustomAudioFx.Renderer
        public final MontageAudioSampleBuffers onFlush() {
            AudioSampleBuffers audioSampleBuffersOnFlush = this.f108386a.onFlush();
            return audioSampleBuffersOnFlush != null ? MonAudioSampleBuffersImpl.unbox(audioSampleBuffersOnFlush) : null;
        }

        @Override // com.bilibili.montage.FX.MontageCustomAudioFx.Renderer
        public final void onInit() {
            this.f108386a.onInit();
        }

        @Override // com.bilibili.montage.FX.MontageCustomAudioFx.Renderer
        public final MontageAudioSampleBuffers onRender(MontageCustomAudioFx.RenderContext renderContext) {
            CustomAudioFx.RenderContext renderContext2 = this.f108387b;
            if (renderContext2 == null) {
                this.f108387b = MonRenderContextImpl.box(renderContext);
            } else {
                renderContext2.setRenderContext(renderContext);
            }
            return MonAudioSampleBuffersImpl.unbox(this.f108386a.onRender(this.f108387b));
        }

        @Override // com.bilibili.montage.FX.MontageCustomAudioFx.Renderer
        public final int querySupportedInputAudioSampleFormat() {
            return this.f108386a.querySupportedInputAudioSampleFormat();
        }
    }

    private MonCustomAudioFxImpl(@NonNull MontageCustomAudioFx montageCustomAudioFx) {
        this.mMonCustomAudioFx = montageCustomAudioFx;
    }

    @NonNull
    public static CustomAudioFx box(@NonNull MontageCustomAudioFx montageCustomAudioFx) {
        return new MonCustomAudioFxImpl(montageCustomAudioFx);
    }

    @NonNull
    public static MontageCustomAudioFx unbox(@NonNull CustomAudioFx customAudioFx) {
        return (MontageCustomAudioFx) customAudioFx.getCustomAudioFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx
    public Object getCustomAudioFx() {
        return this.mMonCustomAudioFx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx
    public void setCustomAudioFx(Object obj) {
        this.mMonCustomAudioFx = (MontageCustomAudioFx) obj;
    }
}
