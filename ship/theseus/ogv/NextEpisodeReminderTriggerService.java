package com.bilibili.ship.theseus.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.player.playselect.PlaybackMode;
import com.bilibili.ship.theseus.ogv.playviewextra.ViewInfoClipInfo;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/NextEpisodeReminderTriggerService.class */
@StabilityInferred(parameters = 0)
public final class NextEpisodeReminderTriggerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f91238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f91239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C6151c f91240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final ViewInfoClipInfo f91241e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.NextEpisodeReminderTriggerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/NextEpisodeReminderTriggerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NextEpisodeReminderTriggerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.NextEpisodeReminderTriggerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/NextEpisodeReminderTriggerService$1$1.class */
        public static final class C06751 extends SuspendLambda implements Function2<Duration, Continuation<? super Unit>, Object> {
            long J$0;
            int label;
            final NextEpisodeReminderTriggerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06751(NextEpisodeReminderTriggerService nextEpisodeReminderTriggerService, Continuation<? super C06751> continuation) {
                super(2, continuation);
                this.this$0 = nextEpisodeReminderTriggerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C06751 c06751 = new C06751(this.this$0, continuation);
                c06751.J$0 = ((Duration) obj).unbox-impl();
                return c06751;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return m8928invokeVtjQ1oo(((Duration) obj).unbox-impl(), (Continuation) obj2);
            }

            /* JADX INFO: renamed from: invoke-VtjQ1oo, reason: not valid java name */
            public final Object m8928invokeVtjQ1oo(long j7, Continuation<? super Unit> continuation) {
                return create(Duration.box-impl(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j7 = this.J$0;
                    if (this.this$0.f91238b.getInt(PlaybackMode.KEY_PLAY_ACTION_MODE_AFTER_ENDED, 0) == 0) {
                        NextEpisodeReminderTriggerService nextEpisodeReminderTriggerService = this.this$0;
                        this.label = 1;
                        Duration durationQ = nextEpisodeReminderTriggerService.f91239c.q();
                        if (durationQ != null) {
                            long j8 = durationQ.unbox-impl();
                            long j9 = j8;
                            if (nextEpisodeReminderTriggerService.f91238b.getBoolean("SkipTitlesAndEndings", true)) {
                                ViewInfoClipInfo viewInfoClipInfo = nextEpisodeReminderTriggerService.f91241e;
                                j9 = j8;
                                if (viewInfoClipInfo != null) {
                                    Duration.Companion companion = Duration.Companion;
                                    j9 = j8;
                                    if (Duration.compareTo-LRDsOJo(viewInfoClipInfo.f94379c, Duration.minus-LRDsOJo(j8, DurationKt.toDuration(1, DurationUnit.SECONDS))) > 0) {
                                        j9 = viewInfoClipInfo.f94378b;
                                    }
                                }
                            }
                            Duration.Companion companion2 = Duration.Companion;
                            DurationUnit durationUnit = DurationUnit.SECONDS;
                            long j10 = Duration.minus-LRDsOJo(j9, DurationKt.toDuration(5.5d, durationUnit));
                            if (Duration.box-impl(j7).compareTo(Duration.box-impl(Duration.minus-LRDsOJo(j9, DurationKt.toDuration(4.5d, durationUnit)))) > 0 || Duration.box-impl(j7).compareTo(Duration.box-impl(j10)) < 0) {
                                obj2 = Unit.INSTANCE;
                            } else {
                                C6151c c6151c = nextEpisodeReminderTriggerService.f91240d;
                                c6151c.getClass();
                                obj2 = Unit.INSTANCE;
                                Object objEmit = c6151c.f91656a.emit(obj2, this);
                                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    objEmit = obj2;
                                }
                                if (objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                    obj2 = objEmit;
                                }
                            }
                        } else {
                            obj2 = Unit.INSTANCE;
                        }
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NextEpisodeReminderTriggerService nextEpisodeReminderTriggerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = nextEpisodeReminderTriggerService;
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
                Flow<Duration> flowJ = this.this$0.f91239c.J();
                C06751 c06751 = new C06751(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowJ, c06751, this) == coroutine_suspended) {
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
    public NextEpisodeReminderTriggerService(@NotNull CoroutineScope coroutineScope, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull C6151c c6151c, @Nullable ViewInfoClipInfo viewInfoClipInfo) {
        this.f91237a = coroutineScope;
        this.f91238b = iPlayerSettingService;
        this.f91239c = jVar;
        this.f91240d = c6151c;
        this.f91241e = viewInfoClipInfo;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
