package com.bilibili.ship.theseus.united.page.weblayer;

import com.bilibili.ship.theseus.united.page.backpress.BackActionRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$showSlangPediaPanel$3;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1.class */
public final class SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    final SlangPediaFloatLayerService$showSlangPediaPanel$3.a $globalLayoutListener;
    final TheseusFloatLayerService.a $layerConfig;
    final TheseusWebUIComponent $uiComponent;
    final String $url;
    int label;
    final SlangPediaFloatLayerService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.weblayer.SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/weblayer/SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final TheseusFloatLayerService.a $layerConfig;
        final TheseusWebUIComponent $uiComponent;
        int label;
        final SlangPediaFloatLayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SlangPediaFloatLayerService slangPediaFloatLayerService, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(1, continuation);
            this.this$0 = slangPediaFloatLayerService;
            this.$uiComponent = theseusWebUIComponent;
            this.$layerConfig = aVar;
        }

        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$uiComponent, this.$layerConfig, continuation);
        }

        public final Object invoke(Continuation<? super Unit> continuation) {
            return create(continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                TheseusFloatLayerService theseusFloatLayerService = this.this$0.f104155c;
                TheseusWebUIComponent theseusWebUIComponent = this.$uiComponent;
                TheseusFloatLayerService.a aVar = this.$layerConfig;
                this.label = 1;
                if (theseusFloatLayerService.e(theseusWebUIComponent, aVar, this) == coroutine_suspended) {
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
    public SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1(SlangPediaFloatLayerService slangPediaFloatLayerService, String str, SlangPediaFloatLayerService$showSlangPediaPanel$3.a aVar, TheseusWebUIComponent theseusWebUIComponent, TheseusFloatLayerService.a aVar2, Continuation<? super SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1> continuation) {
        super(1, continuation);
        this.this$0 = slangPediaFloatLayerService;
        this.$url = str;
        this.$globalLayoutListener = aVar;
        this.$uiComponent = theseusWebUIComponent;
        this.$layerConfig = aVar2;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new SlangPediaFloatLayerService$showSlangPediaPanel$3$1$1(this.this$0, this.$url, this.$globalLayoutListener, this.$uiComponent, this.$layerConfig, continuation);
    }

    public final Object invoke(Continuation<? super Unit> continuation) {
        return create(continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SlangPediaFloatLayerService slangPediaFloatLayerService = this.this$0;
            String str = this.$url;
            slangPediaFloatLayerService.getClass();
            PageReportService.g(slangPediaFloatLayerService.f104157e, "united.player-video-detail.h5-container.open.click", MapsKt.mapOf(TuplesKt.to("url", str)), 4);
            SlangPediaFloatLayerService slangPediaFloatLayerService2 = this.this$0;
            BackActionRepository backActionRepository = slangPediaFloatLayerService2.f104156d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(slangPediaFloatLayerService2, this.$uiComponent, this.$layerConfig, null);
            this.label = 1;
            if (backActionRepository.a(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f104154b.getWindow().getDecorView().removeOnLayoutChangeListener(this.$globalLayoutListener);
        BLog.i("SlangPediaFloatLayerService", "float layer close by cancel scope");
        SlangPediaFloatLayerService.a(this.this$0, this.$url, "2");
        return Unit.INSTANCE;
    }
}
