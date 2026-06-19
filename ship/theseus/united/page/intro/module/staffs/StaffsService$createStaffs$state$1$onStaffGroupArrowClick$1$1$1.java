package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1.class */
public final class StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final StaffsService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1(StaffsService staffsService, Continuation<? super StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1> continuation) {
        super(1, continuation);
        this.this$0 = staffsService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invokeSuspend$lambda$0$0$0(StaffsService staffsService) {
        return staffsService.f101850t.f() ? 3 : 1;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v56 */
    /* JADX WARN: Type inference failed for: r0v58, types: [com.bilibili.ship.theseus.united.page.screenstate.c] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.bilibili.ship.theseus.united.page.screenstate.c, java.lang.Object] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        ?? r10;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar;
        String str3;
        ?? r102;
        com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
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
                r10 = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$0;
                try {
                    ResultKt.throwOnFailure((Object) obj);
                    str3 = str;
                    gVar2 = gVar;
                    r102 = r10;
                    gVar2.j(str3);
                    r102.j(str2, false);
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    th = th;
                    gVar.j(str);
                    throw th;
                }
            }
            ResultKt.throwOnFailure((Object) obj);
            ((A) this.this$0.f101831F.getValue()).j(!this.this$0.f101850t.f());
            final StaffsService staffsService = this.this$0;
            obj = staffsService.f101847q;
            obj.j("StaffsService", true);
            try {
                com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = staffsService.f101845o;
                gVar3.f("StaffsService");
                try {
                    TheseusFloatLayerService theseusFloatLayerService = staffsService.f101840j;
                    A a7 = (A) staffsService.f101831F.getValue();
                    TheseusFloatLayerService.a aVar = new TheseusFloatLayerService.a(0, 0, new Function0(staffsService) { // from class: com.bilibili.ship.theseus.united.page.intro.module.staffs.J

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final StaffsService f101782a;

                        {
                            this.f101782a = staffsService;
                        }

                        public final Object invoke() {
                            return Integer.valueOf(StaffsService$createStaffs$state$1$onStaffGroupArrowClick$1$1$1.invokeSuspend$lambda$0$0$0(this.f101782a));
                        }
                    }, 12);
                    this.L$0 = obj;
                    this.L$1 = "StaffsService";
                    this.L$2 = gVar3;
                    this.L$3 = "StaffsService";
                    this.label = 1;
                    if (theseusFloatLayerService.e(a7, aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str3 = "StaffsService";
                    str2 = "StaffsService";
                    r102 = obj;
                    gVar2 = gVar3;
                    gVar2.j(str3);
                    r102.j(str2, false);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    str = "StaffsService";
                    str2 = "StaffsService";
                    r10 = obj;
                    gVar = gVar3;
                    gVar.j(str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                obj.j("StaffsService", false);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
