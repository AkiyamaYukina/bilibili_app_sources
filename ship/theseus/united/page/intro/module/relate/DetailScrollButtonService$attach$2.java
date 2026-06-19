package com.bilibili.ship.theseus.united.page.intro.module.relate;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.bilibili.droid.DimenUtilsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/DetailScrollButtonService$attach$2.class */
final class DetailScrollButtonService$attach$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {
    final ImageView $scrollButton;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailScrollButtonService$attach$2(ImageView imageView, Continuation<? super DetailScrollButtonService$attach$2> continuation) {
        super(2, continuation);
        this.$scrollButton = imageView;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DetailScrollButtonService$attach$2 detailScrollButtonService$attach$2 = new DetailScrollButtonService$attach$2(this.$scrollButton, continuation);
        detailScrollButtonService$attach$2.I$0 = ((Number) obj).intValue();
        return detailScrollButtonService$attach$2;
    }

    public final Object invoke(int i7, Continuation<? super Unit> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i7 = this.I$0;
        ImageView imageView = this.$scrollButton;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.rightMargin = DimenUtilsKt.dpToPx(i7 - 8);
        imageView.setLayoutParams(marginLayoutParams);
        return Unit.INSTANCE;
    }
}
