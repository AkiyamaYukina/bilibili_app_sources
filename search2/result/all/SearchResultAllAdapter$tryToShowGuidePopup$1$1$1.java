package com.bilibili.search2.result.all;

import android.content.Context;
import android.view.View;
import com.bilibili.lib.ui.BaseFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/all/SearchResultAllAdapter$tryToShowGuidePopup$1$1$1.class */
final class SearchResultAllAdapter$tryToShowGuidePopup$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final View $anchor;
    final Context $context;
    final SearchResultAllFragment $it;
    int label;
    final p this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchResultAllAdapter$tryToShowGuidePopup$1$1$1(Context context, p pVar, View view, SearchResultAllFragment searchResultAllFragment, Continuation<? super SearchResultAllAdapter$tryToShowGuidePopup$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.this$0 = pVar;
        this.$anchor = view;
        this.$it = searchResultAllFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SearchResultAllAdapter$tryToShowGuidePopup$1$1$1(this.$context, this.this$0, this.$anchor, this.$it, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.search2.result.all.o] */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            C6052f c6052f = new C6052f(this.$context);
            BaseFragment baseFragment = this.this$0.f87307e;
            View view = this.$anchor;
            final SearchResultAllFragment searchResultAllFragment = this.$it;
            ?? r02 = new Function0(searchResultAllFragment) { // from class: com.bilibili.search2.result.all.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final SearchResultAllFragment f87306a;

                {
                    this.f87306a = searchResultAllFragment;
                }

                public final Object invoke() {
                    return Integer.valueOf(this.f87306a.Tf());
                }
            };
            this.label = 1;
            if (c6052f.c(baseFragment, view, r02, this) == coroutine_suspended) {
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
