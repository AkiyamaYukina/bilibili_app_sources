package com.bilibili.ship.theseus.ogv.endpage;

import android.R;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.lib.image2.view.InnerInsulateImageView;
import com.bilibili.lib.theme.R$color;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tl0.C8669a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/endpage/OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1.class */
final class OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1 extends SuspendLambda implements Function2<com.bilibili.community.follow.b, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final OgvPlayerEndPageVerticalFullScreenFunctionWidget this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1(OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget, Continuation<? super OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPlayerEndPageVerticalFullScreenFunctionWidget;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1 ogvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1 = new OgvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1(this.this$0, continuation);
        ogvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1.L$0 = obj;
        return ogvPlayerEndPageVerticalFullScreenFunctionWidget$subscribe$1;
    }

    public final Object invoke(com.bilibili.community.follow.b bVar, Continuation<? super Unit> continuation) {
        return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i7;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        com.bilibili.community.follow.b bVar = (com.bilibili.community.follow.b) this.L$0;
        OgvPlayerEndPageVerticalFullScreenFunctionWidget ogvPlayerEndPageVerticalFullScreenFunctionWidget = this.this$0;
        boolean z6 = bVar.a;
        int i8 = R$color.Wh0_u;
        if (z6) {
            InnerInsulateImageView innerInsulateImageView = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92020G;
            if (innerInsulateImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvFollow");
                innerInsulateImageView = null;
            }
            innerInsulateImageView.setVisibility(8);
            i7 = 2131240743;
        } else {
            InnerInsulateImageView innerInsulateImageView2 = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92020G;
            InnerInsulateImageView innerInsulateImageView3 = innerInsulateImageView2;
            if (innerInsulateImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvFollow");
                innerInsulateImageView3 = null;
            }
            innerInsulateImageView3.setVisibility(0);
            BiliImageView biliImageView = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92020G;
            BiliImageView biliImageView2 = biliImageView;
            if (biliImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mIvFollow");
                biliImageView2 = null;
            }
            int color = ContextCompat.getColor(ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92035e, R.color.white);
            VectorDrawableCompat vectorDrawableCompatCreate = VectorDrawableCompat.create(biliImageView2.getResources(), 2131236687, null);
            if (vectorDrawableCompatCreate != null) {
                Drawable drawableWrap = DrawableCompat.wrap(vectorDrawableCompatCreate);
                DrawableCompat.setTint(drawableWrap.mutate(), color);
                biliImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
                biliImageView2.getGenericProperties().setImage(drawableWrap);
            }
            i7 = 2131240744;
        }
        View view = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92021H;
        if (view != null) {
            view.setBackgroundResource(i7);
        }
        TextView textView = ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92019F;
        if (textView != null) {
            textView.setText(C8669a.a(textView.getContext(), ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92029P, z6, ogvPlayerEndPageVerticalFullScreenFunctionWidget.f92039j.f94455g.e()));
            textView.setTextColor(ContextCompat.getColor(textView.getContext(), i8));
        }
        return Unit.INSTANCE;
    }
}
