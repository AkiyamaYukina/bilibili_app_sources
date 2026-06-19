package com.bilibili.ship.theseus.ugc;

import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.page.comment.TheseusCommentService;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCCommentProvider$provideCommentData$1.class */
public final class UGCCommentProvider$provideCommentData$1 implements TheseusCommentService.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.ship.theseus.united.page.view.a f96217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewReply f96218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C8043a f96219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<Av0.a> f96220d;

    public UGCCommentProvider$provideCommentData$1(com.bilibili.ship.theseus.united.page.view.a aVar, ViewReply viewReply, C8043a c8043a, List<Av0.a> list) {
        this.f96217a = aVar;
        this.f96218b = viewReply;
        this.f96219c = c8043a;
        this.f96220d = list;
    }

    @Override // com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.d
    public final Flow<TheseusCommentService.d.b> a() {
        final com.bilibili.ship.theseus.united.page.view.a aVar = this.f96217a;
        final StateFlow<Long> stateFlow = aVar.f104038c;
        final List<Av0.a> list = this.f96220d;
        final ViewReply viewReply = this.f96218b;
        final C8043a c8043a = this.f96219c;
        return new Flow<TheseusCommentService.d.b>(stateFlow, viewReply, c8043a, aVar, list) { // from class: com.bilibili.ship.theseus.ugc.UGCCommentProvider$provideCommentData$1$commentConfigFlow$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f96221a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ViewReply f96222b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final C8043a f96223c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.page.view.a f96224d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final List f96225e;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCCommentProvider$provideCommentData$1$commentConfigFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCCommentProvider$provideCommentData$1$commentConfigFlow$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f96226a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ViewReply f96227b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final C8043a f96228c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final com.bilibili.ship.theseus.united.page.view.a f96229d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final List f96230e;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.UGCCommentProvider$provideCommentData$1$commentConfigFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCCommentProvider$provideCommentData$1$commentConfigFlow$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, ViewReply viewReply, C8043a c8043a, com.bilibili.ship.theseus.united.page.view.a aVar, List list) {
                    this.f96226a = flowCollector;
                    this.f96227b = viewReply;
                    this.f96228c = c8043a;
                    this.f96229d = aVar;
                    this.f96230e = list;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r15, kotlin.coroutines.Continuation r16) {
                    /*
                        Method dump skipped, instruction units count: 273
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.UGCCommentProvider$provideCommentData$1$commentConfigFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f96221a = stateFlow;
                this.f96222b = viewReply;
                this.f96223c = c8043a;
                this.f96224d = aVar;
                this.f96225e = list;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f96221a.collect(new AnonymousClass2(flowCollector, this.f96222b, this.f96223c, this.f96224d, this.f96225e), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
