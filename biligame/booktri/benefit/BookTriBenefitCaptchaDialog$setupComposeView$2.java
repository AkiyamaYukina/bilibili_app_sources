package com.bilibili.biligame.booktri.benefit;

import com.bilibili.biligame.booktri.benefit.AbstractC5291b;
import com.bilibili.biligame.router.BiligameRouterHelper;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/BookTriBenefitCaptchaDialog$setupComposeView$2.class */
final class BookTriBenefitCaptchaDialog$setupComposeView$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BookTriBenefitCaptchaDialog this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/BookTriBenefitCaptchaDialog$setupComposeView$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BookTriBenefitCaptchaDialog f62259a;

        public a(BookTriBenefitCaptchaDialog bookTriBenefitCaptchaDialog) {
            this.f62259a = bookTriBenefitCaptchaDialog;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.fragment.app.Fragment, com.bilibili.biligame.booktri.benefit.BookTriBenefitCaptchaDialog, com.bilibili.biligame.widget.dialog.BaseCaptchaDialogFragment] */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            AbstractC5291b abstractC5291b = (AbstractC5291b) obj;
            boolean z6 = abstractC5291b instanceof AbstractC5291b.C0342b;
            ?? r02 = this.f62259a;
            if (z6) {
                BiligameRouterHelper.login(r02.requireContext(), 1000);
                r02.dismiss();
                r02.mf().f62410r.setValue((Object) null);
            } else if (abstractC5291b instanceof AbstractC5291b.a) {
                r02.startCaptcha();
                r02.mf().f62410r.setValue((Object) null);
            } else if (abstractC5291b != null) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookTriBenefitCaptchaDialog$setupComposeView$2(BookTriBenefitCaptchaDialog bookTriBenefitCaptchaDialog, Continuation<? super BookTriBenefitCaptchaDialog$setupComposeView$2> continuation) {
        super(2, continuation);
        this.this$0 = bookTriBenefitCaptchaDialog;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BookTriBenefitCaptchaDialog$setupComposeView$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            StateFlow<AbstractC5291b> stateFlow = this.this$0.mf().f62411s;
            a aVar = new a(this.this$0);
            this.label = 1;
            if (stateFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
