package com.bilibili.opd.app.bizcommon.imageselector.widget.video;

import Nm0.g;
import Nm0.h;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallMediaVideoView;
import com.bilibili.opd.app.bizcommon.imageselector.widget.video.MallVideoParams;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/video/MallMediaVideoView.class */
@StabilityInferred(parameters = 0)
public final class MallMediaVideoView extends FrameLayout {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f73971g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public a f73972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f73973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public MallVideoParams f73974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public MediaPlayer f73975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public h f73976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public g f73977f;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/imageselector/widget/video/MallMediaVideoView$a.class */
    public interface a {
        void a();

        void b();

        void c();

        void onPlayStart();
    }

    @JvmOverloads
    public MallMediaVideoView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MallMediaVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public MallMediaVideoView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f73973b = context;
    }

    public final void a() {
        MediaPlayer mediaPlayer = this.f73975d;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            MediaPlayer mediaPlayer2 = this.f73975d;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
            }
            this.f73975d = null;
        }
        h hVar = this.f73976e;
        if (hVar != null) {
            View view = hVar.getView();
            this.f73976e = null;
            if (view != null) {
                removeView(view);
            }
        }
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.f73975d;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener(this) { // from class: Nm0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MallMediaVideoView f17296a;

                {
                    this.f17296a = this;
                }

                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    MallMediaVideoView mallMediaVideoView = this.f17296a;
                    MallMediaVideoView.a aVar = mallMediaVideoView.f73972a;
                    if (aVar != null) {
                        aVar.c();
                    }
                    MallVideoParams mallVideoParams = mallMediaVideoView.f73974c;
                    if (mallVideoParams == null || !mallVideoParams.getNeedReleased()) {
                        return;
                    }
                    mallMediaVideoView.a();
                }
            });
        }
        MediaPlayer mediaPlayer2 = this.f73975d;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setOnErrorListener(new MediaPlayer.OnErrorListener(this) { // from class: Nm0.c

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MallMediaVideoView f17297a;

                {
                    this.f17297a = this;
                }

                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer3, int i7, int i8) {
                    MallMediaVideoView mallMediaVideoView = this.f17297a;
                    MallMediaVideoView.a aVar = mallMediaVideoView.f73972a;
                    if (aVar != null) {
                        aVar.a();
                    }
                    mallMediaVideoView.a();
                    return false;
                }
            });
        }
        MediaPlayer mediaPlayer3 = this.f73975d;
        if (mediaPlayer3 != null) {
            mediaPlayer3.setOnPreparedListener(new MediaPlayer.OnPreparedListener(this) { // from class: Nm0.d

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MallMediaVideoView f17298a;

                {
                    this.f17298a = this;
                }

                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer4) {
                    MallMediaVideoView.a aVar = this.f17298a.f73972a;
                    if (aVar != null) {
                        aVar.b();
                    }
                }
            });
        }
        MediaPlayer mediaPlayer4 = this.f73975d;
        if (mediaPlayer4 != null) {
            mediaPlayer4.setOnInfoListener(new MediaPlayer.OnInfoListener(this) { // from class: Nm0.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MallMediaVideoView f17299a;

                {
                    this.f17299a = this;
                }

                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer5, int i7, int i8) {
                    MallMediaVideoView mallMediaVideoView = this.f17299a;
                    if (3 != i7) {
                        int i9 = MallMediaVideoView.f73971g;
                        return true;
                    }
                    MallMediaVideoView.a aVar = mallMediaVideoView.f73972a;
                    if (aVar == null) {
                        return true;
                    }
                    aVar.onPlayStart();
                    return true;
                }
            });
        }
        MediaPlayer mediaPlayer5 = this.f73975d;
        if (mediaPlayer5 != null) {
            mediaPlayer5.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener(this) { // from class: Nm0.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final MallMediaVideoView f17300a;

                {
                    this.f17300a = this;
                }

                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer6, int i7, int i8) {
                    MallMediaVideoView mallMediaVideoView = this.f17300a;
                    h hVar = mallMediaVideoView.f73976e;
                    if (hVar != null) {
                        MediaPlayer mediaPlayer7 = mallMediaVideoView.f73975d;
                        int videoHeight = 0;
                        int videoWidth = mediaPlayer7 != null ? mediaPlayer7.getVideoWidth() : 0;
                        MediaPlayer mediaPlayer8 = mallMediaVideoView.f73975d;
                        if (mediaPlayer8 != null) {
                            videoHeight = mediaPlayer8.getVideoHeight();
                        }
                        hVar.a(videoWidth, videoHeight);
                    }
                }
            });
        }
    }

    public final void c() {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2 = this.f73975d;
        if (mediaPlayer2 == null || mediaPlayer2.isPlaying() || (mediaPlayer = this.f73975d) == null) {
            return;
        }
        mediaPlayer.start();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [Nm0.h, android.view.TextureView] */
    public final void setMediaPlayParams(@NotNull MallVideoParams mallVideoParams) {
        this.f73974c = mallVideoParams;
        this.f73977f = new g(this);
        h hVar = this.f73976e;
        View view = null;
        if (hVar != null) {
            View view2 = hVar.getView();
            this.f73976e = null;
            if (view2 != null) {
                removeView(view2);
            }
        }
        g gVar = this.f73977f;
        if (gVar != null) {
            ?? textureView = new TextureView(this.f73973b);
            textureView.setSurfaceTextureListener(new h.a(gVar));
            this.f73976e = textureView;
            MediaPlayer mediaPlayer = this.f73975d;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(null);
            }
            h hVar2 = this.f73976e;
            if (hVar2 != null) {
                view = hVar2.getView();
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
            if (view != null) {
                view.setLayoutParams(layoutParams);
            }
            removeAllViews();
            if (view != null) {
                addView(view);
            }
        }
    }

    public final void setOnVideoPlayerListener(@Nullable a aVar) {
        this.f73972a = aVar;
    }
}
