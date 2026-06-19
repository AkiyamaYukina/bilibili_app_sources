package com.bilibili.live.streaming.push;

import com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliOutStreamFlashpoint.class */
public final class BiliOutStreamFlashpoint extends BiliCallbackJavaFlashpoint {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String PROTOCOL_TYPE = "osi";

    @NotNull
    private static final String TAG = "BiliOutStreamFlashpoint";
    private boolean firstHead;

    @NotNull
    private final OutStreamInterface outStreamInterface;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliOutStreamFlashpoint$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/push/BiliOutStreamFlashpoint$OutStreamInterface.class */
    public interface OutStreamInterface {
        void onDestroy();

        boolean onSegment(int i7, @NotNull byte[] bArr);
    }

    public BiliOutStreamFlashpoint(@NotNull OutStreamInterface outStreamInterface) {
        super(PROTOCOL_TYPE, false, true, TAG);
        this.outStreamInterface = outStreamInterface;
    }

    private final boolean onSegment(int i7, byte[] bArr) {
        if (i7 == 0 && !this.firstHead) {
            this.firstHead = true;
        }
        if (this.firstHead) {
            return this.outStreamInterface.onSegment(i7, bArr);
        }
        return true;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint, com.bilibili.mediastreaming.flashpoint.h.a
    public void destroy() {
        super.destroy();
        this.firstHead = false;
        this.outStreamInterface.onDestroy();
    }

    public final boolean getFirstHead() {
        return this.firstHead;
    }

    @NotNull
    public final OutStreamInterface getOutStreamInterface() {
        return this.outStreamInterface;
    }

    @Override // com.bilibili.mediastreaming.flashpoint.BiliCallbackJavaFlashpoint
    public boolean onSendPacket(int i7, @NotNull byte[] bArr) {
        return onSegment(i7, bArr);
    }

    public final void setFirstHead(boolean z6) {
        this.firstHead = z6;
    }
}
