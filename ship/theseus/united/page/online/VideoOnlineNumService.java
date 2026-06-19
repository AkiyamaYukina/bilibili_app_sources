package com.bilibili.ship.theseus.united.page.online;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.paging.Y;
import com.bapis.bilibili.app.playeronline.v1.PlayerOnlineReply;
import com.bilibili.bililive.room.biz.medal.e;
import com.bilibili.lib.performance.EntryPointKt;
import com.bilibili.ship.theseus.keel.player.j;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNumService.class */
@StabilityInferred(parameters = 0)
public final class VideoOnlineNumService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Lifecycle f102101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final j f102102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.toolbar.j f102103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final a f102104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public IInteractLayerService f102105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f102106g = 60000;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.online.VideoOnlineNumService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNumService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IInteractLayerService $interactLayerService;
        int label;
        final VideoOnlineNumService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.online.VideoOnlineNumService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNumService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final IInteractLayerService $interactLayerService;
            final Ref.BooleanRef $isNewPlay;
            private Object L$0;
            int label;
            final VideoOnlineNumService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.online.VideoOnlineNumService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNumService$2$1$1.class */
            public static final class C10761 extends SuspendLambda implements Function3<Long, Boolean, Continuation<? super Boolean>, Object> {
                boolean Z$0;
                int label;

                public C10761(Continuation<? super C10761> continuation) {
                    super(3, continuation);
                }

                public final Object invoke(long j7, boolean z6, Continuation<? super Boolean> continuation) {
                    C10761 c10761 = new C10761(continuation);
                    c10761.Z$0 = z6;
                    return c10761.invokeSuspend(Unit.INSTANCE);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return invoke(((Number) obj).longValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(this.Z$0);
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.online.VideoOnlineNumService$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/online/VideoOnlineNumService$2$1$2.class */
            public static final class C10772 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                final CoroutineScope $$this$repeatOnLifecycle;
                final IInteractLayerService $interactLayerService;
                final Ref.BooleanRef $isNewPlay;
                long J$0;
                long J$1;
                boolean Z$0;
                int label;
                final VideoOnlineNumService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10772(VideoOnlineNumService videoOnlineNumService, IInteractLayerService iInteractLayerService, CoroutineScope coroutineScope, Ref.BooleanRef booleanRef, Continuation<? super C10772> continuation) {
                    super(2, continuation);
                    this.this$0 = videoOnlineNumService;
                    this.$interactLayerService = iInteractLayerService;
                    this.$$this$repeatOnLifecycle = coroutineScope;
                    this.$isNewPlay = booleanRef;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C10772 c10772 = new C10772(this.this$0, this.$interactLayerService, this.$$this$repeatOnLifecycle, this.$isNewPlay, continuation);
                    c10772.Z$0 = ((Boolean) obj).booleanValue();
                    return c10772;
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
                }

                public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                    return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x00cf, code lost:
                
                    if (r0 < 0) goto L36;
                 */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0141  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0147  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x013e -> B:23:0x00d5). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 363
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.online.VideoOnlineNumService.AnonymousClass2.AnonymousClass1.C10772.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VideoOnlineNumService videoOnlineNumService, IInteractLayerService iInteractLayerService, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = videoOnlineNumService;
                this.$interactLayerService = iInteractLayerService;
                this.$isNewPlay = booleanRef;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$interactLayerService, this.$isNewPlay, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
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
                    VideoOnlineNumService videoOnlineNumService = this.this$0;
                    Flow flowCombine = FlowKt.combine(videoOnlineNumService.f102103d.f103406k, videoOnlineNumService.f102104e.f102110c, new C10761(null));
                    C10772 c10772 = new C10772(this.this$0, this.$interactLayerService, coroutineScope, this.$isNewPlay, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowCombine, c10772, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VideoOnlineNumService videoOnlineNumService, IInteractLayerService iInteractLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = videoOnlineNumService;
            this.$interactLayerService = iInteractLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$interactLayerService, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                Ref.BooleanRef booleanRefA = Y.a(obj);
                booleanRefA.element = true;
                VideoOnlineNumService videoOnlineNumService = this.this$0;
                Lifecycle lifecycle = videoOnlineNumService.f102101b;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(videoOnlineNumService, this.$interactLayerService, booleanRefA, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
    public VideoOnlineNumService(@NotNull CoroutineScope coroutineScope, @NotNull Lifecycle lifecycle, @NotNull j jVar, @NotNull com.bilibili.ship.theseus.united.page.toolbar.j jVar2, @NotNull IInteractLayerService iInteractLayerService, @NotNull a aVar) {
        Job job;
        this.f102100a = coroutineScope;
        this.f102101b = lifecycle;
        this.f102102c = jVar;
        this.f102103d = jVar2;
        this.f102104e = aVar;
        this.f102105f = iInteractLayerService;
        if (EntryPointKt.getMemleakOptEnable() && (job = coroutineScope.getCoroutineContext().get(Job.Key)) != null) {
            job.invokeOnCompletion(new e(this, 1));
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, iInteractLayerService, null), 3, (Object) null);
    }

    public static final void a(VideoOnlineNumService videoOnlineNumService, long j7, long j8, PlayerOnlineReply playerOnlineReply) {
        videoOnlineNumService.getClass();
        videoOnlineNumService.f102106g = playerOnlineReply.getSecNext() > 0 ? playerOnlineReply.getSecNext() * ((long) 1000) : 60000L;
        a aVar = videoOnlineNumService.f102104e;
        String str = aVar.c().f102114b;
        String totalText = playerOnlineReply.getTotalText();
        String str2 = str;
        if (totalText != null) {
            str2 = StringsKt.isBlank(totalText) ? str : totalText;
        }
        boolean sdmShow = playerOnlineReply.getSdmShow();
        String sdmText = playerOnlineReply.getSdmText();
        aVar.f102111d.setValue(new b(playerOnlineReply.getTotalNumber(), str2, ((b) aVar.f102112e.getValue()).f102115c, playerOnlineReply.getTotalNumberText(), playerOnlineReply.getBottomShow()));
        IInteractLayerService iInteractLayerService = videoOnlineNumService.f102105f;
        if (iInteractLayerService != null) {
            iInteractLayerService.setOnlineInfo(Boolean.valueOf(aVar.a()), j7, j8, str2, (String) null);
            if (sdmShow) {
                iInteractLayerService.sendOnlineInfoDanmaku(j7, j8, sdmText);
            }
        }
    }
}
