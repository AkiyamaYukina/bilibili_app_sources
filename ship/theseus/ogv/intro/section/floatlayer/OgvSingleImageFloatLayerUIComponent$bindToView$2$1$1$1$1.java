package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/OgvSingleImageFloatLayerUIComponent$bindToView$2$1$1$1$1.class */
final class OgvSingleImageFloatLayerUIComponent$bindToView$2$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final MutableState<Drawable> $drawable$delegate;
    final Lifecycle $lifecycle;
    Object L$0;
    int label;
    final u this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvSingleImageFloatLayerUIComponent$bindToView$2$1$1$1$1(Context context, Lifecycle lifecycle, u uVar, MutableState<Drawable> mutableState, Continuation<? super OgvSingleImageFloatLayerUIComponent$bindToView$2$1$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$lifecycle = lifecycle;
        this.this$0 = uVar;
        this.$drawable$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvSingleImageFloatLayerUIComponent$bindToView$2$1$1$1$1(this.$context, this.$lifecycle, this.this$0, this.$drawable$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        MutableState<Drawable> mutableState;
        Object objA;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            mutableState = this.$drawable$delegate;
            ImageDataSource imageDataSourceSubmit = BiliImageLoader.INSTANCE.acquire(this.$context, this.$lifecycle).useOrigin().asDrawable().url((String) this.this$0.f93721a.f93723a.getValue()).submit();
            this.L$0 = mutableState;
            this.label = 1;
            objA = com.bilibili.ogv.infra.biliimage.c.a(imageDataSourceSubmit, this);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableState = (MutableState) this.L$0;
            ResultKt.throwOnFailure(obj);
            objA = ((Result) obj).unbox-impl();
        }
        if (Result.isFailure-impl(objA)) {
            objA = null;
        }
        DrawableHolder drawableHolder = (DrawableHolder) objA;
        Drawable drawable = null;
        if (drawableHolder != null) {
            drawable = drawableHolder.get();
        }
        int i8 = u.f93720c;
        mutableState.setValue(drawable);
        return Unit.INSTANCE;
    }
}
