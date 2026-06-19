package com.bilibili.live.streaming.encoder.video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/video/VideoEncoderUtilKt.class */
public final class VideoEncoderUtilKt {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
    
        if (r0.equals(com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.HEVC_MIME) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r0.equals(com.bilibili.live.streaming.encoder.BiliPushAVCodecUtils.DOLBY_MIME) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        r0 = r5.getByteBuffer("csd-0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0097, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        r5 = new byte[r0.capacity()];
        r0.get(r5, 0, r0.capacity());
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:
    
        r5 = new byte[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b4, code lost:
    
        return r5;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte[] getHead(@org.jetbrains.annotations.NotNull android.media.MediaFormat r5) {
        /*
            r0 = r5
            java.lang.String r1 = "mime"
            java.lang.String r0 = r0.getString(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Lb5
            r0 = r7
            int r0 = r0.hashCode()
            r6 = r0
            r0 = r6
            r1 = -1851077871(0xffffffff91aacb11, float:-2.694642E-28)
            if (r0 == r1) goto L83
            r0 = r6
            r1 = -1662541442(0xffffffff9ce7a17e, float:-1.5328042E-21)
            if (r0 == r1) goto L77
            r0 = r6
            r1 = 1331836730(0x4f62373a, float:3.7952701E9)
            if (r0 == r1) goto L25
            goto Lb5
        L25:
            r0 = r7
            java.lang.String r1 = "video/avc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L31
            goto Lb5
        L31:
            r0 = r5
            java.lang.String r1 = "csd-0"
            java.nio.ByteBuffer r0 = r0.getByteBuffer(r1)
            r7 = r0
            r0 = r5
            java.lang.String r1 = "csd-1"
            java.nio.ByteBuffer r0 = r0.getByteBuffer(r1)
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L71
            r0 = r8
            if (r0 == 0) goto L71
            r0 = r7
            int r0 = r0.capacity()
            r6 = r0
            r0 = r8
            int r0 = r0.capacity()
            r1 = r6
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r5 = r0
            r0 = r7
            r1 = r5
            r2 = 0
            r3 = r7
            int r3 = r3.capacity()
            java.nio.ByteBuffer r0 = r0.get(r1, r2, r3)
            r0 = r8
            r1 = r5
            r2 = r7
            int r2 = r2.capacity()
            r3 = r8
            int r3 = r3.capacity()
            java.nio.ByteBuffer r0 = r0.get(r1, r2, r3)
            goto L75
        L71:
            r0 = 0
            byte[] r0 = new byte[r0]
            r5 = r0
        L75:
            r0 = r5
            return r0
        L77:
            r0 = r7
            java.lang.String r1 = "video/hevc"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8f
            goto Lb5
        L83:
            r0 = r7
            java.lang.String r1 = "video/dolby-vision"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L8f
            goto Lb5
        L8f:
            r0 = r5
            java.lang.String r1 = "csd-0"
            java.nio.ByteBuffer r0 = r0.getByteBuffer(r1)
            r7 = r0
            r0 = r7
            if (r0 == 0) goto Laf
            r0 = r7
            int r0 = r0.capacity()
            byte[] r0 = new byte[r0]
            r5 = r0
            r0 = r7
            r1 = r5
            r2 = 0
            r3 = r7
            int r3 = r3.capacity()
            java.nio.ByteBuffer r0 = r0.get(r1, r2, r3)
            goto Lb3
        Laf:
            r0 = 0
            byte[] r0 = new byte[r0]
            r5 = r0
        Lb3:
            r0 = r5
            return r0
        Lb5:
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.encoder.video.VideoEncoderUtilKt.getHead(android.media.MediaFormat):byte[]");
    }
}
