package com.bilibili.music.podcast.utils.triple;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.animation.core.C3337p;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accountinfo.BiliAccountInfo;
import com.bilibili.lib.accountinfo.model.AccountInfo;
import com.bilibili.music.podcast.data.MusicPagerReportData;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.music.podcast.utils.p;
import com.bilibili.playerbizcommon.view.RingProgressBar;
import com.opensource.svgaplayer.SVGAImageView;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/triple/a.class */
public final class a implements View.OnLongClickListener, RingProgressBar.a, View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f67030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f67031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RingProgressBar f67032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RingProgressBar f67033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SVGAImageView f67034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SVGAImageView f67035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SVGAImageView f67036g;

    @Nullable
    public InterfaceC0385a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67037i;

    /* JADX INFO: renamed from: com.bilibili.music.podcast.utils.triple.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/utils/triple/a$a.class */
    public interface InterfaceC0385a {
        @Nullable
        MusicPagerReportData a();

        @Nullable
        MusicPlayItem b();

        @Nullable
        MusicPlayVideo c();

        default void d(@NotNull String str) {
        }

        void e();
    }

    @Override // com.bilibili.playerbizcommon.view.RingProgressBar.a
    public final void a(int i7, int i8) {
        MusicPlayItem musicPlayItemB;
        InterfaceC0385a interfaceC0385a;
        MusicPlayVideo musicPlayVideoC;
        LifecycleCoroutineScope lifecycleScope;
        if (i7 == i8) {
            RingProgressBar ringProgressBar = this.f67032c;
            RingProgressBar ringProgressBar2 = ringProgressBar;
            if (ringProgressBar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoinProgress");
                ringProgressBar2 = null;
            }
            ringProgressBar2.a();
            RingProgressBar ringProgressBar3 = this.f67033d;
            RingProgressBar ringProgressBar4 = ringProgressBar3;
            if (ringProgressBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFavoriteProgress");
                ringProgressBar4 = null;
            }
            ringProgressBar4.a();
            View view = this.f67030a;
            View view2 = view;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActionLike");
                view2 = null;
            }
            if (!C3337p.c(view2)) {
                InterfaceC0385a interfaceC0385a2 = this.h;
                if (interfaceC0385a2 != null) {
                    interfaceC0385a2.e();
                    return;
                }
                return;
            }
            View view3 = this.f67030a;
            View view4 = view3;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActionLike");
                view4 = null;
            }
            Context context = view4.getContext();
            InterfaceC0385a interfaceC0385a3 = this.h;
            if (interfaceC0385a3 == null || (musicPlayItemB = interfaceC0385a3.b()) == null || (interfaceC0385a = this.h) == null || (musicPlayVideoC = interfaceC0385a.c()) == null) {
                return;
            }
            InterfaceC0385a interfaceC0385a4 = this.h;
            p.c(musicPlayVideoC, interfaceC0385a4 != null ? interfaceC0385a4.a() : null, "three", "video");
            if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
                ToastHelper.showToastShort(context, context.getString(2131832822));
                return;
            }
            View view5 = this.f67030a;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mActionLike");
                view5 = null;
            }
            LifecycleOwner lifecycleOwner = ViewTreeLifecycleOwner.get(view5);
            if (lifecycleOwner == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) == null) {
                return;
            }
            BuildersKt.launch$default(lifecycleScope, (CoroutineContext) null, (CoroutineStart) null, new MusicTripleHelper$onTriggerTripleLike$1(musicPlayItemB, musicPlayVideoC, this, context, null), 3, (Object) null);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(@NotNull View view) {
        MusicPlayItem musicPlayItemB;
        Context context = view.getContext();
        this.f67037i = true;
        InterfaceC0385a interfaceC0385a = this.h;
        if (interfaceC0385a == null || (musicPlayItemB = interfaceC0385a.b()) == null) {
            return true;
        }
        MusicPlayItem.State state = musicPlayItemB.getState();
        if (state != null ? state.isLiked() : false) {
            MusicPlayItem.State state2 = musicPlayItemB.getState();
            if ((state2 != null ? state2.isCoin() : false) && com.bilibili.music.podcast.data.p.a(musicPlayItemB.getState())) {
                ToastHelper.showToastShort(context, 2131845512);
                return true;
            }
        }
        AccountInfo accountInfoFromCache = BiliAccountInfo.Companion.get().getAccountInfoFromCache();
        if (accountInfoFromCache != null && accountInfoFromCache.getSilence() == 1) {
            ToastHelper.showToastShort(context, 2131847121);
            return true;
        }
        RingProgressBar ringProgressBar = this.f67032c;
        RingProgressBar ringProgressBar2 = ringProgressBar;
        if (ringProgressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoinProgress");
            ringProgressBar2 = null;
        }
        ringProgressBar2.c();
        RingProgressBar ringProgressBar3 = this.f67033d;
        RingProgressBar ringProgressBar4 = ringProgressBar3;
        if (ringProgressBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFavoriteProgress");
            ringProgressBar4 = null;
        }
        ringProgressBar4.c();
        ImageView imageView = this.f67031b;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLikeIconView");
            imageView = null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofKeyframe(View.SCALE_X, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.94f), Keyframe.ofFloat(0.4f, 1.15f), Keyframe.ofFloat(0.6f, 1.25f), Keyframe.ofFloat(0.8f, 1.2f), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe(View.SCALE_Y, Keyframe.ofFloat(0.0f, 1.0f), Keyframe.ofFloat(0.2f, 0.94f), Keyframe.ofFloat(0.4f, 1.15f), Keyframe.ofFloat(0.6f, 1.25f), Keyframe.ofFloat(0.8f, 1.2f), Keyframe.ofFloat(1.0f, 1.0f)), PropertyValuesHolder.ofKeyframe(View.ROTATION, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.1f, -8.0f), Keyframe.ofFloat(0.2f, 8.0f), Keyframe.ofFloat(0.3f, -8.0f), Keyframe.ofFloat(0.4f, 8.0f), Keyframe.ofFloat(0.5f, -8.0f), Keyframe.ofFloat(0.6f, 8.0f), Keyframe.ofFloat(0.7f, -8.0f), Keyframe.ofFloat(0.8f, 8.0f), Keyframe.ofFloat(0.9f, -8.0f), Keyframe.ofFloat(1.0f, 0.0f)));
        objectAnimatorOfPropertyValuesHolder.setDuration(1500L);
        objectAnimatorOfPropertyValuesHolder.start();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked != 1 && actionMasked != 3) || !this.f67037i) {
            return false;
        }
        RingProgressBar ringProgressBar = this.f67032c;
        RingProgressBar ringProgressBar2 = ringProgressBar;
        if (ringProgressBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCoinProgress");
            ringProgressBar2 = null;
        }
        if (ringProgressBar2.f80366m.isRunning()) {
            RingProgressBar ringProgressBar3 = this.f67032c;
            RingProgressBar ringProgressBar4 = ringProgressBar3;
            if (ringProgressBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCoinProgress");
                ringProgressBar4 = null;
            }
            ringProgressBar4.b();
            RingProgressBar ringProgressBar5 = this.f67033d;
            if (ringProgressBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mFavoriteProgress");
                ringProgressBar5 = null;
            }
            ringProgressBar5.b();
        }
        this.f67037i = false;
        return false;
    }
}
