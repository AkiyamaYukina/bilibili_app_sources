package com.bilibili.live.streaming.encoder;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/VideoEncoderFactory.class */
public final class VideoEncoderFactory {

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String TAG = "VideoEncoderFactory";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/VideoEncoderFactory$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
        @org.jetbrains.annotations.NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.bilibili.live.streaming.encoder.video.IVideoEncoder getVideoEncoder(@org.jetbrains.annotations.NotNull java.lang.String r7, boolean r8, @org.jetbrains.annotations.Nullable android.os.Looper r9) {
            /*
                r6 = this;
                java.lang.String r0 = "VideoEncoderFactory"
                java.lang.String r1 = "getVideoEncoder, videoCodecType = "
                r2 = r7
                java.lang.String r3 = ", useVideoEncoderFix = "
                r4 = r8
                java.lang.String r1 = com.bilibili.ad.reward.test.K.a(r1, r2, r3, r4)
                r2 = 0
                r3 = 4
                r4 = 0
                com.bilibili.live.streaming.log.LivePusherLog.i$default(r0, r1, r2, r3, r4)
                r0 = r7
                int r0 = r0.hashCode()
                r10 = r0
                r0 = r10
                r1 = -1590203327(0xffffffffa1376c41, float:-6.2146085E-19)
                if (r0 == r1) goto L5d
                r0 = r10
                r1 = -704884141(0xffffffffd5fc5253, float:-3.4678814E13)
                if (r0 == r1) goto L46
                r0 = r10
                r1 = -75075268(0xfffffffffb86713c, float:-1.3961289E36)
                if (r0 == r1) goto L2f
                goto L66
            L2f:
                r0 = r7
                java.lang.String r1 = "NetworkTestEncoder"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L3b
                goto L66
            L3b:
                com.bilibili.live.streaming.encoder.video.NetworkTestEncoder r0 = new com.bilibili.live.streaming.encoder.video.NetworkTestEncoder
                r1 = r0
                r1.<init>()
                r7 = r0
                goto L9b
            L46:
                r0 = r7
                java.lang.String r1 = "VoiceVideoEncoder"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L52
                goto L66
            L52:
                com.bilibili.live.streaming.encoder.video.VoiceVideoEncoder r0 = new com.bilibili.live.streaming.encoder.video.VoiceVideoEncoder
                r1 = r0
                r1.<init>()
                r7 = r0
                goto L9b
            L5d:
                r0 = r7
                java.lang.String r1 = "VideoEncoder"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L82
            L66:
                r0 = r8
                if (r0 == 0) goto L76
                com.bilibili.live.streaming.encoder.video.VideoEncoderFix r0 = new com.bilibili.live.streaming.encoder.video.VideoEncoderFix
                r1 = r0
                r2 = r9
                r1.<init>(r2)
                r7 = r0
                goto L9b
            L76:
                com.bilibili.live.streaming.encoder.video.VideoEncoderV2 r0 = new com.bilibili.live.streaming.encoder.video.VideoEncoderV2
                r1 = r0
                r2 = r9
                r1.<init>(r2)
                r7 = r0
                goto L9b
            L82:
                r0 = r8
                if (r0 == 0) goto L92
                com.bilibili.live.streaming.encoder.video.VideoEncoderFix r0 = new com.bilibili.live.streaming.encoder.video.VideoEncoderFix
                r1 = r0
                r2 = r9
                r1.<init>(r2)
                r7 = r0
                goto L9b
            L92:
                com.bilibili.live.streaming.encoder.video.VideoEncoderV2 r0 = new com.bilibili.live.streaming.encoder.video.VideoEncoderV2
                r1 = r0
                r2 = r9
                r1.<init>(r2)
                r7 = r0
            L9b:
                r0 = r7
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.VideoEncoderFactory.Companion.getVideoEncoder(java.lang.String, boolean, android.os.Looper):com.bilibili.live.streaming.encoder.video.IVideoEncoder");
        }
    }
}
