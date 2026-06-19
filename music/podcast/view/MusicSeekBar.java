package com.bilibili.music.podcast.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewParent;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.LottieTask;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicSeekBar.class */
public final class MusicSeekBar extends AppCompatSeekBar {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public a f67109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public SeekBar.OnSeekBarChangeListener f67110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f67111d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicSeekBar$a.class */
    public static final class a extends LottieDrawable {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public boolean f67112A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f67113B;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @NotNull
        public final MusicSeekBar f67114v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @Nullable
        public final LottieComposition f67115w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @Nullable
        public final LottieComposition f67116x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @Nullable
        public final LottieComposition f67117y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f67118z;

        public a(@NotNull MusicSeekBar musicSeekBar, @Nullable LottieComposition lottieComposition, @Nullable LottieComposition lottieComposition2, @Nullable LottieComposition lottieComposition3) {
            this.f67114v = musicSeekBar;
            this.f67115w = lottieComposition;
            this.f67116x = lottieComposition2;
            this.f67117y = lottieComposition3;
            setComposition(lottieComposition);
            setProgress(0.5f);
        }

        public static /* synthetic */ void o(a aVar, LottieComposition lottieComposition, boolean z6, float f7, boolean z7, int i7) {
            if ((i7 & 4) != 0) {
                f7 = -1.0f;
            }
            if ((i7 & 8) != 0) {
                z7 = false;
            }
            aVar.m(lottieComposition, z6, f7, z7);
        }

        @Override // com.airbnb.lottie.LottieDrawable, android.graphics.drawable.Drawable
        public final void draw(@NotNull Canvas canvas) {
            try {
                Rect bounds = getBounds();
                canvas.translate(bounds.left, bounds.top);
                super.draw(canvas);
            } catch (Exception e7) {
                BLog.e("SeekWidgetDrawable", e7);
            }
        }

        public final void m(LottieComposition lottieComposition, boolean z6, float f7, boolean z7) {
            if (Intrinsics.areEqual(getComposition(), lottieComposition)) {
                return;
            }
            setComposition(lottieComposition);
            if (isLooping() != z6) {
                loop(z6);
            }
            if (f7 >= 0.0f) {
                setProgress(f7);
            }
            if (z7) {
                playAnimation();
            }
        }

        @Override // com.airbnb.lottie.LottieDrawable
        public final boolean setComposition(@NotNull LottieComposition lottieComposition) {
            Rect rect = new Rect(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom);
            boolean composition = super.setComposition(lottieComposition);
            int iWidth = rect.width();
            int iHeight = rect.height();
            int scale = (int) (getScale() * lottieComposition.getBounds().width());
            int scale2 = (int) (getScale() * lottieComposition.getBounds().height());
            if (iWidth == scale && iHeight == scale2) {
                setBounds(rect);
            } else {
                int i7 = rect.left - ((scale - iWidth) / 2);
                int i8 = rect.top - ((scale2 - iHeight) / 2);
                setBounds(new Rect(i7, i8, scale + i7, scale2 + i8));
                this.f67114v.setThumbOffset(getBounds().width() / 2);
                this.f67114v.requestLayout();
            }
            return composition;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicSeekBar$b.class */
    public static final class b implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MusicSeekBar f67119a;

        public b(MusicSeekBar musicSeekBar) {
            this.f67119a = musicSeekBar;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
            a aVar = this.f67119a.f67109b;
            if (aVar != null && aVar.f67112A) {
                int i8 = i7 - aVar.f67118z;
                aVar.f67118z = i7;
                float fMin = Math.min(Math.max(aVar.getProgress(), 0.0f), 1.0f);
                if (i8 > 0) {
                    aVar.setProgress(fMin + 0.05f);
                } else if (i8 < 0) {
                    aVar.setProgress(fMin - 0.05f);
                } else {
                    aVar.setProgress(fMin < 0.5f ? fMin + 0.05f : fMin - 0.05f);
                }
            }
            MusicSeekBar musicSeekBar = this.f67119a;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = musicSeekBar.f67110c;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onProgressChanged(musicSeekBar, i7, z6);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            ViewParent parent = this.f67119a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            a aVar = this.f67119a.f67109b;
            if (aVar != null) {
                aVar.f67118z = seekBar.getProgress();
                aVar.f67112A = true;
                LottieComposition lottieComposition = aVar.f67115w;
                if (lottieComposition != null) {
                    a.o(aVar, lottieComposition, false, 0.5f, false, 8);
                }
            }
            MusicSeekBar musicSeekBar = this.f67119a;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = musicSeekBar.f67110c;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStartTrackingTouch(musicSeekBar);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            ViewParent parent = this.f67119a.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
            a aVar = this.f67119a.f67109b;
            if (aVar != null) {
                aVar.f67112A = false;
                if (aVar.f67113B) {
                    BLog.i("SeekWidgetDrawable", "start show buffer");
                    LottieComposition lottieComposition = aVar.f67117y;
                    if (lottieComposition != null) {
                        a.o(aVar, lottieComposition, true, 0.0f, true, 4);
                    }
                } else {
                    LottieComposition lottieComposition2 = aVar.f67116x;
                    if (lottieComposition2 != null) {
                        aVar.m(lottieComposition2, false, -1.0f, true);
                    }
                }
            }
            MusicSeekBar musicSeekBar = this.f67119a;
            SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = musicSeekBar.f67110c;
            if (onSeekBarChangeListener != null) {
                onSeekBarChangeListener.onStopTrackingTouch(musicSeekBar);
            }
        }
    }

    public MusicSeekBar(@NotNull Context context) {
        this(context, null);
    }

    public MusicSeekBar(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        LifecycleCoroutineScope lifecycleScope;
        super(context, attributeSet, 0);
        b bVar = new b(this);
        setSplitTrack(false);
        FragmentActivity fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(getContext());
        if (fragmentActivityFindFragmentActivityOrNull != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragmentActivityFindFragmentActivityOrNull)) != null) {
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new MusicSeekBar$loadLocalIcon$1(this, null), 3, (Object) null);
        }
        super.setOnSeekBarChangeListener(bVar);
    }

    public static final Object g(MusicSeekBar musicSeekBar, Context context, String str, Continuation continuation) {
        musicSeekBar.getClass();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        LottieTask<LottieComposition> lottieTaskFromAsset = LottieCompositionFactory.fromAsset(context, str);
        o oVar = new o(booleanRef, cancellableContinuationImpl);
        lottieTaskFromAsset.addListener(oVar);
        cancellableContinuationImpl.invokeOnCancellation(new n(lottieTaskFromAsset, oVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setThumbInternal(Drawable drawable) {
        super.setThumb(drawable);
        requestLayout();
    }

    @Override // android.view.View
    public final void invalidate(int i7, int i8, int i9, int i10) {
        a aVar = this.f67109b;
        Rect bounds = aVar != null ? aVar.getBounds() : null;
        super.invalidate(Math.max(0, i7 - (Math.abs(bounds != null ? bounds.centerX() : 0) / 2)), i8, i9, i10);
    }

    @Override // android.widget.SeekBar
    public void setOnSeekBarChangeListener(@Nullable SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f67110c = onSeekBarChangeListener;
    }

    @Override // android.widget.AbsSeekBar
    public void setThumb(@Nullable Drawable drawable) {
        if (Intrinsics.areEqual(drawable, getThumb())) {
            return;
        }
        a aVar = this.f67109b;
        if (aVar != null && aVar.isAnimating()) {
            this.f67109b.cancelAnimation();
        }
        super.setThumb(drawable);
    }
}
