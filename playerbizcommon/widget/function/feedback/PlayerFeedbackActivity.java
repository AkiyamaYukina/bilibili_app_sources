package com.bilibili.playerbizcommon.widget.function.feedback;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.bplus.im.pblink.w;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
import com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackActivity.class */
public final class PlayerFeedbackActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public PlayerFeedbackFragment f80643D;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackActivity$a.class */
    public static final class a implements PlayerFeedbackFragment.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerFeedbackActivity f80644a;

        public a(PlayerFeedbackActivity playerFeedbackActivity) {
            this.f80644a = playerFeedbackActivity;
        }

        @Override // com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackFragment.a
        public final void onFinish() {
            this.f80644a.finish();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayerFeedbackActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.playerbizcommon.widget.function.feedback.PlayerFeedbackActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/widget/function/feedback/PlayerFeedbackActivity$onCreate$1$1.class */
        public static final class C05241 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final PlayerFeedbackActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05241(PlayerFeedbackActivity playerFeedbackActivity, Continuation<? super C05241> continuation) {
                super(2, continuation);
                this.this$0 = playerFeedbackActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05241(this.this$0, continuation);
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
        public AnonymousClass1(PlayerFeedbackActivity playerFeedbackActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerFeedbackActivity;
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
                C05241 c05241 = new C05241(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c05241, this) == coroutine_suspended) {
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

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, com.bilibili.lib.spy.generated.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        PlayerFeedbackFragment playerFeedbackFragment;
        ScreenAdjustUtilsKt.correctOrientation(this);
        super.onCreate(bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        setContentView(2131493765);
        ensureToolbar();
        showBackButton();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Bundle extras = getIntent().getExtras();
        Bundle bundle2 = extras != null ? extras.getBundle(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE) : null;
        if (bundle2 != null) {
            long j7 = bundle2.getLong("key_avid", 0L);
            long j8 = bundle2.getLong("key_cid", 0L);
            long j9 = bundle2.getLong("key_season_id", 0L);
            boolean z6 = bundle2.getBoolean("key_is_bangumi", false);
            boolean z7 = bundle2.getBoolean("key_is_show_bangumi_skip_head_option", false);
            boolean z8 = bundle2.getBoolean("key_from_player", false);
            String string = bundle2.getString("key_player_tag");
            String string2 = bundle2.getString("key_spmid");
            String string3 = bundle2.getString("key_from_spmid");
            int i7 = bundle2.getInt("theme", 1);
            Bundle bundleA = w.a(j7, "key_avid");
            bundleA.putLong("key_cid", j8);
            bundleA.putLong("key_season_id", j9);
            bundleA.putBoolean("key_is_bangumi", z6);
            bundleA.putBoolean("key_is_show_bangumi_skip_head_option", z7);
            bundleA.putBoolean("key_from_player", z8);
            bundleA.putString("key_player_tag", string);
            bundleA.putString("key_spmid", string2);
            bundleA.putString("key_from_spmid", string3);
            bundleA.putInt("theme", i7);
            playerFeedbackFragment = new PlayerFeedbackFragment();
            playerFeedbackFragment.setArguments(bundleA);
        } else {
            playerFeedbackFragment = null;
        }
        this.f80643D = playerFeedbackFragment;
        if (playerFeedbackFragment != null) {
            playerFeedbackFragment.f80653k = new a(this);
        }
        if (playerFeedbackFragment != null) {
            fragmentTransactionBeginTransaction.add(2131301947, playerFeedbackFragment);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        PlayerFeedbackFragment playerFeedbackFragment = this.f80643D;
        if (playerFeedbackFragment != null) {
            fragmentTransactionBeginTransaction.remove(playerFeedbackFragment);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        super.onDestroy();
    }
}
