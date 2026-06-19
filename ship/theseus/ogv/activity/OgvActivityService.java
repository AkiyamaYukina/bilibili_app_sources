package com.bilibili.ship.theseus.ogv.activity;

import Pb.F;
import Pb.G;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comment3.ui.widget.p;
import com.bilibili.community.follow.FollowSeasonStatus;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityApiService;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityService;
import com.bilibili.ship.theseus.ogv.activity.countdown.OgvWatchingCountdownTaskService;
import com.bilibili.ship.theseus.ogv.activity.invitation.OgvInvitationActivityBottomDialog;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository;
import com.bilibili.ship.theseus.ogv.ep.OgvCurrentEpisodeRepository$special$$inlined$map$1;
import com.bilibili.ship.theseus.ogv.intro.Q;
import com.bilibili.ship.theseus.ogv.intro.UnitedActivityComposeContainerService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.operation.OperationActivityVo;
import com.bilibili.ship.theseus.ogv.operation.ShowTime;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TaskParamVo;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.google.gson.reflect.TypeToken;
import dagger.internal.Provider;
import ev0.InterfaceC7008a;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xl0.C8986a;
import yl0.InterfaceC9062a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService.class */
@StabilityInferred(parameters = 0)
public final class OgvActivityService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f91384A = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f91385B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f91386C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public OgvInvitationActivityBottomDialog f91387D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f91388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f91389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f91390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvCurrentEpisodeRepository f91391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f91392e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f91393f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f91394g;

    @NotNull
    public final UnitedActivityComposeContainerService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f91395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.web.b f91396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f91397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final OgvWatchingCountdownTaskService f91398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f91399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final C8043a f91400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f91401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.report.d f91402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f91403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f91404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final InterfaceC9062a f91405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final Provider f91406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final c f91407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final Q f91408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final wv0.a f91409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<OgvActivityVo> f91410x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public OgvActivityDialogVo f91411y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public Deferred<? extends Drawable> f91412z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$3.class */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvActivityService f91413a;

            public a(OgvActivityService ogvActivityService) {
                this.f91413a = ogvActivityService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f91413a.h.f92286i.f94082d.setValue(Boolean.valueOf(((c.a) obj).f102988b));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlowC = this.this$0.f91397k.c();
                a aVar = new a(this.this$0);
                this.label = 1;
                if (stateFlowC.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$4.class */
    final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<OgvEpisode, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvActivityService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvActivityService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(OgvEpisode ogvEpisode, Continuation<? super Unit> continuation) {
                return create(ogvEpisode, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvEpisode ogvEpisode = (OgvEpisode) this.L$0;
                    if (ogvEpisode != null) {
                        OgvActivityService ogvActivityService = this.this$0;
                        this.label = 1;
                        if (OgvActivityService.a(ogvActivityService, ogvEpisode, this) == coroutine_suspended) {
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
        public AnonymousClass4(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvActivityService ogvActivityService = this.this$0;
                OgvCurrentEpisodeRepository$special$$inlined$map$1 ogvCurrentEpisodeRepository$special$$inlined$map$1 = ogvActivityService.f91391d.f92119v;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ogvActivityService, null);
                this.label = 1;
                if (FlowKt.collectLatest(ogvCurrentEpisodeRepository$special$$inlined$map$1, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$5.class */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<OgvActivityVo, PlayerAvailability, Continuation<? super OperationActivityVo>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public final Object invoke(OgvActivityVo ogvActivityVo, PlayerAvailability playerAvailability, Continuation<? super OperationActivityVo> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = ogvActivityVo;
                anonymousClass1.L$1 = playerAvailability;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object next;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OgvActivityVo ogvActivityVo = (OgvActivityVo) this.L$0;
                OperationActivityVo operationActivityVo = null;
                if (((PlayerAvailability) this.L$1) == PlayerAvailability.FORBIDDEN) {
                    operationActivityVo = null;
                    if (ogvActivityVo != null) {
                        List<OperationActivityVo> listF = ogvActivityVo.f();
                        operationActivityVo = null;
                        if (listF != null) {
                            Iterator<T> it = listF.iterator();
                            do {
                                next = null;
                                if (!it.hasNext()) {
                                    break;
                                }
                                next = it.next();
                            } while (((OperationActivityVo) next).e() != ShowTime.PAY_REMINDER);
                            operationActivityVo = (OperationActivityVo) next;
                        }
                    }
                }
                return operationActivityVo;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$5$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$5$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<OperationActivityVo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvActivityService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvActivityService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(OperationActivityVo operationActivityVo, Continuation<? super Unit> continuation) {
                return create(operationActivityVo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                OperationActivityVo operationActivityVo = (OperationActivityVo) this.L$0;
                if (operationActivityVo != null && !operationActivityVo.f94076q) {
                    this.this$0.h.f92286i.b(operationActivityVo);
                    operationActivityVo.f94076q = true;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass5(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvActivityService ogvActivityService = this.this$0;
                Flow flowFlowCombine = FlowKt.flowCombine(ogvActivityService.f91410x, ogvActivityService.f91401o.f91107a.f79286c, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$6.class */
    final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<OgvActivityVo, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvActivityService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ogvActivityService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(OgvActivityVo ogvActivityVo, Continuation<? super Unit> continuation) {
                return create(ogvActivityVo, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) throws Throwable {
                Map mapBuild;
                Throwable th;
                Map map;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    OgvActivityVo ogvActivityVo = (OgvActivityVo) this.L$0;
                    OgvActivityHalfScreenPopup ogvActivityHalfScreenPopupC = ogvActivityVo.c();
                    String strB = ogvActivityHalfScreenPopupC != null ? ogvActivityHalfScreenPopupC.b() : null;
                    if (strB != null && strB.length() != 0) {
                        OgvActivityService ogvActivityService = this.this$0;
                        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                        mapCreateMapBuilder.put("active_link", strB);
                        mapCreateMapBuilder.putAll(ogvActivityService.f91395i.a(null));
                        mapBuild = MapsKt.build(mapCreateMapBuilder);
                        Neurons.reportExposure$default(false, "united.player-video-detail.halfscreen.0.show", mapBuild, (List) null, 8, (Object) null);
                        this.this$0.f(ogvActivityVo.c().a(), null, ActivityDialogActionType.EXPOSURE);
                        try {
                            if (Iu0.a.a(strB)) {
                                Q q7 = this.this$0.f91408v;
                                this.L$0 = mapBuild;
                                this.label = 1;
                                if (q7.c(strB, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                com.bilibili.ship.theseus.ogv.web.b bVar = this.this$0.f91396j;
                                String strA = com.bilibili.ship.theseus.ogv.web.b.a(bVar, strB, false, false, null, 14);
                                this.L$0 = mapBuild;
                                this.label = 2;
                                if (bVar.b(strA, false, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            Neurons.reportClick(false, "united.player-video-detail.halfscreen.0.click", mapBuild);
                        } catch (Throwable th2) {
                            th = th2;
                            map = mapBuild;
                            Neurons.reportClick(false, "united.player-video-detail.halfscreen.0.click", map);
                            throw th;
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    map = (Map) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        mapBuild = map;
                        Neurons.reportClick(false, "united.player-video-detail.halfscreen.0.click", mapBuild);
                    } catch (Throwable th3) {
                        th = th3;
                        Neurons.reportClick(false, "united.player-video-detail.halfscreen.0.click", map);
                        throw th;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass6(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f91410x);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFilterNotNull, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$7.class */
    final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$7$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$7$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function3<c.a, OgvActivityVo, Continuation<? super Pair<? extends c.a, ? extends OgvActivityVo>>, Object> {
            Object L$0;
            Object L$1;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(3, continuation);
            }

            public final Object invoke(c.a aVar, OgvActivityVo ogvActivityVo, Continuation<? super Pair<c.a, OgvActivityVo>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = aVar;
                anonymousClass1.L$1 = ogvActivityVo;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Pair((c.a) this.L$0, (OgvActivityVo) this.L$1);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$7$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$7$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends c.a, ? extends OgvActivityVo>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvActivityService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvActivityService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(Pair<c.a, OgvActivityVo> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                OgvInvitationActivityHostVo ogvInvitationActivityHostVoE;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                boolean z6 = ((c.a) pair.getFirst()).f102988b;
                OgvActivityVo ogvActivityVo = (OgvActivityVo) pair.getSecond();
                OgvInvitationActivityGuestVo ogvInvitationActivityGuestVoD = null;
                OgvInvitationActivitySuccessVo ogvInvitationActivitySuccessVoC = (ogvActivityVo == null || (ogvInvitationActivityHostVoE = ogvActivityVo.e()) == null) ? null : ogvInvitationActivityHostVoE.c();
                if (ogvActivityVo != null) {
                    ogvInvitationActivityGuestVoD = ogvActivityVo.d();
                }
                if (ogvInvitationActivitySuccessVoC != null && !z6) {
                    OgvActivityService ogvActivityService = this.this$0;
                    if (!ogvActivityService.f91385B) {
                        ogvActivityService.f91384A = false;
                        ogvActivityService.f91385B = true;
                    }
                }
                if (ogvInvitationActivityGuestVoD != null && !z6) {
                    OgvActivityService ogvActivityService2 = this.this$0;
                    if (!ogvActivityService2.f91385B) {
                        ogvActivityService2.f91384A = false;
                        ogvActivityService2.f91385B = true;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFlowCombine = FlowKt.flowCombine(this.this$0.f91397k.c(), this.this$0.f91410x, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowCombine, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$8.class */
    final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$8$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$8$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function4<OgvActivityVo, c.a, PlayerAvailability, Continuation<? super Triple<? extends OgvActivityVo, ? extends c.a, ? extends PlayerAvailability>>, Object> {
            Object L$0;
            Object L$1;
            Object L$2;
            int label;

            public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(4, continuation);
            }

            public final Object invoke(OgvActivityVo ogvActivityVo, c.a aVar, PlayerAvailability playerAvailability, Continuation<? super Triple<OgvActivityVo, c.a, ? extends PlayerAvailability>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = ogvActivityVo;
                anonymousClass1.L$1 = aVar;
                anonymousClass1.L$2 = playerAvailability;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return new Triple((OgvActivityVo) this.L$0, (c.a) this.L$1, (PlayerAvailability) this.L$2);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$8$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$8$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Triple<? extends OgvActivityVo, ? extends c.a, ? extends PlayerAvailability>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final OgvActivityService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = ogvActivityService;
            }

            @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.app.Dialog"}, scope = {})
            private static void __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookDialogDismiss(@NotNull Object obj) {
                Contract contractAb = ConfigManager.Companion.ab();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                    Thread threadCurrentThread = Thread.currentThread();
                    if (!n.a(threadCurrentThread)) {
                        IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                        Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                    }
                }
                ((Dialog) obj).dismiss();
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(Triple<OgvActivityVo, c.a, ? extends PlayerAvailability> triple, Continuation<? super Unit> continuation) {
                return create(triple, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Triple triple = (Triple) this.L$0;
                OgvActivityVo ogvActivityVo = (OgvActivityVo) triple.getFirst();
                OgvInvitationActivityBackgroundVo ogvInvitationActivityBackgroundVoA = null;
                OgvInvitationActivityHostVo ogvInvitationActivityHostVoE = ogvActivityVo != null ? ogvActivityVo.e() : null;
                boolean z6 = ((c.a) triple.getSecond()).f102988b;
                boolean z7 = triple.getThird() == PlayerAvailability.FORBIDDEN;
                OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog = this.this$0.f91387D;
                if (ogvInvitationActivityBottomDialog != null) {
                    __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookDialogDismiss(ogvInvitationActivityBottomDialog);
                }
                if (ogvInvitationActivityHostVoE != null) {
                    ogvInvitationActivityBackgroundVoA = ogvInvitationActivityHostVoE.a();
                }
                if (ogvInvitationActivityBackgroundVoA != null && ogvInvitationActivityHostVoE.f91471d && z7 && !z6) {
                    OgvActivityService ogvActivityService = this.this$0;
                    if (!ogvActivityService.f91385B) {
                        ogvActivityService.f91384A = false;
                        ogvActivityService.d();
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OgvActivityService ogvActivityService = this.this$0;
                Flow flowCombine = FlowKt.combine(ogvActivityService.f91410x, ogvActivityService.f91397k.c(), this.this$0.f91401o.f91107a.f79286c, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowCombine, anonymousClass2, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.activity.OgvActivityService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$9.class */
    final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final OgvActivityService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(OgvActivityService ogvActivityService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = ogvActivityService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final boolean invokeSuspend$lambda$0(com.bilibili.ship.theseus.ogv.activity.OgvActivityService r3, boolean r4) {
            /*
                Method dump skipped, instruction units count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.OgvActivityService.AnonymousClass9.invokeSuspend$lambda$0(com.bilibili.ship.theseus.ogv.activity.OgvActivityService, boolean):boolean");
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass9(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                final OgvActivityService ogvActivityService = this.this$0;
                BackActionRepository backActionRepository = ogvActivityService.f91404r;
                Function1<? super Boolean, Boolean> function1 = new Function1(ogvActivityService) { // from class: com.bilibili.ship.theseus.ogv.activity.e

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OgvActivityService f91552a;

                    {
                        this.f91552a = ogvActivityService;
                    }

                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(OgvActivityService.AnonymousClass9.invokeSuspend$lambda$0(this.f91552a, ((Boolean) obj2).booleanValue()));
                    }
                };
                this.label = 1;
                if (backActionRepository.b(function1, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$a.class */
    public static final class a extends TypeToken<Map<String, ? extends String>> {
    }

    @Inject
    public OgvActivityService(@NotNull Context context, @NotNull Activity activity, @NotNull OgvSeason ogvSeason, @NotNull OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository, @NotNull CoroutineScope coroutineScope, @NotNull String str, @Nullable String str2, @NotNull UnitedActivityComposeContainerService unitedActivityComposeContainerService, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.ogv.web.b bVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull OgvWatchingCountdownTaskService ogvWatchingCountdownTaskService, @NotNull BiliAccounts biliAccounts, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull com.bilibili.ship.theseus.united.page.report.d dVar, @NotNull InterfaceC7008a interfaceC7008a, @NotNull BackActionRepository backActionRepository, @NotNull InterfaceC9062a interfaceC9062a, @NotNull Provider provider, @NotNull c cVar2, @NotNull Q q7, @NotNull wv0.a aVar) {
        this.f91388a = context;
        this.f91389b = activity;
        this.f91390c = ogvSeason;
        this.f91391d = ogvCurrentEpisodeRepository;
        this.f91392e = coroutineScope;
        this.f91393f = str;
        this.f91394g = str2;
        this.h = unitedActivityComposeContainerService;
        this.f91395i = pageReportService;
        this.f91396j = bVar;
        this.f91397k = cVar;
        this.f91398l = ogvWatchingCountdownTaskService;
        this.f91399m = biliAccounts;
        this.f91400n = c8043a;
        this.f91401o = hVar;
        this.f91402p = dVar;
        this.f91403q = interfaceC7008a;
        this.f91404r = backActionRepository;
        this.f91405s = interfaceC9062a;
        this.f91406t = provider;
        this.f91407u = cVar2;
        this.f91408v = q7;
        this.f91409w = aVar;
        this.f91410x = unitedActivityComposeContainerService.f92284f;
        unitedActivityComposeContainerService.f92285g = new p(this, 1);
        unitedActivityComposeContainerService.h = new H01.a(this, 3);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.ogv.activity.OgvActivityService r13, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 435
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.OgvActivityService.a(com.bilibili.ship.theseus.ogv.activity.OgvActivityService, com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(OgvActivityDialogVo ogvActivityDialogVo) {
        String strB;
        this.f91411y = ogvActivityDialogVo;
        this.f91412z = (ogvActivityDialogVo == null || (strB = ogvActivityDialogVo.b()) == null) ? null : BuildersKt.async$default(this.f91392e, (CoroutineContext) null, (CoroutineStart) null, new OgvActivityService$preloadImage$1(this, strB, null), 3, (Object) null);
        ActivityDialogShowOccasion activityDialogShowOccasionC = null;
        if (ogvActivityDialogVo != null) {
            activityDialogShowOccasionC = ogvActivityDialogVo.c();
        }
        if (activityDialogShowOccasionC == ActivityDialogShowOccasion.IMMEDIATE) {
            h(ogvActivityDialogVo);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: JsonParseException -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {JsonParseException -> 0x007f, blocks: (B:10:0x003a, B:12:0x004a, B:18:0x005a, B:21:0x0078), top: B:88:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0217 A[Catch: JsonParseException -> 0x021e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JsonParseException -> 0x021e, blocks: (B:57:0x01dd, B:59:0x01e9, B:65:0x01f9, B:68:0x0217), top: B:86:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x026c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.net.Uri r11) {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ogv.activity.OgvActivityService.c(android.net.Uri):void");
    }

    public final void d() {
        OgvInvitationActivityHostVo ogvInvitationActivityHostVoE;
        OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog = this.f91387D;
        if (ogvInvitationActivityBottomDialog != null) {
            Contract contractAb = ConfigManager.Companion.ab();
            Boolean bool = Boolean.TRUE;
            if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                Thread threadCurrentThread = Thread.currentThread();
                if (!n.a(threadCurrentThread)) {
                    IllegalStateException illegalStateException = new IllegalStateException(F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                    Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                }
            }
            ogvInvitationActivityBottomDialog.dismiss();
        }
        OgvActivityVo ogvActivityVo = (OgvActivityVo) this.f91410x.getValue();
        if (ogvActivityVo == null || (ogvInvitationActivityHostVoE = ogvActivityVo.e()) == null) {
            return;
        }
        OgvInvitationActivityBottomDialog ogvInvitationActivityBottomDialog2 = new OgvInvitationActivityBottomDialog(this.f91388a, ogvInvitationActivityHostVoE, ogvActivityVo.a(), this, this.f91400n.a(), this.f91392e);
        ogvInvitationActivityBottomDialog2.show();
        this.f91387D = ogvInvitationActivityBottomDialog2;
        this.f91385B = true;
    }

    @Nullable
    public final Object e(@NotNull OgvActivityApiService.Action action, int i7, @Nullable String str, @NotNull SuspendLambda suspendLambda) {
        OgvActivityApiService.f91342a.getClass();
        OgvActivityApiService ogvActivityApiService = OgvActivityApiService.a.f91344b;
        int actionType = action.getActionType();
        long j7 = this.f91390c.f94449a;
        OgvEpisode ogvEpisodeC = this.f91391d.c();
        return ogvActivityApiService.reportAction(i7, actionType, str, Boxing.boxLong(j7), ogvEpisodeC != null ? Boxing.boxLong(ogvEpisodeC.f93555a) : null, suspendLambda);
    }

    public final void f(@NotNull String str, @Nullable String str2, @NotNull ActivityDialogActionType activityDialogActionType) {
        BuildersKt.launch$default(this.f91392e, (CoroutineContext) null, (CoroutineStart) null, new OgvActivityService$reportAction$1(this, str, str2, activityDialogActionType, null), 3, (Object) null);
    }

    public final void g(@Nullable TaskParamVo taskParamVo) {
        if (!this.f91399m.isLogin()) {
            Qj0.g.e(this.f91389b, C8986a.a());
        } else {
            this.f91397k.g();
            this.f91401o.pause();
            BuildersKt.launch$default(this.f91392e, (CoroutineContext) null, (CoroutineStart) null, new OgvActivityService$runOperationTask$1(taskParamVo, this, null), 3, (Object) null);
        }
    }

    public final boolean h(OgvActivityDialogVo ogvActivityDialogVo) {
        com.bilibili.ship.theseus.ogv.activity.a aVar = (com.bilibili.ship.theseus.ogv.activity.a) this.f91406t.get();
        Map<String, String> map = ogvActivityDialogVo.f91371k;
        aVar.getClass();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            int iHashCode = key.hashCode();
            if (iHashCode != -1268958287) {
                if (iHashCode == 116765) {
                    if (key.equals("vip") && !Intrinsics.areEqual(String.valueOf(aVar.f91504c.isEffectiveVip()), value)) {
                        return false;
                    }
                } else if (iHashCode == 112903375 && key.equals("watch")) {
                    Double doubleOrNull = StringsKt.toDoubleOrNull(value);
                    if (doubleOrNull == null) {
                        return false;
                    }
                    double dDoubleValue = doubleOrNull.doubleValue();
                    long jA = aVar.f91503b.f94821c.a();
                    Duration.Companion companion = Duration.Companion;
                    if (Duration.compareTo-LRDsOJo(jA, DurationKt.toDuration(dDoubleValue, DurationUnit.SECONDS)) <= 0) {
                        return false;
                    }
                }
            } else if (key.equals("follow")) {
                com.bilibili.community.follow.c cVar = com.bilibili.community.follow.c.a;
                com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) com.bilibili.community.follow.c.c.c(com.bilibili.community.follow.c.a(aVar.f91502a));
                com.bilibili.community.follow.b bVar2 = bVar;
                if (bVar == null) {
                    bVar2 = new com.bilibili.community.follow.b(false, FollowSeasonStatus.UNKNOWN);
                }
                if (!Intrinsics.areEqual(String.valueOf(bVar2.a), value)) {
                    return false;
                }
            } else {
                continue;
            }
        }
        boolean z6 = this.f91386C;
        if (this.f91397k.h().f102988b || z6) {
            return false;
        }
        this.f91386C = true;
        BuildersKt.launch$default(this.f91392e, (CoroutineContext) null, (CoroutineStart) null, new OgvActivityService$showImageDialog$1(this, ogvActivityDialogVo, null), 3, (Object) null);
        return true;
    }
}
