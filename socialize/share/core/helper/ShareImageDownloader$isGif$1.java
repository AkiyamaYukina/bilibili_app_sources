package com.bilibili.socialize.share.core.helper;

import com.bilibili.lib.image2.BiliImageLoaderHelper;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/socialize/share/core/helper/ShareImageDownloader$isGif$1.class */
public final class ShareImageDownloader$isGif$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final String $imagePath;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareImageDownloader$isGif$1(String str, Continuation<? super ShareImageDownloader$isGif$1> continuation) {
        super(2, continuation);
        this.$imagePath = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareImageDownloader$isGif$1(this.$imagePath, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        boolean zEquals;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$imagePath;
                this.label = 1;
                Object objCheckImageFormatName = BiliImageLoaderHelper.checkImageFormatName(str, this);
                obj = objCheckImageFormatName;
                if (objCheckImageFormatName == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            zEquals = ((String) obj).equals("GIF");
        } catch (Exception e7) {
            zEquals = false;
        }
        return Boxing.boxBoolean(zEquals);
    }
}
