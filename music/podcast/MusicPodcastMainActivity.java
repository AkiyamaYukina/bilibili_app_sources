package com.bilibili.music.podcast;

import Hi0.InterfaceC2136a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.music.podcast.fragment.MusicPodcastRecommendMainFragment;
import com.bilibili.music.podcast.player.init.MusicActivityHandleMode;
import com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastMainActivity.class */
public final class MusicPodcastMainActivity extends BaseAppCompatActivity implements Ci0.d, IMiniPlayerContainer, InterfaceC2136a, View.OnClickListener {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int f66358F = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @NotNull
    public final Lazy f66359B = LazyKt.lazy(new androidx.compose.material.ripple.a(this, 3));

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final Lazy f66360C = LazyKt.lazy(new c(0, this));

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public View f66361D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public MusicPodcastRecommendMainFragment f66362E;

    /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastMainActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastMainActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MusicPodcastMainActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastMainActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastMainActivity$onCreate$1$1.class */
        public static final class C03781 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final MusicPodcastMainActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03781(MusicPodcastMainActivity musicPodcastMainActivity, Continuation<? super C03781> continuation) {
                super(2, continuation);
                this.this$0 = musicPodcastMainActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03781(this.this$0, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ScreenAdjustUtilsKt.correctOrientation(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MusicPodcastMainActivity musicPodcastMainActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = musicPodcastMainActivity;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowWindowSizeFlow = ScreenAdjustUtilsKt.windowSizeFlow(this.this$0);
                C03781 c03781 = new C03781(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03781, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        MusicPodcastRecommendMainFragment musicPodcastRecommendMainFragment = this.f66362E;
        if (musicPodcastRecommendMainFragment != null) {
            musicPodcastRecommendMainFragment.nd();
        }
        super.finish();
        overridePendingTransition(0, 2130772284);
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final Rect getContainerUnavailableRect() {
        return new Rect();
    }

    @Override // com.bilibili.playerbizcommon.miniplayer.IMiniPlayerContainer
    @NotNull
    public final String getMiniPlayerContainerKey() {
        return "music_podcast_page";
    }

    @Override // Hi0.InterfaceC2136a
    @NotNull
    public final MusicActivityHandleMode k0() {
        return MusicActivityHandleMode.CLEAR_MODULE;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (view.getId() == 2131313607) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.MusicPodcastMainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f66362E = null;
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.clearFlags(201326592);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(ViewCompat.MEASURED_STATE_MASK);
    }
}
