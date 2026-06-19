package com.bilibili.ship.theseus.united.page.videoquality;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playerbizcommonv2.widget.quality.QualityDolbyInfoComponent;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityDolbyInfoFunctionWidget.class */
@StabilityInferred(parameters = 0)
public final class QualityDolbyInfoFunctionWidget extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TheseusPlayerQualityService f103745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.keel.player.h f103746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f103747c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f103748d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final QualityDolbyInfoComponent f103749e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final kq0.b f103750f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CoroutineScope f103751g;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.videoquality.QualityDolbyInfoFunctionWidget$onWidgetShow$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/QualityDolbyInfoFunctionWidget$onWidgetShow$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final QualityDolbyInfoFunctionWidget this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(QualityDolbyInfoFunctionWidget qualityDolbyInfoFunctionWidget, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = qualityDolbyInfoFunctionWidget;
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
                QualityDolbyInfoFunctionWidget qualityDolbyInfoFunctionWidget = this.this$0;
                QualityDolbyInfoComponent qualityDolbyInfoComponent = qualityDolbyInfoFunctionWidget.f103749e;
                kq0.b bVar = qualityDolbyInfoFunctionWidget.f103750f;
                this.label = 1;
                if (qualityDolbyInfoComponent.a(bVar, this) == coroutine_suspended) {
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
    public QualityDolbyInfoFunctionWidget(@NotNull Context context, @NotNull TheseusPlayerQualityService theseusPlayerQualityService, @NotNull com.bilibili.ship.theseus.keel.player.h hVar, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IControlContainerService iControlContainerService) {
        super(context);
        this.f103745a = theseusPlayerQualityService;
        this.f103746b = hVar;
        this.f103747c = absFunctionWidgetService;
        this.f103748d = iControlContainerService;
        this.f103749e = new QualityDolbyInfoComponent(new com.bilibili.lib.fasthybrid.game.engine.core.render.webview.h(this, 3), new com.bilibili.bililive.room.biz.shopping.view.z0(this, 1), new C61.c(this, 1));
        this.f103750f = kq0.b.inflate(LayoutInflater.from(context), null, false);
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        return this.f103750f.f122947a;
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, false);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    public final void onRelease() {
    }

    public final void onWidgetDismiss() {
        super.onWidgetDismiss();
        this.f103746b.i(this);
        CoroutineScope coroutineScope = this.f103751g;
        CoroutineScope coroutineScope2 = coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope2 = null;
        }
        CoroutineScopeKt.cancel$default(coroutineScope2, (CancellationException) null, 1, (Object) null);
    }

    public final void onWidgetShow(@Nullable AbsFunctionWidget.Configuration configuration) {
        super.onWidgetShow(configuration);
        this.f103746b.h(this);
        CoroutineScope coroutineScopeA = com.bilibili.ad.core.click.K.a((Job) null, 1, (Object) null, Dispatchers.getMain().getImmediate());
        this.f103751g = coroutineScopeA;
        if (coroutineScopeA == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScopeA = null;
        }
        BuildersKt.launch$default(coroutineScopeA, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, null), 3, (Object) null);
    }
}
