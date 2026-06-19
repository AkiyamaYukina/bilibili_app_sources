package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvCommentModule$provideCommentData$1.class */
public final class OgvCommentModule$provideCommentData$1 implements TheseusCommentService.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvCurrentEpisodeRepository f91252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f91253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OgvSeason f91254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ship.theseus.keel.player.h f91255d;

    public OgvCommentModule$provideCommentData$1(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, CoroutineScope coroutineScope, OgvSeason ogvSeason, com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f91252a = ogvCurrentEpisodeRepository;
        this.f91253b = coroutineScope;
        this.f91254c = ogvSeason;
        this.f91255d = hVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.comment.TheseusCommentService.d
    public final Flow<TheseusCommentService.d.b> a() {
        final StateFlow stateFlowStateIn = FlowKt.stateIn(FlowKt.filterNotNull(this.f91252a.f92119v), this.f91253b, SharingStarted.Companion.getEagerly(), (Object) null);
        final OgvSeason ogvSeason = this.f91254c;
        final com.bilibili.ship.theseus.keel.player.h hVar = this.f91255d;
        return new Flow<TheseusCommentService.d.b>(stateFlowStateIn, ogvSeason, hVar) { // from class: com.bilibili.ship.theseus.ogv.OgvCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final StateFlow f91256a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvSeason f91257b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.ship.theseus.keel.player.h f91258c;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f91259a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final OgvSeason f91260b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final com.bilibili.ship.theseus.keel.player.h f91261c;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.OgvCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/OgvCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector, OgvSeason ogvSeason, com.bilibili.ship.theseus.keel.player.h hVar) {
                    this.f91259a = flowCollector;
                    this.f91260b = ogvSeason;
                    this.f91261c = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r19, kotlin.coroutines.Continuation r20) {
                    /*
                        Method dump skipped, instruction units count: 327
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.OgvCommentModule$provideCommentData$1$commentConfigFlow$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f91256a = stateFlowStateIn;
                this.f91257b = ogvSeason;
                this.f91258c = hVar;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f91256a.collect(new AnonymousClass2(flowCollector, this.f91257b, this.f91258c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }
}
