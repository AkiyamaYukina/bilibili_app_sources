package com.bilibili.ship.theseus.ugc.recommend;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.ship.theseus.ugc.recommend.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;
import tv.danmaku.biliplayerv2.service.IFunctionWidgetServiceKt;
import tv.danmaku.biliplayerv2.service.report.NeuronsEvents;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/FullScreenPlayingBottomRecommendService$showRecommendCards$1.class */
final class FullScreenPlayingBottomRecommendService$showRecommendCards$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final b.a $action;
    final IFunctionContainer.LayoutParams $layoutParams;
    final b $widget;
    int label;
    final g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullScreenPlayingBottomRecommendService$showRecommendCards$1(g gVar, b bVar, IFunctionContainer.LayoutParams layoutParams, b.a aVar, Continuation<? super FullScreenPlayingBottomRecommendService$showRecommendCards$1> continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$widget = bVar;
        this.$layoutParams = layoutParams;
        this.$action = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(b bVar, b.a aVar, FunctionWidgetToken functionWidgetToken) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorX;
        ViewPropertyAnimator viewPropertyAnimatorY;
        ViewPropertyAnimator listener;
        bVar.f98403e.hide();
        bY.c<RecyclerView> cVar = bVar.f98406i;
        if (cVar != null) {
            cVar.i();
        }
        List<o> list = bVar.h.f98433e;
        a aVar2 = bVar.f98415r;
        aVar2.f98393b.clear();
        if (list != null && !((ArrayList) list).isEmpty()) {
            aVar2.f98393b.addAll(list);
        }
        aVar2.notifyDataSetChanged();
        RecyclerView recyclerViewI = bVar.i();
        if (recyclerViewI != null) {
            recyclerViewI.scrollToPosition(0);
        }
        RecyclerView recyclerViewI2 = bVar.i();
        if (recyclerViewI2 != null) {
            recyclerViewI2.setVisibility(4);
        }
        FrameLayout frameLayoutH = bVar.h();
        if (frameLayoutH != null) {
            frameLayoutH.setVisibility(4);
        }
        bVar.f98411n = aVar.f98417b;
        bVar.f98412o = aVar.f98418c;
        RecyclerView recyclerViewI3 = bVar.i();
        if (recyclerViewI3 != null) {
            recyclerViewI3.setX(bVar.f98411n);
        }
        RecyclerView recyclerViewI4 = bVar.i();
        if (recyclerViewI4 != null) {
            recyclerViewI4.setY(bVar.f98412o);
        }
        RecyclerView recyclerViewI5 = bVar.i();
        if (recyclerViewI5 != null && (viewPropertyAnimatorAnimate = recyclerViewI5.animate()) != null && (viewPropertyAnimatorX = viewPropertyAnimatorAnimate.x(0.0f)) != null && (viewPropertyAnimatorY = viewPropertyAnimatorX.y(aVar.f98419d - bVar.f98407j)) != null && (listener = viewPropertyAnimatorY.setListener(new d(bVar))) != null) {
            listener.start();
        }
        bVar.f98401c.report(new NeuronsEvents.NormalEvent("player.player.relatedvideo-button.0.player", new String[]{"click_type", aVar.f98416a ? "1" : "2", "from_av", bVar.f98404f.b()}));
        return Unit.INSTANCE;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FullScreenPlayingBottomRecommendService$showRecommendCards$1(this.this$0, this.$widget, this.$layoutParams, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            AbsFunctionWidgetService absFunctionWidgetService = this.this$0.f98430b;
            final b bVar = this.$widget;
            IFunctionContainer.LayoutParams layoutParams = this.$layoutParams;
            final b.a aVar = this.$action;
            Function1 function1 = new Function1(bVar, aVar) { // from class: com.bilibili.ship.theseus.ugc.recommend.f

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final b f98427a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final b.a f98428b;

                {
                    this.f98427a = bVar;
                    this.f98428b = aVar;
                }

                public final Object invoke(Object obj2) {
                    return FullScreenPlayingBottomRecommendService$showRecommendCards$1.invokeSuspend$lambda$0(this.f98427a, this.f98428b, (FunctionWidgetToken) obj2);
                }
            };
            this.label = 1;
            if (IFunctionWidgetServiceKt.retainFunctionWidget(absFunctionWidgetService, bVar, layoutParams, function1, this) == coroutine_suspended) {
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
