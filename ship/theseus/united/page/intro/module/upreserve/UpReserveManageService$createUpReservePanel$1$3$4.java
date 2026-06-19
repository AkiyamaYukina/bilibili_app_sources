package com.bilibili.ship.theseus.united.page.intro.module.upreserve;

import androidx.paging.Y;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.weblayer.TheseusWebUIComponent;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1$3$4.class */
public final class UpReserveManageService$createUpReservePanel$1$3$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $layerConfig;
    final Ref.ObjectRef<k> $uiComponent;
    int label;
    final j this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.upreserve.UpReserveManageService$createUpReservePanel$1$3$4$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/upreserve/UpReserveManageService$createUpReservePanel$1$3$4$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final Ref.BooleanRef $lastNormal;
        final TheseusFloatLayerService.a $layerConfig;
        final Ref.ObjectRef<k> $uiComponent;
        Object L$0;
        Object L$1;
        int label;
        final j this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(j jVar, Ref.ObjectRef<k> objectRef, Ref.BooleanRef booleanRef, TheseusFloatLayerService.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = jVar;
            this.$uiComponent = objectRef;
            this.$lastNormal = booleanRef;
            this.$layerConfig = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$uiComponent, this.$lastNormal, this.$layerConfig, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(WindowSizeClass windowSizeClass, Continuation<? super Unit> continuation) {
            return create(windowSizeClass, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) throws Throwable {
            float fMin;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
            j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                boolean zI = this.this$0.f102001f.i();
                k kVar = (k) this.$uiComponent.element;
                if (zI) {
                    fMin = 0.0f;
                } else {
                    Pair pair = new Pair(Boxing.boxInt(DimenUtilsKt.dpToPx(windowSizeClass.getMinWidthDp())), Boxing.boxInt(DimenUtilsKt.dpToPx(windowSizeClass.getMinHeightDp())));
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    MathKt.roundToInt(iIntValue / 1.7777778f);
                    fMin = Math.min(iIntValue2 - DimenUtilsKt.dpToPx(580), MathKt.roundToInt(0.4f * r0)) / iIntValue2;
                }
                kVar.l(fMin);
                ((k) this.$uiComponent.element).f99722f.setValue(Integer.valueOf(DimenUtilsKt.dpToPx(com.bilibili.ship.theseus.united.page.intro.a.b(windowSizeClass))));
                ((TheseusWebUIComponent) ((k) this.$uiComponent.element).f102004m.getValue()).h(true);
                if (this.$lastNormal.element != zI) {
                    this.$layerConfig.f99670f.invoke();
                    this.$lastNormal.element = zI;
                }
                if (zI) {
                    j jVar2 = this.this$0;
                    gVar = jVar2.f101998c;
                    Ref.ObjectRef<k> objectRef = this.$uiComponent;
                    gVar.f(jVar2);
                    try {
                        MutableSharedFlow mutableSharedFlow = ((TheseusWebUIComponent) ((k) objectRef.element).f102004m.getValue()).f104195o;
                        this.L$0 = gVar;
                        this.L$1 = jVar2;
                        this.label = 1;
                        if (FlowKt.first(mutableSharedFlow, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jVar = jVar2;
                        gVar.j(jVar);
                    } catch (Throwable th) {
                        th = th;
                        gVar2 = gVar;
                        jVar = jVar2;
                        gVar2.j(jVar);
                        throw th;
                    }
                } else {
                    this.this$0.f101998c.j("UpReserveManageService");
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.L$1;
                com.bilibili.ship.theseus.united.page.playingarea.g gVar3 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    gVar = gVar3;
                    gVar.j(jVar);
                } catch (Throwable th2) {
                    gVar2 = gVar3;
                    th = th2;
                    gVar2.j(jVar);
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpReserveManageService$createUpReservePanel$1$3$4(j jVar, Ref.ObjectRef<k> objectRef, TheseusFloatLayerService.a aVar, Continuation<? super UpReserveManageService$createUpReservePanel$1$3$4> continuation) {
        super(1, continuation);
        this.this$0 = jVar;
        this.$uiComponent = objectRef;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new UpReserveManageService$createUpReservePanel$1$3$4(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.BooleanRef booleanRefA = Y.a(obj);
            booleanRefA.element = this.this$0.f102001f.i();
            j jVar = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = jVar.f102001f.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(jVar, this.$uiComponent, booleanRefA, this.$layerConfig, null);
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
