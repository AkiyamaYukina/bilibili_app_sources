package com.bilibili.ship.theseus.united.page.videoquality;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.infra.coroutine.SelectKt$selectCancellingUnselected$scope$1;
import dagger.internal.Provider;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.ScreenModeType;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/ShowQualityListImpl.class */
@StabilityInferred(parameters = 0)
public final class ShowQualityListImpl implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f103753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Provider f103754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f103756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.i f103757e;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.ShowQualityListImpl$invoke$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/ShowQualityListImpl$invoke$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final ScreenModeType $screenModeType;
        final TheseusQualityFunctionWidget $widget;
        int label;
        final ShowQualityListImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ShowQualityListImpl showQualityListImpl, TheseusQualityFunctionWidget theseusQualityFunctionWidget, ScreenModeType screenModeType, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = showQualityListImpl;
            this.$widget = theseusQualityFunctionWidget;
            this.$screenModeType = screenModeType;
        }

        private static final Unit invokeSuspend$lambda$0(ShowQualityListImpl showQualityListImpl, TheseusQualityFunctionWidget theseusQualityFunctionWidget, ScreenModeType screenModeType, com.bilibili.ogv.infra.coroutine.c cVar) {
            cVar.b(new ShowQualityListImpl$invoke$1$1$1(showQualityListImpl, theseusQualityFunctionWidget, screenModeType, null));
            cVar.b(new ShowQualityListImpl$invoke$1$1$2(showQualityListImpl, null));
            return Unit.INSTANCE;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$widget, this.$screenModeType, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                ShowQualityListImpl showQualityListImpl = this.this$0;
                TheseusQualityFunctionWidget theseusQualityFunctionWidget = this.$widget;
                ScreenModeType screenModeType = this.$screenModeType;
                this.label = 1;
                ArrayList arrayList = new ArrayList();
                invokeSuspend$lambda$0(showQualityListImpl, theseusQualityFunctionWidget, screenModeType, new SelectKt$selectCancellingUnselected$scope$1(arrayList));
                if (FlowKt.first(FlowKt.merge(arrayList), this) == coroutine_suspended) {
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

    @Inject
    public ShowQualityListImpl(@NotNull CoroutineScope coroutineScope, @NotNull Provider provider, @NotNull IControlContainerService iControlContainerService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.i iVar) {
        this.f103753a = coroutineScope;
        this.f103754b = provider;
        this.f103755c = iControlContainerService;
        this.f103756d = absFunctionWidgetService;
        this.f103757e = iVar;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.O
    public final void invoke() {
        IControlContainerService iControlContainerService = this.f103755c;
        BuildersKt.launch$default(this.f103753a, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, (TheseusQualityFunctionWidget) this.f103754b.get(), iControlContainerService.getScreenModeType(), null), 3, (Object) null);
        iControlContainerService.hide();
    }
}
