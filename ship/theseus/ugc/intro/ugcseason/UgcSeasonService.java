package com.bilibili.ship.theseus.ugc.intro.ugcseason;

import androidx.activity.ComponentActivity;
import androidx.compose.foundation.text.selection.C3751q;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.bus.ChannelOperation;
import com.bilibili.bus.Violet;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6353o;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6355q;
import com.bilibili.ship.theseus.united.page.intro.module.season.C6356s;
import com.bilibili.ship.theseus.united.page.intro.module.season.E;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonActivity;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonService;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonType;
import com.bilibili.ship.theseus.united.page.intro.module.season.Y;
import com.bilibili.ship.theseus.united.page.intro.module.season.Z;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService.class */
@StabilityInferred(parameters = 0)
public final class UgcSeasonService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f97452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f97453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f97454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C7893a f97455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f97456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final E f97457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Y f97458g;

    @NotNull
    public final C6356s h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.autofloat.a f97459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ActivityColorRepository f97460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final PageReportService f97461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.fitnesscollection.a f97462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f97463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonService f97464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final g f97465o = new Observer(this) { // from class: com.bilibili.ship.theseus.ugc.intro.ugcseason.g

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcSeasonService f97489a;

        {
            this.f97489a = this;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Mq0.f fVar = (Mq0.f) obj;
            UgcSeasonService ugcSeasonService = this.f97489a;
            C6353o c6353o = (C6353o) CollectionsKt.firstOrNull(ugcSeasonService.f97456e.b());
            if (c6353o == null || fVar.f16328a != c6353o.f101669a) {
                return;
            }
            ugcSeasonService.f97458g.b(fVar.f16329b);
        }
    };

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$1$1.class */
        public static final class C08651 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcSeasonService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08651(UgcSeasonService ugcSeasonService, Continuation<? super C08651> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C08651(this.this$0, continuation);
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
                C6353o c6353o = (C6353o) CollectionsKt.firstOrNull(this.this$0.f97456e.b());
                if (c6353o == null) {
                    return Unit.INSTANCE;
                }
                UnitedSeasonService.b(this.this$0.f97464n, c6353o, null, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
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
                UgcSeasonService ugcSeasonService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcSeasonService.f97459i.f98978b;
                C08651 c08651 = new C08651(ugcSeasonService, null);
                this.label = 1;
                if (FlowKt.collectLatest(sharedFlow, c08651, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Unit, Continuation<? super Unit>, Object> {
            int label;
            final UgcSeasonService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
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
                C6353o c6353o = (C6353o) CollectionsKt.firstOrNull(this.this$0.f97456e.b());
                if (c6353o == null) {
                    return Unit.INSTANCE;
                }
                UnitedSeasonService.b(this.this$0.f97464n, c6353o, null, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
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
                UgcSeasonService ugcSeasonService = this.this$0;
                SharedFlow<Unit> sharedFlow = ugcSeasonService.f97462l.f96918c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcSeasonService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
            long J$0;
            int label;
            final UgcSeasonService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.J$0 = ((Number) obj).longValue();
                return anonymousClass1;
            }

            public final Object invoke(long j7, Continuation<? super Unit> continuation) {
                return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object obj3;
                Object next;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                long j7 = this.J$0;
                Iterator<T> it = this.this$0.f97456e.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next2 = it.next();
                    Iterator<T> it2 = ((C6353o) next2).h.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        Object next3 = it2.next();
                        Iterator<T> it3 = ((Z) next3).f101648d.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (((C6355q) next).f101683c == j7) {
                                break;
                            }
                        }
                        if (next != null) {
                            obj3 = next3;
                            break;
                        }
                    }
                    if (obj3 != null) {
                        obj2 = next2;
                        break;
                    }
                }
                C6353o c6353o = (C6353o) obj2;
                if (c6353o == null) {
                    return Unit.INSTANCE;
                }
                UnitedSeasonService.b(this.this$0.f97464n, c6353o, null, 6);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
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
                UgcSeasonService ugcSeasonService = this.this$0;
                SharedFlow<Long> sharedFlow = ugcSeasonService.f97456e.f101576g;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcSeasonService, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcSeasonService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
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
                    ChannelOperation channelOperationOfChannel = Violet.INSTANCE.ofChannel(Mq0.f.class);
                    UgcSeasonService ugcSeasonService = this.this$0;
                    channelOperationOfChannel.observe(ugcSeasonService.f97453b, ugcSeasonService.f97465o);
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
                Violet.INSTANCE.ofChannel(Mq0.f.class).removeObserver(this.this$0.f97465o);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final UgcSeasonService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<UpdateVideoDetailState.CheckInState, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final UgcSeasonService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.ugcseason.UgcSeasonService$5$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcseason/UgcSeasonService$5$1$a.class */
            public static final class a extends TypeToken<UnitedSeasonActivity> {
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = ugcSeasonService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(UpdateVideoDetailState.CheckInState checkInState, Continuation<? super Unit> continuation) {
                return create(checkInState, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonSyntaxException */
            public final Object invokeSuspend(Object obj) {
                Object json;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String activity = ((UpdateVideoDetailState.CheckInState) this.L$0).getActivity();
                if (activity != null) {
                    try {
                        json = JsonUtilKt.parseJson(activity, new a().getType());
                    } catch (JsonSyntaxException e7) {
                        com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-ugc-UgcSeasonService$5$1-invokeSuspend] ", "safelyParseJson, " + e7, "UgcSeasonService$5$1-invokeSuspend", (Throwable) null);
                        json = null;
                    }
                    UnitedSeasonActivity unitedSeasonActivity = (UnitedSeasonActivity) json;
                    if (unitedSeasonActivity != null) {
                        for (C6353o c6353o : this.this$0.f97456e.b()) {
                            UnitedSeasonActivity unitedSeasonActivity2 = c6353o.f101678k;
                            if (unitedSeasonActivity2 != null && unitedSeasonActivity2.b() == unitedSeasonActivity.b()) {
                                c6353o.f101678k = unitedSeasonActivity;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(UgcSeasonService ugcSeasonService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = ugcSeasonService;
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
                UgcSeasonService ugcSeasonService = this.this$0;
                SharedFlow<UpdateVideoDetailState.CheckInState> sharedFlow = ugcSeasonService.f97457f.f101464n;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ugcSeasonService, null);
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

    /* JADX WARN: Type inference failed for: r1v14, types: [com.bilibili.ship.theseus.ugc.intro.ugcseason.g] */
    @Inject
    public UgcSeasonService(@NotNull CoroutineScope coroutineScope, @NotNull ComponentActivity componentActivity, @NotNull com.bilibili.ship.theseus.united.page.view.d dVar, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar, @NotNull C7893a c7893a, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull E e7, @NotNull Y y6, @NotNull C6356s c6356s, @NotNull com.bilibili.ship.theseus.united.page.autofloat.a aVar2, @NotNull ActivityColorRepository activityColorRepository, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.ugc.fitnesscollection.a aVar3, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull UnitedSeasonService unitedSeasonService) {
        this.f97452a = coroutineScope;
        this.f97453b = componentActivity;
        this.f97454c = aVar;
        this.f97455d = c7893a;
        this.f97456e = unitedSeasonDetailRepository;
        this.f97457f = e7;
        this.f97458g = y6;
        this.h = c6356s;
        this.f97459i = aVar2;
        this.f97460j = activityColorRepository;
        this.f97461k = pageReportService;
        this.f97462l = aVar3;
        this.f97463m = introContentSizeRepository;
        this.f97464n = unitedSeasonService;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
        c6356s.getClass();
    }

    @NotNull
    public final RunningUIComponent a(@NotNull C6353o c6353o) {
        RunningUIComponent runningUIComponent;
        UnitedSeasonType unitedSeasonType = UnitedSeasonType.FINE;
        UnitedSeasonType unitedSeasonType2 = c6353o.f101673e;
        IntroContentSizeRepository introContentSizeRepository = this.f97463m;
        if (unitedSeasonType2 == unitedSeasonType) {
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = c6353o;
            BLog.i("UgcSeasonService-createFineComponent", "[theseus-ugc-UgcSeasonService-createFineComponent] " + ("createFineComponent " + c6353o));
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
            Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            runningUIComponent = new RunningUIComponent(new d(new h(objectRef2, objectRef, intRef, intRef2, objectRef3, objectRef4, this, new LinkedHashSet()), introContentSizeRepository.f100020a), 0, new UgcSeasonService$createFineComponent$1(this, objectRef3, intRef, intRef2, objectRef4, objectRef2, objectRef, c6353o, null), 2);
        } else {
            Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
            objectRef5.element = c6353o;
            Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
            objectRef6.element = C3751q.a(((C6353o) objectRef5.element).f101672d, "1/");
            Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
            runningUIComponent = new RunningUIComponent(new l(new i(objectRef7, objectRef5, objectRef6, this, new Ref.BooleanRef()), introContentSizeRepository.f100020a), 0, new UgcSeasonService$createSimpleComponent$1(this, objectRef7, objectRef5, objectRef6, c6353o, null), 2);
        }
        return runningUIComponent;
    }
}
