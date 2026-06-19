package com.bilibili.playset.utils;

import android.content.ComponentName;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.app.screen.adjust.utils.ScreenAdjustUtilsKt;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/FavScreenSizeUtils$monitorWindowSizeForRedirect$1.class */
final class FavScreenSizeUtils$monitorWindowSizeForRedirect$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final FragmentActivity $activity;
    final Fragment $fragment;
    final Function0<Boolean> $getIsContainerMode;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playset.utils.FavScreenSizeUtils$monitorWindowSizeForRedirect$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/FavScreenSizeUtils$monitorWindowSizeForRedirect$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function3<FlowCollector<? super WindowSizeClass>, Throwable, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(3, continuation);
        }

        public final Object invoke(FlowCollector<? super WindowSizeClass> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = th;
            return anonymousClass1.invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BLog.e("FavScreenSizeUtils", "monitorWindowSizeForRedirect: error collecting windowSizeFlow", (Throwable) this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/FavScreenSizeUtils$monitorWindowSizeForRedirect$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Fragment f85646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0<Boolean> f85647b;

        public a(Fragment fragment, Function0<Boolean> function0) {
            this.f85646a = fragment;
            this.f85647b = function0;
        }

        public final Object emit(Object obj, Continuation continuation) {
            boolean z6;
            BLog.d("FavScreenSizeUtils", "monitorWindowSizeForRedirect: windowSize changed = " + ((WindowSizeClass) obj));
            c cVar = c.f85657a;
            boolean zBooleanValue = ((Boolean) this.f85647b.invoke()).booleanValue();
            cVar.getClass();
            Fragment fragment = this.f85646a;
            FragmentActivity fragmentActivityP3 = fragment.p3();
            if (fragmentActivityP3 == null) {
                BLog.i("FavScreenSizeUtils", "tryRedirectToAdaptedScreen: activity is null, return false");
            } else if (KScreenAdjustUtilsKt.isNormal(ScreenAdjustUtilsKt.windowSize(fragmentActivityP3))) {
                BLog.d("FavScreenSizeUtils", "tryRedirectToAdaptedScreen: activity windowSize is normal");
            } else {
                try {
                    Intent launchIntentForPackage = fragmentActivityP3.getApplication().getPackageManager().getLaunchIntentForPackage(fragmentActivityP3.getPackageName());
                    ComponentName component = launchIntentForPackage != null ? launchIntentForPackage.getComponent() : null;
                    ComponentName componentName = fragmentActivityP3.getComponentName();
                    z6 = component != null && Intrinsics.areEqual(componentName.toString(), component.toString());
                    BLog.d("FavScreenSizeUtils", "checkIsMainActivity: result=" + z6 + ", current=" + componentName + ", launch=" + component);
                } catch (Exception e7) {
                    BLog.e("FavScreenSizeUtils", "checkIsMainActivity: error", e7);
                    z6 = false;
                }
                if (z6) {
                    BLog.i("FavScreenSizeUtils", "tryRedirectToAdaptedScreen: is main activity, return false");
                } else if (zBooleanValue) {
                    BLog.i("FavScreenSizeUtils", "tryRedirectToAdaptedScreen: is container mode, return false");
                } else if (((Boolean) c.f85658b.getValue()).booleanValue()) {
                    BLog.i("FavScreenSizeUtils", "tryRedirectToAdaptedScreen: screen size is not normal, routing to mine/v2");
                    try {
                        BLRouter.routeTo(new RouteRequest.Builder("bilibili://root?bottom_tab_id=我的Bottom&biz_key=fav").build(), fragment.getContext());
                        c.a(fragmentActivityP3);
                    } catch (Exception e8) {
                        BLog.e("FavScreenSizeUtils", "redirectToMineTab: error routing", e8);
                    }
                } else {
                    BLog.i("FavScreenSizeUtils", "tryRedirectToAdaptedScreen: mine v2 not enabled, skip redirect");
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FavScreenSizeUtils$monitorWindowSizeForRedirect$1(FragmentActivity fragmentActivity, Fragment fragment, Function0<Boolean> function0, Continuation<? super FavScreenSizeUtils$monitorWindowSizeForRedirect$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$fragment = fragment;
        this.$getIsContainerMode = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FavScreenSizeUtils$monitorWindowSizeForRedirect$1(this.$activity, this.$fragment, this.$getIsContainerMode, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            c cVar = c.f85657a;
            FragmentActivity fragmentActivity = this.$activity;
            cVar.getClass();
            Flow flowCatch = FlowKt.catch(FlowKt.distinctUntilChanged(FlowKt.onStart(ScreenAdjustUtilsKt.windowSizeFlow(fragmentActivity), new FavScreenSizeUtils$windowSizeFlowWithInitial$1(fragmentActivity, null))), new AnonymousClass1(null));
            a aVar = new a(this.$fragment, this.$getIsContainerMode);
            this.label = 1;
            if (flowCatch.collect(aVar, this) == coroutine_suspended) {
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
