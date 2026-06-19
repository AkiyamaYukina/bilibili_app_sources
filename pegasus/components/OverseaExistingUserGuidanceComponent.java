package com.bilibili.pegasus.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.dialogmanager.MainDialogManager;
import com.bilibili.base.BiliContext;
import com.bilibili.base.BiliGlobalPreferenceHelper;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.blrouter.RouteResponse;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.PegasusHeaderManager;
import kntr.app.oversea.translation.setting.guidance.J;
import kntr.base.localization.Localization;
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
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaExistingUserGuidanceComponent.class */
@StabilityInferred(parameters = 0)
public final class OverseaExistingUserGuidanceComponent extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final String f75845k = "oversea_existing_user_guidance_component";

    /* JADX INFO: renamed from: com.bilibili.pegasus.components.OverseaExistingUserGuidanceComponent$onViewCreated$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/OverseaExistingUserGuidanceComponent$onViewCreated$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final View $view;
        int label;
        final OverseaExistingUserGuidanceComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OverseaExistingUserGuidanceComponent overseaExistingUserGuidanceComponent, View view, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = overseaExistingUserGuidanceComponent;
            this.$view = view;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$view, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Fragment fragment = this.this$0.getFragment();
            if (fragment != null) {
                final Context context = this.$view.getContext();
                final LifecycleOwner viewLifecycleOwner = fragment.getViewLifecycleOwner();
                if (BiliGlobalPreferenceHelper.getInstance(BiliContext.application()).getSharedPreferences().getBoolean("SP_KEY_OVERSEA_TRANSLATION_GUIDANCE_DIALOG_SHOWN", false) || BiliGlobalPreferenceHelper.getInstance(BiliContext.application()).getSharedPreferences().getBoolean("SP_KEY_OVERSEA_EXISTING_USER_GUIDANCE_DIALOG_SHOWN", false)) {
                    BLog.i("OverseaExistingUserGuidanceDialog", "new user guidance or existing user guidance has been shown");
                } else {
                    Localization localization = Localization.INSTANCE;
                    if (!kntr.base.localization.q.c(localization.getCurrent())) {
                        BLog.i("OverseaExistingUserGuidanceDialog", "current locale " + localization.getCurrent() + " is not Chinese");
                    } else if (kntr.base.localization.p.b(kntr.base.localization.q.b(localization.getSYSTEM()))) {
                        MainDialogManager.addDialog(new MainDialogManager.DialogManagerInfo("oversea_existing_user", new MainDialogManager.IDialogInterface(context, viewLifecycleOwner) { // from class: En0.a

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final Context f4629a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final LifecycleOwner f4630b;

                            {
                                this.f4629a = context;
                                this.f4630b = viewLifecycleOwner;
                            }

                            public final void onShow() {
                                Context context2 = this.f4629a;
                                J.a = new b(0);
                                LifecycleOwner lifecycleOwner = this.f4630b;
                                Lifecycle.State currentState = null;
                                Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
                                if (lifecycle != null) {
                                    currentState = lifecycle.getCurrentState();
                                }
                                if (currentState == Lifecycle.State.DESTROYED) {
                                    BLog.i("OverseaExistingUserGuidanceDialog", "lifecycle DESTROYED, abort and release queue");
                                    MainDialogManager.showNextDialog("oversea_existing_user", false);
                                } else if (lifecycle != null && !currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                                    lifecycle.addObserver(new c(context2, lifecycle));
                                } else if (BLRouter.routeTo(new RouteRequest.Builder("bilibili://oversea/existing-user-guidance").build(), context2).getCode() == RouteResponse.Code.OK) {
                                    SharedPreferences.Editor editorEdit = BiliGlobalPreferenceHelper.getInstance(BiliContext.application()).getSharedPreferences().edit();
                                    editorEdit.putBoolean("SP_KEY_OVERSEA_EXISTING_USER_GUIDANCE_DIALOG_SHOWN", true);
                                    editorEdit.apply();
                                }
                            }
                        }, 91, false), context);
                    } else {
                        BLog.i("OverseaExistingUserGuidanceDialog", "system locale " + localization.getSYSTEM() + " does not support AI translation");
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f75845k;
    }

    public final void onViewCreated(@NotNull View view, @NotNull RecyclerView recyclerView, @NotNull PegasusHeaderManager pegasusHeaderManager) {
        super.onViewCreated(view, recyclerView, pegasusHeaderManager);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getRequireViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, view, null), 3, (Object) null);
    }
}
