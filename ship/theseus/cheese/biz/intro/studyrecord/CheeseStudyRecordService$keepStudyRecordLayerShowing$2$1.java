package com.bilibili.ship.theseus.cheese.biz.intro.studyrecord;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/studyrecord/CheeseStudyRecordService$keepStudyRecordLayerShowing$2$1.class */
final class CheeseStudyRecordService$keepStudyRecordLayerShowing$2$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final x $uiComponent;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final CheeseStudyRecordService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseStudyRecordService$keepStudyRecordLayerShowing$2$1(CheeseStudyRecordService cheeseStudyRecordService, x xVar, Continuation<? super CheeseStudyRecordService$keepStudyRecordLayerShowing$2$1> continuation) {
        super(1, continuation);
        this.this$0 = cheeseStudyRecordService;
        this.$uiComponent = xVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new CheeseStudyRecordService$keepStudyRecordLayerShowing$2$1(this.this$0, this.$uiComponent, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.bilibili.ship.theseus.united.page.screenstate.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        ?? r9;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str3;
        ?? r92;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.L$3;
                gVar = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$2;
                str2 = (String) this.L$1;
                r9 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                try {
                    ResultKt.throwOnFailure((Object) obj);
                    str3 = str;
                    r92 = r9;
                    gVar.j(str3);
                    r92.j(str2, false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    gVar.j(str);
                    throw th;
                }
            }
            ResultKt.throwOnFailure((Object) obj);
            CheeseStudyRecordService cheeseStudyRecordService = this.this$0;
            obj = cheeseStudyRecordService.f90200f;
            UIComponent<?> uIComponent = this.$uiComponent;
            obj.j("CheeseStudyRecordService", true);
            try {
                com.bilibili.ship.theseus.united.page.playingarea.g gVar2 = cheeseStudyRecordService.f90197c;
                gVar2.f("CheeseStudyRecordService");
                try {
                    TheseusFloatLayerService theseusFloatLayerService = cheeseStudyRecordService.f90196b;
                    this.L$0 = obj;
                    this.L$1 = "CheeseStudyRecordService";
                    this.L$2 = gVar2;
                    this.L$3 = "CheeseStudyRecordService";
                    this.label = 1;
                    if (theseusFloatLayerService.h(uIComponent, null, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = "CheeseStudyRecordService";
                    str2 = "CheeseStudyRecordService";
                    r92 = obj;
                    gVar = gVar2;
                    gVar.j(str3);
                    r92.j(str2, false);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    str = "CheeseStudyRecordService";
                    str2 = "CheeseStudyRecordService";
                    r9 = obj;
                    gVar = gVar2;
                    gVar.j(str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj.j("CheeseStudyRecordService", false);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
