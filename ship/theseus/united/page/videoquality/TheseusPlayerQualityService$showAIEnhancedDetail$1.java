package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.playerbizcommonv2.widget.quality.AIEnhancedQualityInfoUIComponent;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showAIEnhancedDetail$1;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showAIEnhancedDetail$1.class */
final class TheseusPlayerQualityService$showAIEnhancedDetail$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final TheseusPlayerQualityService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showAIEnhancedDetail$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/TheseusPlayerQualityService$showAIEnhancedDetail$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final CoroutineScope $$this$launch;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        final TheseusPlayerQualityService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPlayerQualityService theseusPlayerQualityService, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = theseusPlayerQualityService;
            this.$$this$launch = coroutineScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c3  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final kotlin.Unit invokeSuspend$lambda$0$0$0(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService r6, kotlinx.coroutines.CoroutineScope r7) {
            /*
                Method dump skipped, instruction units count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService$showAIEnhancedDetail$1.AnonymousClass1.invokeSuspend$lambda$0$0$0(com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService, kotlinx.coroutines.CoroutineScope):kotlin.Unit");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0$1(CoroutineScope coroutineScope) {
            CoroutineScopeKt.cancel$default(coroutineScope, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0$0$2(TheseusPlayerQualityService theseusPlayerQualityService) {
            PageReportService.i(theseusPlayerQualityService.f103788p, "player.player.aiqn-info.0.player", theseusPlayerQualityService.f103780g.a(), 4);
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [com.bilibili.player.tangram.basic.d] */
        /* JADX WARN: Type inference failed for: r0v47 */
        /* JADX WARN: Type inference failed for: r0v50 */
        /* JADX WARN: Type inference failed for: r0v53 */
        /* JADX WARN: Type inference failed for: r0v56 */
        /* JADX WARN: Type inference failed for: r0v58, types: [com.bilibili.player.tangram.basic.d] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v5 */
        /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v1 */
        /* JADX WARN: Type inference failed for: r6v2, types: [com.bilibili.ship.theseus.keel.player.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v5 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v9 */
        public final Object invokeSuspend(Object obj) throws Throwable {
            TheseusPlayerQualityService theseusPlayerQualityService;
            com.bilibili.ship.theseus.united.page.screenstate.c cVar;
            TheseusPlayerQualityService theseusPlayerQualityService2;
            ?? r10;
            TheseusPlayerQualityService theseusPlayerQualityService3;
            ?? r9;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            try {
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    theseusPlayerQualityService = (TheseusPlayerQualityService) this.L$3;
                    cVar = (com.bilibili.ship.theseus.united.page.screenstate.c) this.L$2;
                    theseusPlayerQualityService2 = (TheseusPlayerQualityService) this.L$1;
                    com.bilibili.player.tangram.basic.d dVar = (com.bilibili.player.tangram.basic.d) this.L$0;
                    try {
                        ResultKt.throwOnFailure((Object) obj);
                        theseusPlayerQualityService3 = theseusPlayerQualityService2;
                        r9 = dVar;
                        cVar.j(theseusPlayerQualityService, false);
                        Unit unit = Unit.INSTANCE;
                        r9.i(theseusPlayerQualityService3);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        r10 = dVar;
                        th = th;
                        cVar.j(theseusPlayerQualityService, false);
                        throw th;
                    }
                }
                ResultKt.throwOnFailure((Object) obj);
                final TheseusPlayerQualityService theseusPlayerQualityService4 = this.this$0;
                obj = theseusPlayerQualityService4.f103774a;
                final CoroutineScope coroutineScope = this.$$this$launch;
                obj.h(theseusPlayerQualityService4);
                try {
                    com.bilibili.ship.theseus.united.page.screenstate.c cVar2 = theseusPlayerQualityService4.f103784l;
                    cVar2.j(theseusPlayerQualityService4, true);
                    try {
                        TheseusFloatLayerService theseusFloatLayerService = theseusPlayerQualityService4.f103785m;
                        AIEnhancedQualityInfoUIComponent aIEnhancedQualityInfoUIComponent = new AIEnhancedQualityInfoUIComponent(new Function0(theseusPlayerQualityService4, coroutineScope) { // from class: com.bilibili.ship.theseus.united.page.videoquality.b0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final TheseusPlayerQualityService f103857a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final CoroutineScope f103858b;

                            {
                                this.f103857a = theseusPlayerQualityService4;
                                this.f103858b = coroutineScope;
                            }

                            public final Object invoke() {
                                return TheseusPlayerQualityService$showAIEnhancedDetail$1.AnonymousClass1.invokeSuspend$lambda$0$0$0(this.f103857a, this.f103858b);
                            }
                        }, new Function0(coroutineScope) { // from class: com.bilibili.ship.theseus.united.page.videoquality.c0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final CoroutineScope f103859a;

                            {
                                this.f103859a = coroutineScope;
                            }

                            public final Object invoke() {
                                return TheseusPlayerQualityService$showAIEnhancedDetail$1.AnonymousClass1.invokeSuspend$lambda$0$0$1(this.f103859a);
                            }
                        }, new ExposureEntry(com.bilibili.ship.theseus.united.report.a.f104837a, new Function0(theseusPlayerQualityService4) { // from class: com.bilibili.ship.theseus.united.page.videoquality.d0

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final TheseusPlayerQualityService f103861a;

                            {
                                this.f103861a = theseusPlayerQualityService4;
                            }

                            public final Object invoke() {
                                return TheseusPlayerQualityService$showAIEnhancedDetail$1.AnonymousClass1.invokeSuspend$lambda$0$0$2(this.f103861a);
                            }
                        }));
                        this.L$0 = obj;
                        this.L$1 = theseusPlayerQualityService4;
                        this.L$2 = cVar2;
                        this.L$3 = theseusPlayerQualityService4;
                        this.label = 1;
                        if (theseusFloatLayerService.i(aIEnhancedQualityInfoUIComponent, null, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        theseusPlayerQualityService3 = theseusPlayerQualityService4;
                        cVar = cVar2;
                        r9 = obj;
                        theseusPlayerQualityService = theseusPlayerQualityService4;
                        cVar.j(theseusPlayerQualityService, false);
                        Unit unit2 = Unit.INSTANCE;
                        r9.i(theseusPlayerQualityService3);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        theseusPlayerQualityService = theseusPlayerQualityService4;
                        cVar = cVar2;
                        theseusPlayerQualityService2 = theseusPlayerQualityService4;
                        r10 = obj;
                        cVar.j(theseusPlayerQualityService, false);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj.i(theseusPlayerQualityService4);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayerQualityService$showAIEnhancedDetail$1(TheseusPlayerQualityService theseusPlayerQualityService, Continuation<? super TheseusPlayerQualityService$showAIEnhancedDetail$1> continuation) {
        super(2, continuation);
        this.this$0 = theseusPlayerQualityService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TheseusPlayerQualityService$showAIEnhancedDetail$1 theseusPlayerQualityService$showAIEnhancedDetail$1 = new TheseusPlayerQualityService$showAIEnhancedDetail$1(this.this$0, continuation);
        theseusPlayerQualityService$showAIEnhancedDetail$1.L$0 = obj;
        return theseusPlayerQualityService$showAIEnhancedDetail$1;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            TheseusPlayerQualityService theseusPlayerQualityService = this.this$0;
            BackActionRepository backActionRepository = theseusPlayerQualityService.f103786n;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusPlayerQualityService, coroutineScope, null);
            this.label = 1;
            if (backActionRepository.a(anonymousClass1, this) == coroutine_suspended) {
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
