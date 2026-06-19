package com.bilibili.ship.theseus.ugc.intro.kingposition;

import Wu0.k;
import android.content.Context;
import androidx.compose.foundation.gestures.o0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.app.gemini.share.d;
import com.bilibili.app.gemini.share.f;
import com.bilibili.lib.sharewrapper.util.SessionManager;
import com.bilibili.playerbizcommonv2.utils.i;
import com.bilibili.playerbizcommonv2.utils.v;
import com.bilibili.playerbizcommonv2.utils.w;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.C6266b;
import com.bilibili.ship.theseus.ugc.intro.ugcheadline.p;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionRepository;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.intro.module.owner.r;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.toolbar.j;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import com.bilibili.ship.theseus.united.page.view.t;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kntr.base.android.legacy.context.ContextUtilKt;
import kntr.common.share.core.b;
import kntr.common.share.domain.model.ShareParams;
import kntr.common.share.domain.model.e;
import kntr.common.share.domain.model.j;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qv0.C8487a;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IPlayerServiceManager;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService.class */
@StabilityInferred(parameters = 0)
public final class UgcKingPositionService {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f97043B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f97046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IPlayerServiceManager f97047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.autofloat.a f97048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f97049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final RelationRepository f97050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final j f97051g;

    @NotNull
    public final p h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C8487a f97052i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final k f97053j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final KingPositionRepository f97054k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lifecycle f97055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final c f97056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final PageReportService f97057n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final t f97058o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final h f97059p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f97060q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final r f97061r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.online.a f97062s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final KingPositionService f97063t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final IPlayDirector f97064u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f97065v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f97066w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final yk.c f97067x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f97068y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public f f97069z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final PlayerServiceManager.Client<d> f97042A = new PlayerServiceManager.Client<>();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final a f97044C = new a(this);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$1$1.class */
        public static final class C08371 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08371(UgcKingPositionService ugcKingPositionService, Continuation<? super C08371> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08371(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("KingPositionShareService", "click share");
                UgcKingPositionService.a(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
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
                UgcKingPositionService ugcKingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcKingPositionService.f97052i.f126352c;
                C08371 c08371 = new C08371(ugcKingPositionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08371, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$10, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$10.class */
    public static final class AnonymousClass10 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$10$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$10$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Av0.a, Continuation<? super Unit>, Object> {
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Av0.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcKingPositionService ugcKingPositionService = this.this$0;
                    this.label = 1;
                    if (UgcKingPositionService.c(ugcKingPositionService, this) == coroutine_suspended) {
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
        public AnonymousClass10(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass10> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass10(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f97060q.f98076u);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BLog.i("KingPositionShareService", "auto share");
                UgcKingPositionService.a(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                UgcKingPositionService ugcKingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcKingPositionService.f97048d.f98982f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcKingPositionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C6266b, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C6266b c6266b, Continuation<? super Unit> continuation) {
                return create(c6266b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                com.bilibili.ship.theseus.ugc.intro.ugcheadline.d dVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C6266b c6266b = (C6266b) this.L$0;
                this.this$0.f97051g.f103397a = (c6266b == null || (dVar = c6266b.f97304b) == null || dVar.f97313a != 1) ? "" : "hot";
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
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
                UgcKingPositionService ugcKingPositionService = this.this$0;
                StateFlow<C6266b> stateFlow = ugcKingPositionService.h.f97379j;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcKingPositionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            final Ref.LongRef $lastCid;
            Object L$0;
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(Ref.LongRef longRef, UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$lastCid = longRef;
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lastCid, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                UgcKingPositionService ugcKingPositionService;
                f fVar;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                if (c1318a == null) {
                    return Unit.INSTANCE;
                }
                long j7 = this.$lastCid.element;
                C7893a.C1318a.C1319a c1319a = c1318a.f123395a;
                if (j7 != c1319a.f123398b && (fVar = (ugcKingPositionService = this.this$0).f97069z) != null) {
                    fVar.b();
                    ugcKingPositionService.f97069z = null;
                }
                this.$lastCid.element = c1319a.f123398b;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
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
                Ref.LongRef longRefB = o0.b(obj);
                UgcKingPositionService ugcKingPositionService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = ugcKingPositionService.f97049e.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(longRefB, ugcKingPositionService, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<w, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(w wVar, Continuation<? super Unit> continuation) {
                return create(wVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    w wVar = (w) this.L$0;
                    UgcKingPositionService ugcKingPositionService = this.this$0;
                    this.label = 1;
                    if (UgcKingPositionService.b(ugcKingPositionService, wVar, this) == coroutine_suspended) {
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
        public AnonymousClass5(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
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
                UgcKingPositionService ugcKingPositionService = this.this$0;
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(ugcKingPositionService.f97052i.f126356g, ugcKingPositionService.f97055l, Lifecycle.State.RESUMED);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowWithLifecycle, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$6$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$6$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<w, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(w wVar, Continuation<? super Unit> continuation) {
                return create(wVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    w wVar = (w) this.L$0;
                    UgcKingPositionService ugcKingPositionService = this.this$0;
                    this.label = 1;
                    ugcKingPositionService.getClass();
                    ugcKingPositionService.f97052i.h.tryEmit(wVar.f81960b);
                    v.f(wVar);
                    Map mapCreateMapBuilder = MapsKt.createMapBuilder();
                    mapCreateMapBuilder.put("from_type", v.e(wVar));
                    String str = wVar.f81960b;
                    String str2 = str;
                    if (str == null) {
                        str2 = "";
                    }
                    mapCreateMapBuilder.put("text", str2);
                    Unit unit = Unit.INSTANCE;
                    PageReportService.i(ugcKingPositionService.f97057n, "united.player-video-detail.user-action.share-pilot-bubble.show", MapsKt.build(mapCreateMapBuilder), 4);
                    if (Unit.INSTANCE == coroutine_suspended) {
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
        public AnonymousClass6(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
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
                UgcKingPositionService ugcKingPositionService = this.this$0;
                Flow flowFlowWithLifecycle = FlowExtKt.flowWithLifecycle(ugcKingPositionService.f97052i.f126359k, ugcKingPositionService.f97055l, Lifecycle.State.RESUMED);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowFlowWithLifecycle, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$7, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$7.class */
    public static final class AnonymousClass7 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$7$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$7$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcKingPositionService f97070a;

            public a(UgcKingPositionService ugcKingPositionService) {
                this.f97070a = ugcKingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                if (((Boolean) obj).booleanValue()) {
                    UgcKingPositionService ugcKingPositionService = this.f97070a;
                    w.a aVar = (w.a) ugcKingPositionService.f97053j.f27386j.getValue();
                    if (aVar != null) {
                        ugcKingPositionService.f97052i.f126355f.tryEmit(aVar);
                    }
                    ugcKingPositionService.f97061r.f100676f.tryEmit((i.a) ugcKingPositionService.f97053j.f27395s.getValue());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass7> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass7(this.this$0, continuation);
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
                UgcKingPositionService ugcKingPositionService = this.this$0;
                SharedFlow<Boolean> sharedFlow = ugcKingPositionService.f97054k.f100347y;
                a aVar = new a(ugcKingPositionService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$8, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$8.class */
    public static final class AnonymousClass8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$8$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$8$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final UgcKingPositionService f97071a;

            public a(UgcKingPositionService ugcKingPositionService) {
                this.f97071a = ugcKingPositionService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                UgcKingPositionService ugcKingPositionService = this.f97071a;
                w.a aVar = (w.a) ugcKingPositionService.f97053j.f27386j.getValue();
                if (aVar != null) {
                    ugcKingPositionService.f97052i.f126355f.tryEmit(aVar);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass8> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass8(this.this$0, continuation);
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
                UgcKingPositionService ugcKingPositionService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcKingPositionService.f97054k.f100345w;
                a aVar = new a(ugcKingPositionService);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$9, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$9.class */
    public static final class AnonymousClass9 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcKingPositionService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService$9$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$9$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Av0.a, Continuation<? super Unit>, Object> {
            int label;
            final UgcKingPositionService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcKingPositionService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Av0.a aVar, Continuation<? super Unit> continuation) {
                return create(aVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcKingPositionService ugcKingPositionService = this.this$0;
                    this.label = 1;
                    if (UgcKingPositionService.d(ugcKingPositionService, this) == coroutine_suspended) {
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
        public AnonymousClass9(UgcKingPositionService ugcKingPositionService, Continuation<? super AnonymousClass9> continuation) {
            super(2, continuation);
            this.this$0 = ugcKingPositionService;
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
                Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.f97060q.f98076u);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$a.class */
    public static final class a implements f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcKingPositionService f97072a;

        public a(UgcKingPositionService ugcKingPositionService) {
            this.f97072a = ugcKingPositionService;
        }

        public final String[] a() {
            ArrayList arrayList = new ArrayList();
            CollectionsKt.e(arrayList, f.m);
            return (String[]) arrayList.toArray(new String[0]);
        }

        public final void onShareSuccess() {
            UgcKingPositionService ugcKingPositionService = this.f97072a;
            ugcKingPositionService.f97050f.p();
            ugcKingPositionService.f97052i.a();
        }
    }

    @Inject
    public UgcKingPositionService(@NotNull CoroutineScope coroutineScope, @NotNull Context context, @NotNull IPlayerServiceManager iPlayerServiceManager, @NotNull com.bilibili.ship.theseus.united.page.autofloat.a aVar, @NotNull C7893a c7893a, @NotNull RelationRepository relationRepository, @NotNull j jVar, @NotNull p pVar, @NotNull C8487a c8487a, @NotNull k kVar, @NotNull KingPositionRepository kingPositionRepository, @NotNull Lifecycle lifecycle, @NotNull c cVar, @NotNull PageReportService pageReportService, @NotNull t tVar, @NotNull h hVar, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull r rVar, @NotNull com.bilibili.ship.theseus.united.page.online.a aVar2, @NotNull KingPositionService kingPositionService, @NotNull IPlayDirector iPlayDirector, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull yk.c cVar2, @NotNull IControlContainerService iControlContainerService) {
        this.f97045a = coroutineScope;
        this.f97046b = context;
        this.f97047c = iPlayerServiceManager;
        this.f97048d = aVar;
        this.f97049e = c7893a;
        this.f97050f = relationRepository;
        this.f97051g = jVar;
        this.h = pVar;
        this.f97052i = c8487a;
        this.f97053j = kVar;
        this.f97054k = kingPositionRepository;
        this.f97055l = lifecycle;
        this.f97056m = cVar;
        this.f97057n = pageReportService;
        this.f97058o = tVar;
        this.f97059p = hVar;
        this.f97060q = uGCPlaybackRepository;
        this.f97061r = rVar;
        this.f97062s = aVar2;
        this.f97063t = kingPositionService;
        this.f97064u = iPlayDirector;
        this.f97065v = iPlayerCoreService;
        this.f97066w = iPlayerSettingService;
        this.f97067x = cVar2;
        this.f97068y = iControlContainerService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass7(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass8(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass9(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass10(this, null), 3, (Object) null);
    }

    public static final void a(UgcKingPositionService ugcKingPositionService) {
        d service;
        FragmentActivity fragmentActivityFindFragmentActivityOrNull;
        C6266b c6266b = (C6266b) ugcKingPositionService.h.f97378i.getValue();
        com.bilibili.ship.theseus.ugc.intro.ugcheadline.d dVar = c6266b != null ? c6266b.f97304b : null;
        String str = (dVar == null || dVar.f97313a != 1) ? "" : "hot";
        com.bilibili.ship.theseus.united.page.online.a aVar = ugcKingPositionService.f97062s;
        String str2 = aVar.c().f102117e;
        String str3 = String.format(ugcKingPositionService.f97046b.getResources().getQuantityString(2131689762, (int) aVar.c().f102116d, str2), Arrays.copyOf(new Object[]{str2}, 1));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", str3);
        boolean zBooleanValue = ((Boolean) ugcKingPositionService.f97053j.f27391o.getValue()).booleanValue();
        KingPositionService kingPositionService = ugcKingPositionService.f97063t;
        String string = (!zBooleanValue || kingPositionService.f100370T) ? null : jsonObject.toString();
        com.bilibili.app.gemini.share.i iVar = new com.bilibili.app.gemini.share.i(94, (Integer) null, str, (String) null, (String) null, (String) null, (String) null, string);
        if (!kingPositionService.f100370T) {
            kingPositionService.f100370T = true;
        }
        List list = com.bilibili.app.gemini.share.t.f;
        if (!b.a()) {
            PlayerServiceManager.Client<d> client = ugcKingPositionService.f97042A;
            if (client.getService() == null) {
                ugcKingPositionService.f97047c.bindService(PlayerServiceManager.ServiceDescriptor.Companion.obtain(d.class), client);
                service = (d) client.getService();
            } else {
                service = client.getService();
            }
            if (service == null) {
                BLog.i("KingPositionShareService", "create share panel, service is null");
                return;
            }
            f fVarF = service.f("main.ugc-video-detail.0.0.pv", "vinfo_share", iVar, ugcKingPositionService.f97044C);
            if (fVarF == null) {
                BLog.i("KingPositionShareService", "create share panel, geminiShare is null");
                return;
            } else {
                fVarF.d();
                ugcKingPositionService.f97069z = fVarF;
                return;
            }
        }
        j.a bVar = ugcKingPositionService.f97068y.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? j.a.a : new j.b();
        GeminiCommonPlayableParams currentPlayableParams = ugcKingPositionService.f97064u.getCurrentPlayableParams();
        GeminiCommonPlayableParams geminiCommonPlayableParams = currentPlayableParams instanceof GeminiCommonPlayableParams ? currentPlayableParams : null;
        if (geminiCommonPlayableParams == null || (fragmentActivityFindFragmentActivityOrNull = ContextUtilKt.findFragmentActivityOrNull(ugcKingPositionService.f97046b)) == null) {
            return;
        }
        long avid = geminiCommonPlayableParams.getAvid();
        long cid = geminiCommonPlayableParams.getCid();
        String spmid = geminiCommonPlayableParams.getSpmid();
        e eVarC = ugcKingPositionService.f97067x.C("vinfo_share");
        if (spmid == null) {
            spmid = "";
        }
        String jumpFrom = geminiCommonPlayableParams.getJumpFrom();
        String fromSpmid = geminiCommonPlayableParams.getFromSpmid();
        List list2 = com.bilibili.app.gemini.share.t.f;
        SessionManager sessionManager = SessionManager.INSTANCE;
        sessionManager.generateSessionId();
        com.bilibili.app.gemini.share.t tVar = new com.bilibili.app.gemini.share.t(fragmentActivityFindFragmentActivityOrNull, new kntr.common.share.domain.model.h(new ShareParams("main.ugc-video-detail.0.0.pv", String.valueOf(avid), "vinfo_share", String.valueOf(cid), new ShareParams.PageInfo(spmid, jumpFrom, fromSpmid, string, str), list2), sessionManager.getSessionId()), eVarC);
        com.bilibili.app.gemini.share.t.d(tVar, new com.bilibili.ship.theseus.ugc.intro.kingposition.a(ugcKingPositionService, tVar, bVar));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0211 A[PHI: r10 r16
  0x0211: PHI (r10v2 boolean) = (r10v0 boolean), (r10v3 boolean) binds: [B:49:0x01d2, B:53:0x020b] A[DONT_GENERATE, DONT_INLINE]
  0x0211: PHI (r16v12 com.bilibili.playerbizcommonv2.utils.w) = (r16v9 com.bilibili.playerbizcommonv2.utils.w), (r16v15 com.bilibili.playerbizcommonv2.utils.w) binds: [B:49:0x01d2, B:53:0x020b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Type inference failed for: r0v135 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService r6, com.bilibili.playerbizcommonv2.utils.w r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService.b(com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService, com.bilibili.playerbizcommonv2.utils.w, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015e A[PHI: r7 r8
  0x015e: PHI (r7v4 java.lang.Object) = (r7v3 java.lang.Object), (r7v7 java.lang.Object) binds: [B:28:0x0155, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]
  0x015e: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:28:0x0155, B:16:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService.c(com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            Method dump skipped, instruction units count: 560
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService.d(com.bilibili.ship.theseus.ugc.intro.kingposition.UgcKingPositionService, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
