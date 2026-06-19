package com.bilibili.ship.theseus.united.player.toast;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.ogv.infra.util.k;
import com.bilibili.ship.theseus.united.page.screenstate.c;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import com.bilibili.ship.theseus.united.player.controlcontainer.PlayerControlContainerService;
import com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.z;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService.class */
@StabilityInferred(parameters = 0)
public final class TheseusToastContainerService {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f104792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public static final a f104793n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f104794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IToastService f104795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StateFlow<Boolean> f104797d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PlayerControlContainerService f104798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f104799f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final z f104800g;

    @NotNull
    public final TheseusPageUIStyleRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f104801i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public c f104803k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public c f104802j = f104793n;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public b f104804l = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusToastContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$1$3, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$1$3.class */
        public static final /* synthetic */ class AnonymousClass3 extends AdaptedFunctionReference implements Function6<Boolean, Boolean, c.a, Boolean, Boolean, Continuation<? super k<? extends Boolean, ? extends Boolean, ? extends c.a, ? extends Boolean, ? extends Boolean>>, Object>, SuspendFunction {
            public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

            public AnonymousClass3() {
                super(6, k.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", 4);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (c.a) obj3, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (Continuation<? super k<Boolean, Boolean, c.a, Boolean, Boolean>>) obj6);
            }

            public final Object invoke(boolean z6, boolean z7, c.a aVar, boolean z8, boolean z9, Continuation<? super k<Boolean, Boolean, c.a, Boolean, Boolean>> continuation) {
                return AnonymousClass1.invokeSuspend$lambda$0(z6, z7, aVar, z8, z9, continuation);
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$1$4, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$1$4.class */
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<k<? extends Boolean, ? extends Boolean, ? extends c.a, ? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusToastContainerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(TheseusToastContainerService theseusToastContainerService, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = theseusToastContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            public final Object invoke(k<Boolean, Boolean, c.a, Boolean, Boolean> kVar, Continuation<? super Unit> continuation) {
                return create(kVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Object invokeSuspend(Object obj) {
                b bVarC;
                Object objA;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    k kVar = (k) this.L$0;
                    boolean zBooleanValue = ((Boolean) kVar.f67960a).booleanValue();
                    boolean zBooleanValue2 = ((Boolean) kVar.f67961b).booleanValue();
                    c.a aVar = (c.a) kVar.f67962c;
                    boolean zBooleanValue3 = ((Boolean) kVar.f67963d).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) kVar.f67964e).booleanValue();
                    boolean z6 = zBooleanValue || zBooleanValue2;
                    boolean z7 = zBooleanValue3 || zBooleanValue4;
                    TheseusToastContainerService theseusToastContainerService = this.this$0;
                    c cVar = theseusToastContainerService.f104803k;
                    c cVar2 = cVar;
                    if (cVar == null) {
                        cVar2 = theseusToastContainerService.f104802j;
                    }
                    if (z6 || !TheseusToastContainerService.f104792m) {
                        boolean z8 = aVar.f102988b;
                        bVarC = (z8 || !theseusToastContainerService.h.f103504n) ? !z8 ? cVar2.c() : (z8 && aVar.f102987a) ? cVar2.a() : cVar2.b(z7) : new b(0, 0, 0, NewPlayerUtilsKt.toPx(8.0f));
                    } else {
                        bVarC = new b(0, 0, 0, (!aVar.f102988b || aVar.f102987a) ? NewPlayerUtilsKt.toPx(8.0f) : NewPlayerUtilsKt.toPx(26.0f));
                    }
                    final TheseusToastContainerService theseusToastContainerService2 = this.this$0;
                    this.label = 1;
                    final b bVar = theseusToastContainerService2.f104804l;
                    if (Intrinsics.areEqual(bVar, bVarC)) {
                        BLog.i("TheseusToastContainerService-animTo", "[theseus-united-TheseusToastContainerService-animTo] Padding not changed, skip");
                        objA = Unit.INSTANCE;
                    } else {
                        final b bVar2 = new b(bVarC.f104805a - bVar.f104805a, bVarC.f104806b - bVar.f104806b, bVarC.f104807c - bVar.f104807c, bVarC.f104808d - bVar.f104808d);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setDuration(200L);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(bVar, bVar2, theseusToastContainerService2) { // from class: com.bilibili.ship.theseus.united.player.toast.a

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final TheseusToastContainerService.b f104809a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final TheseusToastContainerService.b f104810b;

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            public final TheseusToastContainerService f104811c;

                            {
                                this.f104809a = bVar;
                                this.f104810b = bVar2;
                                this.f104811c = theseusToastContainerService2;
                            }

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                TheseusToastContainerService.b bVar3 = this.f104809a;
                                TheseusToastContainerService.b bVar4 = this.f104810b;
                                TheseusToastContainerService theseusToastContainerService3 = this.f104811c;
                                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                theseusToastContainerService3.f104795b.setPadding(new Rect((int) ((bVar4.f104805a * fFloatValue) + bVar3.f104805a), (int) ((bVar4.f104806b * fFloatValue) + bVar3.f104806b), (int) ((bVar4.f104807c * fFloatValue) + bVar3.f104807c), (int) ((bVar4.f104808d * fFloatValue) + bVar3.f104808d)));
                            }
                        });
                        valueAnimatorOfFloat.addListener(new com.bilibili.ship.theseus.united.player.toast.b(theseusToastContainerService2, bVarC));
                        theseusToastContainerService2.f104804l = bVarC;
                        objA = Bj0.c.a(valueAnimatorOfFloat, true, this);
                        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objA = Unit.INSTANCE;
                        }
                    }
                    if (objA == coroutine_suspended) {
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
        public AnonymousClass1(TheseusToastContainerService theseusToastContainerService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusToastContainerService;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$lambda$0(boolean z6, boolean z7, c.a aVar, boolean z8, boolean z9, Continuation continuation) {
            return new k(Boxing.boxBoolean(z6), Boxing.boxBoolean(z7), aVar, Boxing.boxBoolean(z8), Boxing.boxBoolean(z9));
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
                StateFlow stateFlowIsDraggingByUserFlow = this.this$0.f104800g.isDraggingByUserFlow();
                TheseusToastContainerService theseusToastContainerService = this.this$0;
                StateFlow<Boolean> stateFlow = theseusToastContainerService.f104798e.f104429g;
                StateFlow stateFlowC = theseusToastContainerService.f104799f.c();
                TheseusToastContainerService theseusToastContainerService2 = this.this$0;
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.combine(stateFlowIsDraggingByUserFlow, stateFlow, stateFlowC, theseusToastContainerService2.f104797d, theseusToastContainerService2.f104796c, AnonymousClass3.INSTANCE));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowDistinctUntilChanged, anonymousClass4, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusToastContainerService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
            int label;
            final TheseusToastContainerService this$0;

            /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$2$1$a */
            /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$2$1$a.class */
            public static final class a implements c {
                @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
                public final b a() {
                    return new b(0, 0, 0, NewPlayerUtilsKt.toPx(140.0f));
                }

                @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
                public final b b(boolean z6) {
                    return new b(0, 0, 0, NewPlayerUtilsKt.toPx(140.0f));
                }

                @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
                public final b c() {
                    return new b(0, 0, 0, NewPlayerUtilsKt.toPx(140.0f));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusToastContainerService theseusToastContainerService, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusToastContainerService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
                return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$c] */
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                TheseusToastContainerService theseusToastContainerService = this.this$0;
                theseusToastContainerService.f104802j = theseusToastContainerService.f104801i.f() ? new Object() : TheseusToastContainerService.f104793n;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusToastContainerService theseusToastContainerService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusToastContainerService;
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
                TheseusToastContainerService theseusToastContainerService = this.this$0;
                StateFlow<WindowSizeClass> stateFlow = theseusToastContainerService.f104801i.f102939c;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusToastContainerService, null);
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$a.class */
    public static final class a implements c {
        @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
        public final b a() {
            return new b(0, 0, 0, NewPlayerUtilsKt.toPx(206.0f));
        }

        @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
        public final b b(boolean z6) {
            return z6 ? new b(0, 0, 0, NewPlayerUtilsKt.toPx(105.0f)) : new b(0, 0, 0, NewPlayerUtilsKt.toPx(117.0f));
        }

        @Override // com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService.c
        public final b c() {
            return new b(0, 0, 0, NewPlayerUtilsKt.toPx(40.0f));
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$b.class */
    @StabilityInferred(parameters = 1)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f104805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f104806b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104807c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f104808d;

        public b(int i7, int i8, int i9, int i10) {
            this.f104805a = i7;
            this.f104806b = i8;
            this.f104807c = i9;
            this.f104808d = i10;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f104805a == bVar.f104805a && this.f104806b == bVar.f104806b && this.f104807c == bVar.f104807c && this.f104808d == bVar.f104808d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f104808d) + I.a(this.f104807c, I.a(this.f104806b, Integer.hashCode(this.f104805a) * 31, 31), 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Padding(left=");
            sb.append(this.f104805a);
            sb.append(", top=");
            sb.append(this.f104806b);
            sb.append(", right=");
            sb.append(this.f104807c);
            sb.append(", bottom=");
            return C4277b.a(this.f104808d, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/toast/TheseusToastContainerService$c.class */
    public interface c {
        @NotNull
        b a();

        @NotNull
        b b(boolean z6);

        @NotNull
        b c();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.ship.theseus.united.player.toast.TheseusToastContainerService$a, java.lang.Object] */
    static {
        boolean withDefault = ConfigManager.Companion.ab2().getWithDefault("ff_toast_follow_control_widget", true);
        defpackage.a.b("[theseus-united-TheseusToastContainerService-<clinit>] ", com.bilibili.app.comm.bh.x5.b.a("ff_toast_follow_control_widget: ", withDefault), "TheseusToastContainerService-<clinit>");
        f104792m = withDefault;
        f104793n = new Object();
    }

    @Inject
    public TheseusToastContainerService(@NotNull CoroutineScope coroutineScope, @NotNull IToastService iToastService, @NotNull StateFlow<Boolean> stateFlow, @NotNull StateFlow<Boolean> stateFlow2, @NotNull PlayerControlContainerService playerControlContainerService, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull z zVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar) {
        this.f104794a = coroutineScope;
        this.f104795b = iToastService;
        this.f104796c = stateFlow;
        this.f104797d = stateFlow2;
        this.f104798e = playerControlContainerService;
        this.f104799f = cVar;
        this.f104800g = zVar;
        this.h = theseusPageUIStyleRepository;
        this.f104801i = aVar;
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
    }
}
