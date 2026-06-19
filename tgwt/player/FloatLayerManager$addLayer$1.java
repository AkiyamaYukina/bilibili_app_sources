package com.bilibili.tgwt.player;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.app.gemini.ui.UIComponentKt;
import com.bilibili.tgwt.player.FloatLayerManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$addLayer$1.class */
final class FloatLayerManager$addLayer$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Animation $animation;
    final FloatLayerManager.a $layer;
    final ViewGroup $this_addLayer;
    int label;
    final FloatLayerManager this$0;

    /* JADX INFO: renamed from: com.bilibili.tgwt.player.FloatLayerManager$addLayer$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/FloatLayerManager$addLayer$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
        final Animation $animation;
        final FloatLayerManager.a $layer;
        final ViewGroup $this_addLayer;
        Object L$0;
        int label;
        final FloatLayerManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ViewGroup viewGroup, Animation animation, FloatLayerManager floatLayerManager, FloatLayerManager.a aVar, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_addLayer = viewGroup;
            this.$animation = animation;
            this.this$0 = floatLayerManager;
            this.$layer = aVar;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_addLayer, this.$animation, this.this$0, this.$layer, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(UIComponent.ViewEntry viewEntry, Continuation<? super Unit> continuation) {
            return create(viewEntry, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            UIComponent.ViewEntry viewEntry = (UIComponent.ViewEntry) this.L$0;
            this.$this_addLayer.addView(viewEntry.getRoot());
            Animation animation = this.$animation;
            if (animation != null) {
                viewEntry.getRoot().startAnimation(animation);
            }
            FloatLayerManager floatLayerManager = this.this$0;
            View root = viewEntry.getRoot();
            FloatLayerManager.a aVar = this.$layer;
            KProperty<Object>[] kPropertyArr = FloatLayerManager.f111519f;
            floatLayerManager.getClass();
            KProperty<Object> kProperty = FloatLayerManager.f111519f[0];
            root.setTag(floatLayerManager.f111524e, aVar);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatLayerManager$addLayer$1(FloatLayerManager.a aVar, ViewGroup viewGroup, Animation animation, FloatLayerManager floatLayerManager, Continuation<? super FloatLayerManager$addLayer$1> continuation) {
        super(2, continuation);
        this.$layer = aVar;
        this.$this_addLayer = viewGroup;
        this.$animation = animation;
        this.this$0 = floatLayerManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatLayerManager$addLayer$1(this.$layer, this.$this_addLayer, this.$animation, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            UIComponent<?> uIComponent = this.$layer.f111525a;
            Context context = this.$this_addLayer.getContext();
            ViewGroup viewGroup = this.$this_addLayer;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(viewGroup, this.$animation, this.this$0, this.$layer, null);
            this.label = 1;
            if (UIComponentKt.b(uIComponent, context, viewGroup, anonymousClass1, this, 4) == coroutine_suspended) {
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
