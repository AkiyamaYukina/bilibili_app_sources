package com.bilibili.ship.theseus.ugc.intro.ai;

import De0.C1577j;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.base.MainThread;
import com.bilibili.lib.jsbridge.common.BaseJsBridgeCallHandlerV2;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.player.tangram.basic.PlayerAvailability;
import com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$showFeedbackLayer$1;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.toolbar.C6417a;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService.class */
@StabilityInferred(parameters = 0)
public final class UgcAiFeedbackService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f96938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f96939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f96940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final com.bilibili.playerbizcommonv2.service.ai.a f96941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f96942e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f96943f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f96944g;

    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C6417a f96945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f96946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f96947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f96948l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f96950n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public Job f96953q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f96955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Long f96956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f96957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f96958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f96959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public Integer f96960x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96949m = StateFlowKt.MutableStateFlow(Boolean.FALSE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96951o = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f96952p = StateFlowKt.MutableStateFlow((Object) null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f96954r = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final String f96961y = "https://www.bilibili.com/york/interactive/h5/overseas/question";

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcAiFeedbackService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$1$1.class */
        public static final class C08311 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            boolean Z$0;
            int label;
            final UgcAiFeedbackService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08311(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super C08311> continuation) {
                super(2, continuation);
                this.this$0 = ugcAiFeedbackService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C08311 c08311 = new C08311(this.this$0, continuation);
                c08311.Z$0 = ((Boolean) obj).booleanValue();
                return c08311;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
                return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!this.Z$0) {
                    return Unit.INSTANCE;
                }
                if (Intrinsics.areEqual(this.this$0.f96951o.getValue(), Boxing.boxBoolean(true))) {
                    this.this$0.f96951o.tryEmit(Boxing.boxBoolean(false));
                }
                UgcAiFeedbackService.a(this.this$0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcAiFeedbackService;
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
                UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
                MutableStateFlow<Boolean> mutableStateFlow = ugcAiFeedbackService.f96949m;
                C08311 c08311 = new C08311(ugcAiFeedbackService, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlow, c08311, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcAiFeedbackService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<LanguageItem, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcAiFeedbackService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcAiFeedbackService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(LanguageItem languageItem, Continuation<? super Unit> continuation) {
                return create(languageItem, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                LanguageItem languageItem = (LanguageItem) this.L$0;
                UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
                if (ugcAiFeedbackService.f96955s || ugcAiFeedbackService.f96957u) {
                    return Unit.INSTANCE;
                }
                String strC = languageItem != null ? languageItem.c() : null;
                ugcAiFeedbackService.f96952p.setValue(Boxing.boxBoolean((strC == null || strC.length() == 0 || languageItem.h() != 2) ? false : true));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcAiFeedbackService;
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
                MutableStateFlow mutableStateFlowB0 = this.this$0.f96941d.b0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(mutableStateFlowB0, anonymousClass1, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcAiFeedbackService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<C7893a.C1318a, Continuation<? super Unit>, Object> {
            int label;
            final UgcAiFeedbackService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcAiFeedbackService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(C7893a.C1318a c1318a, Continuation<? super Unit> continuation) {
                return create(c1318a, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
                if (!Intrinsics.areEqual(ugcAiFeedbackService.f96956t, ugcAiFeedbackService.f96942e.b())) {
                    UgcAiFeedbackService ugcAiFeedbackService2 = this.this$0;
                    ugcAiFeedbackService2.f96956t = ugcAiFeedbackService2.f96942e.b();
                    UgcAiFeedbackService ugcAiFeedbackService3 = this.this$0;
                    ugcAiFeedbackService3.f96955s = false;
                    ugcAiFeedbackService3.f96951o.setValue((Object) null);
                    this.this$0.f96952p.setValue((Object) null);
                    UgcAiFeedbackService ugcAiFeedbackService4 = this.this$0;
                    ugcAiFeedbackService4.f96957u = false;
                    ugcAiFeedbackService4.f96949m.setValue(Boxing.boxBoolean(false));
                    UgcAiFeedbackService ugcAiFeedbackService5 = this.this$0;
                    ugcAiFeedbackService5.f96958v = false;
                    ugcAiFeedbackService5.f96959w = false;
                    ugcAiFeedbackService5.b();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcAiFeedbackService;
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
                UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
                ugcAiFeedbackService.f96956t = ugcAiFeedbackService.f96942e.b();
                UgcAiFeedbackService ugcAiFeedbackService2 = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = ugcAiFeedbackService2.f96942e.f123393f;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcAiFeedbackService2, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcAiFeedbackService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ugcAiFeedbackService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(UgcAiFeedbackService ugcAiFeedbackService) {
            if (Intrinsics.areEqual(ugcAiFeedbackService.f96951o.getValue(), Boolean.TRUE)) {
                ugcAiFeedbackService.f96951o.tryEmit(Boolean.FALSE);
            }
            UgcAiFeedbackService.a(ugcAiFeedbackService);
            return Unit.INSTANCE;
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
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
                    ugcAiFeedbackService.f96941d.I(new f(ugcAiFeedbackService));
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
                this.this$0.f96941d.I(null);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcAiFeedbackService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcAiFeedbackService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcAiFeedbackService;
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
                PlayerAvailability playerAvailability = (PlayerAvailability) this.L$0;
                if (playerAvailability == PlayerAvailability.COMPLETED) {
                    this.this$0.f96958v = true;
                } else if (playerAvailability == PlayerAvailability.READY) {
                    this.this$0.f96959w = false;
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(UgcAiFeedbackService ugcAiFeedbackService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ugcAiFeedbackService;
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
                UgcAiFeedbackService ugcAiFeedbackService = this.this$0;
                MutableStateFlow<PlayerAvailability> mutableStateFlow = ugcAiFeedbackService.f96948l.f91107a.f79286c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcAiFeedbackService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ai/UgcAiFeedbackService$a.class */
    public final class a extends BaseJsBridgeCallHandlerV2<IJsBridgeBehavior> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcAiFeedbackService f96962a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@Nullable UgcAiFeedbackService ugcAiFeedbackService, UgcAiFeedbackService$showFeedbackLayer$1.a aVar) {
            super(aVar);
            this.f96962a = ugcAiFeedbackService;
        }

        @NotNull
        public final String[] getSupportFunctions() {
            return new String[]{"aiFeedbackSuccess", "showToast"};
        }

        @NotNull
        public final String getTag() {
            return "AiFeedbackJsBridgeCallHandler";
        }

        public final void invokeNative(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2) {
            BLog.i("UgcAiFeedbackService$AiFeedbackJsBridgeCallHandler-invokeNative", "[theseus-ugc-UgcAiFeedbackService$AiFeedbackJsBridgeCallHandler-invokeNative] " + ("method " + str + ", data " + jSONObject + ", callbackId " + str2));
            if (Intrinsics.areEqual(str, "aiFeedbackSuccess")) {
                MainThread.runOnMainThread(new Wu0.g(this.f96962a, 1));
            } else if (Intrinsics.areEqual(str, "showToast")) {
                MainThread.runOnMainThread(new C1577j(3, jSONObject, str));
            }
        }
    }

    @Inject
    public UgcAiFeedbackService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.playerbizcommonv2.service.ai.a aVar, @NotNull C7893a c7893a, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull C6417a c6417a, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar2, @NotNull com.bilibili.ship.theseus.keel.player.h hVar) {
        this.f96938a = coroutineScope;
        this.f96939b = componentActivity;
        this.f96940c = theseusFloatLayerService;
        this.f96941d = aVar;
        this.f96942e = c7893a;
        this.f96943f = cVar;
        this.f96944g = cVar2;
        this.h = gVar;
        this.f96945i = c6417a;
        this.f96946j = introContentSizeRepository;
        this.f96947k = aVar2;
        this.f96948l = hVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService r8) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService.a(com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService):void");
    }

    public final void b() {
        Job job;
        Job job2 = this.f96953q;
        if (job2 == null || !job2.isActive() || (job = this.f96953q) == null) {
            return;
        }
        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.ugc.intro.ai.UgcAiFeedbackService.c(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
