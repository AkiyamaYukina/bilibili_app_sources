package com.bilibili.ship.theseus.united.page.playingarea;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.window.layout.WindowMetricsCalculator;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.playerbizcommonv2.widget.base.i;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingAreaDescription;
import com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleRepository;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import lv0.C7893a;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository.class */
@StabilityInferred(parameters = 0)
public final class PlayingContainerSizeRepository implements a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f102329n = DimenUtilsKt.dpToPx(242);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f102330o = DimenUtilsKt.dpToPx(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKIN_SEGMENT_MIN_THRESHOLD);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f102331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C7893a f102332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f102333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ComponentActivity f102334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Flow<a.c> f102335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f102336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Er0.a f102337g;

    @NotNull
    public final MutableStateFlow<a.C1102a> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Pair<Integer, Integer>> f102338i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f102339j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final StateFlow<a.C1102a> f102340k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final StateFlow<Pair<Integer, Integer>> f102341l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final StateFlow f102342m;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private Object L$0;
        int label;
        final PlayingContainerSizeRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$1$1.class */
        public static final class C10991 extends SuspendLambda implements Function2<a.c, Continuation<? super Unit>, Object> {
            final CoroutineScope $$this$launch;
            Object L$0;
            int label;
            final PlayingContainerSizeRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10991(CoroutineScope coroutineScope, PlayingContainerSizeRepository playingContainerSizeRepository, Continuation<? super C10991> continuation) {
                super(2, continuation);
                this.$$this$launch = coroutineScope;
                this.this$0 = playingContainerSizeRepository;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void invokeSuspend$lambda$0(PlayingContainerSizeRepository playingContainerSizeRepository, View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                int i15 = i9 - i7;
                int i16 = i10 - i8;
                if (i15 == ((Number) playingContainerSizeRepository.d().getFirst()).intValue() && i16 == ((Number) playingContainerSizeRepository.d().getSecond()).intValue()) {
                    return;
                }
                Pair pair = new Pair(Integer.valueOf(i15), Integer.valueOf(i16));
                defpackage.a.b("[theseus-united-PlayingContainerSizeRepository$1$1-invokeSuspend$lambda$0] ", "on decor view layout, root size to " + pair, "PlayingContainerSizeRepository$1$1-invokeSuspend$lambda$0");
                playingContainerSizeRepository.f102338i.setValue(pair);
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C10991 c10991 = new C10991(this.$$this$launch, this.this$0, continuation);
                c10991.L$0 = obj;
                return c10991;
            }

            public final Object invoke(a.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                a.c cVar = (a.c) this.L$0;
                if (cVar == null) {
                    return Unit.INSTANCE;
                }
                ViewGroup viewGroup = cVar.f102354a;
                final PlayingContainerSizeRepository playingContainerSizeRepository = this.this$0;
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener(playingContainerSizeRepository) { // from class: com.bilibili.ship.theseus.united.page.playingarea.k

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final PlayingContainerSizeRepository f102370a;

                    {
                        this.f102370a = playingContainerSizeRepository;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                        PlayingContainerSizeRepository.AnonymousClass1.C10991.invokeSuspend$lambda$0(this.f102370a, view, i7, i8, i9, i10, i11, i12, i13, i14);
                    }
                };
                viewGroup.addOnLayoutChangeListener(onLayoutChangeListener);
                BuildersKt.launch$default(this.$$this$launch, (CoroutineContext) null, (CoroutineStart) null, new PlayingContainerSizeRepository$1$1$invokeSuspend$$inlined$awaitCancel$1(null, viewGroup, onLayoutChangeListener), 3, (Object) null);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PlayingContainerSizeRepository playingContainerSizeRepository, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = playingContainerSizeRepository;
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
                PlayingContainerSizeRepository playingContainerSizeRepository = this.this$0;
                Flow<a.c> flow = playingContainerSizeRepository.f102335e;
                C10991 c10991 = new C10991(coroutineScope, playingContainerSizeRepository, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, c10991, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayingContainerSizeRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<a.c, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final PlayingContainerSizeRepository this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PlayingContainerSizeRepository playingContainerSizeRepository, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = playingContainerSizeRepository;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            public final Object invoke(a.c cVar, Continuation<? super Unit> continuation) {
                return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i7 = this.label;
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    a.c cVar = (a.c) this.L$0;
                    if (cVar == null) {
                        return Unit.INSTANCE;
                    }
                    BLog.i("PlayingContainerSizeRepository$2$1-invokeSuspend", "[theseus-united-PlayingContainerSizeRepository$2$1-invokeSuspend] collect views change, start collect video area layout change");
                    if (this.this$0.f102336f.f()) {
                        PlayingContainerSizeRepository playingContainerSizeRepository = this.this$0;
                        FrameLayout frameLayout = cVar.f102355b;
                        this.label = 1;
                        if (PlayingContainerSizeRepository.j(playingContainerSizeRepository, frameLayout, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        PlayingContainerSizeRepository playingContainerSizeRepository2 = this.this$0;
                        this.label = 2;
                        if (PlayingContainerSizeRepository.j(playingContainerSizeRepository2, cVar.f102356c, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PlayingContainerSizeRepository playingContainerSizeRepository, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = playingContainerSizeRepository;
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
                PlayingContainerSizeRepository playingContainerSizeRepository = this.this$0;
                Flow<a.c> flow = playingContainerSizeRepository.f102335e;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(playingContainerSizeRepository, null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final PlayingContainerSizeRepository this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository$3$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayingContainerSizeRepository$3$a.class */
        public static final class a implements com.bilibili.playerbizcommonv2.widget.base.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayingContainerSizeRepository f102343a;

            public a(PlayingContainerSizeRepository playingContainerSizeRepository) {
                this.f102343a = playingContainerSizeRepository;
            }

            @Override // com.bilibili.playerbizcommonv2.widget.base.i
            public final int a() {
                return this.f102343a.f102339j;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PlayingContainerSizeRepository playingContainerSizeRepository, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = playingContainerSizeRepository;
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
            i.a aVar = i.a.f82406a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PlayingContainerSizeRepository playingContainerSizeRepository = this.this$0;
                    playingContainerSizeRepository.f102337g.put(aVar, new a(playingContainerSizeRepository));
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
                this.this$0.f102337g.remove(aVar);
                throw th;
            }
        }
    }

    @Inject
    public PlayingContainerSizeRepository(@NotNull CoroutineScope coroutineScope, @NotNull C7893a c7893a, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull ComponentActivity componentActivity, @NotNull Flow<a.c> flow, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull Er0.a aVar2) {
        this.f102331a = coroutineScope;
        this.f102332b = c7893a;
        this.f102333c = theseusPageUIStyleRepository;
        this.f102334d = componentActivity;
        this.f102335e = flow;
        this.f102336f = aVar;
        this.f102337g = aVar2;
        MutableStateFlow<a.C1102a> MutableStateFlow = StateFlowKt.MutableStateFlow(new a.C1102a(0, 0));
        this.h = MutableStateFlow;
        WindowMetricsCalculator.Companion companion = WindowMetricsCalculator.Companion;
        MutableStateFlow<Pair<Integer, Integer>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new Pair(Integer.valueOf(companion.getOrCreate().computeCurrentWindowMetrics((Activity) componentActivity).getBounds().width()), Integer.valueOf(companion.getOrCreate().computeCurrentWindowMetrics((Activity) componentActivity).getBounds().height())));
        this.f102338i = MutableStateFlow2;
        this.f102339j = MathKt.roundToInt(companion.getOrCreate().computeCurrentWindowMetrics((Activity) componentActivity).getBounds().width() * 0.5625f);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
        this.f102340k = FlowKt.asStateFlow(MutableStateFlow);
        StateFlow<Pair<Integer, Integer>> stateFlowAsStateFlow = FlowKt.asStateFlow(MutableStateFlow2);
        this.f102341l = stateFlowAsStateFlow;
        this.f102342m = stateFlowAsStateFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object j(final com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository r5, final android.view.View r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository.j(com.bilibili.ship.theseus.united.page.playingarea.PlayingContainerSizeRepository, android.view.View, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    public final int a() {
        return this.f102339j;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    @NotNull
    public final StateFlow<Pair<Integer, Integer>> b() {
        return this.f102341l;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    @NotNull
    public final a.C1102a c() {
        return (a.C1102a) this.h.getValue();
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    @NotNull
    public final Pair<Integer, Integer> d() {
        return (Pair) this.f102342m.getValue();
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    public final float e(@NotNull PlayingAreaDescription playingAreaDescription) {
        Float f7;
        int iIntValue = ((Number) d().getFirst()).intValue();
        float fIntValue = ((Number) d().getSecond()).intValue() - f();
        if (fIntValue <= 0.0f) {
            return 1.7777778f;
        }
        float f8 = iIntValue / fIntValue;
        Pair<Long, Float> pair = this.f102332b.f123390c;
        float fMax = Math.max(f8, (pair == null || (f7 = (Float) pair.getSecond()) == null) ? playingAreaDescription.f102326a : f7.floatValue());
        defpackage.a.b("[theseus-united-PlayingContainerSizeRepository-adjustVideoRatio] ", G0.g.a(fMax, "vertical screen video ratio is "), "PlayingContainerSizeRepository-adjustVideoRatio");
        float fMax2 = fMax;
        if (playingAreaDescription.f102327b == PlayingAreaDescription.Direction.Horizontal) {
            fMax2 = Math.max(Math.min(1.7777778f, fMax), f8);
        }
        return fMax2;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    public final int f() {
        return this.f102336f.g() ? f102330o : f102329n;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    @NotNull
    public final StateFlow<a.C1102a> g() {
        return this.f102340k;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    public final int h() {
        int iRoundToInt = MathKt.roundToInt(((Number) d().getFirst()).floatValue() / 1.7777778f);
        int iMin = iRoundToInt;
        if (this.f102336f.h()) {
            iMin = Math.min((((Number) d().getSecond()).intValue() / 2) - this.f102333c.f103507q, iRoundToInt);
        }
        return iMin;
    }

    @Override // com.bilibili.ship.theseus.united.page.playingarea.a
    public final int i() {
        PlayingAreaDescription playingAreaDescription = (PlayingAreaDescription) this.f102332b.f123389b.getValue();
        PlayingAreaDescription playingAreaDescription2 = playingAreaDescription;
        if (playingAreaDescription == null) {
            playingAreaDescription2 = new PlayingAreaDescription(1.7777778f);
        }
        return MathKt.roundToInt(((Number) d().getFirst()).floatValue() / e(playingAreaDescription2));
    }
}
