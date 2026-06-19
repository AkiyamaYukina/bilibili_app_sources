package com.bilibili.live.streaming.source;

import G.p;
import X1.C3081k;
import ZS0.j0;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Handler;
import android.view.Surface;
import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.gl.BEGLContext;
import com.bilibili.live.streaming.gl.BGLDrawer;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLTexture;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.utils.ExtMethodsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/VideoFileSource.class */
public final class VideoFileSource extends CaptureSource {
    public static final int CB_MSG_COMPLETED = 3;
    public static final int CB_MSG_ERROR = 2;
    public static final int CB_MSG_FILE_ERROR = -99;
    public static final int CB_MSG_LOADSUCCEED = 1;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final String ID = "VideoFileSource";

    @Nullable
    private Mp4AlphaConfig mMp4AlphaConfig;

    @Nullable
    private MediaPlayer mPlayer;

    @Nullable
    private Integer mDisplayWidth = 0;

    @Nullable
    private Integer mDisplayHeight = 0;

    @NotNull
    private Shaders.Transfer mInputTransfer = Shaders.Transfer.SRGB;

    @NotNull
    private Shaders.Primaries mInputPrimaries = Shaders.Primaries.SRGB;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/VideoFileSource$Companion.class */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/source/VideoFileSource$Mp4AlphaConfig.class */
    public static final class Mp4AlphaConfig {
        private final float alphasx;
        private final float alphasy;
        private final float alphax;
        private final float alphay;
        private final float rgbx;
        private final float rgbxs;
        private final float rgby;
        private final float rgbys;

        public Mp4AlphaConfig(float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
            this.rgbx = f7;
            this.rgby = f8;
            this.rgbxs = f9;
            this.rgbys = f10;
            this.alphax = f11;
            this.alphay = f12;
            this.alphasx = f13;
            this.alphasy = f14;
        }

        public final float getAlphasx() {
            return this.alphasx;
        }

        public final float getAlphasy() {
            return this.alphasy;
        }

        public final float getAlphax() {
            return this.alphax;
        }

        public final float getAlphay() {
            return this.alphay;
        }

        public final float getRgbx() {
            return this.rgbx;
        }

        public final float getRgbxs() {
            return this.rgbxs;
        }

        public final float getRgby() {
            return this.rgby;
        }

        public final float getRgbys() {
            return this.rgbys;
        }
    }

    private final void detectHDR(String str) {
        MediaExtractor mediaExtractor = new MediaExtractor();
        try {
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                int i7 = 0;
                while (true) {
                    if (i7 < trackCount) {
                        MediaFormat trackFormat = mediaExtractor.getTrackFormat(i7);
                        String string = trackFormat.getString("mime");
                        if (string != null && StringsKt.Z(string, "video/")) {
                            Integer intOrNull = getIntOrNull(trackFormat, "color-transfer");
                            Integer intOrNull2 = getIntOrNull(trackFormat, "color-standard");
                            if (intOrNull != null && intOrNull.intValue() == 6) {
                                this.mInputTransfer = Shaders.Transfer.PQ;
                                this.mInputPrimaries = Shaders.Primaries.BT2020;
                                LivePusherLog.i$default(ID, "HDR detected: PQ + BT2020", null, 4, null);
                            } else if (intOrNull != null && intOrNull.intValue() == 7) {
                                this.mInputTransfer = Shaders.Transfer.HLG;
                                this.mInputPrimaries = Shaders.Primaries.BT2020;
                                LivePusherLog.i$default(ID, "HDR detected: HLG + BT2020", null, 4, null);
                            } else if (intOrNull2 != null && intOrNull2.intValue() == 6) {
                                this.mInputPrimaries = Shaders.Primaries.BT2020;
                                LivePusherLog.i$default(ID, "BT2020 primaries detected, transfer: SDR", null, 4, null);
                            }
                        } else {
                            i7++;
                        }
                    }
                }
                break;
            } catch (Exception e7) {
                LivePusherLog.w(ID, "detectHDR failed: " + e7.getMessage(), e7);
            }
        } finally {
            mediaExtractor.release();
        }
    }

    private final Integer getIntOrNull(MediaFormat mediaFormat, String str) {
        Integer numValueOf = null;
        try {
            if (mediaFormat.containsKey(str)) {
                numValueOf = Integer.valueOf(mediaFormat.getInteger(str));
            }
        } catch (Exception e7) {
            numValueOf = null;
        }
        return numValueOf;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e3, code lost:
    
        r17 = r0 - 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ea, code lost:
    
        r21 = new byte[r17];
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        r23 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0105, code lost:
    
        if (r22.read(r21) >= r17) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011b, code lost:
    
        r24 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void parseMp4BLPC(java.lang.String r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.live.streaming.source.VideoFileSource.parseMp4BLPC(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playFile$lambda$6$lambda$2(VideoFileSource videoFileSource, MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2, int i7, int i8) {
        if (videoFileSource.getMWidth() == i7 && videoFileSource.getMHeight() == i8) {
            return;
        }
        videoFileSource.setMWidth(i7);
        videoFileSource.setMHeight(i8);
        videoFileSource.setMRealWidth(Integer.valueOf(i7));
        videoFileSource.setMRealHeight(Integer.valueOf(i8));
        videoFileSource.setMUseTexture2D(true);
        Handler railgunHandler = videoFileSource.mCtx.getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new com.bilibili.app.authorspace.local.c(1, mediaPlayer, videoFileSource));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit playFile$lambda$6$lambda$2$lambda$1(MediaPlayer mediaPlayer, VideoFileSource videoFileSource) {
        mediaPlayer.setSurface(null);
        super.destroy();
        LivePusherLog.i$default(ID, G.f.a(videoFileSource.getMWidth(), videoFileSource.getMHeight(), "video size: ", " x "), null, 4, null);
        videoFileSource.attachCaptureTexture();
        mediaPlayer.setSurface(new Surface(videoFileSource.getMCaptureSurfaceTexture()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playFile$lambda$6$lambda$3(String str, boolean z6, Function1 function1, MediaPlayer mediaPlayer) {
        LivePusherLog.i$default(ID, str + ": end prepare, play, loop: " + z6, null, 4, null);
        mediaPlayer.start();
        if (function1 != null) {
            function1.invoke(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean playFile$lambda$6$lambda$4(String str, Function1 function1, MediaPlayer mediaPlayer, int i7, int i8) {
        LivePusherLog.i$default(ID, str + ": error: what=" + i7 + " extra=" + i8, null, 4, null);
        if (function1 == null) {
            return false;
        }
        function1.invoke(2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void playFile$lambda$6$lambda$5(String str, Function1 function1, MediaPlayer mediaPlayer) {
        LivePusherLog.i$default(ID, p.a(str, ": play complete"), null, 4, null);
        if (function1 != null) {
            function1.invoke(3);
        }
    }

    private final void resetPlayInfo() {
        this.mMp4AlphaConfig = null;
        setMWidth(0);
        setMHeight(0);
        this.mDisplayWidth = null;
        this.mDisplayHeight = null;
        this.mInputTransfer = Shaders.Transfer.SRGB;
        this.mInputPrimaries = Shaders.Primaries.SRGB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stopPlay$lambda$7(VideoFileSource videoFileSource) {
        MediaPlayer mediaPlayer = videoFileSource.mPlayer;
        if (mediaPlayer == null) {
            return Unit.INSTANCE;
        }
        mediaPlayer.pause();
        mediaPlayer.setLooping(false);
        mediaPlayer.stop();
        return Unit.INSTANCE;
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        super.destroy();
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.mPlayer = null;
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource
    public void finalize() {
        super.finalize();
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        Integer num = this.mDisplayHeight;
        return num != null ? num.intValue() : super.getHeight();
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    @NotNull
    public String getID() {
        return ID;
    }

    @Override // com.bilibili.live.streaming.source.CaptureSource, com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        Integer num = this.mDisplayWidth;
        return num != null ? num.intValue() : super.getWidth();
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void init(@Nullable AVContext aVContext) {
        super.init(aVContext);
        setMUseTexture2D(true);
        setMUseAlphaChannel(false);
    }

    public final void playFile(@Nullable final String str, final boolean z6, boolean z7, @Nullable final Function1<? super Integer, Unit> function1) throws Throwable {
        final MediaPlayer mediaPlayer;
        StringBuilder sbB = C3081k.b("filePath:", str, ", isLoop:", ", isParseMp4BLPC:", z6);
        sbB.append(z7);
        LivePusherLog.i$default(ID, sbB.toString(), null, 4, null);
        if (this.mPlayer == null) {
            this.mPlayer = new MediaPlayer();
        }
        resetPlayInfo();
        MediaPlayer mediaPlayer2 = this.mPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.reset();
        }
        if (str == null || (mediaPlayer = this.mPlayer) == null) {
            return;
        }
        try {
            detectHDR(str);
            mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener(mediaPlayer, this) { // from class: com.bilibili.live.streaming.source.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final VideoFileSource f65400a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final MediaPlayer f65401b;

                {
                    this.f65400a = this;
                    this.f65401b = mediaPlayer;
                }

                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer3, int i7, int i8) {
                    VideoFileSource.playFile$lambda$6$lambda$2(this.f65400a, this.f65401b, mediaPlayer3, i7, i8);
                }
            });
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener(str, z6, function1) { // from class: com.bilibili.live.streaming.source.i

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f65402a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final boolean f65403b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final Function1 f65404c;

                {
                    this.f65402a = str;
                    this.f65403b = z6;
                    this.f65404c = function1;
                }

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer3) {
                    VideoFileSource.playFile$lambda$6$lambda$3(this.f65402a, this.f65403b, this.f65404c, mediaPlayer3);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener(str, function1) { // from class: com.bilibili.live.streaming.source.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f65405a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f65406b;

                {
                    this.f65405a = str;
                    this.f65406b = function1;
                }

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer3, int i7, int i8) {
                    return VideoFileSource.playFile$lambda$6$lambda$4(this.f65405a, this.f65406b, mediaPlayer3, i7, i8);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(str, function1) { // from class: com.bilibili.live.streaming.source.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f65407a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Function1 f65408b;

                {
                    this.f65407a = str;
                    this.f65408b = function1;
                }

                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) {
                    VideoFileSource.playFile$lambda$6$lambda$5(this.f65407a, this.f65408b, mediaPlayer3);
                }
            });
            LivePusherLog.i$default(ID, str.concat(": start prepare"), null, 4, null);
            if (z7) {
                parseMp4BLPC(str);
            }
            mediaPlayer.setDataSource(str);
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.setLooping(z6);
            mediaPlayer.prepareAsync();
        } catch (Exception e7) {
            if (function1 != null) {
                function1.invoke(-99);
            }
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() throws BGLException {
        BGLTexture mCaptureTexture2D;
        AVContext aVContext;
        BEGLContext eglContext;
        BGLDrawer inputTexDrawer;
        MediaPlayer mediaPlayer = this.mPlayer;
        if (mediaPlayer == null || !mediaPlayer.isPlaying() || (mCaptureTexture2D = getMCaptureTexture2D()) == null || (aVContext = this.mCtx) == null || (eglContext = aVContext.getEglContext()) == null || (inputTexDrawer = eglContext.getInputTexDrawer(this.mInputTransfer, this.mInputPrimaries)) == null) {
            return true;
        }
        Mp4AlphaConfig mp4AlphaConfig = this.mMp4AlphaConfig;
        if (mp4AlphaConfig == null) {
            inputTexDrawer.drawTex(mCaptureTexture2D);
            return true;
        }
        if (mp4AlphaConfig == null) {
            return true;
        }
        inputTexDrawer.drawTexMp4Alpha(mCaptureTexture2D, mp4AlphaConfig.getRgbx(), mp4AlphaConfig.getRgby(), mp4AlphaConfig.getRgbxs(), mp4AlphaConfig.getRgbys(), mp4AlphaConfig.getAlphax(), mp4AlphaConfig.getAlphay(), mp4AlphaConfig.getAlphasx(), mp4AlphaConfig.getAlphasy());
        return true;
    }

    public final void stopPlay() {
        Handler railgunHandler = this.mCtx.getRailgunHandler();
        if (railgunHandler != null) {
            ExtMethodsKt.invoke(railgunHandler, new j0(this, 2));
        }
    }
}
