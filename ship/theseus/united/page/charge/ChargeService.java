package com.bilibili.ship.theseus.united.page.charge;

import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.ui.text.font.C4496a;
import androidx.recyclerview.widget.v;
import bilibili.live.app.service.resolver.b;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.adcommon.utils.e;
import com.bilibili.app.comm.IJsBridgeBehavior;
import com.bilibili.bus.Violet;
import com.bilibili.comm.charge.data.ChargePlusMessage;
import com.bilibili.lib.jsbridge.common.BaseJsBridgeCallHandlerV2;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.ship.theseus.united.page.charge.ChargeService$showChargePayLayer$2;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.g;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ChargingPlusOperationAction;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService.class */
@StabilityInferred(parameters = 0)
public final class ChargeService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f99167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f99168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final g f99169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C7893a f99170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final c f99171f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f99172g;

    @NotNull
    public final ChargeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public Job f99173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public Job f99174j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$1$1.class */
        public static final class C09561 extends SuspendLambda implements Function3<C7893a.C1318a, C7893a.C1318a, Continuation<? super C7893a.C1318a>, Object> {
            Object L$0;
            Object L$1;
            int label;
            final ChargeService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C09561(ChargeService chargeService, Continuation<? super C09561> continuation) {
                super(3, continuation);
                this.this$0 = chargeService;
            }

            public final Object invoke(C7893a.C1318a c1318a, C7893a.C1318a c1318a2, Continuation<? super C7893a.C1318a> continuation) {
                C09561 c09561 = new C09561(this.this$0, continuation);
                c09561.L$0 = c1318a;
                c09561.L$1 = c1318a2;
                return c09561.invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                C7893a.C1318a c1318a = (C7893a.C1318a) this.L$0;
                C7893a.C1318a c1318a2 = (C7893a.C1318a) this.L$1;
                if (c1318a != null && c1318a2 != null) {
                    long j7 = c1318a.f123395a.f123398b;
                    long j8 = c1318a2.f123395a.f123398b;
                    if (j7 != j8) {
                        v.a(z.a(j7, "change video, cancel charge pay panel job ", " "), j8, "[ChargeBloc]");
                        Job job = this.this$0.f99173i;
                        if (job != null) {
                            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                        }
                        Job job2 = this.this$0.f99174j;
                        if (job2 != null) {
                            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                        }
                    }
                }
                return c1318a2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ChargeService chargeService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = chargeService;
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
                ChargeService chargeService = this.this$0;
                StateFlow<C7893a.C1318a> stateFlow = chargeService.f99170e.f123393f;
                C09561 c09561 = new C09561(chargeService, null);
                this.label = 1;
                if (FlowKt.reduce(stateFlow, c09561, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final ChargeService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Pair<? extends String, ? extends ChargingPlusOperationAction.TYPE>, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            Object L$0;
            int label;
            final ChargeService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$2$1$1.class */
            public static final class C09571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final String $url;
                int label;
                final ChargeService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09571(ChargeService chargeService, String str, Continuation<? super C09571> continuation) {
                    super(2, continuation);
                    this.this$0 = chargeService;
                    this.$url = str;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09571(this.this$0, this.$url, continuation);
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
                            ChargeRepository chargeRepository = this.this$0.h;
                            chargeRepository.f99158l.tryEmit(Boolean.TRUE);
                            ChargeService chargeService = this.this$0;
                            String str = this.$url;
                            this.label = 1;
                            chargeService.getClass();
                            Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ChargeService$showChargePayLayer$2(str, chargeService, null), this);
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
                        ChargeRepository chargeRepository2 = this.this$0.h;
                        chargeRepository2.f99158l.tryEmit(Boolean.FALSE);
                        return Unit.INSTANCE;
                    } catch (Throwable th) {
                        ChargeRepository chargeRepository3 = this.this$0.h;
                        chargeRepository3.f99158l.tryEmit(Boolean.FALSE);
                        throw th;
                    }
                }
            }

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$2$1$2, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$2$1$2.class */
            public static final class C09582 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final String $url;
                int label;
                final ChargeService this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C09582(ChargeService chargeService, String str, Continuation<? super C09582> continuation) {
                    super(2, continuation);
                    this.this$0 = chargeService;
                    this.$url = str;
                }

                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C09582(this.this$0, this.$url, continuation);
                }

                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
                }

                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i7 = this.label;
                    if (i7 == 0) {
                        ResultKt.throwOnFailure(obj);
                        ChargeService chargeService = this.this$0;
                        String str = this.$url;
                        this.label = 1;
                        chargeService.getClass();
                        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new ChargeService$showChargePayLayer$2(str, chargeService, null), this);
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

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$2$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f99175a;

                static {
                    int[] iArr = new int[ChargingPlusOperationAction.TYPE.values().length];
                    try {
                        iArr[ChargingPlusOperationAction.TYPE.CHARGING_PLUS_NORMAL.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[ChargingPlusOperationAction.TYPE.CHARGING_PLUS_AD.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[ChargingPlusOperationAction.TYPE.CHARGING_PLUS_QA.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    f99175a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChargeService chargeService, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chargeService;
                this.$$this$launch = coroutineScope;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$$this$launch, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(Pair<String, ? extends ChargingPlusOperationAction.TYPE> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                BLog.i("[ChargeBloc]", "charge pay panel show");
                String str = (String) pair.getFirst();
                int i7 = a.f99175a[((ChargingPlusOperationAction.TYPE) pair.getSecond()).ordinal()];
                if (i7 == 1 || i7 == 2) {
                    Job job = this.this$0.f99173i;
                    if (job != null && job.isActive()) {
                        return Unit.INSTANCE;
                    }
                    Job job2 = this.this$0.f99173i;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                    ChargeService chargeService = this.this$0;
                    chargeService.f99173i = BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new C09571(chargeService, str, null), 3, (Object) null);
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Job job3 = this.this$0.f99174j;
                    if (job3 != null && job3.isActive()) {
                        return Unit.INSTANCE;
                    }
                    Job job4 = this.this$0.f99174j;
                    if (job4 != null) {
                        Job.DefaultImpls.cancel$default(job4, (CancellationException) null, 1, (Object) null);
                    }
                    ChargeService chargeService2 = this.this$0;
                    chargeService2.f99174j = BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new C09582(chargeService2, str, null), 3, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ChargeService chargeService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = chargeService;
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
                ChargeService chargeService = this.this$0;
                SharedFlow<Pair<String, ChargingPlusOperationAction.TYPE>> sharedFlow = chargeService.h.f99152e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(chargeService, coroutineScope, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final ChargeService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<ChargingPlusOperationAction.TYPE, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final ChargeService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.charge.ChargeService$3$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$3$1$a.class */
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final int[] f99176a;

                static {
                    int[] iArr = new int[ChargingPlusOperationAction.TYPE.values().length];
                    try {
                        iArr[ChargingPlusOperationAction.TYPE.CHARGING_PLUS_NORMAL.ordinal()] = 1;
                    } catch (NoSuchFieldError e7) {
                    }
                    try {
                        iArr[ChargingPlusOperationAction.TYPE.CHARGING_PLUS_AD.ordinal()] = 2;
                    } catch (NoSuchFieldError e8) {
                    }
                    try {
                        iArr[ChargingPlusOperationAction.TYPE.CHARGING_PLUS_QA.ordinal()] = 3;
                    } catch (NoSuchFieldError e9) {
                    }
                    f99176a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(ChargeService chargeService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = chargeService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(ChargingPlusOperationAction.TYPE type, Continuation<? super Unit> continuation) {
                return create(type, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ChargingPlusOperationAction.TYPE type = (ChargingPlusOperationAction.TYPE) this.L$0;
                defpackage.a.b("charge pay panel close ", type.name(), "[ChargeBloc]");
                int i7 = a.f99176a[type.ordinal()];
                if (i7 == 1 || i7 == 2) {
                    Job job = this.this$0.f99173i;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                } else {
                    if (i7 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Job job2 = this.this$0.f99174j;
                    if (job2 != null) {
                        Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ChargeService chargeService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = chargeService;
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
                ChargeService chargeService = this.this$0;
                SharedFlow<ChargingPlusOperationAction.TYPE> sharedFlow = chargeService.h.f99157k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(chargeService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/charge/ChargeService$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a extends BaseJsBridgeCallHandlerV2<IJsBridgeBehavior> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final ChargeRepository f99177a;

        public a(@Nullable ChargeRepository chargeRepository, @Nullable ChargeService$showChargePayLayer$2.a aVar) {
            super(aVar);
            this.f99177a = chargeRepository;
        }

        public final void c(JSONObject jSONObject) {
            defpackage.a.b("handlePurchaseCallback data: ", jSONObject != null ? jSONObject.toString() : null, "[ChargeBloc]");
            if (jSONObject == null) {
                return;
            }
            ChargeRepository chargeRepository = this.f99177a;
            if (chargeRepository != null) {
                BuildersKt.launch$default(chargeRepository.f99148a, (CoroutineContext) null, (CoroutineStart) null, new ChargeRepository$updateChargeResult$1(chargeRepository, null), 3, (Object) null);
            }
            try {
                Violet.INSTANCE.sendMsg(new ChargePlusMessage(jSONObject.getIntValue("good_id"), jSONObject.getLong("up_mid").longValue(), jSONObject.getString("good_name"), jSONObject.getString("up_name")), true, true);
            } catch (Throwable th) {
                e.a("handlePurchaseCallback error ", "[ChargeBloc]", th.getCause());
            }
        }

        @NotNull
        public final String[] getSupportFunctions() {
            return new String[]{"purchaseChargePlus", "didClickChargeButton"};
        }

        @NotNull
        public final String getTag() {
            return "ChargePayJsBridgeCallHandler";
        }

        public final void invokeNative(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2) {
            ChargeRepository chargeRepository;
            StringBuilder sb = new StringBuilder("method ");
            sb.append(str);
            sb.append(", data ");
            sb.append(jSONObject);
            sb.append(", callbackId ");
            b.a(sb, str2, "[ChargeBloc]");
            try {
                if (Intrinsics.areEqual(str, "purchaseChargePlus")) {
                    JSONObject jSONObject2 = null;
                    if (jSONObject != null) {
                        jSONObject2 = jSONObject.getJSONObject(ThirdPartyExtraBuilder.KEY_RESULT);
                    }
                    c(jSONObject2);
                    return;
                }
                if (Intrinsics.areEqual(str, "didClickChargeButton")) {
                    if (Intrinsics.areEqual(jSONObject != null ? jSONObject.getString("type") : null, "ad_unlock")) {
                        ChargeRepository chargeRepository2 = this.f99177a;
                        if (chargeRepository2 != null) {
                            chargeRepository2.c();
                            return;
                        }
                        return;
                    }
                    String string = null;
                    if (jSONObject != null) {
                        string = jSONObject.getString(EditCustomizeSticker.TAG_MID);
                    }
                    defpackage.a.b("[theseus-united-ChargeService$ChargePayJsBridgeCallHandler-handleClickPurchaseCallback] ", C4496a.a("handleClickPurchaseCallback mid: ", string), "ChargeService$ChargePayJsBridgeCallHandler-handleClickPurchaseCallback");
                    if (string == null || (chargeRepository = this.f99177a) == null) {
                        return;
                    }
                    chargeRepository.f99164r.tryEmit(Unit.INSTANCE);
                }
            } catch (Throwable th) {
                e.a("invoke earn jsb error ", "[ChargeBloc]", th.getCause());
            }
        }
    }

    @Inject
    public ChargeService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull g gVar, @NotNull C7893a c7893a, @NotNull c cVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull ChargeRepository chargeRepository) {
        this.f99166a = coroutineScope;
        this.f99167b = componentActivity;
        this.f99168c = theseusFloatLayerService;
        this.f99169d = gVar;
        this.f99170e = c7893a;
        this.f99171f = cVar;
        this.f99172g = aVar;
        this.h = chargeRepository;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
    }
}
