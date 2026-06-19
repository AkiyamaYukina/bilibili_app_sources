package com.bilibili.ship.theseus.ugc.weblayer;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.common.webview.js.JsBridgeCallHandlerFactoryV2;
import com.bilibili.common.webview.js.JsBridgeCallHandlerV2;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.droid.ScreenUtil;
import com.bilibili.droid.thread.HandlerThreads;
import com.bilibili.lib.jsbridge.common.BaseJsBridgeCallHandlerV2;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import com.bilibili.opd.app.bizcommon.context.provider.MallProviderParamsHelper;
import com.bilibili.player.history.MediaHistoryEntry;
import com.bilibili.player.history.MediaHistoryHelper;
import com.bilibili.playerbizcommon.note.NoteEditTimeInfoDialog;
import com.bilibili.ship.theseus.ugc.play.UGCPlaybackRepository;
import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.castscreen.TheseusCastScreenRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import cq0.C6748a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kntr.common.screen.adjust.KScreenAdjustUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import uv0.C8768a;
import uv0.C8769b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService.class */
@StabilityInferred(parameters = 0)
public final class NoteFloatLayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f98596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f98597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f98598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final FragmentManager f98599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final List<Av0.a> f98600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final UGCPlaybackRepository f98601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final C8043a f98602g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.intro.ugcheadline.p f98603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final TheseusCastScreenRepository f98604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final C8769b f98605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f98606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.toolbar.j f98607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f98608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final PlayerContainer f98609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f98610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final BackActionRepository f98611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.activitywindow.m f98612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public Job f98613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Job f98614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @Nullable
    public Job f98615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f98616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public String f98617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public a f98618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @Nullable
    public Oq0.c f98619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public NoteEditTimeInfoDialog f98620z;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final NoteFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$1$1.class */
        public static final class C09281 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            Object L$0;
            int label;
            final NoteFloatLayerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$1$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$1$1$1.class */
            public static final class C09291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final String $it;
                int label;
                final NoteFloatLayerService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09291(NoteFloatLayerService noteFloatLayerService, String str, Continuation<? super C09291> continuation) {
                    super(2, continuation);
                    this.this$0 = noteFloatLayerService;
                    this.$it = str;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09291(this.this$0, this.$it, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        NoteFloatLayerService noteFloatLayerService = this.this$0;
                        String str = this.$it;
                        this.label = 1;
                        noteFloatLayerService.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new NoteFloatLayerService$showNoteEditPanel$2(noteFloatLayerService, str, null), this);
                        if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objCoroutineScope = Unit.INSTANCE;
                        }
                        if (objCoroutineScope == coroutine_suspended) {
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
            public C09281(NoteFloatLayerService noteFloatLayerService, CoroutineScope coroutineScope, Continuation<? super C09281> continuation) {
                super(2, continuation);
                this.this$0 = noteFloatLayerService;
                this.$$this$launch = coroutineScope;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C09281 c09281 = new C09281(this.this$0, this.$$this$launch, continuation);
                c09281.L$0 = obj;
                return c09281;
            }

            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return create(str, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                Job job = this.this$0.f98613s;
                if (job != null && job.isActive()) {
                    return Unit.INSTANCE;
                }
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                noteFloatLayerService.f98613s = BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new C09291(noteFloatLayerService, str, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = noteFloatLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
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
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                SharedFlow<String> sharedFlow = noteFloatLayerService.f98605k.f127997b;
                C09281 c09281 = new C09281(noteFloatLayerService, coroutineScope, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c09281, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final NoteFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C8768a, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            Object L$0;
            int label;
            final NoteFloatLayerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$2$1$1.class */
            public static final class C09301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final C8768a $it;
                Object L$0;
                Object L$1;
                int label;
                final NoteFloatLayerService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09301(C8768a c8768a, NoteFloatLayerService noteFloatLayerService, Continuation<? super C09301> continuation) {
                    super(2, continuation);
                    this.$it = c8768a;
                    this.this$0 = noteFloatLayerService;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09301(this.$it, this.this$0, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 202
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService.AnonymousClass2.AnonymousClass1.C09301.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NoteFloatLayerService noteFloatLayerService, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = noteFloatLayerService;
                this.$$this$launch = coroutineScope;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(C8768a c8768a, Continuation<? super Unit> continuation) {
                return create(c8768a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C8768a c8768a = (C8768a) this.L$0;
                Job job = this.this$0.f98614t;
                if (job != null && job.isActive()) {
                    return Unit.INSTANCE;
                }
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                noteFloatLayerService.f98614t = BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new C09301(c8768a, noteFloatLayerService, null), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = noteFloatLayerService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
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
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                SharedFlow<C8768a> sharedFlow = noteFloatLayerService.f98605k.f127999d;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(noteFloatLayerService, coroutineScope, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NoteFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final NoteFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = noteFloatLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    NoteFloatLayerService noteFloatLayerService = this.this$0;
                    this.label = 1;
                    noteFloatLayerService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new NoteFloatLayerService$showNoteList$2(noteFloatLayerService, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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
        public AnonymousClass3(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = noteFloatLayerService;
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
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                SharedFlow<Unit> sharedFlow = noteFloatLayerService.f98605k.f128001f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(noteFloatLayerService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final NoteFloatLayerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.weblayer.NoteFloatLayerService$4$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$4$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final NoteFloatLayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = noteFloatLayerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(Unit unit, Continuation<? super Unit> continuation) {
                return create(unit, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    NoteFloatLayerService noteFloatLayerService = this.this$0;
                    this.label = 1;
                    noteFloatLayerService.getClass();
                    Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new NoteFloatLayerService$showNoteList$2(noteFloatLayerService, null), this);
                    if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCoroutineScope = Unit.INSTANCE;
                    }
                    if (objCoroutineScope == coroutine_suspended) {
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
        public AnonymousClass4(NoteFloatLayerService noteFloatLayerService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = noteFloatLayerService;
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
                NoteFloatLayerService noteFloatLayerService = this.this$0;
                SharedFlow<Unit> sharedFlow = noteFloatLayerService.f98607m.f103404i;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(noteFloatLayerService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/weblayer/NoteFloatLayerService$a.class */
    public final class a extends BaseJsBridgeCallHandlerV2<IJsBridgeBehavior> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f98621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f98622b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f98623c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final NoteFloatLayerService f98624d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@Nullable NoteFloatLayerService noteFloatLayerService, i iVar) {
            super(iVar);
            this.f98624d = noteFloatLayerService;
        }

        @NotNull
        public final String[] getSupportFunctions() {
            return new String[]{"clickTimeTag", "closePage", "pageDismiss", "openEditNote", "openNoteList", "getVideoTimeTag", "getVideoTagInfo", "getCapture", "appendCommentText", "keyboardEvent"};
        }

        @NotNull
        public final String getTag() {
            return "JsBridgeCallHandlerUgcVideoCustom";
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final void invokeNative(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable final String str2) {
            String str3;
            int iHashCode = str.hashCode();
            final NoteFloatLayerService noteFloatLayerService = this.f98624d;
            switch (iHashCode) {
                case -2126747917:
                    if (str.equals("keyboardEvent")) {
                        this.f98623c = jSONObject != null ? jSONObject.getString("onKeyboardEventCallbackId") : null;
                        if (str2 != null && str2.length() != 0) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("code", 0);
                            jSONObject2.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject2});
                            break;
                        }
                    }
                    break;
                case -2102552910:
                    if (str.equals("pageWindowModeChanged")) {
                        this.f98622b = jSONObject != null ? jSONObject.getString("onMultiWindowModeChangedCallbackId") : null;
                        if (str2 != null && str2.length() != 0) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("code", 0);
                            jSONObject3.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject3});
                            break;
                        }
                    }
                    break;
                case -758518043:
                    if (str.equals("clickTimeTag") && jSONObject != null) {
                        final Long l7 = jSONObject.getLong("aid");
                        final Long l8 = jSONObject.getLong("cid");
                        final Integer integer = jSONObject.getInteger("millisecond");
                        if (l7.longValue() > 0 && l8.longValue() > 0 && integer.intValue() >= 0) {
                            HandlerThreads.post(0, new Runnable(noteFloatLayerService, l7, l8, integer) { // from class: com.bilibili.ship.theseus.ugc.weblayer.g

                                /* JADX INFO: renamed from: a, reason: collision with root package name */
                                public final NoteFloatLayerService f98680a;

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final Long f98681b;

                                /* JADX INFO: renamed from: c, reason: collision with root package name */
                                public final Long f98682c;

                                /* JADX INFO: renamed from: d, reason: collision with root package name */
                                public final Integer f98683d;

                                {
                                    this.f98680a = noteFloatLayerService;
                                    this.f98681b = l7;
                                    this.f98682c = l8;
                                    this.f98683d = integer;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object next;
                                    NoteFloatLayerService noteFloatLayerService2 = this.f98680a;
                                    Long l9 = this.f98681b;
                                    Long l10 = this.f98682c;
                                    Integer num = this.f98683d;
                                    long jLongValue = l9.longValue();
                                    long jLongValue2 = l10.longValue();
                                    int iIntValue = num.intValue();
                                    Av0.a aVarC = noteFloatLayerService2.f98601f.c();
                                    if (aVarC != null && noteFloatLayerService2.h.a() == jLongValue) {
                                        Iterator<T> it = noteFloatLayerService2.f98600e.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            } else {
                                                next = it.next();
                                                if (((Av0.a) next).f591b == aVarC.f591b) {
                                                    break;
                                                }
                                            }
                                        }
                                        Av0.a aVar = (Av0.a) next;
                                        if (aVar == null) {
                                            return;
                                        }
                                        HandlerThreads.post(0, new Runnable(aVarC, jLongValue2, noteFloatLayerService2, iIntValue, aVar) { // from class: com.bilibili.ship.theseus.ugc.weblayer.a

                                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                                            public final Av0.a f98668a;

                                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                                            public final long f98669b;

                                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                                            public final NoteFloatLayerService f98670c;

                                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                                            public final int f98671d;

                                            /* JADX INFO: renamed from: e, reason: collision with root package name */
                                            public final Av0.a f98672e;

                                            {
                                                this.f98668a = aVarC;
                                                this.f98669b = jLongValue2;
                                                this.f98670c = noteFloatLayerService2;
                                                this.f98671d = iIntValue;
                                                this.f98672e = aVar;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Av0.a aVar2 = this.f98668a;
                                                long j7 = this.f98669b;
                                                NoteFloatLayerService noteFloatLayerService3 = this.f98670c;
                                                int i7 = this.f98671d;
                                                Av0.a aVar3 = this.f98672e;
                                                if (aVar2.f591b == j7) {
                                                    BuildersKt.launch$default(noteFloatLayerService3.f98596a, (CoroutineContext) null, (CoroutineStart) null, new NoteFloatLayerService$seekPosition$1$1(noteFloatLayerService3, i7, null), 3, (Object) null);
                                                } else {
                                                    MediaHistoryHelper.Companion.getInstance().write(new C6748a(j7), new MediaHistoryEntry(i7));
                                                    UGCPlaybackRepository.g(noteFloatLayerService3.f98601f, noteFloatLayerService3.h.a(), aVar3.f591b, null, null, 0, 12);
                                                }
                                                BuildersKt.launch$default(noteFloatLayerService3.f98596a, (CoroutineContext) null, (CoroutineStart) null, new NoteFloatLayerService$seekPosition$1$2(noteFloatLayerService3, i7, null), 3, (Object) null);
                                            }
                                        });
                                    }
                                }
                            });
                        }
                        if (str2 != null && str2.length() != 0) {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("code", 0);
                            jSONObject4.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject4});
                            break;
                        }
                    }
                    break;
                case -482608985:
                    if (str.equals("closePage")) {
                        HandlerThreads.post(0, new e(noteFloatLayerService, 0));
                        if (str2 != null && str2.length() != 0) {
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("code", 0);
                            jSONObject5.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject5});
                            break;
                        }
                    }
                    break;
                case -225760230:
                    if (str.equals("openNoteList")) {
                        HandlerThreads.post(0, new Runnable(noteFloatLayerService) { // from class: com.bilibili.ship.theseus.ugc.weblayer.d

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final NoteFloatLayerService f98675a;

                            {
                                this.f98675a = noteFloatLayerService;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                NoteFloatLayerService noteFloatLayerService2 = this.f98675a;
                                noteFloatLayerService2.getClass();
                                BuildersKt.launch$default(noteFloatLayerService2.f98596a, (CoroutineContext) null, (CoroutineStart) null, new NoteFloatLayerService$openNoteList$1(noteFloatLayerService2, null), 3, (Object) null);
                            }
                        });
                        break;
                    }
                    break;
                case -204792442:
                    if (str.equals("openEditNote")) {
                        HandlerThreads.post(0, new Runnable(noteFloatLayerService) { // from class: com.bilibili.ship.theseus.ugc.weblayer.c

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final NoteFloatLayerService f98674a;

                            {
                                this.f98674a = noteFloatLayerService;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                NoteFloatLayerService noteFloatLayerService2 = this.f98674a;
                                noteFloatLayerService2.getClass();
                                BuildersKt.launch$default(noteFloatLayerService2.f98596a, (CoroutineContext) null, (CoroutineStart) null, new NoteFloatLayerService$openNoteEdit$1(noteFloatLayerService2, null), 3, (Object) null);
                            }
                        });
                        break;
                    }
                    break;
                case -69967645:
                    if (str.equals("getVideoTagInfo")) {
                        HandlerThreads.post(0, new Runnable(noteFloatLayerService, str2) { // from class: com.bilibili.ship.theseus.ugc.weblayer.f

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final NoteFloatLayerService f98678a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final String f98679b;

                            {
                                this.f98678a = noteFloatLayerService;
                                this.f98679b = str2;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                NoteFloatLayerService noteFloatLayerService2 = this.f98678a;
                                String str4 = this.f98679b;
                                NoteEditTimeInfoDialog noteEditTimeInfoDialog = noteFloatLayerService2.f98620z;
                                NoteEditTimeInfoDialog noteEditTimeInfoDialog2 = noteEditTimeInfoDialog;
                                if (noteEditTimeInfoDialog == null) {
                                    noteEditTimeInfoDialog2 = new NoteEditTimeInfoDialog();
                                    noteFloatLayerService2.f98620z = noteEditTimeInfoDialog2;
                                }
                                if (noteEditTimeInfoDialog2.isVisible()) {
                                    return;
                                }
                                noteFloatLayerService2.f98619y = noteFloatLayerService2.b();
                                com.bilibili.ship.theseus.keel.player.j jVarJ = noteFloatLayerService2.f98598c.j();
                                noteEditTimeInfoDialog2.f80234g = jVarJ != null ? jVarJ.L() : 0L;
                                noteEditTimeInfoDialog2.h = str4;
                                noteEditTimeInfoDialog2.f80235i = new q(noteFloatLayerService2);
                                noteEditTimeInfoDialog2.showNow(noteFloatLayerService2.f98599d, "TimeInfo");
                            }
                        });
                        break;
                    }
                    break;
                case 165415688:
                    if (str.equals("getVideoTimeTag")) {
                        Oq0.c cVarB = noteFloatLayerService.b();
                        if (str2 != null && str2.length() != 0 && cVarB != null) {
                            JSONObject jSONObject6 = new JSONObject();
                            String str4 = cVarB.f18016g;
                            if (str4.length() == 0) {
                                JSONObject jSONObject7 = new JSONObject();
                                jSONObject7.put("millisecond", Integer.valueOf(cVarB.f18010a));
                                jSONObject7.put("cid", Long.valueOf(cVarB.f18011b));
                                jSONObject7.put("pageCount", Integer.valueOf(cVarB.f18012c));
                                jSONObject7.put(MallProviderParamsHelper.ActiveProviderParams.URI_QUERY_PAGE, Integer.valueOf(cVarB.f18013d));
                                jSONObject7.put("title", cVarB.f18014e);
                                jSONObject7.put("pageTitle", cVarB.f18015f);
                                jSONObject6.put(TextSource.CFG_CONTENT, jSONObject7);
                                str4 = "";
                            }
                            jSONObject6.put("code", 0);
                            jSONObject6.put("message", str4);
                            callbackToJs(new Object[]{str2, jSONObject6});
                            break;
                        }
                    }
                    break;
                case 187278514:
                    if (str.equals("appendCommentText") && (str3 = noteFloatLayerService.f98617w) != null && str3.length() > 0 && str2 != null && str2.length() != 0) {
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("code", 0);
                        jSONObject8.put("message", "");
                        jSONObject8.put(TextSource.CFG_CONTENT, str3);
                        callbackToJs(new Object[]{str2, jSONObject8});
                    }
                    break;
                case 505264379:
                    if (str.equals("pageDismiss")) {
                        this.f98621a = jSONObject != null ? jSONObject.getString("onPageDismissCallbackId") : null;
                        if (str2 != null && str2.length() != 0) {
                            JSONObject jSONObject9 = new JSONObject();
                            jSONObject9.put("code", 0);
                            jSONObject9.put("message", "");
                            callbackToJs(new Object[]{str2, jSONObject9});
                            break;
                        }
                    }
                    break;
                case 1589445392:
                    if (str.equals("getCapture")) {
                        h hVar = new h(str2, this);
                        boolean zC = noteFloatLayerService.f98604j.c();
                        ComponentActivity componentActivity = noteFloatLayerService.f98597b;
                        if (!zC) {
                            noteFloatLayerService.f98609o.getRenderContainerService().takeVideoCapture(new j(noteFloatLayerService, hVar), ScreenUtil.getScreenWidth(componentActivity), -2);
                        } else {
                            hVar.a(null, componentActivity.getString(2131845652));
                        }
                        break;
                    }
                    break;
            }
        }

        public final void onKeyboardEvent(boolean z6, int i7) {
            defpackage.a.b("[theseus-ugc-NoteFloatLayerService$JsBridgeCallHandlerUgcVideoCustom-onKeyboardEvent] ", "onKeyboardEvent: open=" + z6 + ", height=" + i7, "NoteFloatLayerService$JsBridgeCallHandlerUgcVideoCustom-onKeyboardEvent");
            String str = this.f98623c;
            if (str != null) {
                JSONObject jSONObject = new JSONObject();
                pl.h.a(0, jSONObject, "code", "message", "");
                jSONObject.put("isOpen", Boolean.valueOf(z6));
                jSONObject.put("height", Integer.valueOf(i7));
                callbackToJs(new Object[]{str, jSONObject});
            }
        }
    }

    @Inject
    public NoteFloatLayerService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull FragmentManager fragmentManager, @NotNull List<Av0.a> list, @NotNull UGCPlaybackRepository uGCPlaybackRepository, @NotNull C8043a c8043a, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull com.bilibili.ship.theseus.ugc.intro.ugcheadline.p pVar, @NotNull TheseusCastScreenRepository theseusCastScreenRepository, @NotNull C8769b c8769b, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull com.bilibili.ship.theseus.united.page.toolbar.j jVar, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull PlayerContainer playerContainer, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull BackActionRepository backActionRepository, @NotNull com.bilibili.ship.theseus.united.page.activitywindow.m mVar) {
        this.f98596a = coroutineScope;
        this.f98597b = componentActivity;
        this.f98598c = hVar;
        this.f98599d = fragmentManager;
        this.f98600e = list;
        this.f98601f = uGCPlaybackRepository;
        this.f98602g = c8043a;
        this.h = aVar;
        this.f98603i = pVar;
        this.f98604j = theseusCastScreenRepository;
        this.f98605k = c8769b;
        this.f98606l = aVar2;
        this.f98607m = jVar;
        this.f98608n = gVar;
        this.f98609o = playerContainer;
        this.f98610p = theseusFloatLayerService;
        this.f98611q = backActionRepository;
        this.f98612r = mVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
    }

    public static final Object a(final NoteFloatLayerService noteFloatLayerService, String str, Continuation continuation) {
        noteFloatLayerService.f98616v = false;
        noteFloatLayerService.f98618x = new a(noteFloatLayerService, new i(noteFloatLayerService));
        com.bilibili.ogv.infra.jsb.d dVar = new com.bilibili.ogv.infra.jsb.d();
        dVar.f67876b.put("ugcvideo", new JsBridgeCallHandlerFactoryV2(noteFloatLayerService) { // from class: com.bilibili.ship.theseus.ugc.weblayer.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final NoteFloatLayerService f98673a;

            {
                this.f98673a = noteFloatLayerService;
            }

            public final JsBridgeCallHandlerV2 create() {
                return this.f98673a.f98618x;
            }
        });
        com.bilibili.ship.theseus.united.page.screensize.a aVar = noteFloatLayerService.f98606l;
        TheseusWebUIComponent theseusWebUIComponent = new TheseusWebUIComponent(str, dVar, new TheseusWebUIComponent.a(false, "", 0, 0, 0, false, 0, false, 0, DimenUtilsKt.dpToPx(KScreenAdjustUtilsKt.contentWebViewMaxWith$default(aVar.b(), 0, 1, (Object) null)), false, true, aVar.f102941e, 360380), null, null, null, null, 120);
        ArrayList arrayList = new ArrayList();
        SelectKt$selectCancellingUnselected$scope$1 selectKt$selectCancellingUnselected$scope$1 = new SelectKt$selectCancellingUnselected$scope$1(arrayList);
        selectKt$selectCancellingUnselected$scope$1.b(new NoteFloatLayerService$showNoteGuestPanel$2$1(noteFloatLayerService, theseusWebUIComponent, null));
        selectKt$selectCancellingUnselected$scope$1.a(theseusWebUIComponent.f104195o);
        selectKt$selectCancellingUnselected$scope$1.b(new NoteFloatLayerService$showNoteGuestPanel$2$2(noteFloatLayerService, null));
        Unit unit = Unit.INSTANCE;
        Object objFirst = FlowKt.first(FlowKt.merge(arrayList), continuation);
        if (objFirst != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            objFirst = Unit.INSTANCE;
        }
        return objFirst;
    }

    public final Oq0.c b() {
        Oq0.c cVar;
        if (this.f98604j.c()) {
            return new Oq0.c(0, 0L, 0, 0, null, null, this.f98597b.getString(2131845428), 63);
        }
        Av0.a aVarC = this.f98601f.c();
        if (aVarC == null) {
            return null;
        }
        com.bilibili.ship.theseus.keel.player.j jVarJ = this.f98598c.j();
        int iL = jVarJ != null ? (int) jVarJ.L() : 0;
        int size = this.f98600e.size();
        com.bilibili.ship.theseus.ugc.intro.ugcheadline.p pVar = this.f98603i;
        if (size > 1) {
            cVar = new Oq0.c(iL, aVarC.f591b, size, this.f98600e.indexOf(aVarC) + 1, pVar.a(), aVarC.f593d, null, 64);
        } else {
            cVar = new Oq0.c(iL, aVarC.f591b, 1, 1, pVar.a(), null, null, 96);
        }
        return cVar;
    }
}
