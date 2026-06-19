package com.bilibili.search2.eastereggs;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/EasterEggVideoView.class */
@StabilityInferred(parameters = 0)
public final class EasterEggVideoView extends SurfaceView implements MediaController.MediaPlayerControl {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int f86465A = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Uri f86466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public SurfaceHolder f86469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public MediaPlayer f86470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86472g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f86473i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f86474j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public MediaPlayer.OnCompletionListener f86475k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public MediaPlayer.OnPreparedListener f86476l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f86477m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public MediaPlayer.OnErrorListener f86478n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public MediaPlayer.OnInfoListener f86479o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f86480p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f86481q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f86482r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f86483s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public MediaPlayer.OnVideoSizeChangedListener f86484t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public MediaPlayer.OnPreparedListener f86485u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final d f86486v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final e f86487w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final f f86488x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final g f86489y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public SurfaceHolder.Callback f86490z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/eastereggs/EasterEggVideoView$a.class */
    public static final class a implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EasterEggVideoView f86491a;

        public a(EasterEggVideoView easterEggVideoView) {
            this.f86491a = easterEggVideoView;
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i7, int i8, int i9) {
            EasterEggVideoView easterEggVideoView = this.f86491a;
            easterEggVideoView.f86473i = i8;
            easterEggVideoView.f86474j = i9;
            boolean z6 = easterEggVideoView.f86468c == 3;
            boolean z7 = false;
            if (easterEggVideoView.f86472g == i8) {
                z7 = false;
                if (easterEggVideoView.h == i9) {
                    z7 = true;
                }
            }
            if (easterEggVideoView.f86470e != null && z6 && z7) {
                int i10 = easterEggVideoView.f86480p;
                if (i10 != 0) {
                    easterEggVideoView.seekTo(i10);
                }
                this.f86491a.start();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            EasterEggVideoView easterEggVideoView = this.f86491a;
            easterEggVideoView.f86469d = surfaceHolder;
            easterEggVideoView.b();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            EasterEggVideoView easterEggVideoView = this.f86491a;
            easterEggVideoView.f86469d = null;
            easterEggVideoView.c(true);
        }
    }

    @JvmOverloads
    public EasterEggVideoView(@Nullable Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public EasterEggVideoView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.search2.eastereggs.d] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.bilibili.search2.eastereggs.e] */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.bilibili.search2.eastereggs.g] */
    public EasterEggVideoView(final Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f86484t = new MediaPlayer.OnVideoSizeChangedListener(this, context) { // from class: com.bilibili.search2.eastereggs.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EasterEggVideoView f86509a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f86510b;

            {
                this.f86509a = this;
                this.f86510b = context;
            }

            @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i8, int i9) {
                ViewGroup.LayoutParams layoutParams;
                EasterEggVideoView easterEggVideoView = this.f86509a;
                Context context2 = this.f86510b;
                int i10 = EasterEggVideoView.f86465A;
                easterEggVideoView.f86472g = mediaPlayer.getVideoWidth();
                int videoHeight = mediaPlayer.getVideoHeight();
                easterEggVideoView.h = videoHeight;
                if (easterEggVideoView.f86472g == 0 || videoHeight == 0) {
                    return;
                }
                easterEggVideoView.getHolder().setFixedSize(easterEggVideoView.f86472g, easterEggVideoView.h);
                if ((context2 != null ? com.bilibili.search2.component.e.g(context2) : false) && (layoutParams = easterEggVideoView.getLayoutParams()) != null && layoutParams.width != -2) {
                    layoutParams.width = -2;
                    easterEggVideoView.setLayoutParams(layoutParams);
                }
                easterEggVideoView.requestLayout();
            }
        };
        this.f86485u = new MediaPlayer.OnPreparedListener(this, context) { // from class: com.bilibili.search2.eastereggs.c

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EasterEggVideoView f86511a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f86512b;

            {
                this.f86511a = this;
                this.f86512b = context;
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                EasterEggVideoView easterEggVideoView = this.f86511a;
                Context context2 = this.f86512b;
                easterEggVideoView.f86467b = 2;
                easterEggVideoView.f86483s = true;
                easterEggVideoView.f86482r = true;
                easterEggVideoView.f86481q = true;
                MediaPlayer.OnPreparedListener onPreparedListener = easterEggVideoView.f86476l;
                if (onPreparedListener != null) {
                    onPreparedListener.onPrepared(easterEggVideoView.f86470e);
                }
                easterEggVideoView.f86472g = mediaPlayer.getVideoWidth();
                easterEggVideoView.h = mediaPlayer.getVideoHeight();
                int i8 = easterEggVideoView.f86480p;
                if (i8 != 0) {
                    easterEggVideoView.seekTo(i8);
                }
                if (easterEggVideoView.f86472g == 0 || easterEggVideoView.h == 0) {
                    if (easterEggVideoView.f86468c == 3) {
                        easterEggVideoView.start();
                        return;
                    }
                    return;
                }
                easterEggVideoView.getHolder().setFixedSize(easterEggVideoView.f86472g, easterEggVideoView.h);
                if (context2 != null && com.bilibili.search2.component.e.g(context2)) {
                    easterEggVideoView.requestLayout();
                }
                if (easterEggVideoView.f86473i == easterEggVideoView.f86472g && easterEggVideoView.f86474j == easterEggVideoView.h && easterEggVideoView.f86468c == 3) {
                    easterEggVideoView.start();
                }
            }
        };
        this.f86486v = new MediaPlayer.OnCompletionListener(this) { // from class: com.bilibili.search2.eastereggs.d

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EasterEggVideoView f86513a;

            {
                this.f86513a = this;
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                EasterEggVideoView easterEggVideoView = this.f86513a;
                easterEggVideoView.f86467b = 5;
                easterEggVideoView.f86468c = 5;
                MediaPlayer.OnCompletionListener onCompletionListener = easterEggVideoView.f86475k;
                if (onCompletionListener != null) {
                    onCompletionListener.onCompletion(easterEggVideoView.f86470e);
                }
            }
        };
        this.f86487w = new MediaPlayer.OnInfoListener(this) { // from class: com.bilibili.search2.eastereggs.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EasterEggVideoView f86514a;

            {
                this.f86514a = this;
            }

            @Override // android.media.MediaPlayer.OnInfoListener
            public final boolean onInfo(MediaPlayer mediaPlayer, int i8, int i9) {
                MediaPlayer.OnInfoListener onInfoListener = this.f86514a.f86479o;
                if (onInfoListener == null) {
                    return true;
                }
                onInfoListener.onInfo(mediaPlayer, i8, i9);
                return true;
            }
        };
        this.f86488x = new f(this);
        this.f86489y = new MediaPlayer.OnBufferingUpdateListener(this) { // from class: com.bilibili.search2.eastereggs.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final EasterEggVideoView f86516a;

            {
                this.f86516a = this;
            }

            @Override // android.media.MediaPlayer.OnBufferingUpdateListener
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i8) {
                this.f86516a.f86477m = i8;
            }
        };
        this.f86490z = new a(this);
        getHolder().addCallback(this.f86490z);
        getHolder().setType(3);
        setBackgroundColor(0);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f86467b = 0;
        this.f86468c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r3 = this;
            r0 = r3
            android.media.MediaPlayer r0 = r0.f86470e
            if (r0 == 0) goto L1f
            r0 = r3
            int r0 = r0.f86467b
            r4 = r0
            r0 = r4
            r1 = -1
            if (r0 == r1) goto L1f
            r0 = r4
            if (r0 == 0) goto L1f
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 == r1) goto L1f
            goto L21
        L1f:
            r0 = 0
            r5 = r0
        L21:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.eastereggs.EasterEggVideoView.a():boolean");
    }

    public final void b() {
        if (this.f86466a == null || this.f86469d == null) {
            return;
        }
        c(false);
        ((AudioManager) getContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
        try {
            this.f86470e = new MediaPlayer();
            Context context = getContext();
            int i7 = this.f86471f;
            if (i7 != 0) {
                this.f86470e.setAudioSessionId(i7);
            } else {
                this.f86471f = this.f86470e.getAudioSessionId();
            }
            this.f86470e.setOnPreparedListener(this.f86485u);
            this.f86470e.setOnVideoSizeChangedListener(this.f86484t);
            this.f86470e.setOnCompletionListener(this.f86486v);
            this.f86470e.setOnErrorListener(this.f86488x);
            this.f86470e.setOnInfoListener(this.f86487w);
            this.f86470e.setOnBufferingUpdateListener(this.f86489y);
            this.f86477m = 0;
            this.f86470e.setDataSource(context, this.f86466a, (Map<String, String>) null);
            this.f86470e.setDisplay(this.f86469d);
            this.f86470e.setAudioStreamType(3);
            this.f86470e.setScreenOnWhilePlaying(true);
            this.f86470e.prepareAsync();
            this.f86467b = 1;
        } catch (IOException e7) {
            k.a("video egg play error", "Unable to open content: " + this.f86466a + ", error: " + e7.getMessage());
            this.f86467b = -1;
            this.f86468c = -1;
            this.f86488x.onError(this.f86470e, 1, 0);
        } catch (IllegalArgumentException e8) {
            k.a("video egg play error", "Unable to open content: " + this.f86466a + ", error: " + e8.getMessage());
            this.f86467b = -1;
            this.f86468c = -1;
            this.f86488x.onError(this.f86470e, 1, 0);
        }
    }

    public final void c(boolean z6) {
        MediaPlayer mediaPlayer = this.f86470e;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.f86470e.release();
            this.f86470e = null;
            this.f86467b = 0;
            if (z6) {
                this.f86468c = 0;
            }
            Object systemService = getContext().getSystemService("audio");
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return this.f86481q;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return this.f86482r;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return this.f86483s;
    }

    @Override // android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "android.widget.VideoView";
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f86471f == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f86471f = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f86471f;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return this.f86470e != null ? this.f86477m : 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer;
        return (!a() || (mediaPlayer = this.f86470e) == null) ? 0 : mediaPlayer.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer;
        return (!a() || (mediaPlayer = this.f86470e) == null) ? -1 : mediaPlayer.getDuration();
    }

    @NotNull
    public final MediaPlayer.OnPreparedListener getMPreparedListener() {
        return this.f86485u;
    }

    @NotNull
    public final SurfaceHolder.Callback getMSHCallback() {
        return this.f86490z;
    }

    @NotNull
    public final MediaPlayer.OnVideoSizeChangedListener getMSizeChangedListener() {
        return this.f86484t;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        return this.f86470e != null && a() && this.f86470e.isPlaying();
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9;
        int i10;
        float f7;
        float f8;
        float f9;
        float f10;
        int i11;
        int defaultSize = SurfaceView.getDefaultSize(this.f86472g, i7);
        int defaultSize2 = SurfaceView.getDefaultSize(this.h, i8);
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size2 = View.MeasureSpec.getSize(i8);
        int i12 = this.f86472g;
        int i13 = defaultSize;
        int i14 = defaultSize2;
        if (i12 > 0) {
            int i15 = this.h;
            i13 = defaultSize;
            i14 = defaultSize2;
            if (i15 > 0) {
                if (mode == 1073741824 && mode2 == 1073741824) {
                    if (com.bilibili.search2.component.e.g(getContext())) {
                        float f11 = this.f86472g / this.h;
                        float f12 = size;
                        float f13 = size2;
                        f7 = f11;
                        f8 = f13;
                        if (f11 > f12 / f13) {
                            f10 = f12;
                            f9 = f11;
                            i14 = (int) (f10 / f9);
                            i13 = size;
                        }
                        i11 = (int) (f8 * f7);
                        i13 = i11;
                        i14 = size2;
                    } else {
                        int i16 = this.f86472g;
                        int i17 = i16 * size2;
                        int i18 = this.h;
                        int i19 = size * i18;
                        if (i17 < i19) {
                            i11 = i17 / i18;
                            i13 = i11;
                            i14 = size2;
                        } else {
                            if (i17 > i19) {
                                i14 = i19 / i16;
                                i13 = size;
                            }
                            i11 = size;
                            i13 = i11;
                            i14 = size2;
                        }
                    }
                } else if (mode == 1073741824) {
                    if (com.bilibili.search2.component.e.g(getContext()) && mode2 == Integer.MIN_VALUE && size2 > 0) {
                        float f14 = this.f86472g / this.h;
                        float f15 = size;
                        float f16 = size2;
                        f7 = f14;
                        f8 = f16;
                        if (f14 > f15 / f16) {
                            f9 = f14;
                            f10 = f15;
                            i14 = (int) (f10 / f9);
                            i13 = size;
                        }
                        i11 = (int) (f8 * f7);
                        i13 = i11;
                        i14 = size2;
                    } else {
                        i14 = (this.h * size) / this.f86472g;
                        i13 = size;
                    }
                } else if (mode2 == 1073741824) {
                    int i20 = (i12 * size2) / i15;
                    i11 = i20;
                    if (mode == Integer.MIN_VALUE) {
                        i11 = i20;
                        if (i20 > size) {
                            i11 = size;
                        }
                    }
                    i13 = i11;
                    i14 = size2;
                } else if (com.bilibili.search2.component.e.g(getContext()) && mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE && size > 0 && size2 > 0) {
                    float f17 = this.f86472g / this.h;
                    float f18 = size;
                    float f19 = size2;
                    f7 = f17;
                    f8 = f19;
                    if (f17 > f18 / f19) {
                        f9 = f17;
                        f10 = f18;
                        i14 = (int) (f10 / f9);
                        i13 = size;
                    }
                    i11 = (int) (f8 * f7);
                    i13 = i11;
                    i14 = size2;
                } else {
                    int i21 = this.f86472g;
                    int i22 = this.h;
                    if (mode2 != Integer.MIN_VALUE || i22 <= size2) {
                        i9 = i21;
                        i10 = i22;
                    } else {
                        i9 = (size2 * i21) / i22;
                        i10 = size2;
                    }
                    if (mode != Integer.MIN_VALUE || i9 <= size) {
                        int i23 = i9;
                        i14 = i10;
                        i13 = i23;
                    } else {
                        i14 = (i22 * size) / i21;
                        i13 = size;
                    }
                }
            }
        }
        setMeasuredDimension(i13, i14);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        MediaPlayer mediaPlayer;
        if (a() && (mediaPlayer = this.f86470e) != null && mediaPlayer.isPlaying()) {
            this.f86470e.pause();
            this.f86467b = 4;
        }
        this.f86468c = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i7) {
        if (this.f86470e == null) {
            return;
        }
        int i8 = i7;
        if (a()) {
            this.f86470e.seekTo(i7);
            i8 = 0;
        }
        this.f86480p = i8;
    }

    public final void setMPreparedListener(@NotNull MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f86485u = onPreparedListener;
    }

    public final void setMSHCallback(@NotNull SurfaceHolder.Callback callback) {
        this.f86490z = callback;
    }

    public final void setMSizeChangedListener(@NotNull MediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.f86484t = onVideoSizeChangedListener;
    }

    public final void setOnCompletionListener(@Nullable MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f86475k = onCompletionListener;
    }

    public final void setOnErrorListener(@Nullable MediaPlayer.OnErrorListener onErrorListener) {
        this.f86478n = onErrorListener;
    }

    public final void setOnInfoListener(@Nullable MediaPlayer.OnInfoListener onInfoListener) {
        this.f86479o = onInfoListener;
    }

    public final void setOnPreparedListener(@Nullable MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f86476l = onPreparedListener;
    }

    public final void setVideoPath(@Nullable String str) {
        setVideoURI(Uri.parse(str));
    }

    public final void setVideoURI(@Nullable Uri uri) {
        this.f86466a = uri;
        this.f86480p = 0;
        b();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        MediaPlayer mediaPlayer;
        if (a() && (mediaPlayer = this.f86470e) != null) {
            mediaPlayer.start();
            this.f86467b = 3;
        }
        this.f86468c = 3;
    }
}
