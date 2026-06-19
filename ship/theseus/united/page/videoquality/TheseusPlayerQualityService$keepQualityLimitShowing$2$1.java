package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.ship.theseus.united.page.restrictionlayer.RestrictionLayerVo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$keepQualityLimitShowing$2$1.class */
final class TheseusPlayerQualityService$keepQualityLimitShowing$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final RestrictionLayerVo $qualityLimit;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$keepQualityLimitShowing$2$1(TheseusPlayerQualityService theseusPlayerQualityService, RestrictionLayerVo restrictionLayerVo, Continuation<? super TheseusPlayerQualityService$keepQualityLimitShowing$2$1> continuation) {
        super(1, continuation);
        this.this$0 = theseusPlayerQualityService;
        this.$qualityLimit = restrictionLayerVo;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TheseusPlayerQualityService$keepQualityLimitShowing$2$1(this.this$0, this.$qualityLimit, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00f7: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:29:0x00f4 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        RestrictionLayerVo restrictionLayerVo;
        RestrictionLayerVo restrictionLayerVo2;
        RestrictionLayerVo restrictionLayerVo3;
        com.bilibili.ship.theseus.united.page.screenstate.c cVar;
        RestrictionLayerVo restrictionLayerVo4;
        com.bilibili.ship.theseus.united.page.playingarea.i iVar;
        RestrictionLayerVo restrictionLayerVo5;
        com.bilibili.ship.theseus.united.page.playingarea.i iVar2;
        RestrictionLayerVo restrictionLayerVo6;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                restrictionLayerVo3 = (RestrictionLayerVo) this.L$3;
                cVar = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$2;
                restrictionLayerVo4 = (RestrictionLayerVo) this.L$1;
                com.bilibili.ship.theseus.united.page.playingarea.i iVar3 = (com.bilibili.ship.theseus.united.page.playingarea.i) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    restrictionLayerVo6 = restrictionLayerVo3;
                    restrictionLayerVo5 = restrictionLayerVo4;
                    iVar2 = iVar3;
                    cVar.j(restrictionLayerVo6, false);
                    Unit unit = Unit.INSTANCE;
                    iVar2.c(restrictionLayerVo5);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar3;
                    cVar.j(restrictionLayerVo3, false);
                    throw th;
                }
            }
            ResultKt.throwOnFailure(obj);
            TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
            com.bilibili.ship.theseus.united.page.playingarea.i iVar4 = theseusPlayerQualityService.f103791s;
            restrictionLayerVo2 = this.$qualityLimit;
            iVar4.a(restrictionLayerVo2);
            try {
                com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = theseusPlayerQualityService.f103784l;
                cVar2.j(restrictionLayerVo2, true);
                try {
                    com.bilibili.ship.theseus.united.page.restrictionlayer.G g7 = theseusPlayerQualityService.f103792t;
                    this.L$0 = iVar4;
                    this.L$1 = restrictionLayerVo2;
                    this.L$2 = cVar2;
                    this.L$3 = restrictionLayerVo2;
                    this.label = 1;
                    if (com.bilibili.ship.theseus.united.page.restrictionlayer.G.c(g7, restrictionLayerVo2, false, true, null, true, null, this, 34) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    restrictionLayerVo5 = restrictionLayerVo2;
                    cVar = cVar2;
                    iVar2 = iVar4;
                    restrictionLayerVo6 = restrictionLayerVo2;
                    cVar.j(restrictionLayerVo6, false);
                    Unit unit2 = Unit.INSTANCE;
                    iVar2.c(restrictionLayerVo5);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    restrictionLayerVo3 = restrictionLayerVo2;
                    cVar = cVar2;
                    restrictionLayerVo4 = restrictionLayerVo2;
                    iVar = iVar4;
                    cVar.j(restrictionLayerVo3, false);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj2 = iVar4;
                obj2.c(restrictionLayerVo2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            obj2 = obj;
            restrictionLayerVo2 = restrictionLayerVo;
        }
    }
}
