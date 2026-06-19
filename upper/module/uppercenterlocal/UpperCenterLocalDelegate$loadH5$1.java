package com.bilibili.upper.module.uppercenterlocal;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.base.BiliContext;
import com.bilibili.common.hilowebview.service.HiloBiz;
import com.bilibili.common.hilowebview.view.HiloWebView;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenterlocal/UpperCenterLocalDelegate$loadH5$1.class */
final class UpperCenterLocalDelegate$loadH5$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final UpperCenterLocalDelegate this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpperCenterLocalDelegate$loadH5$1(UpperCenterLocalDelegate upperCenterLocalDelegate, Continuation<? super UpperCenterLocalDelegate$loadH5$1> continuation) {
        super(2, continuation);
        this.this$0 = upperCenterLocalDelegate;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UpperCenterLocalDelegate$loadH5$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Application application;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            application = BiliContext.application();
        } catch (Exception e7) {
            com.bilibili.biligame.dialogdispatcher.e.a("loadService error=", e7.getMessage(), "UpperCenterLocalDelegate", e7);
        }
        if (application == null) {
            return Unit.INSTANCE;
        }
        xW.e eVar = new xW.e(application, HiloBiz.UpperCenterMain, this.this$0.f114226a.lc() ? new xW.c(1, "home", MapsKt.mapOf(TuplesKt.to("isEmbedded", "1"))) : new xW.c(3, "home", (Map) null));
        UpperCenterLocalDelegate upperCenterLocalDelegate = this.this$0;
        upperCenterLocalDelegate.f114227b = eVar.e;
        HiloWebView hiloWebViewQa = upperCenterLocalDelegate.f114226a.Qa();
        if (hiloWebViewQa != null) {
            hiloWebViewQa.setSupportThirdCookie(true);
        }
        FragmentActivity fragmentActivityH0 = this.this$0.f114226a.h0();
        if (fragmentActivityH0 == null) {
            return Unit.INSTANCE;
        }
        HiloWebView hiloWebViewQa2 = this.this$0.f114226a.Qa();
        if (hiloWebViewQa2 != null) {
            hiloWebViewQa2.a(new WeakReference(fragmentActivityH0), eVar, this.this$0.f114232g);
        }
        return Unit.INSTANCE;
    }
}
