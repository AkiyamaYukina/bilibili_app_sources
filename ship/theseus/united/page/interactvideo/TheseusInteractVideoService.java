package com.bilibili.ship.theseus.united.page.interactvideo;

import android.content.Context;
import android.view.MotionEvent;
import androidx.appcompat.widget.C3259x;
import androidx.compose.foundation.lazy.D;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.z;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bapis.bilibili.playershared.Fragment;
import com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams;
import com.bilibili.common.chronoscommon.EnhancedChronosView;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.player.tangram.basic.PlayNetworkEnv;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.playercore.A;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import com.bilibili.player.tangram.playercore.SequentialPCSPlayable;
import com.bilibili.playerbizcommon.features.interactvideo.model.InteractNode;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoGetSceneInfo$Request;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoGetSceneInfo$Response;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoInvalidSeekArea$Request;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoJumpNode$Request;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoPreSelectionNode$Request;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoShowEndingPage$Request;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoUpdateControlBar$Request;
import com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoUpdateHiddenVar$Request;
import com.google.gson.Gson;
import dagger.assisted.AssistedInject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.L;
import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.service.gesture.GestureInterceptShield;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdatePlaybackStatus;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService.class */
@StabilityInferred(parameters = 0)
public final class TheseusInteractVideoService {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public Job f99864A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.interactvideo.d f99865B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public InteractNode f99866C;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f99869F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public long f99870G;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f99872I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @NotNull
    public final SequentialPCSPlayable f99873J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<GeminiCommonPlayableParams> f99874K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<PlayViewUniteReply> f99875L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public float f99876M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @NotNull
    public final m f99877N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @NotNull
    public final l f99878O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @NotNull
    public final List<ChronosRequestHandler<?, ?>> f99879P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    @NotNull
    public final HashMap<String, Float> f99880Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @NotNull
    public Map<Long, ? extends com.bilibili.ship.theseus.keel.player.j> f99881R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public com.bilibili.ship.theseus.united.page.interactvideo.f f99882S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public Job f99883T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @NotNull
    public final Mutex f99884U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f99885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f99886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.mediaplay.q f99887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IPlayerCoreService f99888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IInteractLayerService f99889e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f99890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f99891g;

    @NotNull
    public final IGestureService h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommon.features.background.h f99892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f99894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.interactvideo.e f99895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f99896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final BiliAccounts f99897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f99898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f99899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final c f99900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f99901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final IToastService f99902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final IPlayerSettingService f99903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f99904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.player.e f99905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final GeminiCommonPlayableParams f99906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public final PlayViewUniteReply f99907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final Function2<com.bilibili.ship.theseus.keel.player.j, Continuation<? super Unit>, Object> f99908y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<a> f99909z = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f99867D = true;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f99868E = true;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final GestureInterceptShield f99871H = new Object();

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    TheseusInteractVideoService theseusInteractVideoService = this.this$0;
                    theseusInteractVideoService.f99865B = new com.bilibili.ship.theseus.united.page.interactvideo.d(theseusInteractVideoService.f99885a, theseusInteractVideoService, theseusInteractVideoService.f99890f);
                    TheseusInteractVideoService.a(theseusInteractVideoService);
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            } catch (Throwable th) {
                TheseusInteractVideoService.b(this.this$0);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusInteractVideoService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusInteractVideoService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
                return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (((PlayerAvailability) this.L$0) == PlayerAvailability.FORBIDDEN) {
                    Job job = this.this$0.f99864A;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    Job job2 = this.this$0.f99883T;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    TheseusInteractVideoService.b(this.this$0);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
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
                TheseusInteractVideoService theseusInteractVideoService = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = theseusInteractVideoService.f99894k.f91107a.f79286c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusInteractVideoService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusInteractVideoService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$3$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusInteractVideoService f99910a;

            public a(TheseusInteractVideoService theseusInteractVideoService) {
                this.f99910a = theseusInteractVideoService;
            }

            public final Object emit(Object obj, Continuation continuation) {
                TheseusInteractVideoService theseusInteractVideoService = this.f99910a;
                theseusInteractVideoService.f99886b.hide();
                com.bilibili.ship.theseus.united.page.interactvideo.d dVar = theseusInteractVideoService.f99865B;
                if (dVar != null && !dVar.a()) {
                    FunctionWidgetToken functionWidgetToken = dVar.f99963d;
                    AbsFunctionWidgetService absFunctionWidgetService = dVar.f99962c;
                    if (functionWidgetToken == null || functionWidgetToken.isRemoved()) {
                        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
                        layoutParams.setFunctionType(2);
                        layoutParams.setLayoutType(32);
                        dVar.f99963d = absFunctionWidgetService.showWidget(new com.bilibili.ship.theseus.united.page.interactvideo.c(dVar.f99960a, dVar.f99961b), layoutParams);
                    } else {
                        absFunctionWidgetService.showWidget(dVar.f99963d);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusInteractVideoService theseusInteractVideoService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusInteractVideoService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.this$0, continuation);
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
                TheseusInteractVideoService theseusInteractVideoService = this.this$0;
                MutableSharedFlow<Unit> mutableSharedFlow = theseusInteractVideoService.f99895l.f99964a;
                a aVar = new a(theseusInteractVideoService);
                this.label = 1;
                if (mutableSharedFlow.collect(aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a.class */
    public interface a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$a.class */
        @StabilityInferred(parameters = 1)
        public static final class C0994a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final com.bilibili.ship.theseus.united.page.interactvideo.a f99911a;

            public C0994a(@NotNull com.bilibili.ship.theseus.united.page.interactvideo.a aVar) {
                this.f99911a = aVar;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$b.class */
        @StabilityInferred(parameters = 1)
        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f99912a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$c.class */
        @StabilityInferred(parameters = 1)
        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f99913a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f99914b;

            public c(boolean z6, boolean z7) {
                this.f99913a = z6;
                this.f99914b = z7;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$d.class */
        @StabilityInferred(parameters = 1)
        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final d f99915a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$e.class */
        @StabilityInferred(parameters = 1)
        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final e f99916a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$f.class */
        @StabilityInferred(parameters = 1)
        public static final class f implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public static final f f99917a = new Object();
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$a$g.class */
        @StabilityInferred(parameters = 0)
        public static final class g implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InteractiveVideoPreSelectionNode$Request f99918a;

            public g(@NotNull InteractiveVideoPreSelectionNode$Request interactiveVideoPreSelectionNode$Request) {
                this.f99918a = interactiveVideoPreSelectionNode$Request;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$b.class */
    public interface b {

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$b$a.class */
        @StabilityInferred(parameters = 1)
        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f99919a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public final String f99920b;

            public a(int i7, @Nullable String str) {
                this.f99919a = i7;
                this.f99920b = str;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$b$b.class */
        @StabilityInferred(parameters = 0)
        public static final class C0995b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final InteractNode f99921a;

            public C0995b(@NotNull InteractNode interactNode) {
                this.f99921a = interactNode;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$c.class */
    public interface c {
        @Nullable
        Object a(@NotNull TheseusInteractVideoService theseusInteractVideoService, @NotNull Continuation<? super Boolean> continuation);

        @Nullable
        Object b(boolean z6, @NotNull v vVar, @NotNull Continuation continuation);

        void c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$d.class */
    public static final class d implements ChronosRequestHandler<InteractiveVideoInvalidSeekArea$Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99922a = Reflection.typeOf(InteractiveVideoInvalidSeekArea$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99923b;

        public d(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99923b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoInvalidSeekArea$Request> getRequestClass() {
            return InteractiveVideoInvalidSeekArea$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99922a;
        }

        public final ChronosResponseWrapper<Void> handle(InteractiveVideoInvalidSeekArea$Request interactiveVideoInvalidSeekArea$Request) {
            InteractiveVideoInvalidSeekArea$Request interactiveVideoInvalidSeekArea$Request2 = interactiveVideoInvalidSeekArea$Request;
            Duration.Companion companion = Duration.Companion;
            double startTime = interactiveVideoInvalidSeekArea$Request2.getStartTime();
            DurationUnit durationUnit = DurationUnit.SECONDS;
            this.f99923b.h(new a.C0994a(new com.bilibili.ship.theseus.united.page.interactvideo.a(DurationKt.toDuration(startTime, durationUnit), DurationKt.toDuration(interactiveVideoInvalidSeekArea$Request2.getDuration(), durationUnit), DurationKt.toDuration(interactiveVideoInvalidSeekArea$Request2.getFake(), durationUnit))));
            return new ChronosResponseWrapper.Success((Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$e.class */
    public static final class e implements ChronosRequestHandler<InteractiveVideoJumpNode$Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99924a = Reflection.typeOf(InteractiveVideoJumpNode$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99925b;

        public e(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99925b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoJumpNode$Request> getRequestClass() {
            return InteractiveVideoJumpNode$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99924a;
        }

        public final ChronosResponseWrapper<Void> handle(InteractiveVideoJumpNode$Request interactiveVideoJumpNode$Request) {
            InteractiveVideoJumpNode$Request interactiveVideoJumpNode$Request2 = interactiveVideoJumpNode$Request;
            long edgeId = interactiveVideoJumpNode$Request2.getEdgeId();
            long cid = interactiveVideoJumpNode$Request2.getCid();
            String choices = interactiveVideoJumpNode$Request2.getChoices();
            String str = choices;
            if (choices == null) {
                str = "";
            }
            TheseusInteractVideoService.c(this.f99925b, edgeId, cid, str);
            return new ChronosResponseWrapper.Success((Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$f.class */
    public static final class f implements ChronosRequestHandler<InteractiveVideoPreSelectionNode$Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99926a = Reflection.typeOf(InteractiveVideoPreSelectionNode$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99927b;

        public f(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99927b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoPreSelectionNode$Request> getRequestClass() {
            return InteractiveVideoPreSelectionNode$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99926a;
        }

        public final ChronosResponseWrapper<Void> handle(InteractiveVideoPreSelectionNode$Request interactiveVideoPreSelectionNode$Request) {
            this.f99927b.h(new a.g(interactiveVideoPreSelectionNode$Request));
            return new ChronosResponseWrapper.Success((Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$g.class */
    public static final class g implements ChronosRequestHandler<UpdatePlaybackStatus.Request, UpdatePlaybackStatus.Response> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99928a = Reflection.typeOf(UpdatePlaybackStatus.Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99929b;

        public g(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99929b = theseusInteractVideoService;
        }

        public final Class<UpdatePlaybackStatus.Request> getRequestClass() {
            return UpdatePlaybackStatus.Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99928a;
        }

        public final ChronosResponseWrapper<UpdatePlaybackStatus.Response> handle(UpdatePlaybackStatus.Request request) {
            UpdatePlaybackStatus.Response response;
            UpdatePlaybackStatus.Request request2 = request;
            TheseusInteractVideoService theseusInteractVideoService = this.f99929b;
            PlayerAvailability playerAvailabilityK = theseusInteractVideoService.f99894k.f91107a.k();
            PlayerAvailability playerAvailability = PlayerAvailability.COMPLETED;
            com.bilibili.ship.theseus.keel.player.h hVar = theseusInteractVideoService.f99894k;
            Long lValueOf = null;
            if (playerAvailabilityK == playerAvailability || playerAvailabilityK == PlayerAvailability.FORBIDDEN || playerAvailabilityK == PlayerAvailability.ERROR) {
                UpdatePlaybackStatus.Response response2 = new UpdatePlaybackStatus.Response();
                com.bilibili.ship.theseus.keel.player.j jVarJ = hVar.j();
                Long lValueOf2 = null;
                if (jVarJ != null) {
                    lValueOf2 = Long.valueOf(jVarJ.L());
                }
                response2.setCurrentTime(lValueOf2);
                response2.setPlaybackRate(Float.valueOf(0.0f));
                response2.setTimestamp(Long.valueOf(System.currentTimeMillis()));
                response = response2;
            } else {
                Long currentTime = request2.getCurrentTime();
                if (currentTime != null) {
                    BuildersKt.launch$default(theseusInteractVideoService.f99893j, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractVideoService$mBusinessMessageHandlers$1$5$3$1(theseusInteractVideoService, currentTime.longValue(), null), 3, (Object) null);
                }
                Float playbackRate = request2.getPlaybackRate();
                if (playbackRate != null) {
                    float fFloatValue = playbackRate.floatValue();
                    if (fFloatValue == 0.0f) {
                        BLog.i("TheseusInteractVideoService$mBusinessMessageHandlers$lambda$0$$inlined$chronosRequestHandler$4-handle", "[theseus-united-TheseusInteractVideoService$mBusinessMessageHandlers$lambda$0$$inlined$chronosRequestHandler$4-handle] interact call player pause");
                        hVar.pause();
                    } else {
                        hVar.r(fFloatValue);
                        hVar.p();
                    }
                }
                UpdatePlaybackStatus.Response response3 = new UpdatePlaybackStatus.Response();
                com.bilibili.ship.theseus.keel.player.j jVarJ2 = hVar.j();
                if (jVarJ2 != null) {
                    lValueOf = Long.valueOf(jVarJ2.L());
                }
                response3.setCurrentTime(lValueOf);
                response3.setPlaybackRate(CompoundPlayStateProviderKt.a(hVar) ? Float.valueOf(hVar.f91108b.b()) : Float.valueOf(0.0f));
                response3.setTimestamp(Long.valueOf(System.currentTimeMillis()));
                response = response3;
            }
            return new ChronosResponseWrapper.Success(response);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$h.class */
    public static final class h implements ChronosRequestHandler<InteractiveVideoShowEndingPage$Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99930a = Reflection.typeOf(InteractiveVideoShowEndingPage$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99931b;

        public h(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99931b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoShowEndingPage$Request> getRequestClass() {
            return InteractiveVideoShowEndingPage$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99930a;
        }

        public final ChronosResponseWrapper<Void> handle(InteractiveVideoShowEndingPage$Request interactiveVideoShowEndingPage$Request) {
            this.f99931b.h(a.f.f99917a);
            return new ChronosResponseWrapper.Success((Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$i.class */
    public static final class i implements ChronosRequestHandler<InteractiveVideoUpdateControlBar$Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99932a = Reflection.typeOf(InteractiveVideoUpdateControlBar$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99933b;

        public i(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99933b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoUpdateControlBar$Request> getRequestClass() {
            return InteractiveVideoUpdateControlBar$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99932a;
        }

        public final ChronosResponseWrapper<Void> handle(InteractiveVideoUpdateControlBar$Request interactiveVideoUpdateControlBar$Request) {
            InteractiveVideoUpdateControlBar$Request interactiveVideoUpdateControlBar$Request2 = interactiveVideoUpdateControlBar$Request;
            String type = interactiveVideoUpdateControlBar$Request2.getType();
            boolean zAreEqual = Intrinsics.areEqual(type, "INTERACTIVE");
            TheseusInteractVideoService theseusInteractVideoService = this.f99933b;
            if (zAreEqual) {
                theseusInteractVideoService.h(new a.c(false, interactiveVideoUpdateControlBar$Request2.getHidden()));
            } else if (Intrinsics.areEqual(type, "INTERACTIVE_WITH_RETRY")) {
                theseusInteractVideoService.h(new a.c(true, interactiveVideoUpdateControlBar$Request2.getHidden()));
            } else {
                theseusInteractVideoService.h(a.b.f99912a);
            }
            return new ChronosResponseWrapper.Success((Object) null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$j.class */
    public static final class j implements ChronosRequestHandler<InteractiveVideoUpdateHiddenVar$Request, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99934a = Reflection.typeOf(InteractiveVideoUpdateHiddenVar$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99935b;

        public j(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99935b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoUpdateHiddenVar$Request> getRequestClass() {
            return InteractiveVideoUpdateHiddenVar$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99934a;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v35 java.util.List<com.bilibili.playerbizcommon.features.interactvideo.model.HiddenVar>, still in use, count: 1, list:
              (r0v35 java.util.List<com.bilibili.playerbizcommon.features.interactvideo.model.HiddenVar>) from 0x008c: INVOKE (r0v43 java.util.Iterator<T>) = (r0v35 java.util.List<com.bilibili.playerbizcommon.features.interactvideo.model.HiddenVar>) INTERFACE call: java.lang.Iterable.iterator():java.util.Iterator A[MD:():java.util.Iterator<T> (c)]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.simplifyMoveInsns(CodeShrinkVisitor.java:289)
            	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:49)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.processForceInlineInsns(RegionMakerVisitor.java:43)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:29)
            */
        public final tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper<java.lang.Void> handle(com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoUpdateHiddenVar$Request r6) {
            /*
                Method dump skipped, instruction units count: 255
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.j.handle(java.lang.Object):tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$k.class */
    public static final class k implements ChronosRequestHandler<InteractiveVideoGetSceneInfo$Request, InteractiveVideoGetSceneInfo$Response> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99936a = Reflection.nullableTypeOf(InteractiveVideoGetSceneInfo$Request.class).isMarkedNullable();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TheseusInteractVideoService f99937b;

        public k(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99937b = theseusInteractVideoService;
        }

        public final Class<InteractiveVideoGetSceneInfo$Request> getRequestClass() {
            return InteractiveVideoGetSceneInfo$Request.class;
        }

        public final boolean getRequestNullable() {
            return this.f99936a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoGetSceneInfo$Response, java.lang.Object] */
        public final ChronosResponseWrapper<InteractiveVideoGetSceneInfo$Response> handle(InteractiveVideoGetSceneInfo$Request interactiveVideoGetSceneInfo$Request) {
            Object success;
            TheseusInteractVideoService theseusInteractVideoService = this.f99937b;
            InteractNode interactNode = theseusInteractVideoService.f99866C;
            if (interactNode == null) {
                success = new Object();
            } else {
                ?? r02 = new Object() { // from class: com.bilibili.ship.theseus.united.page.interactvideo.model.InteractiveVideoGetSceneInfo$Response
                    public static final int $stable = 8;

                    @JSONField(name = "eval_hidden_var_action")
                    @Nullable
                    private String evalHiddenVarAction;

                    @JSONField(name = "scene")
                    @Nullable
                    private String scene;

                    @Nullable
                    public final String getEvalHiddenVarAction() {
                        return this.evalHiddenVarAction;
                    }

                    @Nullable
                    public final String getScene() {
                        return this.scene;
                    }

                    public final void setEvalHiddenVarAction(@Nullable String str) {
                        this.evalHiddenVarAction = str;
                    }

                    public final void setScene(@Nullable String str) {
                        this.scene = str;
                    }
                };
                r02.setScene(theseusInteractVideoService.i(interactNode));
                r02.setEvalHiddenVarAction(CollectionsKt.p(theseusInteractVideoService.f99880Q.entrySet(), ReporterMap.SEMICOLON, (CharSequence) null, (CharSequence) null, new D(1), 30));
                BLog.i("TheseusInteractVideoService$mBusinessMessageHandlers$lambda$0$$inlined$failableChronosRequestHandler$1-handle", "[theseus-united-TheseusInteractVideoService$mBusinessMessageHandlers$lambda$0$$inlined$failableChronosRequestHandler$1-handle] " + z.a("getSceneInfo:", r02.getScene(), " ", r02.getEvalHiddenVarAction()));
                success = new ChronosResponseWrapper.Success((Object) r02);
            }
            return success;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$l.class */
    public static final class l implements ni1.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TheseusInteractVideoService f99938a;

        public l(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99938a = theseusInteractVideoService;
        }

        public final void a(MotionEvent motionEvent) {
            EnhancedChronosView enhancedChronosView = this.f99938a.f99889e.getChronosInteractContainer().i;
            if (enhancedChronosView != null) {
                enhancedChronosView.dispatchTouchEvent(motionEvent);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/TheseusInteractVideoService$m.class */
    public static final class m implements com.bilibili.ship.theseus.keel.player.j, com.bilibili.player.tangram.playercore.v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SequentialPCSPlayable f99939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f99940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TheseusInteractVideoService f99941c;

        public m(TheseusInteractVideoService theseusInteractVideoService) {
            this.f99941c = theseusInteractVideoService;
            this.f99939a = theseusInteractVideoService.f99873J;
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Flow<com.bilibili.player.tangram.basic.a> B() {
            return this.f99939a.B();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Flow<ResolveAndPlayPlayable.c<InterfaceC5778f>> C() {
            return this.f99939a.C();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object D(ContinuationImpl continuationImpl) {
            return this.f99939a.D(continuationImpl);
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object E(Continuation<? super Unit> continuation) {
            return this.f99939a.E(continuation);
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final long F() {
            return this.f99939a.F();
        }

        public final void G(Function1<? super sb0.c, sb0.c> function1) {
            this.f99939a.G(function1);
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Flow<com.bilibili.player.tangram.basic.a> H() {
            return this.f99939a.H();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Flow<Duration> J() {
            return this.f99939a.J();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Object K(com.bilibili.player.tangram.basic.c cVar, ContinuationImpl continuationImpl) {
            return this.f99939a.K(cVar, continuationImpl);
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final long L() {
            return this.f99939a.L();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final Fragment O() {
            return null;
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final void P(boolean z6) {
            this.f99940b = z6;
        }

        public final sb0.c R() {
            return this.f99939a.R();
        }

        public final Flow<L> T() {
            return this.f99939a.T();
        }

        public final L Z() {
            return this.f99939a.Z();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final Object a(Continuation<? super Unit> continuation) {
            this.f99941c.k();
            return Unit.INSTANCE;
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Flow<com.bilibili.player.tangram.playercore.u> b() {
            return this.f99939a.b();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Object c(long j7, boolean z6, Continuation<? super Boolean> continuation) {
            return this.f99939a.c(j7, z6, continuation);
        }

        @Override // com.bilibili.player.tangram.basic.j
        public final Flow<PlayerAvailability> d() {
            return this.f99939a.d();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object d0(Function2 function2, SuspendLambda suspendLambda) {
            return this.f99939a.d0(function2, suspendLambda);
        }

        @Override // com.bilibili.player.tangram.basic.k
        public final Flow<PlayNetworkEnv> e() {
            return this.f99939a.e();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final GeminiCommonPlayableParams f() {
            return (GeminiCommonPlayableParams) this.f99941c.f99874K.getValue();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final Flow<PlayViewUniteReply> g() {
            return this.f99941c.f99875L;
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Long h() {
            return this.f99939a.h();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final ResolveAndPlayPlayable.c<InterfaceC5778f> h0() {
            return this.f99939a.h0();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final com.bilibili.player.tangram.basic.a i() {
            return this.f99939a.i();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final void j(GeminiCommonPlayableParams geminiCommonPlayableParams) {
            this.f99941c.f99874K.setValue(geminiCommonPlayableParams);
        }

        @Override // com.bilibili.player.tangram.basic.j
        public final PlayerAvailability k() {
            return this.f99939a.k();
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final StateFlow<GeminiCommonPlayableParams> l() {
            return this.f99941c.f99874K;
        }

        @Override // com.bilibili.player.tangram.playercore.G
        public final boolean m(com.bilibili.player.tangram.playercore.u uVar) {
            this.f99939a.getClass();
            return false;
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final void n() {
            this.f99939a.n();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final com.bilibili.player.tangram.playercore.u o() {
            return this.f99939a.o();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Duration q() {
            return this.f99939a.q();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Flow<Long> r() {
            return this.f99939a.r();
        }

        public final Flow<sb0.c> s() {
            return this.f99939a.s();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final Flow<List<com.bilibili.player.tangram.basic.a>> t() {
            return this.f99939a.t();
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Object u(Continuation<? super Long> continuation) {
            return this.f99939a.u(continuation);
        }

        @Override // com.bilibili.player.tangram.playercore.v
        public final Flow<A> v() {
            return this.f99939a.v();
        }

        @Override // com.bilibili.player.tangram.basic.l
        public final com.bilibili.player.tangram.basic.a x() {
            return this.f99939a.x();
        }

        @Override // com.bilibili.player.tangram.basic.WithVideoProgress
        public final Object y(long j7, boolean z6, Continuation<? super Boolean> continuation) {
            return this.f99939a.y(j7, z6, continuation);
        }

        @Override // com.bilibili.ship.theseus.keel.player.j
        public final boolean z() {
            return this.f99940b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, tv.danmaku.biliplayerv2.service.gesture.GestureInterceptShield] */
    @AssistedInject
    public TheseusInteractVideoService(@NotNull Context context, @NotNull IControlContainerService iControlContainerService, @NotNull com.bilibili.ship.theseus.united.player.mediaplay.q qVar, @NotNull IPlayerCoreService iPlayerCoreService, @NotNull IInteractLayerService iInteractLayerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IRenderContainerService iRenderContainerService, @NotNull IGestureService iGestureService, @NotNull com.bilibili.playerbizcommon.features.background.h hVar, @NotNull CoroutineScope coroutineScope, @NotNull com.bilibili.ship.theseus.keel.player.h hVar2, @NotNull com.bilibili.ship.theseus.united.page.interactvideo.e eVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar, @NotNull BiliAccounts biliAccounts, @NotNull BackActionRepository backActionRepository, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull c cVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2, @NotNull IToastService iToastService, @NotNull IPlayerSettingService iPlayerSettingService, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull com.bilibili.ship.theseus.united.player.e eVar2, @NotNull GeminiCommonPlayableParams geminiCommonPlayableParams, @Nullable PlayViewUniteReply playViewUniteReply, @NotNull Function2<? super com.bilibili.ship.theseus.keel.player.j, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f99885a = context;
        this.f99886b = iControlContainerService;
        this.f99887c = qVar;
        this.f99888d = iPlayerCoreService;
        this.f99889e = iInteractLayerService;
        this.f99890f = absFunctionWidgetService;
        this.f99891g = iRenderContainerService;
        this.h = iGestureService;
        this.f99892i = hVar;
        this.f99893j = coroutineScope;
        this.f99894k = hVar2;
        this.f99895l = eVar;
        this.f99896m = aVar;
        this.f99897n = biliAccounts;
        this.f99898o = backActionRepository;
        this.f99899p = theseusFloatLayerService;
        this.f99900q = cVar;
        this.f99901r = cVar2;
        this.f99902s = iToastService;
        this.f99903t = iPlayerSettingService;
        this.f99904u = aVar2;
        this.f99905v = eVar2;
        this.f99906w = geminiCommonPlayableParams;
        this.f99907x = playViewUniteReply;
        this.f99908y = function2;
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.TRUE);
        this.f99872I = MutableStateFlow;
        this.f99873J = new SequentialPCSPlayable(MutableStateFlow);
        this.f99874K = StateFlowKt.MutableStateFlow(geminiCommonPlayableParams);
        this.f99875L = SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow) null, 7, (Object) null);
        this.f99877N = new m(this);
        this.f99878O = new l(this);
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        List list = listCreateListBuilder;
        list.add(new k(this));
        list.add(new d(this));
        list.add(new e(this));
        list.add(new f(this));
        list.add(new g(this));
        list.add(new h(this));
        list.add(new i(this));
        list.add(new j(this));
        this.f99879P = CollectionsKt.build(listCreateListBuilder);
        this.f99880Q = new HashMap<>();
        this.f99881R = MapsKt.emptyMap();
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractVideoService$special$$inlined$awaitCancel$1(null, this), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractVideoService$collectHalfHistoriesGraph$1(this, null), 3, (Object) null);
        Video.b interact = geminiCommonPlayableParams.getInteract();
        PlayerToast playerToastBuild = (interact == null || interact.b == 0 || interact.c == interact.d) ? null : new PlayerToast.Builder().level(2).toastItemType(18).location(32).setExtraString("extra_title", context.getString(2131846809)).setExtraString("extra_action_text", context.getString(2131846709)).duration(10000L).messageClickListener(new t(interact, this)).build();
        if (playerToastBuild != null) {
            iToastService.showToast(playerToastBuild);
        }
        this.f99884U = MutexKt.Mutex$default(false, 1, (Object) null);
    }

    public static final void a(TheseusInteractVideoService theseusInteractVideoService) {
        Iterator<T> it = theseusInteractVideoService.f99879P.iterator();
        while (it.hasNext()) {
            theseusInteractVideoService.f99889e.registerChronosMessageHandler((ChronosRequestHandler) it.next());
        }
        IGestureService iGestureService = theseusInteractVideoService.h;
        theseusInteractVideoService.f99868E = iGestureService.isResizeGestureForbidden();
        iGestureService.forbiddenResizeGesture(true);
        com.bilibili.playerbizcommon.features.background.h hVar = theseusInteractVideoService.f99892i;
        hVar.isEnable();
        theseusInteractVideoService.f99867D = hVar.isSettingAvailable();
        hVar.setSettingAvailable(false);
        Video.b interactParams = theseusInteractVideoService.f99906w.getInteractParams();
        if (interactParams != null) {
            theseusInteractVideoService.j(new com.bilibili.app.gemini.ugc.feature.interactivevideo.j(interactParams.d), theseusInteractVideoService.f99907x, false);
        } else {
            theseusInteractVideoService.m();
            BLog.e("TheseusInteractVideoService-enterInteractVideo", "[theseus-united-TheseusInteractVideoService-enterInteractVideo] enterInteractVideo, invalid params", (Throwable) null);
        }
    }

    public static final void b(TheseusInteractVideoService theseusInteractVideoService) {
        Iterator<T> it = theseusInteractVideoService.f99879P.iterator();
        while (it.hasNext()) {
            theseusInteractVideoService.f99889e.unregisterChronosMessageHandler((ChronosRequestHandler) it.next());
        }
        boolean z6 = theseusInteractVideoService.f99868E;
        IGestureService iGestureService = theseusInteractVideoService.h;
        iGestureService.forbiddenResizeGesture(z6);
        iGestureService.forbiddenInnerTouchEvent(false);
        theseusInteractVideoService.f99892i.setSettingAvailable(theseusInteractVideoService.f99867D);
    }

    public static final void c(TheseusInteractVideoService theseusInteractVideoService, long j7, long j8, String str) {
        InteractNode interactNode;
        if (j8 == ((GeminiCommonPlayableParams) theseusInteractVideoService.f99874K.getValue()).getCid() && (interactNode = theseusInteractVideoService.f99866C) != null && j7 == interactNode.getNodeid()) {
            return;
        }
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "jump node :", " ");
        sbA.append(j8);
        BLog.i("TheseusInteractVideoService-handleJumpNode", "[theseus-united-TheseusInteractVideoService-handleJumpNode] " + sbA.toString());
        theseusInteractVideoService.j(new com.bilibili.app.gemini.ugc.feature.interactivevideo.j(j7, j8, str, System.currentTimeMillis() - theseusInteractVideoService.f99870G, 0, 0, 0), null, true);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Job d(TheseusInteractVideoService theseusInteractVideoService, CoroutineScope coroutineScope, b bVar, GeminiCommonPlayableParams geminiCommonPlayableParams) throws NoWhenBranchMatchedException {
        Job jobLaunch$default;
        theseusInteractVideoService.getClass();
        if (bVar instanceof b.a) {
            geminiCommonPlayableParams.setTitle((String) null);
            b.a aVar = (b.a) bVar;
            String str = aVar.f99920b;
            int i7 = aVar.f99919a;
            if (i7 == 99003 && str != null && str.length() != 0) {
                ToastHelper.showToast(theseusInteractVideoService.f99885a, str, 0);
            }
            theseusInteractVideoService.l(null);
            theseusInteractVideoService.f99869F = i7;
            BLog.i("TheseusInteractVideoService-handleNodeInfoResult", "[theseus-united-TheseusInteractVideoService-handleNodeInfoResult] " + C3259x.a(i7, "Handling node info fail"));
            theseusInteractVideoService.m();
            jobLaunch$default = null;
        } else {
            if (!(bVar instanceof b.C0995b)) {
                throw new NoWhenBranchMatchedException();
            }
            jobLaunch$default = BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new TheseusInteractVideoService$handleNodeInfoResult$2(geminiCommonPlayableParams, bVar, theseusInteractVideoService, null), 1, (Object) null);
        }
        return jobLaunch$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService r6, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r7, com.bilibili.app.gemini.ugc.feature.interactivevideo.j r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.e(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams, com.bilibili.app.gemini.ugc.feature.interactivevideo.j, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0030  */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService r6, boolean r7, boolean r8, kotlin.coroutines.jvm.internal.ContinuationImpl r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.f(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService, boolean, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService r10, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams r11, com.bilibili.app.gemini.ugc.feature.interactivevideo.j r12, kotlinx.coroutines.flow.MutableSharedFlow r13, com.bilibili.ship.theseus.keel.player.j r14, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply r15, kotlin.coroutines.jvm.internal.ContinuationImpl r16) throws kotlin.KotlinNothingValueException {
        /*
            r0 = r10
            java.lang.Class r0 = r0.getClass()
            r0 = r16
            boolean r0 = r0 instanceof com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$1
            if (r0 == 0) goto L36
            r0 = r16
            com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$1 r0 = (com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$1) r0
            r18 = r0
            r0 = r18
            int r0 = r0.label
            r17 = r0
            r0 = r17
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L36
            r0 = r18
            r1 = r17
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1 + r2
            r0.label = r1
            r0 = r18
            r16 = r0
            goto L42
        L36:
            com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$1 r0 = new com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$1
            r1 = r0
            r2 = r10
            r3 = r16
            r1.<init>(r2, r3)
            r16 = r0
        L42:
            r0 = r16
            java.lang.Object r0 = r0.result
            r19 = r0
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r18 = r0
            r0 = r16
            int r0 = r0.label
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L73
            r0 = r17
            r1 = 1
            if (r0 == r1) goto L6b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L6b:
            r0 = r19
            kotlin.ResultKt.throwOnFailure(r0)
            goto L9d
        L73:
            r0 = r19
            kotlin.ResultKt.throwOnFailure(r0)
            com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2 r0 = new com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService$runNode$2
            r1 = r0
            r2 = r14
            r3 = r10
            r4 = r11
            r5 = r15
            r6 = r12
            r7 = r13
            r8 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r10 = r0
            r0 = r16
            r1 = 1
            r0.label = r1
            r0 = r10
            r1 = r16
            java.lang.Object r0 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r1)
            r1 = r18
            if (r0 != r1) goto L9d
            r0 = r18
            return r0
        L9d:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r1 = r0
            r1.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService.g(com.bilibili.ship.theseus.united.page.interactvideo.TheseusInteractVideoService, com.bilibili.app.gemini.base.player.GeminiCommonPlayableParams, com.bilibili.app.gemini.ugc.feature.interactivevideo.j, kotlinx.coroutines.flow.MutableSharedFlow, com.bilibili.ship.theseus.keel.player.j, com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void h(a aVar) {
        BuildersKt.launch$default(this.f99893j, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractVideoService$emitNodeAction$1(this, aVar, null), 3, (Object) null);
    }

    public final String i(InteractNode interactNode) throws JSONException {
        String edges = interactNode.getEdges();
        if (edges == null) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject(edges);
        jSONObject.put("video_duration", this.f99888d.getDuration());
        return jSONObject.put("video_aspect", Float.valueOf(this.f99891g.getVideoRatio())).toString();
    }

    public final void j(@NotNull com.bilibili.app.gemini.ugc.feature.interactivevideo.j jVar, @Nullable PlayViewUniteReply playViewUniteReply, boolean z6) {
        if (jVar.a < 0) {
            k();
            return;
        }
        GeminiCommonPlayableParams geminiCommonPlayableParams = this.f99906w;
        long cid = geminiCommonPlayableParams.getCid();
        long j7 = jVar.b;
        GeminiCommonPlayableParams geminiCommonPlayableParams2 = geminiCommonPlayableParams;
        if (cid != j7) {
            geminiCommonPlayableParams2 = (GeminiCommonPlayableParams) new Gson().fromJson(new Gson().toJson(geminiCommonPlayableParams, GeminiCommonPlayableParams.class), GeminiCommonPlayableParams.class);
            geminiCommonPlayableParams2.setCid(j7);
        }
        Job job = this.f99883T;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f99883T = BuildersKt.launch$default(this.f99893j, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractVideoService$playInteractNode$1(this, z6, geminiCommonPlayableParams2, jVar, playViewUniteReply, null), 3, (Object) null);
    }

    public final void k() {
        this.f99880Q.clear();
        Video.b interactParams = this.f99906w.getInteractParams();
        if (interactParams != null) {
            j(new com.bilibili.app.gemini.ugc.feature.interactivevideo.j(0L, interactParams.d, "", 0L, 1, 0, 0), null, true);
        } else {
            m();
            BLog.e("TheseusInteractVideoService-replayVideo", "[theseus-united-TheseusInteractVideoService-replayVideo] replayVideo, invalid params", (Throwable) null);
        }
    }

    public final void l(InteractNode interactNode) {
        this.f99866C = interactNode;
        this.f99895l.f99967d = interactNode != null ? interactNode.getTitle() : null;
    }

    public final void m() {
        Job job = this.f99864A;
        if (job != null && job.isActive()) {
            BLog.i("TheseusInteractVideoService-showNodeInfoLoadFailedTips", "[theseus-united-TheseusInteractVideoService-showNodeInfoLoadFailedTips] showNodeInfoLoadFailedTips, widget is showing");
            return;
        }
        IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-1, -1);
        layoutParams.setFunctionType(1);
        layoutParams.setLayoutType(32);
        this.f99864A = BuildersKt.launch$default(this.f99893j, (CoroutineContext) null, (CoroutineStart) null, new TheseusInteractVideoService$showNodeInfoLoadFailedTips$1(this, new o(this.f99885a, this, this.f99898o), layoutParams, null), 3, (Object) null);
    }
}
