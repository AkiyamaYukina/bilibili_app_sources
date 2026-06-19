package com.bilibili.ship.theseus.united.page.tab;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.biliplayerv2.utils.DpUtils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/CommentTabUIComponent$tryToShowImgAnim$2.class */
final class CommentTabUIComponent$tryToShowImgAnim$2 extends SuspendLambda implements Function2<Drawable, Continuation<? super Unit>, Object> {
    final ImageView $imageView;
    final TintTextView $textView;
    final View $view;
    Object L$0;
    int label;
    final f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentTabUIComponent$tryToShowImgAnim$2(ImageView imageView, TintTextView tintTextView, View view, f fVar, Continuation<? super CommentTabUIComponent$tryToShowImgAnim$2> continuation) {
        super(2, continuation);
        this.$imageView = imageView;
        this.$textView = tintTextView;
        this.$view = view;
        this.this$0 = fVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CommentTabUIComponent$tryToShowImgAnim$2 commentTabUIComponent$tryToShowImgAnim$2 = new CommentTabUIComponent$tryToShowImgAnim$2(this.$imageView, this.$textView, this.$view, this.this$0, continuation);
        commentTabUIComponent$tryToShowImgAnim$2.L$0 = obj;
        return commentTabUIComponent$tryToShowImgAnim$2;
    }

    public final Object invoke(Drawable drawable, Continuation<? super Unit> continuation) {
        return create(drawable, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Drawable drawable = (Drawable) this.L$0;
        this.$imageView.setImageDrawable(drawable);
        int measuredWidth = this.$textView.getMeasuredWidth();
        int iMin = Math.min(drawable.getIntrinsicWidth(), this.$imageView.getMaxWidth());
        if (iMin > measuredWidth) {
            int paddingRight = this.$view.getPaddingRight();
            int i7 = measuredWidth + paddingRight > iMin ? paddingRight - (iMin - measuredWidth) : 0;
            int i8 = i7;
            if (i7 < 0) {
                i8 = 0;
            }
            View view = this.$view;
            view.setPadding(view.getPaddingLeft(), 0, i8, 0);
        }
        f fVar = this.this$0;
        TintTextView tintTextView = this.$textView;
        ImageView imageView = this.$imageView;
        int i9 = f.f103174e;
        fVar.getClass();
        float fDp2px = DpUtils.dp2px(tintTextView.getContext(), 10.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.TRANSLATION_Y;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tintTextView, (Property<TintTextView, Float>) property, 0.0f, fDp2px);
        Property property2 = View.ALPHA;
        animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(tintTextView, (Property<TintTextView, Float>) property2, 1.0f, 0.0f));
        animatorSet.setDuration(400L);
        AnimatorSet animatorSet2 = new AnimatorSet();
        float f7 = -fDp2px;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, f7, 0.0f), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 0.0f, 1.0f));
        animatorSet2.setDuration(400L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 0.0f, fDp2px), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f, 0.0f));
        animatorSet3.setStartDelay(2000L);
        animatorSet3.setDuration(400L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        animatorSet4.playTogether(ObjectAnimator.ofFloat(tintTextView, (Property<TintTextView, Float>) property, f7, 0.0f), ObjectAnimator.ofFloat(tintTextView, (Property<TintTextView, Float>) property2, 0.0f, 1.0f));
        animatorSet4.setDuration(400L);
        animatorSet4.setStartDelay(2200L);
        AnimatorSet animatorSet5 = new AnimatorSet();
        animatorSet5.playTogether(animatorSet, animatorSet2, animatorSet4, animatorSet3);
        animatorSet5.addListener(new g(imageView));
        fVar.f103177c = animatorSet5;
        return Unit.INSTANCE;
    }
}
