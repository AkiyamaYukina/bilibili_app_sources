package com.bilibili.music.podcast;

import Rd1.e;
import a70.K;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.biligame.card.GameCardButton;
import com.bilibili.bililive.room.biz.shopping.view.search.LiveRoomShoppingSearchPanel;
import com.bilibili.bplus.im.pblink.w;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseAppCompatActivity;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.lib.ui.util.StatusBarCompat;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.music.podcast.fragment.MusicPodcastFindAllListFragment;
import com.bilibili.music.podcast.view.mini.MusicBottomPlayView;
import com.bilibili.userfeedback.laserreport.LogReportStrategy;
import java.util.HashMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.sms.SmsLoginDialogActivityV2;
import tv.danmaku.bili.ui.login.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastFindAllListActivity.class */
public final class MusicPodcastFindAllListActivity extends BaseAppCompatActivity implements Ci0.d {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f66356C = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public MusicBottomPlayView f66357B;

    /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastFindAllListActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastFindAllListActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final MusicPodcastFindAllListActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.music.podcast.MusicPodcastFindAllListActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/MusicPodcastFindAllListActivity$onCreate$1$1.class */
        public static final class C03771 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final MusicPodcastFindAllListActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03771(MusicPodcastFindAllListActivity musicPodcastFindAllListActivity, Continuation<? super C03771> continuation) {
                super(2, continuation);
                this.this$0 = musicPodcastFindAllListActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03771(this.this$0, continuation);
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
        public AnonymousClass1(MusicPodcastFindAllListActivity musicPodcastFindAllListActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = musicPodcastFindAllListActivity;
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
                C03771 c03771 = new C03771(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03771, this) == coroutine_suspended) {
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

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        long j7;
        String str;
        String str2;
        long j8;
        Uri data;
        String str3;
        String queryParameter;
        ScreenAdjustUtilsKt.correctOrientation(this);
        super.onCreate(bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        setContentView(2131499484);
        final int i7 = 0;
        findViewById(2131313607).setOnClickListener(new View.OnClickListener(this, i7) { // from class: com.bilibili.music.podcast.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f66371a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f66372b;

            {
                this.f66371a = i7;
                this.f66372b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (this.f66371a) {
                    case 0:
                        MusicPodcastFindAllListActivity musicPodcastFindAllListActivity = (MusicPodcastFindAllListActivity) this.f66372b;
                        int i8 = MusicPodcastFindAllListActivity.f66356C;
                        musicPodcastFindAllListActivity.finish();
                        break;
                    case 1:
                        LiveRoomShoppingSearchPanel liveRoomShoppingSearchPanel = (LiveRoomShoppingSearchPanel) this.f66372b;
                        LiveRoomShoppingSearchPanel.a aVar = LiveRoomShoppingSearchPanel.i;
                        liveRoomShoppingSearchPanel.dismissAllowingStateLoss();
                        break;
                    default:
                        SmsLoginDialogActivityV2 smsLoginDialogActivityV2 = (SmsLoginDialogActivityV2) this.f66372b;
                        int i9 = SmsLoginDialogActivityV2.w1;
                        HashMap mapX6 = smsLoginDialogActivityV2.X6();
                        String strE = e.e(smsLoginDialogActivityV2);
                        mapX6.put("show_provision", strE);
                        if (Intrinsics.areEqual("1", strE)) {
                            mapX6.put("is_agree", e.b(smsLoginDialogActivityV2.d1));
                        }
                        d.a.b("app.sms-login2.submit2.0.click", mapX6);
                        smsLoginDialogActivityV2.T6(new K(smsLoginDialogActivityV2, 6));
                        break;
                }
            }
        });
        this.f66357B = (MusicBottomPlayView) findViewById(2131297924);
        Toolbar toolbar = (Toolbar) findViewById(2131312697);
        if (toolbar != null) {
            toolbar.setPadding(toolbar.getPaddingLeft(), StatusBarCompat.getStatusBarHeight(this) + toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Intent intent = getIntent();
        String str4 = "";
        if (intent == null || (data = intent.getData()) == null || !Intrinsics.areEqual(LogReportStrategy.TAG_DEFAULT, data.getScheme()) || !Intrinsics.areEqual("podcast", data.getHost())) {
            j7 = -1;
            str = "";
            str2 = "";
            j8 = -1;
        } else {
            try {
                String lastPathSegment = data.getLastPathSegment();
                j7 = lastPathSegment != null ? Long.parseLong(lastPathSegment) : -1L;
                long j9 = -1;
                try {
                    String queryParameter2 = data.getQueryParameter("pick_id");
                    j8 = -1;
                    if (queryParameter2 != null) {
                        j8 = Long.parseLong(queryParameter2);
                    }
                    j9 = j8;
                    String queryParameter3 = data.getQueryParameter("from_route");
                    str3 = queryParameter3;
                    if (queryParameter3 == null) {
                        str3 = "";
                    }
                    try {
                        String queryParameter4 = data.getQueryParameter(GameCardButton.extraParamSource);
                        str2 = queryParameter4;
                        if (queryParameter4 == null) {
                            str2 = "";
                        }
                    } catch (Throwable th) {
                        th = th;
                        str2 = "";
                    }
                } catch (Throwable th2) {
                    th = th2;
                    j8 = j9;
                    str3 = "";
                    str2 = "";
                    com.bilibili.adcommon.utils.e.a("read intent error: ", "MusicPodcastSongList", th);
                    queryParameter = str4;
                    str4 = str3;
                    str = queryParameter;
                    Bundle bundleA = w.a(j8, "pick_id");
                    bundleA.putLong("card_id", j7);
                    bundleA.putString("from_route", str4);
                    bundleA.putString(GameCardButton.extraParamSource, str2);
                    bundleA.putString("from_spmid", str);
                    fragmentTransactionBeginTransaction.replace(2131311875, MusicPodcastFindAllListFragment.class, bundleA).commitAllowingStateLoss();
                }
            } catch (Throwable th3) {
                th = th3;
                j7 = -1;
                j8 = -1;
            }
            try {
                queryParameter = data.getQueryParameter("from_spmid");
                if (queryParameter == null) {
                    queryParameter = str4;
                }
            } catch (Throwable th4) {
                th = th4;
                com.bilibili.adcommon.utils.e.a("read intent error: ", "MusicPodcastSongList", th);
                queryParameter = str4;
            }
            str4 = str3;
            str = queryParameter;
        }
        Bundle bundleA2 = w.a(j8, "pick_id");
        bundleA2.putLong("card_id", j7);
        bundleA2.putString("from_route", str4);
        bundleA2.putString(GameCardButton.extraParamSource, str2);
        bundleA2.putString("from_spmid", str);
        fragmentTransactionBeginTransaction.replace(2131311875, MusicPodcastFindAllListFragment.class, bundleA2).commitAllowingStateLoss();
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public final void onPostCreate(@Nullable Bundle bundle) {
        super.onPostCreate(bundle);
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() | 1280);
        window.clearFlags(BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        StatusBarCompat.setStatusBarMode(this, !MultipleThemeUtils.isNightTheme(this));
    }

    @Override // com.bilibili.lib.ui.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onResume() {
        super.onResume();
        MusicBottomPlayView musicBottomPlayView = this.f66357B;
        if (musicBottomPlayView != null) {
            int i7 = MusicBottomPlayView.f67279p;
            musicBottomPlayView.f(this, false, true);
        }
    }
}
