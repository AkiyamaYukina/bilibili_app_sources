package com.bilibili.playset.detail.widget;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import androidx.compose.runtime.MutableState;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/BlurImageKt$BlurImage$2$1.class */
public final class BlurImageKt$BlurImage$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Bitmap> $blurredBitmap$delegate;
    final MutableState<Bitmap> $originBitmap$delegate;
    int label;

    /* JADX INFO: renamed from: com.bilibili.playset.detail.widget.BlurImageKt$BlurImage$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/BlurImageKt$BlurImage$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final MutableState<Bitmap> $blurredBitmap$delegate;
        final Bitmap $original;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Bitmap bitmap, MutableState<Bitmap> mutableState, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$original = bitmap;
            this.$blurredBitmap$delegate = mutableState;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$original, this.$blurredBitmap$delegate, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:18:0x0076). Please report as a decompilation issue!!! */
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                Bitmap bitmapCopy = this.$original.copy(Bitmap.Config.ARGB_8888, true);
                if (bitmapCopy != null) {
                    MutableState<Bitmap> mutableState = this.$blurredBitmap$delegate;
                    int iA = com.bilibili.app.comm.list.widget.utils.a.a(bitmapCopy);
                    NativeBlurFilter.iterativeBoxBlur(bitmapCopy, 2, 28);
                    new Canvas(bitmapCopy).drawColor(iA);
                    Bitmap value = mutableState.getValue();
                    mutableState.setValue(bitmapCopy);
                    if (value != null) {
                        try {
                            if (value.isRecycled()) {
                                value = null;
                            }
                            if (value != null) {
                                value.recycle();
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (Exception e7) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                }
            } catch (Exception e8) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlurImageKt$BlurImage$2$1(MutableState<Bitmap> mutableState, MutableState<Bitmap> mutableState2, Continuation<? super BlurImageKt$BlurImage$2$1> continuation) {
        super(2, continuation);
        this.$originBitmap$delegate = mutableState;
        this.$blurredBitmap$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BlurImageKt$BlurImage$2$1(this.$originBitmap$delegate, this.$blurredBitmap$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Bitmap value = this.$originBitmap$delegate.getValue();
            if (value == null) {
                return Unit.INSTANCE;
            }
            CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(value, this.$blurredBitmap$delegate, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == coroutine_suspended) {
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
