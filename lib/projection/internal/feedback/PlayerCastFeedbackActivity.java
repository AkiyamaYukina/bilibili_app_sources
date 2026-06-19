package com.bilibili.lib.projection.internal.feedback;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.droid.BundleUtil;
import com.bilibili.lib.tribe.core.internal.Hooks;
import com.bilibili.lib.ui.BaseToolbarActivity;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackActivity.class */
public final class PlayerCastFeedbackActivity extends BaseToolbarActivity {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public PlayerCastFeedbackFragment f63175D;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackActivity$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerCastFeedbackActivity f63176a;

        public a(PlayerCastFeedbackActivity playerCastFeedbackActivity) {
            this.f63176a = playerCastFeedbackActivity;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.feedback.PlayerCastFeedbackActivity$onCreate$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackActivity$onCreate$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayerCastFeedbackActivity this$0;

        /* JADX INFO: renamed from: com.bilibili.lib.projection.internal.feedback.PlayerCastFeedbackActivity$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/feedback/PlayerCastFeedbackActivity$onCreate$1$1.class */
        public static final class C03481 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final PlayerCastFeedbackActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03481(PlayerCastFeedbackActivity playerCastFeedbackActivity, Continuation<? super C03481> continuation) {
                super(2, continuation);
                this.this$0 = playerCastFeedbackActivity;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03481(this.this$0, continuation);
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
        public AnonymousClass1(PlayerCastFeedbackActivity playerCastFeedbackActivity, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playerCastFeedbackActivity;
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
                C03481 c03481 = new C03481(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowWindowSizeFlow, c03481, this) == coroutine_suspended) {
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
        ScreenAdjustUtilsKt.correctOrientation(this);
        super.onCreate(bundle);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        setContentView(2131495218);
        ensureToolbar();
        showBackButton();
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            extras.getBundle(BundleUtil.KEY_DEFAULT_EXTRA_BUNDLE);
        }
        PlayerCastFeedbackFragment playerCastFeedbackFragment = new PlayerCastFeedbackFragment();
        this.f63175D = playerCastFeedbackFragment;
        playerCastFeedbackFragment.f63182g = new a(this);
        fragmentTransactionBeginTransaction.add(2131301947, playerCastFeedbackFragment);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    @Override // com.bilibili.lib.ui.BaseToolbarActivity, com.bilibili.lib.ui.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, lf0.ActivityC7846a, android.app.Activity
    public final void onDestroy() {
        FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
        PlayerCastFeedbackFragment playerCastFeedbackFragment = this.f63175D;
        if (playerCastFeedbackFragment != null) {
            fragmentTransactionBeginTransaction.remove(playerCastFeedbackFragment);
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        super.onDestroy();
    }
}
