package com.bilibili.montage.FX;

import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageVideoFrameInfo;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomVideoFx.class */
public class MontageCustomVideoFx {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomVideoFx$RenderContext.class */
    public static class RenderContext {
        public long effectEndTime;
        public long effectStartTime;
        public long effectTime;
        public boolean hasBuddyVideoFrame;
        public RenderHelper helper;
        public MontageVideoFrameInfo inputBuddyVideoFrameInfo;
        public ByteBuffer inputBuddyVideoFramebuffer;
        public VideoFrame inputVideoFrame;
        public long mediaStreamTime;
        public VideoFrame outputVideoFrame;

        public RenderContext() {
            this.inputBuddyVideoFramebuffer = null;
        }

        public RenderContext(byte[] bArr) {
            if (bArr != null) {
                this.inputBuddyVideoFramebuffer = ByteBuffer.wrap(bArr);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomVideoFx$RenderHelper.class */
    public interface RenderHelper {
        int allocateRGBATexture(int i7, int i8);

        void reclaimTexture(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomVideoFx$Renderer.class */
    public interface Renderer {
        void onCleanup();

        void onInit();

        void onPreloadResources();

        void onRender(RenderContext renderContext);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomVideoFx$RendererWithClearCache.class */
    public interface RendererWithClearCache extends Renderer {
        void onClearCacheResources();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageCustomVideoFx$VideoFrame.class */
    public static class VideoFrame {
        public int height;
        public boolean isUpsideDownTexture;
        public MontageRational proxyScale;
        public int texId;
        public int width;
    }
}
