package com.bilibili.ship.theseus.united.page.uistyle;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.D;
import com.bilibili.app.comm.bh.x5.b;
import com.bilibili.playerbizcommonv2.utils.o;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.playingarea.PageNestedScrollFusionRepository;
import com.bilibili.ship.theseus.united.page.playingarea.a;
import com.bilibili.ship.theseus.united.utils.TheseusPlayContainerXKt;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.I;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.S;
import tv.danmaku.biliplayerv2.service.z;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService.class */
@StabilityInferred(parameters = 0)
public final class TheseusPageUIStyleService {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final List<Class<Si1.a>> f103521j = CollectionsKt.listOf(Si1.a.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f103523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f103524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Er0.a f103526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final z f103527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final TheseusPageUIStyleRepository f103528g;

    @NotNull
    public final PageNestedScrollFusionRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.a f103529i;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TheseusPageUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$1$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$1$a.class */
        public static final class a implements I {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TheseusPageUIStyleService f103530a;

            public a(TheseusPageUIStyleService theseusPageUIStyleService) {
                this.f103530a = theseusPageUIStyleService;
            }

            public final void onWidgetDismiss(FunctionWidgetToken functionWidgetToken) {
                defpackage.a.b("[theseus-united-TheseusPageUIStyleService$1$listener$1-onWidgetDismiss] ", D.a(functionWidgetToken.getClazz(), "Function widget dismissed: "), "TheseusPageUIStyleService$1$listener$1-onWidgetDismiss");
                this.f103530a.f103528g.f103498g.b(functionWidgetToken.getClazz());
            }

            public final void onWidgetShow(FunctionWidgetToken functionWidgetToken) {
                defpackage.a.b("[theseus-united-TheseusPageUIStyleService$1$listener$1-onWidgetShow] ", D.a(functionWidgetToken.getClazz(), "Function widget shown: "), "TheseusPageUIStyleService$1$listener$1-onWidgetShow");
                if (CollectionsKt.contains(TheseusPageUIStyleService.f103521j, functionWidgetToken.getClazz())) {
                    return;
                }
                this.f103530a.f103528g.f103498g.a(functionWidgetToken.getClazz());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusPageUIStyleService theseusPageUIStyleService = this.this$0;
                aVar = new a(theseusPageUIStyleService);
                try {
                    theseusPageUIStyleService.f103524c.addOnWidgetStateChangeListener(aVar);
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    this.this$0.f103524c.removeOnWidgetStateChangeListener(aVar);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar3 = (a) this.L$0;
                aVar2 = aVar3;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar3;
                } catch (Throwable th2) {
                    th = th2;
                    aVar = aVar2;
                    this.this$0.f103524c.removeOnWidgetStateChangeListener(aVar);
                    throw th;
                }
            }
            aVar2 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$2$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$2$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final String $tag;
            boolean Z$0;
            int label;
            final TheseusPageUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusPageUIStyleService theseusPageUIStyleService, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageUIStyleService;
                this.$tag = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tag, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                boolean z6 = this.Z$0;
                defpackage.a.b("[theseus-united-TheseusPageUIStyleService$2$1-invokeSuspend] ", b.a("Float layer showing state changed: ", z6), "TheseusPageUIStyleService$2$1-invokeSuspend");
                if (z6) {
                    this.this$0.f103528g.f103498g.a(this.$tag);
                } else {
                    this.this$0.f103528g.f103498g.b(this.$tag);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleService;
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
                TheseusPageUIStyleService theseusPageUIStyleService = this.this$0;
                StateFlow<Boolean> stateFlow = theseusPageUIStyleService.f103523b.f99662l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusPageUIStyleService, "hasFloatLayerShowingFlow", null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$3, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$3.class */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$3$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$3$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            final String $tag;
            boolean Z$0;
            int label;
            final TheseusPageUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusPageUIStyleService theseusPageUIStyleService, String str, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageUIStyleService;
                this.$tag = str;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$tag, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
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
                boolean z6 = this.Z$0;
                defpackage.a.b("[theseus-united-TheseusPageUIStyleService$3$1-invokeSuspend] ", b.a("Story entrance enabled: ", z6), "TheseusPageUIStyleService$3$1-invokeSuspend");
                if (z6) {
                    this.this$0.f103528g.f103498g.b(this.$tag);
                } else {
                    this.this$0.f103528g.f103498g.a(this.$tag);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleService;
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
                TheseusPageUIStyleService theseusPageUIStyleService = this.this$0;
                StateFlow<Boolean> stateFlow = theseusPageUIStyleService.f103528g.f103509s;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(theseusPageUIStyleService, "storyEntrance", null);
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$4, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$4.class */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final TheseusPageUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$4$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$4$a.class */
        public static final class a implements S {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleService;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass4(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            a aVar2;
            a aVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                aVar = new a();
                this.this$0.f103527f.addSimpleProgressCondition(aVar);
                try {
                    this.L$0 = aVar;
                    this.label = 1;
                    if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th) {
                    th = th;
                    aVar2 = aVar;
                    this.this$0.f103527f.removeSimpleProgressCondition(aVar2);
                    throw th;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a aVar4 = (a) this.L$0;
                aVar3 = aVar4;
                try {
                    ResultKt.throwOnFailure(obj);
                    aVar = aVar4;
                } catch (Throwable th2) {
                    aVar2 = aVar3;
                    th = th2;
                    this.this$0.f103527f.removeSimpleProgressCondition(aVar2);
                    throw th;
                }
            }
            aVar3 = aVar;
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$5, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$5.class */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$5$1, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$5$1.class */
        public static final class AnonymousClass1 extends SuspendLambda implements Function5<Integer, ScreenModeType, a.C1102a, Pair<? extends Integer, ? extends Integer>, Continuation<? super Pair<? extends Float, ? extends ScreenModeType>>, Object> {
            final int $extendBottom;
            int I$0;
            Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final TheseusPageUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(TheseusPageUIStyleService theseusPageUIStyleService, int i7, Continuation<? super AnonymousClass1> continuation) {
                super(5, continuation);
                this.this$0 = theseusPageUIStyleService;
                this.$extendBottom = i7;
            }

            public final Object invoke(int i7, ScreenModeType screenModeType, a.C1102a c1102a, Pair<Integer, Integer> pair, Continuation<? super Pair<Float, ? extends ScreenModeType>> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$extendBottom, continuation);
                anonymousClass1.I$0 = i7;
                anonymousClass1.L$0 = screenModeType;
                anonymousClass1.L$1 = c1102a;
                anonymousClass1.L$2 = pair;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return invoke(((Number) obj).intValue(), (ScreenModeType) obj2, (a.C1102a) obj3, (Pair<Integer, Integer>) obj4, (Continuation<? super Pair<Float, ? extends ScreenModeType>>) obj5);
            }

            public final Object invokeSuspend(Object obj) {
                Pair pair;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i7 = this.I$0;
                ScreenModeType screenModeType = (ScreenModeType) this.L$0;
                a.C1102a c1102a = (a.C1102a) this.L$1;
                Pair pair2 = (Pair) this.L$2;
                float f7 = 1.0f;
                if (screenModeType == ScreenModeType.THUMB) {
                    int i8 = c1102a.f102352b;
                    int iA = this.this$0.f103529i.a();
                    int iH = this.this$0.f103529i.h();
                    float fIntValue = (((Number) pair2.getSecond()).intValue() - this.this$0.f103529i.f()) - this.$extendBottom;
                    int iRoundToInt = iH;
                    if (fIntValue < iH) {
                        iRoundToInt = MathKt.roundToInt(fIntValue) - Math.abs(iA - iH);
                    }
                    int iCoerceAtLeast = RangesKt.coerceAtLeast((i8 - iRoundToInt) + i7, 0);
                    int i9 = this.$extendBottom;
                    if (iCoerceAtLeast < i9) {
                        f7 = iCoerceAtLeast / i9;
                    }
                    pair = new Pair(Boxing.boxFloat(f7), screenModeType);
                } else {
                    pair = new Pair(Boxing.boxFloat(1.0f), screenModeType);
                }
                return pair;
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$5$2, reason: invalid class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$5$2.class */
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<Pair<? extends Float, ? extends ScreenModeType>, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final TheseusPageUIStyleService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = theseusPageUIStyleService;
            }

            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            public final Object invoke(Pair<Float, ? extends ScreenModeType> pair, Continuation<? super Unit> continuation) {
                return create(pair, continuation).invokeSuspend(Unit.INSTANCE);
            }

            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Pair pair = (Pair) this.L$0;
                float fFloatValue = ((Number) pair.component1()).floatValue();
                if (((ScreenModeType) pair.component2()) == ScreenModeType.THUMB) {
                    this.this$0.f103525d.setControlWidgetAlpha(fFloatValue, 2131320471);
                } else {
                    this.this$0.f103525d.setControlWidgetAlpha(1.0f, 2131320471);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleService;
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
                TheseusPageUIStyleService theseusPageUIStyleService = this.this$0;
                int i8 = theseusPageUIStyleService.f103528g.f103507q;
                if (i8 <= 0) {
                    return Unit.INSTANCE;
                }
                Flow flowCombine = FlowKt.combine(theseusPageUIStyleService.h.f102255f, TheseusPlayContainerXKt.b(theseusPageUIStyleService.f103525d), this.this$0.f103529i.g(), this.this$0.f103529i.b(), new AnonymousClass1(this.this$0, i8, null));
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$6, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$6.class */
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final TheseusPageUIStyleService this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.uistyle.TheseusPageUIStyleService$6$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/uistyle/TheseusPageUIStyleService$6$a.class */
        public static final class a implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f103531a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f103532b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f103533c;

            public a(TheseusPageUIStyleService theseusPageUIStyleService) {
                TheseusPageUIStyleRepository theseusPageUIStyleRepository = theseusPageUIStyleService.f103528g;
                this.f103531a = theseusPageUIStyleRepository.f103504n;
                this.f103532b = theseusPageUIStyleRepository.f103505o;
                this.f103533c = theseusPageUIStyleRepository.f103507q;
            }

            @Override // com.bilibili.playerbizcommonv2.utils.o
            public final boolean a() {
                return this.f103532b;
            }

            @Override // com.bilibili.playerbizcommonv2.utils.o
            public final boolean b() {
                return this.f103531a;
            }

            @Override // com.bilibili.playerbizcommonv2.utils.o
            public final int c() {
                return this.f103533c;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(TheseusPageUIStyleService theseusPageUIStyleService, Continuation<? super AnonymousClass6> continuation) {
            super(2, continuation);
            this.this$0 = theseusPageUIStyleService;
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
            o.a aVar = o.a.f81942a;
            try {
                if (i7 == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.f103526e.put(aVar, new a(this.this$0));
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
                this.this$0.f103526e.remove(aVar);
                throw th;
            }
        }
    }

    @Inject
    public TheseusPageUIStyleService(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IControlContainerService iControlContainerService, @NotNull Er0.a aVar, @NotNull z zVar, @NotNull TheseusPageUIStyleRepository theseusPageUIStyleRepository, @NotNull PageNestedScrollFusionRepository pageNestedScrollFusionRepository, @NotNull com.bilibili.ship.theseus.united.page.playingarea.a aVar2) {
        this.f103522a = coroutineScope;
        this.f103523b = theseusFloatLayerService;
        this.f103524c = absFunctionWidgetService;
        this.f103525d = iControlContainerService;
        this.f103526e = aVar;
        this.f103527f = zVar;
        this.f103528g = theseusPageUIStyleRepository;
        this.h = pageNestedScrollFusionRepository;
        this.f103529i = aVar2;
        if (theseusPageUIStyleRepository.f103503m) {
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, null), 3, (Object) null);
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass3(this, null), 3, (Object) null);
            if (theseusPageUIStyleRepository.f103504n) {
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass4(this, null), 3, (Object) null);
                BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass5(this, null), 3, (Object) null);
            }
            BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass6(this, null), 3, (Object) null);
        }
    }
}
