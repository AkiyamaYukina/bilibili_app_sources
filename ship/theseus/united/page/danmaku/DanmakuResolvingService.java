package com.bilibili.ship.theseus.united.page.danmaku;

import M3.C2619t0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.C4496a;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.app.viewunite.v1.FragmentParam;
import com.bapis.bilibili.community.service.dm.v1.DanmuPlayerConfig;
import com.bapis.bilibili.community.service.dm.v1.DanmuPlayerViewConfig;
import com.bapis.bilibili.community.service.dm.v1.DmViewReply;
import com.bapis.bilibili.subtitle.SubtitleViewReply;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import java.util.Map;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.InteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.core.IInteractCoreService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService.class */
@StabilityInferred(parameters = 0)
public final class DanmakuResolvingService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final InteractLayerService.SubtitleKeyConfig f99420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DanmakuRefreshTriggerRepository f99421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.j f99422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AutoPlayService f99423f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final PlayViewUniteReply f99424g;

    @NotNull
    public final IPlayerSettingService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f99425i = LazyKt.lazy(new C2619t0(6));

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final com.bilibili.ship.theseus.united.player.mediaplay.c $masterPieceOffset;
        final Flow<Unit> $triggerFlow;
        final FragmentParam $viewProgressFragmentParam;
        int label;
        final DanmakuResolvingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$1$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final DanmakuResolvingService f99426a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final FragmentParam f99427b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final com.bilibili.ship.theseus.united.player.mediaplay.c f99428c;

            public a(DanmakuResolvingService danmakuResolvingService, FragmentParam fragmentParam, com.bilibili.ship.theseus.united.player.mediaplay.c cVar) {
                this.f99426a = danmakuResolvingService;
                this.f99427b = fragmentParam;
                this.f99428c = cVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                DanmakuResolvingService danmakuResolvingService = this.f99426a;
                IInteractLayerService.reloadViewProgress$default(danmakuResolvingService.f99419b, this.f99427b, Duration.getInWholeSeconds-impl(this.f99428c.f104512a), false, (Map) null, 12, (Object) null);
                danmakuResolvingService.f99419b.loadCommandPanel();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Flow<Unit> flow, DanmakuResolvingService danmakuResolvingService, FragmentParam fragmentParam, com.bilibili.ship.theseus.united.player.mediaplay.c cVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$triggerFlow = flow;
            this.this$0 = danmakuResolvingService;
            this.$viewProgressFragmentParam = fragmentParam;
            this.$masterPieceOffset = cVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$triggerFlow, this.this$0, this.$viewProgressFragmentParam, this.$masterPieceOffset, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Unit> flow = this.$triggerFlow;
                a aVar = new a(this.this$0, this.$viewProgressFragmentParam, this.$masterPieceOffset);
                this.label = 1;
                if (flow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final Video.DanmakuResolveParams $dmViewRequestParams;
        final Flow<Unit> $triggerFlow;
        int label;
        final DanmakuResolvingService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            final Video.DanmakuResolveParams $dmViewRequestParams;
            boolean Z$0;
            int label;
            final DanmakuResolvingService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$2$1$3, reason: invalid class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$2$1$3.class */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final Video.DanmakuResolveParams $dmViewRequestParams;
                final boolean $isDanmakuVisible;
                private Object L$0;
                int label;
                final DanmakuResolvingService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$2$1$3$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$2$1$3$1.class */
                public static final class C09741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final Deferred<DmViewReply> $dmViewDeferred;
                    final boolean $isDanmakuVisible;
                    int label;
                    final DanmakuResolvingService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09741(Deferred<DmViewReply> deferred, DanmakuResolvingService danmakuResolvingService, boolean z6, Continuation<? super C09741> continuation) {
                        super(2, continuation);
                        this.$dmViewDeferred = deferred;
                        this.this$0 = danmakuResolvingService;
                        this.$isDanmakuVisible = z6;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09741(this.$dmViewDeferred, this.this$0, this.$isDanmakuVisible, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        DmViewReply dmViewReply;
                        DanmuPlayerViewConfig playerConfig;
                        DanmuPlayerViewConfig playerConfig2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        try {
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                Deferred<DmViewReply> deferred = this.$dmViewDeferred;
                                this.label = 1;
                                Object objAwait = deferred.await(this);
                                obj = objAwait;
                                if (objAwait == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i7 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            dmViewReply = (DmViewReply) obj;
                        } catch (CancellationException e7) {
                            throw e7;
                        } catch (Exception e8) {
                            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-DanmakuResolvingService$2$1$3$1-invokeSuspend] ", C4496a.a("DmView request failed: ", e8.getMessage()), "DanmakuResolvingService$2$1$3$1-invokeSuspend", (Throwable) null);
                            dmViewReply = null;
                        }
                        if (dmViewReply == null) {
                            BLog.w("DanmakuResolvingService$2$1$3$1-invokeSuspend", "[theseus-united-DanmakuResolvingService$2$1$3$1-invokeSuspend] DmView reply is null!", (Throwable) null);
                        }
                        this.this$0.f99419b.setDmViewReply(dmViewReply);
                        DanmuPlayerConfig danmukuPlayerConfig = (dmViewReply == null || !dmViewReply.hasPlayerConfig() || (playerConfig = dmViewReply.getPlayerConfig()) == null || !playerConfig.hasDanmukuPlayerConfig() || (playerConfig2 = dmViewReply.getPlayerConfig()) == null) ? null : playerConfig2.getDanmukuPlayerConfig();
                        if (((Boolean) this.this$0.f99425i.getValue()).booleanValue() && !this.$isDanmakuVisible && danmukuPlayerConfig != null && !danmukuPlayerConfig.getPlayerDanmakuSwitchSave() && danmukuPlayerConfig.getPlayerDanmakuSwitch()) {
                            IInteractCoreService.hideDanmaku$default(this.this$0.f99419b, false, 1, (Object) null);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService$2$1$3$2, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/DanmakuResolvingService$2$1$3$2.class */
                public static final class C09752 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final Deferred<SubtitleViewReply> $subtitleDeferred;
                    int label;
                    final DanmakuResolvingService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C09752(Deferred<SubtitleViewReply> deferred, DanmakuResolvingService danmakuResolvingService, Continuation<? super C09752> continuation) {
                        super(2, continuation);
                        this.$subtitleDeferred = deferred;
                        this.this$0 = danmakuResolvingService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C09752(this.$subtitleDeferred, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        SubtitleViewReply subtitleViewReply;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        try {
                            if (i7 == 0) {
                                ResultKt.throwOnFailure(obj);
                                Deferred<SubtitleViewReply> deferred = this.$subtitleDeferred;
                                this.label = 1;
                                Object objAwait = deferred.await(this);
                                obj = objAwait;
                                if (objAwait == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i7 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            subtitleViewReply = (SubtitleViewReply) obj;
                        } catch (CancellationException e7) {
                            throw e7;
                        } catch (Exception e8) {
                            com.bilibili.bangumi.logic.page.detail.service.f.a("[theseus-united-DanmakuResolvingService$2$1$3$2-invokeSuspend] ", C4496a.a("Subtitle API failed: ", e8.getMessage()), "DanmakuResolvingService$2$1$3$2-invokeSuspend", (Throwable) null);
                            subtitleViewReply = null;
                        }
                        this.this$0.f99419b.setSubtitleReply(subtitleViewReply);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(Video.DanmakuResolveParams danmakuResolveParams, DanmakuResolvingService danmakuResolvingService, boolean z6, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.$dmViewRequestParams = danmakuResolveParams;
                    this.this$0 = danmakuResolvingService;
                    this.$isDanmakuVisible = z6;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$dmViewRequestParams, this.this$0, this.$isDanmakuVisible, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Deferred deferredAsync$default = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DanmakuResolvingService$2$1$3$dmViewDeferred$1(this.$dmViewRequestParams, null), 3, (Object) null);
                    Deferred deferredAsync$default2 = BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new DanmakuResolvingService$2$1$3$subtitleDeferred$1(this.$dmViewRequestParams, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09741(deferredAsync$default, this.this$0, this.$isDanmakuVisible, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C09752(deferredAsync$default2, this.this$0, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DanmakuResolvingService danmakuResolvingService, Video.DanmakuResolveParams danmakuResolveParams, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = danmakuResolvingService;
                this.$dmViewRequestParams = danmakuResolveParams;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$dmViewRequestParams, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0158  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
            /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 515
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.danmaku.DanmakuResolvingService.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Flow<Unit> flow, DanmakuResolvingService danmakuResolvingService, Video.DanmakuResolveParams danmakuResolveParams, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$triggerFlow = flow;
            this.this$0 = danmakuResolvingService;
            this.$dmViewRequestParams = danmakuResolveParams;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$triggerFlow, this.this$0, this.$dmViewRequestParams, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Unit> flow = this.$triggerFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$dmViewRequestParams, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
    public DanmakuResolvingService(@NotNull CoroutineScope coroutineScope, @NotNull IInteractLayerService iInteractLayerService, @NotNull InteractLayerService.SubtitleKeyConfig subtitleKeyConfig, @NotNull DanmakuRefreshTriggerRepository danmakuRefreshTriggerRepository, @NotNull com.bilibili.ship.theseus.keel.player.j jVar, @NotNull AutoPlayService autoPlayService, @NotNull PlayViewUniteReply playViewUniteReply, @NotNull IPlayerSettingService iPlayerSettingService, @Nullable Video.DanmakuResolveParams danmakuResolveParams, @Nullable FragmentParam fragmentParam, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.c cVar) {
        this.f99418a = coroutineScope;
        this.f99419b = iInteractLayerService;
        this.f99420c = subtitleKeyConfig;
        this.f99421d = danmakuRefreshTriggerRepository;
        this.f99422e = jVar;
        this.f99423f = autoPlayService;
        this.f99424g = playViewUniteReply;
        this.h = iPlayerSettingService;
        iInteractLayerService.putSubtitleKeyConfig(subtitleKeyConfig);
        Flow flow = FlowKt.flow(new DanmakuResolvingService$triggerFlow$1(this, null));
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(flow, this, fragmentParam, cVar, null), 3, (Object) null);
        if (danmakuResolveParams != null) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(flow, this, danmakuResolveParams, null), 3, (Object) null);
        } else {
            BLog.i("DanmakuResolvingService-<init>", "[theseus-united-DanmakuResolvingService-<init>] DmView params null.");
        }
    }
}
