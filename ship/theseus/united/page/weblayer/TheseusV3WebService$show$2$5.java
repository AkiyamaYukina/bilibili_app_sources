package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusV3WebRepository;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/TheseusV3WebService$show$2$5.class */
final class TheseusV3WebService$show$2$5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<String> $finishReason;
    final TheseusFloatLayerService.a $layerConfig;
    final TheseusV3WebRepository.b $request;
    final PlayerV3WebGeneralUIComponent $webUiComponent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusV3WebService$show$2$5(TheseusV3WebRepository.b bVar, l lVar, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent, Ref.ObjectRef<String> objectRef, TheseusFloatLayerService.a aVar, Continuation<? super TheseusV3WebService$show$2$5> continuation) {
        super(1, continuation);
        this.$request = bVar;
        this.this$0 = lVar;
        this.$webUiComponent = playerV3WebGeneralUIComponent;
        this.$finishReason = objectRef;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusV3WebService$show$2$5(this.$request, this.this$0, this.$webUiComponent, this.$finishReason, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0117: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:35:0x0117 */
    /* JADX WARN: Type inference failed for: r0v69 */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.player.tangram.basic.d] */
    /* JADX WARN: Type inference failed for: r0v72 */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v78 */
    /* JADX WARN: Type inference failed for: r0v80, types: [com.bilibili.player.tangram.basic.d] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v7, types: [com.bilibili.ship.theseus.keel.player.h, java.lang.Object] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent;
        ?? r8;
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent2;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        Throwable th;
        String str;
        String str2;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar2;
        ?? r10;
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent3;
        ?? r102;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.$request.f104176d) {
                    l lVar = this.this$0;
                    r8 = lVar.f104272d;
                    playerV3WebGeneralUIComponent2 = this.$webUiComponent;
                    TheseusFloatLayerService.a aVar = this.$layerConfig;
                    r8.h(playerV3WebGeneralUIComponent2);
                    try {
                        com.bilibili.ship.theseus.united.page.screenstate.c cVar3 = lVar.h;
                        cVar3.b("TheseusV3Web", true);
                        try {
                            TheseusFloatLayerService theseusFloatLayerService = lVar.f104273e;
                            this.L$0 = r8;
                            this.L$1 = playerV3WebGeneralUIComponent2;
                            this.L$2 = cVar3;
                            this.L$3 = "TheseusV3Web";
                            this.label = 1;
                            if (theseusFloatLayerService.e(playerV3WebGeneralUIComponent2, aVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str2 = "TheseusV3Web";
                            cVar2 = cVar3;
                            r102 = r8;
                            playerV3WebGeneralUIComponent3 = playerV3WebGeneralUIComponent2;
                            cVar2.b(str2, false);
                            Unit unit = Unit.INSTANCE;
                            r102.i(playerV3WebGeneralUIComponent3);
                        } catch (Throwable th2) {
                            th = th2;
                            str2 = "TheseusV3Web";
                            cVar2 = cVar3;
                            r10 = r8;
                            playerV3WebGeneralUIComponent3 = playerV3WebGeneralUIComponent2;
                            cVar2.b(str2, false);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r8.i(playerV3WebGeneralUIComponent2);
                        throw th;
                    }
                } else {
                    l lVar2 = this.this$0;
                    com.bilibili.ship.theseus.united.page.screenstate.c cVar4 = lVar2.h;
                    PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent4 = this.$webUiComponent;
                    TheseusFloatLayerService.a aVar2 = this.$layerConfig;
                    cVar4.b("TheseusV3Web", true);
                    try {
                        TheseusFloatLayerService theseusFloatLayerService2 = lVar2.f104273e;
                        this.L$0 = cVar4;
                        this.L$1 = "TheseusV3Web";
                        this.label = 2;
                        if (theseusFloatLayerService2.e(playerV3WebGeneralUIComponent4, aVar2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str = "TheseusV3Web";
                        cVar = cVar4;
                        cVar.b(str, false);
                    } catch (Throwable th4) {
                        cVar = cVar4;
                        th = th4;
                        str = "TheseusV3Web";
                        cVar.b(str, false);
                        throw th;
                    }
                }
            } else if (i7 == 1) {
                str2 = (String) this.L$3;
                cVar2 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$2;
                playerV3WebGeneralUIComponent3 = (PlayerV3WebGeneralUIComponent) this.L$1;
                r10 = (com.bilibili.player.tangram.basic.d) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    r102 = r10;
                    cVar2.b(str2, false);
                    Unit unit2 = Unit.INSTANCE;
                    r102.i(playerV3WebGeneralUIComponent3);
                } catch (Throwable th5) {
                    th = th5;
                    cVar2.b(str2, false);
                    throw th;
                }
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$1;
                cVar = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    cVar.b(str, false);
                } catch (Throwable th6) {
                    th = th6;
                    cVar.b(str, false);
                    throw th;
                }
            }
            if (Intrinsics.areEqual(this.$finishReason.element, "scope_cancelled")) {
                this.$finishReason.element = "layer_closed";
            }
            return Unit.INSTANCE;
        } catch (Throwable th7) {
            th = th7;
            r8 = obj;
            playerV3WebGeneralUIComponent2 = playerV3WebGeneralUIComponent;
        }
    }
}
