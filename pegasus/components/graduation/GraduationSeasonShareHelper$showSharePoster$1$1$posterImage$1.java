package com.bilibili.pegasus.components.graduation;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.compose.material.C3953w3;
import androidx.compose.ui.graphics.AndroidImageBitmap_androidKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.pegasus.data.config.GraduationSeasonShareConfig;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonShareHelper$showSharePoster$1$1$posterImage$1.class */
public final class GraduationSeasonShareHelper$showSharePoster$1$1$posterImage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageBitmap>, Object> {
    final FragmentActivity $activity;
    final Bitmap $background;
    final GraduationSeasonShareConfig $shareConfig;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonShareHelper$showSharePoster$1$1$posterImage$1(FragmentActivity fragmentActivity, GraduationSeasonShareConfig graduationSeasonShareConfig, Bitmap bitmap, Continuation<? super GraduationSeasonShareHelper$showSharePoster$1$1$posterImage$1> continuation) {
        super(2, continuation);
        this.$activity = fragmentActivity;
        this.$shareConfig = graduationSeasonShareConfig;
        this.$background = bitmap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonShareHelper$showSharePoster$1$1$posterImage$1(this.$activity, this.$shareConfig, this.$background, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ImageBitmap> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        W w7 = W.f76097a;
        FragmentActivity fragmentActivity = this.$activity;
        GraduationSeasonShareConfig graduationSeasonShareConfig = this.$shareConfig;
        Bitmap bitmap = this.$background;
        w7.getClass();
        float f7 = fragmentActivity.getResources().getDisplayMetrics().density;
        int iRoundToInt = MathKt.roundToInt(307.0f * f7);
        int iRoundToInt2 = MathKt.roundToInt(512.0f * f7);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iRoundToInt, iRoundToInt2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, iRoundToInt, iRoundToInt2), (Paint) null);
            bitmap.recycle();
        }
        Y yA = X.a(graduationSeasonShareConfig != null ? graduationSeasonShareConfig.getValue() : null);
        if (yA != null) {
            Typeface font = ResourcesCompat.getFont(fragmentActivity, 2132213761);
            Typeface typeface = font;
            if (font == null) {
                typeface = Typeface.DEFAULT;
            }
            Paint paint = new Paint(1);
            int i7 = C5620v.f76256v;
            paint.setColor(i7);
            paint.setTextSize(f7 * 70.0f);
            paint.setTypeface(typeface);
            Paint paint2 = new Paint(1);
            paint2.setColor(i7);
            paint2.setTextSize(f7 * 40.0f);
            paint2.setTypeface(typeface);
            Paint paint3 = new Paint(1);
            paint3.setColor(i7);
            paint3.setTextSize(25.0f * f7);
            paint3.setTypeface(typeface);
            float f8 = 33.5f * f7;
            float f9 = 330.0f * f7;
            String str = yA.f76098a;
            canvas.drawText(str, f8, f9, paint);
            float fMeasureText = paint.measureText(str) + f8;
            String str2 = yA.f76099b;
            float fMeasureText2 = fMeasureText;
            if (str2 != null) {
                float f10 = fMeasureText - (f7 * 4.0f);
                canvas.drawText(str2, f10, f9, paint2);
                fMeasureText2 = f10 + paint2.measureText(str2);
            }
            canvas.drawText("%", (2.0f * f7) + fMeasureText2, f9, paint3);
        }
        Bitmap bitmap2 = bitmapCreateBitmap;
        if (graduationSeasonShareConfig != null) {
            String text = graduationSeasonShareConfig.getText();
            bitmap2 = bitmapCreateBitmap;
            if (text != null) {
                if (StringsKt.isBlank(text)) {
                    text = null;
                }
                if (text != null) {
                    float f11 = 180.0f * f7;
                    Paint paint4 = new Paint(1);
                    paint4.setColor(-16742469);
                    paint4.setTextSize(18.0f * f7);
                    paint4.setTextAlign(Paint.Align.CENTER);
                    paint4.setFakeBoldText(true);
                    Iterator it = SequencesKt.take(SequencesKt.filter(StringsKt.lineSequence(text), new C3953w3(2)), 2).iterator();
                    int i8 = 0;
                    while (true) {
                        bitmap2 = bitmapCreateBitmap;
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (i8 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        String strA = (String) next;
                        W.f76097a.getClass();
                        if (paint4.measureText(strA) > f11) {
                            float fMeasureText3 = paint4.measureText("...");
                            int length = strA.length();
                            int i9 = 0;
                            while (i9 < length) {
                                int i10 = ((i9 + length) + 1) / 2;
                                if (paint4.measureText(strA, 0, i10) + fMeasureText3 <= f11) {
                                    i9 = i10;
                                } else {
                                    length = i10 - 1;
                                }
                            }
                            strA = G.p.a(StringsKt.take(strA, i9), "...");
                        }
                        canvas.drawText(strA, 153.5f * f7, (i8 * 24.0f * f7) + (373.0f * f7), paint4);
                        i8++;
                    }
                } else {
                    bitmap2 = bitmapCreateBitmap;
                }
            }
        }
        int iRoundToInt3 = MathKt.roundToInt(86.0f * f7);
        int i11 = iRoundToInt2 - iRoundToInt3;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(fragmentActivity.getResources(), 2131245532);
        if (bitmapDecodeResource != null) {
            canvas.drawBitmap(bitmapDecodeResource, (Rect) null, new Rect(0, i11, iRoundToInt, iRoundToInt3 + i11), (Paint) null);
            bitmapDecodeResource.recycle();
        }
        int iRoundToInt4 = MathKt.roundToInt(315.0f * f7);
        int iRoundToInt5 = MathKt.roundToInt(543.0f * f7);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iRoundToInt4, iRoundToInt5, Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(fragmentActivity.getResources(), 2131245541);
        if (bitmapDecodeResource2 != null) {
            canvas2.drawBitmap(bitmapDecodeResource2, (Rect) null, new Rect(0, 0, iRoundToInt4, iRoundToInt5), (Paint) null);
            bitmapDecodeResource2.recycle();
        }
        canvas2.drawBitmap(bitmap2, f7 * 4.0f, f7 * 20.0f, (Paint) null);
        bitmap2.recycle();
        return AndroidImageBitmap_androidKt.asImageBitmap(bitmapCreateBitmap2);
    }
}
