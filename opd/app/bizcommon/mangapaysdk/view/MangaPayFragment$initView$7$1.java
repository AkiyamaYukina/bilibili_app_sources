package com.bilibili.opd.app.bizcommon.mangapaysdk.view;

import android.widget.ImageView;
import com.bilibili.lib.mod.H0;
import com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.ButtonState;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initView$7$1.class */
final class MangaPayFragment$initView$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MangaPayFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/mangapaysdk/view/MangaPayFragment$initView$7$1$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f74130a;

        static {
            int[] iArr = new int[ButtonState.values().length];
            try {
                iArr[ButtonState.SureToBuy.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[ButtonState.GotoCharging.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[ButtonState.ChargingAndSureToBuy.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f74130a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MangaPayFragment$initView$7$1(MangaPayFragment mangaPayFragment, Continuation<? super MangaPayFragment$initView$7$1> continuation) {
        super(2, continuation);
        this.this$0 = mangaPayFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MangaPayFragment$initView$7$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        StateFlow stateFlowAsStateFlow;
        com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h hVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.pf().p(MangaPayFragment.nf(this.this$0, null, false, false, false, 15));
                com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.d dVar = this.this$0.f74087L;
                ButtonState buttonState = (dVar == null || (stateFlowAsStateFlow = FlowKt.asStateFlow(dVar.f74049c)) == null || (hVar = (com.bilibili.opd.app.bizcommon.mangapaysdk.data.model.h) stateFlowAsStateFlow.getValue()) == null) ? null : hVar.f74072c;
                int i8 = buttonState == null ? -1 : a.f74130a[buttonState.ordinal()];
                if (i8 == 1) {
                    MangaPayFragment mangaPayFragment = this.this$0;
                    if (mangaPayFragment.f74077B) {
                        ImageView imageView = mangaPayFragment.f74078C;
                        if (imageView != null) {
                            imageView.post(new H0(1, mangaPayFragment, imageView));
                        }
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    if (MangaPayFragment.kf(mangaPayFragment, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Unit unit = Unit.INSTANCE;
                } else if (i8 != 2) {
                    if (i8 == 3) {
                        MangaPayFragment mangaPayFragment2 = this.this$0;
                        if (mangaPayFragment2.f74077B) {
                            ImageView imageView2 = mangaPayFragment2.f74078C;
                            if (imageView2 != null) {
                                imageView2.post(new H0(1, mangaPayFragment2, imageView2));
                            }
                            return Unit.INSTANCE;
                        }
                        this.label = 3;
                        if (MangaPayFragment.jf(mangaPayFragment2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                } else {
                    MangaPayFragment mangaPayFragment3 = this.this$0;
                    this.label = 2;
                    if (MangaPayFragment.m7854if(mangaPayFragment3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i7 == 1) {
                ResultKt.throwOnFailure(obj);
                Unit unit3 = Unit.INSTANCE;
            } else if (i7 == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Unit unit22 = Unit.INSTANCE;
            }
        } catch (Exception e7) {
            com.bilibili.adcommon.utils.i.a("sure to buy click exception... message: ", e7.getMessage(), ", stack: ", ExceptionsKt.stackTraceToString(e7), "MangaPayFragmentTag");
        }
        return Unit.INSTANCE;
    }
}
