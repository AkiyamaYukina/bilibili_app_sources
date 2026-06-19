package com.bilibili.ship.theseus.united.page.intro.module.promptbar;

import android.view.ViewGroup;
import com.bilibili.app.gemini.ui.UIComponent;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/promptbar/IntroPromptBarService$keepPromptActiveBarDisplaying$2.class */
final class IntroPromptBarService$keepPromptActiveBarDisplaying$2 extends SuspendLambda implements Function2<UIComponent.ViewEntry, Continuation<? super Unit>, Object> {
    final ViewGroup $vipBarContainer;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroPromptBarService$keepPromptActiveBarDisplaying$2(ViewGroup viewGroup, Continuation<IntroPromptBarService$keepPromptActiveBarDisplaying$2> continuation) {
        super(2, continuation);
        this.$vipBarContainer = viewGroup;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IntroPromptBarService$keepPromptActiveBarDisplaying$2 introPromptBarService$keepPromptActiveBarDisplaying$2 = new IntroPromptBarService$keepPromptActiveBarDisplaying$2(this.$vipBarContainer, continuation);
        introPromptBarService$keepPromptActiveBarDisplaying$2.L$0 = obj;
        return introPromptBarService$keepPromptActiveBarDisplaying$2;
    }

    public final Object invoke(UIComponent.ViewEntry viewEntry, Continuation<Unit> continuation) {
        return create(viewEntry, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        UIComponent.ViewEntry viewEntry;
        UIComponent.ViewEntry viewEntry2;
        UIComponent.ViewEntry viewEntry3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            viewEntry = (UIComponent.ViewEntry) this.L$0;
            this.$vipBarContainer.addView(viewEntry.getRoot());
            try {
                this.L$0 = viewEntry;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                viewEntry2 = viewEntry;
                this.$vipBarContainer.removeView(viewEntry2.getRoot());
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UIComponent.ViewEntry viewEntry4 = (UIComponent.ViewEntry) this.L$0;
            viewEntry3 = viewEntry4;
            try {
                ResultKt.throwOnFailure(obj);
                viewEntry = viewEntry4;
            } catch (Throwable th2) {
                viewEntry2 = viewEntry3;
                th = th2;
                this.$vipBarContainer.removeView(viewEntry2.getRoot());
                throw th;
            }
        }
        viewEntry3 = viewEntry;
        throw new KotlinNothingValueException();
    }
}
