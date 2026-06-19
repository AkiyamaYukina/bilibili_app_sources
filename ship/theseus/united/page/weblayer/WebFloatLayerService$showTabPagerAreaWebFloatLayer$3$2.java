package com.bilibili.ship.theseus.united.page.weblayer;

import androidx.paging.Y;
import androidx.window.core.layout.WindowSizeClass;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2.class */
public final class WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final TheseusFloatLayerService.a $layerConfig;
    final TheseusWebUIComponent $uiComponent;
    int label;
    final WebFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<WindowSizeClass, Continuation<? super Unit>, Object> {
        final Ref.BooleanRef $lastNormal;
        final TheseusFloatLayerService.a $layerConfig;
        final TheseusWebUIComponent $uiComponent;
        Object L$0;
        Object L$1;
        int label;
        final WebFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebFloatLayerService webFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, Ref.BooleanRef booleanRef, TheseusFloatLayerService.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = webFloatLayerService;
            this.$uiComponent = theseusWebUIComponent;
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
            com.bilibili.ship.theseus.united.page.playingarea.g gVar;
            com.bilibili.ship.theseus.united.page.playingarea.g gVar2;
            String str;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                WindowSizeClass windowSizeClass = (WindowSizeClass) this.L$0;
                boolean z6 = this.this$0.f104240b.i() || this.this$0.f104240b.f();
                if (z6) {
                    this.$uiComponent.i(0);
                } else {
                    this.$uiComponent.i(DimenUtilsKt.dpToPx(this.this$0.f104240b.a(windowSizeClass)));
                }
                this.$uiComponent.f104190j.setValue(Integer.valueOf(DimenUtilsKt.dpToPx(com.bilibili.ship.theseus.united.page.intro.a.b(windowSizeClass))));
                this.$uiComponent.h(!z6);
                if (this.$lastNormal.element != z6) {
                    this.$layerConfig.f99670f.invoke();
                    this.$lastNormal.element = z6;
                }
                if (z6) {
                    gVar = this.this$0.f104241c;
                    TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
                    gVar.f("WebFloatLayerService");
                    try {
                        MutableSharedFlow mutableSharedFlow = theseusWebUIComponent.f104195o;
                        this.L$0 = gVar;
                        this.L$1 = "WebFloatLayerService";
                        this.label = 1;
                        if (FlowKt.first(mutableSharedFlow, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str2 = "WebFloatLayerService";
                        gVar.j(str2);
                    } catch (Throwable th) {
                        th = th;
                        gVar2 = gVar;
                        str = "WebFloatLayerService";
                        gVar2.j(str);
                        throw th;
                    }
                } else {
                    this.this$0.f104241c.j("WebFloatLayerService");
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.L$1;
                gVar2 = (com.bilibili.ship.theseus.united.page.playingarea.g) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    gVar = gVar2;
                    gVar.j(str2);
                } catch (Throwable th2) {
                    th = th2;
                    str = str2;
                    gVar2.j(str);
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2(WebFloatLayerService webFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2> continuation) {
        super(1, continuation);
        this.this$0 = webFloatLayerService;
        this.$uiComponent = theseusWebUIComponent;
        this.$layerConfig = aVar;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new WebFloatLayerService$showTabPagerAreaWebFloatLayer$3$2(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            Ref.BooleanRef booleanRefA = Y.a(obj);
            booleanRefA.element = this.this$0.f104240b.i() || this.this$0.f104240b.f();
            WebFloatLayerService webFloatLayerService = this.this$0;
            StateFlow<WindowSizeClass> stateFlow = webFloatLayerService.f104240b.f102939c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(webFloatLayerService, this.$uiComponent, booleanRefA, this.$layerConfig, null);
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
