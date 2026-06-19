package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryComponent$showPrimaryTitle$2.class */
final class CheesePrimaryComponent$showPrimaryTitle$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final List<S> $badges;
    final String $title;
    final TextView $tvTitle;
    private Object L$0;
    int label;
    final C6081b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheesePrimaryComponent$showPrimaryTitle$2(List<S> list, TextView textView, String str, C6081b c6081b, Continuation<? super CheesePrimaryComponent$showPrimaryTitle$2> continuation) {
        super(2, continuation);
        this.$badges = list;
        this.$tvTitle = textView;
        this.$title = str;
        this.this$0 = c6081b;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheesePrimaryComponent$showPrimaryTitle$2 cheesePrimaryComponent$showPrimaryTitle$2 = new CheesePrimaryComponent$showPrimaryTitle$2(this.$badges, this.$tvTitle, this.$title, this.this$0, continuation);
        cheesePrimaryComponent$showPrimaryTitle$2.L$0 = obj;
        return cheesePrimaryComponent$showPrimaryTitle$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SpannableStringBuilder spannableStringBuilder;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            spannableStringBuilder = new SpannableStringBuilder();
            List<S> list = this.$badges;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                S s7 = (S) obj2;
                if (s7.f89681a.length() > 0 && s7.f89685e > 0 && s7.f89686f > 0) {
                    arrayList.add(obj2);
                }
            }
            C6081b c6081b = this.this$0;
            TextView textView = this.$tvTitle;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(BuildersKt.async$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CheesePrimaryComponent$showPrimaryTitle$2$2$1(c6081b, (S) it.next(), textView, null), 3, (Object) null));
            }
            this.L$0 = spannableStringBuilder;
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayList2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spannableStringBuilder = (SpannableStringBuilder) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        Iterator it2 = CollectionsKt.filterNotNull((Iterable) obj).iterator();
        while (it2.hasNext()) {
            spannableStringBuilder.append((CharSequence) it2.next()).append((CharSequence) " ");
        }
        this.$tvTitle.setText(spannableStringBuilder.append((CharSequence) this.$title));
        return Unit.INSTANCE;
    }
}
