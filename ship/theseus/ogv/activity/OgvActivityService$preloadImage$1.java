package com.bilibili.ship.theseus.ogv.activity;

import android.graphics.drawable.Drawable;
import com.bilibili.lib.image2.BiliImageLoader;
import com.bilibili.lib.image2.bean.DrawableHolder;
import com.bilibili.lib.image2.bean.ImageDataSource;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$preloadImage$1.class */
final class OgvActivityService$preloadImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Drawable>, Object> {
    final String $url;
    int label;
    final OgvActivityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityService$preloadImage$1(OgvActivityService ogvActivityService, String str, Continuation<? super OgvActivityService$preloadImage$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvActivityService;
        this.$url = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvActivityService$preloadImage$1(this.this$0, this.$url, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Drawable> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ImageDataSource imageDataSourceSubmit = BiliImageLoader.INSTANCE.acquire(ContextUtilKt.requireFragmentActivity(this.this$0.f91388a)).useOrigin().asDrawable().url(this.$url).submit();
            this.label = 1;
            Object objA = com.bilibili.ogv.infra.biliimage.c.a(imageDataSourceSubmit, this);
            obj2 = objA;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        if (Result.isFailure-impl(obj2)) {
            obj2 = null;
        }
        DrawableHolder drawableHolder = (DrawableHolder) obj2;
        Drawable drawable = null;
        if (drawableHolder != null) {
            drawable = drawableHolder.get();
        }
        return drawable;
    }
}
