package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseCommentModule$provideCommentData$1.class */
public final class CheeseCommentModule$provideCommentData$1 implements TheseusCommentService.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheesePlayRepository f90340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f90341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.a f90342c;

    public CheeseCommentModule$provideCommentData$1(CheesePlayRepository cheesePlayRepository, CoroutineScope coroutineScope, com.bilibili.ship.theseus.united.page.view.a aVar) {
        this.f90340a = cheesePlayRepository;
        this.f90341b = coroutineScope;
        this.f90342c = aVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.d
    public final Flow<TheseusCommentService.d.b> a() {
        final StateFlow stateFlowStateIn = FlowKt.stateIn(FlowKt.filterNotNull(this.f90340a.f90695y), this.f90341b, SharingStarted.Companion.getEagerly(), (Object) null);
        final com.bilibili.ship.theseus.united.page.view.a aVar = this.f90342c;
        return new Flow<TheseusCommentService.d.b>(stateFlowStateIn, aVar) { // from class: com.bilibili.ship.theseus.cheese.biz.modules.CheeseCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f90343a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.view.a f90344b;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.CheeseCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f90345a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.view.a f90346b;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.CheeseCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/CheeseCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2$1.class */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    Object result;
                    final AnonymousClass2 this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(AnonymousClass2 anonymousClass2, Continuation continuation) {
                        super(continuation);
                        this.this$0 = anonymousClass2;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, com.bilibili.ship.theseus.united.page.view.a aVar) {
                    this.f90345a = flowCollector;
                    this.f90346b = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r15, kotlin.coroutines.Continuation r16) {
                    /*
                        Method dump skipped, instruction units count: 243
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.modules.CheeseCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f90343a = stateFlowStateIn;
                this.f90344b = aVar;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f90343a.collect(new AnonymousClass2(flowCollector, this.f90344b), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
