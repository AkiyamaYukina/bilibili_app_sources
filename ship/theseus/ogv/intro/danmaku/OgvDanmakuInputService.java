package com.bilibili.ship.theseus.ogv.intro.danmaku;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.section.bean.EpisodeRights;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/danmaku/OgvDanmakuInputService.class */
@StabilityInferred(parameters = 0)
public final class OgvDanmakuInputService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSeason f92368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f92369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DanmakuCompoundRepository f92370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f92371d;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.danmaku.OgvDanmakuInputService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/danmaku/OgvDanmakuInputService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvDanmakuInputService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.danmaku.OgvDanmakuInputService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/danmaku/OgvDanmakuInputService$1$1.class */
        public static final class C06921 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final OgvDanmakuInputService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06921(OgvDanmakuInputService ogvDanmakuInputService, Continuation<? super C06921> continuation) {
                super(2, continuation);
                this.this$0 = ogvDanmakuInputService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06921 c06921 = new C06921(this.this$0, continuation);
                c06921.L$0 = obj;
                return c06921;
            }

            public final Object invoke(OgvEpisode ogvEpisode, Continuation<? super Unit> continuation) {
                return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                EpisodeRights episodeRightsE;
                OgvDanmakuInputService ogvDanmakuInputService;
                DanmakuCompoundRepository danmakuCompoundRepository;
                DanmakuCompoundRepository danmakuCompoundRepository2;
                OgvDanmakuInputService ogvDanmakuInputService2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvEpisode ogvEpisode = (OgvEpisode) this.L$0;
                    OgvSeason ogvSeason = this.this$0.f92368a;
                    if (!(ogvEpisode == null && ogvSeason.f94455g.d()) && ((ogvEpisode == null || (episodeRightsE = ogvEpisode.e()) == null || !episodeRightsE.d()) && (this.this$0.f92368a.f94461n.f94503b || ogvEpisode != null))) {
                        return Unit.INSTANCE;
                    }
                    ogvDanmakuInputService = this.this$0;
                    danmakuCompoundRepository = ogvDanmakuInputService.f92370c;
                    danmakuCompoundRepository.f99382s.add(ogvDanmakuInputService);
                    danmakuCompoundRepository.f99380q.setValue(Boolean.valueOf(!danmakuCompoundRepository.f99382s.isEmpty()));
                    try {
                        this.L$0 = danmakuCompoundRepository;
                        this.L$1 = ogvDanmakuInputService;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th) {
                        th = th;
                        danmakuCompoundRepository2 = danmakuCompoundRepository;
                        ogvDanmakuInputService2 = ogvDanmakuInputService;
                        danmakuCompoundRepository2.f99382s.remove(ogvDanmakuInputService2);
                        danmakuCompoundRepository2.f99380q.setValue(Boolean.valueOf(!danmakuCompoundRepository2.f99382s.isEmpty()));
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    OgvDanmakuInputService ogvDanmakuInputService3 = (OgvDanmakuInputService) this.L$1;
                    danmakuCompoundRepository = (DanmakuCompoundRepository) this.L$0;
                    ogvDanmakuInputService2 = ogvDanmakuInputService3;
                    danmakuCompoundRepository2 = danmakuCompoundRepository;
                    try {
                        ResultKt.throwOnFailure(obj);
                        ogvDanmakuInputService = ogvDanmakuInputService3;
                    } catch (Throwable th2) {
                        th = th2;
                        danmakuCompoundRepository2.f99382s.remove(ogvDanmakuInputService2);
                        danmakuCompoundRepository2.f99380q.setValue(Boolean.valueOf(!danmakuCompoundRepository2.f99382s.isEmpty()));
                        throw th;
                    }
                }
                ogvDanmakuInputService2 = ogvDanmakuInputService;
                danmakuCompoundRepository2 = danmakuCompoundRepository;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OgvDanmakuInputService ogvDanmakuInputService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ogvDanmakuInputService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvDanmakuInputService ogvDanmakuInputService = this.this$0;
                OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = ogvDanmakuInputService.f92369b.f92119v;
                C06921 c06921 = new C06921(ogvDanmakuInputService, null);
                this.label = 1;
                if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, c06921, this) == coroutine_suspended) {
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

    @Inject
    public OgvDanmakuInputService(@NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull CoroutineScope coroutineScope) {
        this.f92368a = ogvSeason;
        this.f92369b = ogvCurrentEpisodeRepository;
        this.f92370c = danmakuCompoundRepository;
        this.f92371d = coroutineScope;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
