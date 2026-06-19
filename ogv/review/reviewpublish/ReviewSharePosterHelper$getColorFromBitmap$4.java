package com.bilibili.ogv.review.reviewpublish;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewSharePosterHelper$getColorFromBitmap$4.class */
final class ReviewSharePosterHelper$getColorFromBitmap$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
    final Pair<Float, Float> $BConverter;
    final Pair<Float, Float> $SConverter;
    final Bitmap $bitmap;
    final int $defaultColor;
    final float $heightEnd;
    final float $heightStart;
    final float $widthEnd;
    final float $widthStart;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSharePosterHelper$getColorFromBitmap$4(int i7, Bitmap bitmap, float f7, float f8, float f9, float f10, Pair<Float, Float> pair, Pair<Float, Float> pair2, Continuation<? super ReviewSharePosterHelper$getColorFromBitmap$4> continuation) {
        super(2, continuation);
        this.$defaultColor = i7;
        this.$bitmap = bitmap;
        this.$widthStart = f7;
        this.$widthEnd = f8;
        this.$heightStart = f9;
        this.$heightEnd = f10;
        this.$SConverter = pair;
        this.$BConverter = pair2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewSharePosterHelper$getColorFromBitmap$4(this.$defaultColor, this.$bitmap, this.$widthStart, this.$widthEnd, this.$heightStart, this.$heightEnd, this.$SConverter, this.$BConverter, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int width = this.$bitmap.getWidth();
        int height = this.$bitmap.getHeight();
        float f7 = this.$widthStart;
        int iRoundToInt = (0.0f > f7 || f7 > 1.0f || f7 >= this.$widthEnd) ? 0 : MathKt.roundToInt(width * f7);
        float f8 = this.$widthStart;
        int iRoundToInt2 = width;
        if (0.0f <= f8) {
            iRoundToInt2 = width;
            if (f8 <= 1.0f) {
                float f9 = this.$widthEnd;
                iRoundToInt2 = width;
                if (f8 < f9) {
                    iRoundToInt2 = MathKt.roundToInt(width * f9);
                }
            }
        }
        float f10 = this.$heightStart;
        int iRoundToInt3 = (0.0f > f10 || f10 > 1.0f || f10 >= this.$heightEnd) ? 0 : MathKt.roundToInt(height * f10);
        float f11 = this.$heightStart;
        int iRoundToInt4 = height;
        if (0.0f <= f11) {
            iRoundToInt4 = height;
            if (f11 <= 1.0f) {
                float f12 = this.$heightEnd;
                iRoundToInt4 = height;
                if (f11 < f12) {
                    iRoundToInt4 = MathKt.roundToInt(height * f12);
                }
            }
        }
        Bitmap bitmap = this.$bitmap;
        Rect rect = new Rect(iRoundToInt, iRoundToInt3, iRoundToInt2, iRoundToInt4);
        int iMin = Math.min(rect.bottom, bitmap.getHeight() - 1);
        long j7 = 0;
        int i7 = 0;
        long j8 = 0;
        long j9 = 0;
        for (int iMax = Math.max(0, rect.top); iMax <= iMin; iMax++) {
            int iMax2 = Math.max(0, rect.left);
            int iMin2 = Math.min(rect.right, bitmap.getWidth() - 1);
            while (iMax2 <= iMin2) {
                int pixel = bitmap.getPixel(iMax2, iMax);
                j7 += (long) ((pixel >> 16) & 255);
                j8 += (long) ((pixel >> 8) & 255);
                j9 += (long) (pixel & 255);
                iMax2++;
                i7++;
            }
        }
        float f13 = i7;
        int iRgb = Color.rgb(MathKt.roundToInt(j7 / f13), MathKt.roundToInt(j8 / f13), MathKt.roundToInt(j9 / f13));
        float[] fArr = new float[3];
        Color.colorToHSV(iRgb, fArr);
        Pair<Float, Float> pair = this.$SConverter;
        Pair<Float, Float> pair2 = this.$BConverter;
        if (((Number) pair.getFirst()).floatValue() < ((Number) pair.getSecond()).floatValue() && ((Number) pair.getFirst()).floatValue() >= 0.0f && ((Number) pair.getSecond()).floatValue() <= 1.0f) {
            if (fArr[1] < ((Number) pair.getFirst()).floatValue()) {
                fArr[1] = ((Number) pair.getFirst()).floatValue();
            }
            if (fArr[1] > ((Number) pair.getSecond()).floatValue()) {
                fArr[1] = ((Number) pair.getSecond()).floatValue();
            }
        }
        if (((Number) pair2.getFirst()).floatValue() < ((Number) pair2.getSecond()).floatValue() && ((Number) pair2.getFirst()).floatValue() >= 0.0f && ((Number) pair2.getSecond()).floatValue() <= 1.0f) {
            if (fArr[2] < ((Number) pair2.getFirst()).floatValue()) {
                fArr[2] = ((Number) pair2.getFirst()).floatValue();
            }
            if (fArr[2] > ((Number) pair2.getSecond()).floatValue()) {
                fArr[2] = ((Number) pair2.getSecond()).floatValue();
            }
        }
        return Boxing.boxInt(Color.HSVToColor(fArr));
    }
}
