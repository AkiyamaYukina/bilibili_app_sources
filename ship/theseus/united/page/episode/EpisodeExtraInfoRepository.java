package com.bilibili.ship.theseus.united.page.episode;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.player.tangram.playercore.u;
import com.bilibili.ship.theseus.keel.player.j;
import javax.inject.Inject;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/episode/EpisodeExtraInfoRepository.class */
@StabilityInferred(parameters = 0)
public final class EpisodeExtraInfoRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MutableState f99565a = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final StateFlow<ExtraInfo> f99566b;

    @Inject
    public EpisodeExtraInfoRepository(@NotNull j jVar, @NotNull CoroutineScope coroutineScope) {
        final Flow<u> flowB = jVar.b();
        this.f99566b = FlowKt.stateIn(FlowKt.onEach(new Flow<ExtraInfo>(flowB) { // from class: com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Flow f99567a;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/episode/EpisodeExtraInfoRepository$special$$inlined$map$1$2.class */
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final FlowCollector f99568a;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/episode/EpisodeExtraInfoRepository$special$$inlined$map$1$2$1.class */
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

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.f99568a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = r7
                        boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L29
                        r0 = r7
                        com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1$2$1 r0 = (com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        r9 = r0
                        r0 = r9
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L29
                        r0 = r9
                        r1 = r8
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        int r1 = r1 + r2
                        r0.label = r1
                        r0 = r9
                        r7 = r0
                        goto L33
                    L29:
                        com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1$2$1 r0 = new com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1$2$1
                        r1 = r0
                        r2 = r5
                        r3 = r7
                        r1.<init>(r2, r3)
                        r7 = r0
                    L33:
                        r0 = r7
                        java.lang.Object r0 = r0.result
                        r10 = r0
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        r9 = r0
                        r0 = r7
                        int r0 = r0.label
                        r8 = r0
                        r0 = r8
                        if (r0 == 0) goto L5e
                        r0 = r8
                        r1 = 1
                        if (r0 != r1) goto L54
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        goto L97
                    L54:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        r1 = r0
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r0
                    L5e:
                        r0 = r10
                        kotlin.ResultKt.throwOnFailure(r0)
                        r0 = r6
                        com.bilibili.player.tangram.playercore.u r0 = (com.bilibili.player.tangram.playercore.u) r0
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L7d
                        r0 = r6
                        com.bilibili.lib.media.resource.MediaResource r0 = r0.f79460c
                        r6 = r0
                        r0 = r6
                        if (r0 == 0) goto L7d
                        r0 = r6
                        com.bilibili.lib.media.resource.ExtraInfo r0 = r0.getExtraInfo()
                        r6 = r0
                        goto L7f
                    L7d:
                        r0 = 0
                        r6 = r0
                    L7f:
                        r0 = r7
                        r1 = 1
                        r0.label = r1
                        r0 = r5
                        kotlinx.coroutines.flow.FlowCollector r0 = r0.f99568a
                        r1 = r6
                        r2 = r7
                        java.lang.Object r0 = r0.emit(r1, r2)
                        r1 = r9
                        if (r0 != r1) goto L97
                        r0 = r9
                        return r0
                    L97:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            {
                this.f99567a = flowB;
            }

            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = this.f99567a.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        }, new EpisodeExtraInfoRepository$playViewExtraFlow$2(this, null)), coroutineScope, SharingStarted.Companion.getEagerly(), (Object) null);
    }

    @Nullable
    public final ExtraInfo a() {
        return (ExtraInfo) this.f99565a.getValue();
    }
}
