package com.bilibili.music.podcast;

import Ci0.f;
import Hi0.InterfaceC2136a;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.mixin.IFragmentShowHide;
import com.bilibili.music.podcast.data.o;
import com.bilibili.music.podcast.fragment.BaseLoadFragment;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastPlayListActivity.class */
public final class MusicPodcastPlayListActivity extends BaseAppCompatActivity implements View.OnClickListener, Ci0.d, IMiniPlayerContainer, InterfaceC2136a {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int f66363G = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public BaseLoadFragment f66364B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public View f66365C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public TextView f66366D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @NotNull
    public final Lazy f66367E = LazyKt.lazy(new YH.c(this, 1));

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final Lazy f66368F = LazyKt.lazy(new IM.c(this, 2));

    /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastPlayListActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastPlayListActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MusicPodcastPlayListActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastPlayListActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastPlayListActivity$onCreate$1$1.class */
        public static final class C03791 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final MusicPodcastPlayListActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03791(MusicPodcastPlayListActivity musicPodcastPlayListActivity, Continuation<? super C03791> continuation) {
                super(2, continuation);
                this.this$0 = musicPodcastPlayListActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03791(this.this$0, continuation);
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
        public AnonymousClass1(MusicPodcastPlayListActivity musicPodcastPlayListActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = musicPodcastPlayListActivity;
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
                C03791 c03791 = new C03791(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03791, this) == coroutine_suspended) {
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

    @Override // Hi0.InterfaceC2136a
    @NotNull
    public final String K4() {
        return "com.bilibili.music.podcast.playlist";
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle P6() {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.music.podcast.data.o r0 = r0.Q6()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L14
            r0 = r5
            android.os.Bundle r0 = r0.f66481a
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L1c
        L14:
            android.os.Bundle r0 = new android.os.Bundle
            r1 = r0
            r1.<init>()
            r5 = r0
        L1c:
            r0 = r5
            java.lang.String r1 = "router_pager_report_spmid"
            java.lang.String r2 = "listen.audio-detail.audio-player.0"
            r0.putString(r1, r2)
            r0 = r5
            java.lang.String r1 = "router_pager_report_pv"
            java.lang.String r2 = "listen.audio-detail.0.0.pv"
            r0.putString(r1, r2)
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.MusicPodcastPlayListActivity.P6():android.os.Bundle");
    }

    public final o Q6() {
        return (o) this.f66368F.getValue();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, lf0.ActivityC7846a, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(Hooks.hookAttachContext(this, context));
        Hooks.hookAfterAttachContext(this);
    }

    @Override // android.app.Activity
    public final void finish() {
        IFragmentShowHide iFragmentShowHide = this.f66364B;
        f fVar = iFragmentShowHide instanceof f ? (f) iFragmentShowHide : null;
        if (fVar != null) {
            fVar.nd();
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
        return MusicActivityHandleMode.SINGLE_MODULE;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View view) {
        if (view.getId() == 2131313607) {
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 803
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.music.podcast.MusicPodcastPlayListActivity.onCreate(android.os.Bundle):void");
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
