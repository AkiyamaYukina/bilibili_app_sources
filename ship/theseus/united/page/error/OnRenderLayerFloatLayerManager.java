package com.bilibili.ship.theseus.united.page.error;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.player.feature.zoom.ZoomContainerService;
import com.bilibili.ship.theseus.united.page.floatlayer.FloatLayerManager;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.panel.BuiltInLayer;
import tv.danmaku.biliplayerv2.panel.IPanelContainer;
import tv.danmaku.biliplayerv2.panel.IPlayerLayer;
import tv.danmaku.biliplayerv2.service.IRenderContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/OnRenderLayerFloatLayerManager.class */
@StabilityInferred(parameters = 0)
public final class OnRenderLayerFloatLayerManager extends FloatLayerManager {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IRenderContainerService f99569g;

    @NotNull
    public final Context h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f99570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ZoomContainerService f99571j;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/OnRenderLayerFloatLayerManager$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $layer;
        int label;
        final OnRenderLayerFloatLayerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager, a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = onRenderLayerFloatLayerManager;
            this.$layer = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$layer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager = this.this$0;
                FrameLayout frameLayout = this.$layer.f99573a;
                this.label = 1;
                if (onRenderLayerFloatLayerManager.a(frameLayout, this) == coroutine_suspended) {
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

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/OnRenderLayerFloatLayerManager$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final a $layer;
        int label;
        final OnRenderLayerFloatLayerManager this$0;

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.error.OnRenderLayerFloatLayerManager$2$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/OnRenderLayerFloatLayerManager$2$a.class */
        public static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a f99572a;

            public a(a aVar) {
                this.f99572a = aVar;
            }

            public final Object emit(Object obj, Continuation continuation) {
                this.f99572a.f99573a.setPaddingRelative(0, 0, ((Number) obj).intValue(), 0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager, a aVar, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = onRenderLayerFloatLayerManager;
            this.$layer = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, this.$layer, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow stateFlow = this.this$0.f99571j.f;
                a aVar = new a(this.$layer);
                this.label = 1;
                if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/error/OnRenderLayerFloatLayerManager$a.class */
    public final class a implements IPlayerLayer<View> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final FrameLayout f99573a;

        public a(OnRenderLayerFloatLayerManager onRenderLayerFloatLayerManager) {
            this.f99573a = new FrameLayout(onRenderLayerFloatLayerManager.h);
        }

        @NotNull
        public final View getView() {
            return this.f99573a;
        }
    }

    @Inject
    public OnRenderLayerFloatLayerManager(@NotNull IRenderContainerService iRenderContainerService, @NotNull Context context, @NotNull CoroutineScope coroutineScope, @NotNull ZoomContainerService zoomContainerService) {
        this.f99569g = iRenderContainerService;
        this.h = context;
        this.f99570i = coroutineScope;
        this.f99571j = zoomContainerService;
        a aVar = new a(this);
        IPanelContainer panelContainer = iRenderContainerService.getPanelContainer();
        if (panelContainer != null) {
            panelContainer.addLayer(aVar, BuiltInLayer.LayerRender);
        }
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(this, aVar, null), 3, (Object) null);
        BuildersKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass2(this, aVar, null), 3, (Object) null);
    }
}
