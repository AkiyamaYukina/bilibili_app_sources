package com.bilibili.upper.widget.videoplayer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.base.BiliContext;
import com.bilibili.base.MainThread;
import com.bilibili.biligame.cloudgame.v2.ui.fragment.c;
import com.bilibili.upper.module.aistory.view.UpperRoundedFrameLayout;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/videoplayer/CommonVideoView.class */
@StabilityInferred(parameters = 0)
@RequiresApi(14)
public final class CommonVideoView extends FrameLayout implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f114683u = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f114684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Integer f114685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f114686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f114687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f114689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f114690g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f114691i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final View f114692j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Surface f114693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final IjkMediaPlayer f114694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public State f114695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final TextureView f114696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final ImageView f114697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final View f114698p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final ImageView f114699q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final UpperRoundedFrameLayout f114700r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f114701s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f114702t;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/videoplayer/CommonVideoView$ReadyState.class */
    public static final class ReadyState {
        private static final EnumEntries $ENTRIES;
        private static final ReadyState[] $VALUES;
        public static final ReadyState VIEW_READY = new ReadyState("VIEW_READY", 0);
        public static final ReadyState VIDEO_READY = new ReadyState("VIDEO_READY", 1);

        private static final /* synthetic */ ReadyState[] $values() {
            return new ReadyState[]{VIEW_READY, VIDEO_READY};
        }

        static {
            ReadyState[] readyStateArr$values = $values();
            $VALUES = readyStateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(readyStateArr$values);
        }

        private ReadyState(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<ReadyState> getEntries() {
            return $ENTRIES;
        }

        public static ReadyState valueOf(String str) {
            return (ReadyState) Enum.valueOf(ReadyState.class, str);
        }

        public static ReadyState[] values() {
            return (ReadyState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/videoplayer/CommonVideoView$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State STATE_PLAY = new State("STATE_PLAY", 0);
        public static final State STATE_PAUSE = new State("STATE_PAUSE", 1);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_PLAY, STATE_PAUSE};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/videoplayer/CommonVideoView$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f114703a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STATE_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[State.STATE_PLAY.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f114703a = iArr;
        }
    }

    public CommonVideoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114686c = true;
        View viewInflate = LayoutInflater.from(context).inflate(2131497418, this);
        this.f114692j = viewInflate;
        this.f114694l = new IjkMediaPlayer(BiliContext.application());
        this.f114695m = State.STATE_PLAY;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, IE0.a.f10165e);
        this.f114686c = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.f114684a = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(0, 2131236374));
        this.f114685b = Integer.valueOf(typedArrayObtainStyledAttributes.getResourceId(1, 2131236581));
        this.f114687d = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f114688e = typedArrayObtainStyledAttributes.getBoolean(6, true);
        this.f114689f = typedArrayObtainStyledAttributes.getBoolean(7, true);
        this.f114690g = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.h = typedArrayObtainStyledAttributes.getBoolean(4, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f114696n = (TextureView) viewInflate.findViewById(2131314015);
        this.f114697o = (ImageView) viewInflate.findViewById(2131303993);
        this.f114699q = (ImageView) viewInflate.findViewById(2131303957);
        this.f114698p = viewInflate.findViewById(2131305811);
        this.f114700r = viewInflate.findViewById(2131316124);
        setRoundCorner(this.f114687d);
        setRoundTopLeft(this.f114688e);
        setRoundTopRight(this.f114689f);
        setRoundBottomLeft(this.f114690g);
        setRoundBottomRight(this.h);
        setDefaultCover(this.f114684a);
        setPauseIcon(this.f114685b);
        TextureView textureView = this.f114696n;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this);
        }
        UpperRoundedFrameLayout upperRoundedFrameLayout = this.f114700r;
        if (upperRoundedFrameLayout != null) {
            upperRoundedFrameLayout.setOnClickListener(new c(this, 2));
        }
    }

    public final void a(ReadyState readyState) {
        TextureView textureView;
        if (!this.f114701s) {
            this.f114701s = readyState == ReadyState.VIEW_READY;
        }
        if (!this.f114702t) {
            boolean z6 = false;
            if (readyState == ReadyState.VIDEO_READY) {
                z6 = true;
            }
            this.f114702t = z6;
        }
        if (this.f114702t && this.f114701s && (textureView = this.f114696n) != null) {
            int videoWidth = this.f114694l.getVideoWidth();
            int videoHeight = this.f114694l.getVideoHeight();
            float measuredWidth = textureView.getMeasuredWidth();
            float measuredHeight = textureView.getMeasuredHeight();
            if (videoWidth == 0 || videoHeight == 0 || measuredWidth == 0.0f || measuredHeight == 0.0f) {
                return;
            }
            Matrix matrix = new Matrix();
            float f7 = videoWidth;
            float f8 = (measuredWidth - f7) / 2.0f;
            float f9 = videoHeight;
            matrix.preTranslate(f8, (measuredHeight - f9) / 2.0f);
            matrix.preScale(f7 / measuredWidth, f9 / measuredHeight);
            float f10 = measuredWidth / f7;
            float f11 = 2;
            matrix.postScale(f10, f10, measuredWidth / f11, measuredHeight / f11);
            textureView.setTransform(matrix);
            textureView.postInvalidate();
        }
    }

    public final void b() {
        this.f114695m = State.STATE_PAUSE;
        this.f114694l.pause();
        MainThread.postOnMainThread(new WC.a(this, 4));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(@NotNull SurfaceTexture surfaceTexture, int i7, int i8) {
        Surface surface = this.f114693k;
        if (surface != null && surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.f114693k = surface2;
        this.f114694l.setSurface(surface2);
        a(ReadyState.VIEW_READY);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surfaceTexture, int i7, int i8) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(@NotNull SurfaceTexture surfaceTexture) {
    }

    public final void setDefaultCover(@Nullable Integer num) {
        if (num != null) {
            this.f114684a = num;
            ImageView imageView = this.f114699q;
            if (imageView != null) {
                imageView.setImageResource(num.intValue());
            }
            MainThread.postOnMainThread(new Jn0.a(this, 4));
        }
    }

    public final void setLoopPlay(boolean z6) {
        this.f114686c = z6;
    }

    public final void setPauseIcon(@Nullable Integer num) {
        if (num != null) {
            this.f114685b = num;
            ImageView imageView = this.f114697o;
            if (imageView != null) {
                imageView.setImageResource(num.intValue());
            }
        }
    }

    public final void setRoundBottomLeft(boolean z6) {
        this.f114690g = z6;
        UpperRoundedFrameLayout upperRoundedFrameLayout = this.f114700r;
        if (upperRoundedFrameLayout != null) {
            upperRoundedFrameLayout.setRoundBottomLeft(z6);
        }
    }

    public final void setRoundBottomRight(boolean z6) {
        this.h = z6;
        UpperRoundedFrameLayout upperRoundedFrameLayout = this.f114700r;
        if (upperRoundedFrameLayout != null) {
            upperRoundedFrameLayout.setRoundBottomRight(z6);
        }
    }

    public final void setRoundCorner(float f7) {
        this.f114687d = f7;
        UpperRoundedFrameLayout upperRoundedFrameLayout = this.f114700r;
        if (upperRoundedFrameLayout != null) {
            upperRoundedFrameLayout.setRadius(f7);
        }
        UpperRoundedFrameLayout upperRoundedFrameLayout2 = this.f114700r;
        if (upperRoundedFrameLayout2 != null) {
            upperRoundedFrameLayout2.postInvalidate();
        }
    }

    public final void setRoundTopLeft(boolean z6) {
        this.f114688e = z6;
        UpperRoundedFrameLayout upperRoundedFrameLayout = this.f114700r;
        if (upperRoundedFrameLayout != null) {
            upperRoundedFrameLayout.setRoundTopLeft(z6);
        }
    }

    public final void setRoundTopRight(boolean z6) {
        this.f114689f = z6;
        UpperRoundedFrameLayout upperRoundedFrameLayout = this.f114700r;
        if (upperRoundedFrameLayout != null) {
            upperRoundedFrameLayout.setRoundTopRight(z6);
        }
    }
}
