package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import android.widget.TextView;
import java.text.DecimalFormat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$1.class */
public final class MangaPayFragment$initFlow$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MangaPayFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.opd.app.bizcommon.mangapaysdk.view.MangaPayFragment$initFlow$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initFlow$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b, Continuation<? super Unit>, Object> {
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

        public final Object invoke(com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b bVar, Continuation<? super Unit> continuation) {
            return create(bVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b bVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.b) this.L$0;
            if (bVar != null) {
                if (bVar.f74038a) {
                    if (!bVar.f74041d) {
                        MangaPayFragment mangaPayFragment = this.this$0;
                        mangaPayFragment.Df(mangaPayFragment.getResources().getString(2131838475));
                    }
                    this.this$0.dismissAllowingStateLoss();
                    this.this$0.f74096U = false;
                }
                MangaPayFragment mangaPayFragment2 = this.this$0;
                mangaPayFragment2.getClass();
                float f7 = bVar.f74039b;
                if (f7 < 0.0f) {
                    BLog.e("MangaPayFragmentTag", "check user consume b coin is correct !!!! consume b coin: " + f7);
                } else {
                    DecimalFormat decimalFormat = new DecimalFormat("0.00");
                    TextView textView = mangaPayFragment2.f74117t;
                    if (textView != null) {
                        textView.setText(decimalFormat.format(Float.valueOf(f7)));
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(mangaPayFragment2.getResources().getString(2131838487));
                    stringBuffer.append(decimalFormat.format(Float.valueOf(f7)));
                    stringBuffer.append(mangaPayFragment2.getResources().getString(2131838509));
                    stringBuffer.append(mangaPayFragment2.getResources().getString(2131838499));
                    TextView textView2 = mangaPayFragment2.f74118u;
                    if (textView2 != null) {
                        textView2.setText(stringBuffer.toString());
                    }
                }
                MangaPayFragment mangaPayFragment3 = this.this$0;
                mangaPayFragment3.getClass();
                float f8 = bVar.f74040c;
                if (f8 < 0.0f) {
                    BLog.e("MangaPayFragmentTag", "check user b coin is correct !!!! user b coin: " + f8);
                } else {
                    DecimalFormat decimalFormat2 = new DecimalFormat("0.00");
                    TextView textView3 = mangaPayFragment3.f74119v;
                    if (textView3 != null) {
                        textView3.setText(decimalFormat2.format(Float.valueOf(f8)));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initFlow$1(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$initFlow$1(this.this$0, continuation);
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
            if (dVar != null && (stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74048b)) != null) {
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
