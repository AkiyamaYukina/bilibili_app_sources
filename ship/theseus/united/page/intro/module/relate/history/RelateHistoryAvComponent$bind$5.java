package com.bilibili.ship.theseus.united.page.intro.module.relate.history;

import android.content.Context;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import tv.danmaku.bili.widget.text.TintFixedLineSpacingTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/history/RelateHistoryAvComponent$bind$5.class */
final class RelateHistoryAvComponent$bind$5 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    final Context $context;
    final TintFixedLineSpacingTextView $title;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelateHistoryAvComponent$bind$5(TintFixedLineSpacingTextView tintFixedLineSpacingTextView, Context context, Continuation<? super RelateHistoryAvComponent$bind$5> continuation) {
        super(2, continuation);
        this.$title = tintFixedLineSpacingTextView;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RelateHistoryAvComponent$bind$5 relateHistoryAvComponent$bind$5 = new RelateHistoryAvComponent$bind$5(this.$title, this.$context, continuation);
        relateHistoryAvComponent$bind$5.Z$0 = ((Boolean) obj).booleanValue();
        return relateHistoryAvComponent$bind$5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.Z$0) {
            this.$title.setTextColor(ContextCompat.getColor(this.$context, 2131100812));
        } else {
            this.$title.setTextColor(ContextCompat.getColor(this.$context, R$color.Ga10));
        }
        return Unit.INSTANCE;
    }
}
