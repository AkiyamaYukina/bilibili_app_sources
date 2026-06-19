package com.bilibili.ship.theseus.ogv.intro.danmaku;

import Ju0.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuCompoundRepository;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
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
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/danmaku/DanmakuDisabledForDrm.class */
@StabilityInferred(parameters = 1)
public final class DanmakuDisabledForDrm {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.danmaku.DanmakuDisabledForDrm$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/danmaku/DanmakuDisabledForDrm$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final BiliAccounts $biliAccounts;
        final DanmakuCompoundRepository $danmakuCompoundRepository;
        final EpisodeExtraInfoRepository $extraInfoRepository;
        int label;
        final DanmakuDisabledForDrm this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.intro.danmaku.DanmakuDisabledForDrm$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/danmaku/DanmakuDisabledForDrm$1$1.class */
        public static final class C06911 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            final BiliAccounts $biliAccounts;
            final DanmakuCompoundRepository $danmakuCompoundRepository;
            Object L$0;
            Object L$1;
            int label;
            final DanmakuDisabledForDrm this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06911(BiliAccounts biliAccounts, DanmakuCompoundRepository danmakuCompoundRepository, DanmakuDisabledForDrm danmakuDisabledForDrm, Continuation<? super C06911> continuation) {
                super(2, continuation);
                this.$biliAccounts = biliAccounts;
                this.$danmakuCompoundRepository = danmakuCompoundRepository;
                this.this$0 = danmakuDisabledForDrm;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06911 c06911 = new C06911(this.$biliAccounts, this.$danmakuCompoundRepository, this.this$0, continuation);
                c06911.L$0 = obj;
                return c06911;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                DanmakuCompoundRepository danmakuCompoundRepository;
                DanmakuDisabledForDrm danmakuDisabledForDrm;
                DanmakuDisabledForDrm danmakuDisabledForDrm2;
                DanmakuDisabledForDrm danmakuDisabledForDrm3;
                DanmakuCompoundRepository danmakuCompoundRepository2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ExtraInfo extraInfo = (ExtraInfo) this.L$0;
                    if (this.$biliAccounts.isLogin() || extraInfo == null || !((Boolean) a.f11694a.a(extraInfo)).booleanValue()) {
                        return Unit.INSTANCE;
                    }
                    danmakuCompoundRepository = this.$danmakuCompoundRepository;
                    DanmakuDisabledForDrm danmakuDisabledForDrm4 = this.this$0;
                    danmakuCompoundRepository.f99382s.add(danmakuDisabledForDrm4);
                    danmakuCompoundRepository.f99380q.setValue(Boolean.valueOf(!danmakuCompoundRepository.f99382s.isEmpty()));
                    try {
                        this.L$0 = danmakuCompoundRepository;
                        this.L$1 = danmakuDisabledForDrm4;
                        this.label = 1;
                        if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        danmakuDisabledForDrm2 = danmakuDisabledForDrm4;
                    } catch (Throwable th) {
                        th = th;
                        danmakuDisabledForDrm = danmakuDisabledForDrm4;
                        danmakuCompoundRepository.f99382s.remove(danmakuDisabledForDrm);
                        danmakuCompoundRepository.f99380q.setValue(Boolean.valueOf(!danmakuCompoundRepository.f99382s.isEmpty()));
                        throw th;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    danmakuDisabledForDrm2 = (DanmakuDisabledForDrm) this.L$1;
                    DanmakuCompoundRepository danmakuCompoundRepository3 = (DanmakuCompoundRepository) this.L$0;
                    danmakuDisabledForDrm3 = danmakuDisabledForDrm2;
                    danmakuCompoundRepository2 = danmakuCompoundRepository3;
                    try {
                        ResultKt.throwOnFailure(obj);
                        danmakuCompoundRepository = danmakuCompoundRepository3;
                    } catch (Throwable th2) {
                        danmakuDisabledForDrm = danmakuDisabledForDrm3;
                        danmakuCompoundRepository = danmakuCompoundRepository2;
                        th = th2;
                        danmakuCompoundRepository.f99382s.remove(danmakuDisabledForDrm);
                        danmakuCompoundRepository.f99380q.setValue(Boolean.valueOf(!danmakuCompoundRepository.f99382s.isEmpty()));
                        throw th;
                    }
                }
                danmakuDisabledForDrm3 = danmakuDisabledForDrm2;
                danmakuCompoundRepository2 = danmakuCompoundRepository;
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(EpisodeExtraInfoRepository episodeExtraInfoRepository, BiliAccounts biliAccounts, DanmakuCompoundRepository danmakuCompoundRepository, DanmakuDisabledForDrm danmakuDisabledForDrm, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$extraInfoRepository = episodeExtraInfoRepository;
            this.$biliAccounts = biliAccounts;
            this.$danmakuCompoundRepository = danmakuCompoundRepository;
            this.this$0 = danmakuDisabledForDrm;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$extraInfoRepository, this.$biliAccounts, this.$danmakuCompoundRepository, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ExtraInfo> stateFlow = this.$extraInfoRepository.f99566b;
                C06911 c06911 = new C06911(this.$biliAccounts, this.$danmakuCompoundRepository, this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c06911, this) == coroutine_suspended) {
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
    public DanmakuDisabledForDrm(@NotNull CoroutineScope coroutineScope, @NotNull BiliAccounts biliAccounts, @NotNull DanmakuCompoundRepository danmakuCompoundRepository, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository) {
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(episodeExtraInfoRepository, biliAccounts, danmakuCompoundRepository, this, null), 3, (Object) null);
    }
}
