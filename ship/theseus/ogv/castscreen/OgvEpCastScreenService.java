package com.bilibili.ship.theseus.ogv.castscreen;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService;
import ev0.InterfaceC7008a;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvEpCastScreenService.class */
@StabilityInferred(parameters = 1)
public final class OgvEpCastScreenService {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvEpCastScreenService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvEpCastScreenService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BusinessCastScreenService $castService;
        final OgvCurrentEpisodeRepository $currentEpRepo;
        final OgvEpisode $ep;
        final C8043a $extraVariadicsRepository;
        final InterfaceC7008a $scopeDriver;
        final OgvSeason $season;
        int label;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.castscreen.OgvEpCastScreenService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/castscreen/OgvEpCastScreenService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvEpisode f91668a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvSeason f91669b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final InterfaceC7008a f91670c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final C8043a f91671d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final OgvCurrentEpisodeRepository f91672e;

            public a(OgvEpisode ogvEpisode, OgvSeason ogvSeason, InterfaceC7008a interfaceC7008a, C8043a c8043a, OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository) {
                this.f91668a = ogvEpisode;
                this.f91669b = ogvSeason;
                this.f91670c = interfaceC7008a;
                this.f91671d = c8043a;
                this.f91672e = ogvCurrentEpisodeRepository;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0044  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(java.lang.Object r14, kotlin.coroutines.Continuation r15) {
                /*
                    r13 = this;
                    r0 = r14
                    com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService$a r0 = (com.bilibili.ship.theseus.united.page.castscreen.BusinessCastScreenService.a) r0
                    com.bilibili.lib.projection.internal.projectionitem.ProjectionItemData r0 = r0.f99102a
                    r15 = r0
                    r0 = r15
                    long r0 = r0.f63478e
                    r17 = r0
                    r0 = r13
                    com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r0 = r0.f91668a
                    r14 = r0
                    r0 = r17
                    r1 = r14
                    long r1 = r1.f93555a
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    r16 = r0
                    r0 = r16
                    if (r0 != 0) goto L44
                    r0 = r15
                    long r0 = r0.f63477d
                    r19 = r0
                    r0 = r19
                    r1 = r14
                    long r1 = r1.f93561g
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 != 0) goto L44
                    java.lang.String r0 = "[theseus-ogv-OgvEpCastScreenService$1$1-emit] "
                    r1 = r19
                    java.lang.String r2 = "cast screen item change but current ep is same as change item! cid:"
                    java.lang.String r1 = androidx.compose.foundation.text.selection.C3751q.a(r1, r2)
                    java.lang.String r2 = "OgvEpCastScreenService$1$1-emit"
                    defpackage.a.b(r0, r1, r2)
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    r14 = r0
                    goto L9c
                L44:
                    r0 = r15
                    long r0 = r0.f63479f
                    r1 = r13
                    com.bilibili.ship.theseus.ogv.season.OgvSeason r1 = r1.f91669b
                    long r1 = r1.f94449a
                    int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                    if (r0 == 0) goto L81
                    r0 = r15
                    long r0 = r0.f63475b
                    r19 = r0
                    r0 = r15
                    long r0 = r0.f63477d
                    r17 = r0
                    r0 = r13
                    mv0.a r0 = r0.f91671d
                    mv0.b r0 = r0.a()
                    java.lang.String r0 = r0.f123881c
                    r14 = r0
                    r0 = r13
                    ev0.a r0 = r0.f91670c
                    r1 = r19
                    r2 = r17
                    r3 = 0
                    r4 = r14
                    r5 = 0
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    r9 = 490(0x1ea, float:6.87E-43)
                    ev0.InterfaceC7008a.e(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    goto L98
                L81:
                    r0 = r16
                    if (r0 == 0) goto L98
                    com.bilibili.ship.theseus.ogv.ep.ContinuingType r0 = com.bilibili.ship.theseus.ogv.ep.ContinuingType.NotContinuing
                    r14 = r0
                    r0 = r13
                    com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository r0 = r0.f91672e
                    r1 = r17
                    r2 = r14
                    r3 = 0
                    boolean r0 = r0.i(r1, r2, r3)
                    java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                L98:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    r14 = r0
                L9c:
                    r0 = r14
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.castscreen.OgvEpCastScreenService.AnonymousClass1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BusinessCastScreenService businessCastScreenService, OgvEpisode ogvEpisode, OgvSeason ogvSeason, InterfaceC7008a interfaceC7008a, C8043a c8043a, OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$castService = businessCastScreenService;
            this.$ep = ogvEpisode;
            this.$season = ogvSeason;
            this.$scopeDriver = interfaceC7008a;
            this.$extraVariadicsRepository = c8043a;
            this.$currentEpRepo = ogvCurrentEpisodeRepository;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$castService, this.$ep, this.$season, this.$scopeDriver, this.$extraVariadicsRepository, this.$currentEpRepo, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow<BusinessCastScreenService.a> sharedFlow = this.$castService.f99098o;
                a aVar = new a(this.$ep, this.$season, this.$scopeDriver, this.$extraVariadicsRepository, this.$currentEpRepo);
                this.label = 1;
                if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @Inject
    public OgvEpCastScreenService(@NotNull CoroutineScope coroutineScope, @NotNull OgvSeason ogvSeason, @NotNull OgvEpisode ogvEpisode, @NotNull InterfaceC7008a interfaceC7008a, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull BusinessCastScreenService businessCastScreenService, @NotNull C8043a c8043a) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(businessCastScreenService, ogvEpisode, ogvSeason, interfaceC7008a, c8043a, ogvCurrentEpisodeRepository, null), 3, (Object) null);
    }
}
