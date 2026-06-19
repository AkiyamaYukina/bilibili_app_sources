package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import android.graphics.drawable.Drawable;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import com.bilibili.lib.theme.R$color;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$2.class */
public final class MangaPayFragment$initFlow$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MangaPayFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$2$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$2$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final MangaPayFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MangaPayFragment mangaPayFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mangaPayFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar, Continuation<? super Unit> continuation) {
            return create(hVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Button button;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h) this.L$0;
            if (hVar != null) {
                MangaPayFragment mangaPayFragment = this.this$0;
                mangaPayFragment.getClass();
                synchronized (Button.class) {
                    try {
                        mangaPayFragment.f74077B = !hVar.f74070a;
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    Drawable drawable = ContextCompat.getDrawable(mangaPayFragment.requireContext(), 2131241752);
                    if (drawable != null) {
                        drawable.setTint(ContextCompat.getColor(mangaPayFragment.requireContext(), R$color.Pi5));
                    }
                    Button button2 = mangaPayFragment.f74076A;
                    if (button2 != null) {
                        button2.setBackground(drawable);
                    }
                } catch (Exception e7) {
                    com.bilibili.adcommon.utils.i.a("require context error, message:", e7.getMessage(), ", stack: ", ExceptionsKt.stackTraceToString(e7), "MangaPayFragmentTag");
                }
                if (!StringsKt.isBlank(hVar.f74071b) && (button = mangaPayFragment.f74076A) != null) {
                    button.setText(hVar.f74071b);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initFlow$2(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initFlow$2> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$initFlow$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        StateFlow stateFlowAsStateFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = this.this$0.f74087L;
            if (dVar != null && (stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74049c)) != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlowAsStateFlow, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
