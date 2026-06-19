package com.bilibili.ogv.review.reviewpublish;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import androidx.core.graphics.ColorUtils;
import com.bilibili.lib.image2.ImageMeasureBuilder;
import com.bilibili.ogv.pub.review.bean.ReviewShareData;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$preparePictures$1.class */
final class ReviewShareFragment$preparePictures$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final i $vm;
    Object L$0;
    int label;
    final ReviewShareFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewShareFragment$preparePictures$1(i iVar, ReviewShareFragment reviewShareFragment, Continuation<? super ReviewShareFragment$preparePictures$1> continuation) {
        super(2, continuation);
        this.$vm = iVar;
        this.this$0 = reviewShareFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewShareFragment$preparePictures$1(this.$vm, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        i iVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            i iVar2 = this.$vm;
            h hVar = h.f72531a;
            ImageMeasureBuilder imageMeasureBuilder = new ImageMeasureBuilder(this.this$0.requireContext(), this.this$0.getLifecycle());
            ReviewShareData reviewShareData = this.this$0.f72466b;
            ReviewShareData reviewShareData2 = reviewShareData;
            if (reviewShareData == null) {
                Intrinsics.throwUninitializedPropertyAccessException("data");
                reviewShareData2 = null;
            }
            String str = reviewShareData2.f71737c;
            Pair pair = new Pair(Boxing.boxFloat(0.5f), Boxing.boxFloat(0.9f));
            Pair pair2 = new Pair(Boxing.boxFloat(0.3f), Boxing.boxFloat(0.7f));
            this.L$0 = iVar2;
            this.label = 1;
            Object objA = hVar.a(imageMeasureBuilder, str, 2568773, pair, pair2, 66, 100, 0.9f, 1.0f, 0.0f, 1.0f, this);
            obj2 = objA;
            iVar = iVar2;
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar3 = (i) this.L$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            iVar = iVar3;
        }
        int iIntValue = ((Number) obj2).intValue();
        iVar.f72541k = iIntValue;
        GradientDrawable gradientDrawableA = e8.h.a(0);
        gradientDrawableA.setColors(new int[]{ColorUtils.setAlphaComponent(iIntValue, 0), ColorUtils.setAlphaComponent(iIntValue, 230)});
        gradientDrawableA.setGradientType(0);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        gradientDrawableA.setOrientation(orientation);
        if (!Intrinsics.areEqual(gradientDrawableA, iVar.f72542l)) {
            iVar.f72542l = gradientDrawableA;
            iVar.notifyPropertyChanged(455);
        }
        GradientDrawable gradientDrawableA2 = e8.h.a(0);
        gradientDrawableA2.setColors(new int[]{ColorUtils.setAlphaComponent(iIntValue, 231), ColorUtils.setAlphaComponent(iIntValue, 255)});
        gradientDrawableA2.setGradientType(0);
        gradientDrawableA2.setOrientation(orientation);
        if (!Intrinsics.areEqual(gradientDrawableA2, iVar.f72543m)) {
            iVar.f72543m = gradientDrawableA2;
            iVar.notifyPropertyChanged(454);
        }
        ColorDrawable colorDrawable = new ColorDrawable(iIntValue);
        if (!Intrinsics.areEqual(colorDrawable, iVar.f72544n)) {
            iVar.f72544n = colorDrawable;
            iVar.notifyPropertyChanged(453);
        }
        return Unit.INSTANCE;
    }
}
