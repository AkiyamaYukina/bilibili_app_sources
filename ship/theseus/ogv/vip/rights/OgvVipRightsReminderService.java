package com.bilibili.ship.theseus.ogv.vip.rights;

import Fr0.o;
import U80.J;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import com.alipay.sdk.app.PayTask;
import com.bilibili.bililive.biz.interactions.popularredpacket.view.record.i;
import com.bilibili.lib.media.resource.ExtraInfo;
import com.bilibili.player.tangram.basic.c;
import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ogv.playercontainer.OgvActionDelegate;
import com.bilibili.ship.theseus.ogv.playercontainer.OgvSubtitleBusinessService;
import com.bilibili.ship.theseus.ogv.playviewextra.PlayerToasts;
import com.bilibili.ship.theseus.ogv.viewingduration.ViewingDurationService;
import com.bilibili.ship.theseus.united.page.episode.EpisodeExtraInfoRepository;
import com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualityService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;
import vv0.n;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService.class */
@StabilityInferred(parameters = 0)
public final class OgvVipRightsReminderService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f94884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f94885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IToastService f94886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f94887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f94888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final o f94889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f94890g;

    @NotNull
    public final PageReportService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ViewingDurationService f94891i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final h f94892j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final OgvSubtitleBusinessService f94893k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final DateFormat f94894l = SimpleDateFormat.getDateInstance();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableState f94895m;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final EpisodeExtraInfoRepository $episodeExtraInfoRepository;
        int label;
        final OgvVipRightsReminderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1$1.class */
        public static final class C07581 extends SuspendLambda implements Function2<ExtraInfo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvVipRightsReminderService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1$1$1.class */
            public static final class C07591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final ExtraInfo $extraInfo;
                private Object L$0;
                int label;
                final OgvVipRightsReminderService this$0;

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1$1$1$1.class */
                public static final class C07601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ExtraInfo $extraInfo;
                    int label;
                    final OgvVipRightsReminderService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C07601(ExtraInfo extraInfo, OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super C07601> continuation) {
                        super(2, continuation);
                        this.$extraInfo = extraInfo;
                        this.this$0 = ogvVipRightsReminderService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C07601(this.$extraInfo, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        PlayerToasts playerToasts;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ExtraInfo extraInfo = this.$extraInfo;
                            PlayerToastVo playerToastVoD = (extraInfo == null || (playerToasts = (PlayerToasts) Ju0.a.f11704l.a(extraInfo)) == null) ? null : playerToasts.d();
                            if (playerToastVoD != null) {
                                OgvVipRightsReminderService ogvVipRightsReminderService = this.this$0;
                                this.label = 1;
                                if (OgvVipRightsReminderService.c(ogvVipRightsReminderService, playerToastVoD, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1$1$1$2, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1$1$1$2.class */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ExtraInfo $extraInfo;
                    int label;
                    final OgvVipRightsReminderService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(ExtraInfo extraInfo, OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$extraInfo = extraInfo;
                        this.this$0 = ogvVipRightsReminderService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$extraInfo, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        PlayerToasts playerToasts;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ExtraInfo extraInfo = this.$extraInfo;
                            PlayerToastVo playerToastVoC = (extraInfo == null || (playerToasts = (PlayerToasts) Ju0.a.f11704l.a(extraInfo)) == null) ? null : playerToasts.c();
                            if (playerToastVoC != null) {
                                OgvVipRightsReminderService ogvVipRightsReminderService = this.this$0;
                                this.label = 1;
                                if (OgvVipRightsReminderService.b(ogvVipRightsReminderService, playerToastVoC, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1$1$1$3, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1$1$1$3.class */
                public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ExtraInfo $extraInfo;
                    int label;
                    final OgvVipRightsReminderService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass3(ExtraInfo extraInfo, OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super AnonymousClass3> continuation) {
                        super(2, continuation);
                        this.$extraInfo = extraInfo;
                        this.this$0 = ogvVipRightsReminderService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass3(this.$extraInfo, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i7 = this.label;
                        if (i7 == 0) {
                            ResultKt.throwOnFailure(obj);
                            ExtraInfo extraInfo = this.$extraInfo;
                            PlayerToastVo playerToastVo = extraInfo != null ? (PlayerToastVo) Ju0.a.f11705m.a(extraInfo) : null;
                            if (playerToastVo != null) {
                                OgvVipRightsReminderService ogvVipRightsReminderService = this.this$0;
                                this.label = 1;
                                if (OgvVipRightsReminderService.a(ogvVipRightsReminderService, playerToastVo, this) == coroutine_suspended) {
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

                /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$1$1$1$4, reason: invalid class name */
                /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$1$1$1$4.class */
                public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final ExtraInfo $extraInfo;
                    int label;
                    final OgvVipRightsReminderService this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass4(ExtraInfo extraInfo, OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super AnonymousClass4> continuation) {
                        super(2, continuation);
                        this.$extraInfo = extraInfo;
                        this.this$0 = ogvVipRightsReminderService;
                    }

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass4(this.$extraInfo, this.this$0, continuation);
                    }

                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                    }

                    public final Object invokeSuspend(Object obj) {
                        List list;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        ExtraInfo extraInfo = this.$extraInfo;
                        if (extraInfo != null && (list = (List) Ju0.a.f11706n.a(extraInfo)) != null) {
                            List<PlayerToastVo> list2 = list;
                            OgvVipRightsReminderService ogvVipRightsReminderService = this.this$0;
                            for (PlayerToastVo playerToastVo : list2) {
                                ogvVipRightsReminderService.getClass();
                                ReportVo reportVo = playerToastVo.f102391c;
                                ogvVipRightsReminderService.f94886c.showToast(n.b(playerToastVo, ogvVipRightsReminderService.f94885b, 5000L, new J(ogvVipRightsReminderService, 2)));
                                String strD = reportVo != null ? reportVo.d() : null;
                                if (strD != null && strD.length() != 0) {
                                    PageReportService.i(ogvVipRightsReminderService.h, strD, ogvVipRightsReminderService.e(reportVo.c()), 4);
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C07591(ExtraInfo extraInfo, OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super C07591> continuation) {
                    super(2, continuation);
                    this.$extraInfo = extraInfo;
                    this.this$0 = ogvVipRightsReminderService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C07591 c07591 = new C07591(this.$extraInfo, this.this$0, continuation);
                    c07591.L$0 = obj;
                    return c07591;
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
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new C07601(this.$extraInfo, this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this.$extraInfo, this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this.$extraInfo, this.this$0, null), 3, (Object) null);
                    BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this.$extraInfo, this.this$0, null), 3, (Object) null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07581(OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super C07581> continuation) {
                super(2, continuation);
                this.this$0 = ogvVipRightsReminderService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07581 c07581 = new C07581(this.this$0, continuation);
                c07581.L$0 = obj;
                return c07581;
            }

            public final Object invoke(ExtraInfo extraInfo, Continuation<? super Unit> continuation) {
                return create(extraInfo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    C07591 c07591 = new C07591((ExtraInfo) this.L$0, this.this$0, null);
                    this.label = 1;
                    if (CoroutineScopeKt.coroutineScope(c07591, this) == coroutine_suspended) {
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
        public AnonymousClass1(EpisodeExtraInfoRepository episodeExtraInfoRepository, OgvVipRightsReminderService ogvVipRightsReminderService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$episodeExtraInfoRepository = episodeExtraInfoRepository;
            this.this$0 = ogvVipRightsReminderService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$episodeExtraInfoRepository, this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<ExtraInfo> stateFlow = this.$episodeExtraInfoRepository.f99566b;
                C07581 c07581 = new C07581(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, c07581, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final IControlContainerService $controlContainerService;
        final EpisodeExtraInfoRepository $episodeExtraInfoRepository;
        final OgvActionDelegate $ogvActionDelegate;
        Object L$0;
        int label;
        final OgvVipRightsReminderService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
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

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService$2$2, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/rights/OgvVipRightsReminderService$2$2.class */
        public static final class C07612 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
            boolean Z$0;
            int label;

            public C07612(Continuation<? super C07612> continuation) {
                super(2, continuation);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C07612 c07612 = new C07612(continuation);
                c07612.Z$0 = ((Boolean) obj).booleanValue();
                return c07612;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EpisodeExtraInfoRepository episodeExtraInfoRepository, OgvVipRightsReminderService ogvVipRightsReminderService, IControlContainerService iControlContainerService, OgvActionDelegate ogvActionDelegate, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$episodeExtraInfoRepository = episodeExtraInfoRepository;
            this.this$0 = ogvVipRightsReminderService;
            this.$controlContainerService = iControlContainerService;
            this.$ogvActionDelegate = ogvActionDelegate;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$episodeExtraInfoRepository, this.this$0, this.$controlContainerService, this.$ogvActionDelegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0313  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0380  */
        /* JADX WARN: Removed duplicated region for block: B:141:0x03f6  */
        /* JADX WARN: Removed duplicated region for block: B:146:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0234  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 1172
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public OgvVipRightsReminderService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull IToastService iToastService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull o oVar, @NotNull TheseusPlayerQualityService theseusPlayerQualityService, @NotNull PageReportService pageReportService, @NotNull ViewingDurationService viewingDurationService, @NotNull h hVar, @NotNull EpisodeExtraInfoRepository episodeExtraInfoRepository, @NotNull IControlContainerService iControlContainerService, @NotNull OgvActionDelegate ogvActionDelegate, @NotNull OgvSubtitleBusinessService ogvSubtitleBusinessService) {
        this.f94884a = coroutineScope;
        this.f94885b = context;
        this.f94886c = iToastService;
        this.f94887d = iPlayerSettingService;
        this.f94888e = cVar;
        this.f94889f = oVar;
        this.f94890g = theseusPlayerQualityService;
        this.h = pageReportService;
        this.f94891i = viewingDurationService;
        this.f94892j = hVar;
        this.f94893k = ogvSubtitleBusinessService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(episodeExtraInfoRepository, this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(episodeExtraInfoRepository, this, iControlContainerService, ogvActionDelegate, null), 3, (Object) null);
        this.f94895m = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService r6, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService.a(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService r6, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService.b(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService r6, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService.c(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService, com.bilibili.ship.theseus.united.page.playviewextra.PlayerToastVo, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService.d(com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static boolean f() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jLongValue = ((Number) b.f94903d.getValue(null, b.f94900a[2])).longValue();
        Duration.Companion companion = Duration.Companion;
        return jCurrentTimeMillis - jLongValue <= Duration.getInWholeMilliseconds-impl(DurationKt.toDuration(13.5d, DurationUnit.DAYS));
    }

    public final Map<String, String> e(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(map);
        com.bilibili.ship.theseus.united.page.screenstate.c cVar = this.f94888e;
        c.a aVarH = cVar.h();
        linkedHashMap.put("state", !Intrinsics.areEqual(cVar.f(), Boolean.TRUE) ? !aVarH.f102988b ? "1" : "2" : !aVarH.f102988b ? "3" : "4");
        return linkedHashMap;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean g() throws NoWhenBranchMatchedException {
        com.bilibili.player.tangram.basic.a aVarA;
        h hVar = this.f94892j;
        com.bilibili.player.tangram.basic.c cVarG = hVar.f91109c.g();
        if (cVarG instanceof c.b) {
            aVarA = new com.bilibili.player.tangram.basic.a(((c.b) cVarG).f79322a);
        } else {
            if (!Intrinsics.areEqual(cVarG, c.a.f79321a)) {
                throw new NoWhenBranchMatchedException();
            }
            aVarA = hVar.f91109c.a();
        }
        return PlayerSettingHelper.INSTANCE.isVipQuality(aVarA != null ? aVarA.f79320a : 0, "bangumi");
    }

    public final void h(PlayerToastVo playerToastVo) {
        PlayerToast.Builder builderDuration = new PlayerToast.Builder().location(32).level(1).toastItemType(19).duration(PayTask.f60018j);
        FrameLayout frameLayout = new FrameLayout(this.f94885b);
        ComposeView composeView = new ComposeView(frameLayout.getContext(), null, 0, 6, null);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(1923023722, true, new i(playerToastVo, 1)));
        frameLayout.addView(composeView);
        this.f94886c.showToast(builderDuration.setCustomView(frameLayout).build());
    }
}
