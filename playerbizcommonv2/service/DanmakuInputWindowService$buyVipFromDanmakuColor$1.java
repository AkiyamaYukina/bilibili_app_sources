package com.bilibili.playerbizcommonv2.service;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.ServicesProvider;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.IPlayerContainer;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/service/DanmakuInputWindowService$buyVipFromDanmakuColor$1.class */
public final class DanmakuInputWindowService$buyVipFromDanmakuColor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final c $params;
    Object L$0;
    Object L$1;
    int label;
    final DanmakuInputWindowService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DanmakuInputWindowService$buyVipFromDanmakuColor$1(DanmakuInputWindowService danmakuInputWindowService, c cVar, Continuation<? super DanmakuInputWindowService$buyVipFromDanmakuColor$1> continuation) {
        super(2, continuation);
        this.this$0 = danmakuInputWindowService;
        this.$params = cVar;
    }

    @JvmStatic
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "getServices", owner = {"com.bilibili.lib.blrouter.BLRouter"})
    @NotNull
    private static <T> ServicesProvider<T> __Ghost$Insertion$com_bilibili_gripper_router_aop_RouterHook_getServices(@NotNull BLRouter bLRouter, @NotNull Class<T> cls) {
        o00.a.a();
        return bLRouter.getServices(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(DanmakuInputWindowService danmakuInputWindowService, c cVar, Ref.BooleanRef booleanRef) {
        IPlayerContainer iPlayerContainer = danmakuInputWindowService.f81791a;
        IPlayerContainer iPlayerContainer2 = iPlayerContainer;
        if (iPlayerContainer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerContainer");
            iPlayerContainer2 = null;
        }
        if (iPlayerContainer2.getControlContainerService().getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN) {
            cVar.f81864d.invoke();
            booleanRef.element = cVar.f81862b;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$1(Result result, DanmakuInputWindowService danmakuInputWindowService, b bVar) {
        boolean z6 = Result.isSuccess-impl(result.unbox-impl());
        a aVar = danmakuInputWindowService.f81797g;
        bVar.a(aVar != null ? aVar.f81821b : 0L, z6);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DanmakuInputWindowService$buyVipFromDanmakuColor$1(this.this$0, this.$params, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 1066
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.service.DanmakuInputWindowService$buyVipFromDanmakuColor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
