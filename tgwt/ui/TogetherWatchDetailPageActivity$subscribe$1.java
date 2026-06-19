package com.bilibili.tgwt.ui;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.player.processor.r;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/ui/TogetherWatchDetailPageActivity$subscribe$1.class */
final class TogetherWatchDetailPageActivity$subscribe$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    boolean Z$0;
    int label;
    final TogetherWatchDetailPageActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchDetailPageActivity$subscribe$1(TogetherWatchDetailPageActivity togetherWatchDetailPageActivity, Continuation<? super TogetherWatchDetailPageActivity$subscribe$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchDetailPageActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TogetherWatchDetailPageActivity$subscribe$1 togetherWatchDetailPageActivity$subscribe$1 = new TogetherWatchDetailPageActivity$subscribe$1(this.this$0, continuation);
        togetherWatchDetailPageActivity$subscribe$1.Z$0 = ((Boolean) obj).booleanValue();
        return togetherWatchDetailPageActivity$subscribe$1;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Unit> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        ValueAnimator duration;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        boolean z6 = this.Z$0;
        r rVar = this.this$0.f112217G;
        r rVar2 = rVar;
        if (rVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mVideoWrapperProcessor");
            rVar2 = null;
        }
        if (rVar2.f111706i && rVar2.f111707j != z6 && rVar2.f111711n > 0) {
            rVar2.f111707j = z6;
            ValueAnimator valueAnimator = rVar2.f111708k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = rVar2.f111708k;
                if (valueAnimator2 != null) {
                    valueAnimator2.removeAllUpdateListeners();
                }
                ValueAnimator valueAnimator3 = rVar2.f111708k;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                rVar2.f111708k = null;
            }
            int i7 = rVar2.f111711n;
            boolean z7 = rVar2.f111712o;
            int i8 = rVar2.f111709l;
            int i9 = i7;
            int i10 = i8;
            if (z7) {
                int iA = Kl.d.a(rVar2.f111699a.getWindow());
                i10 = i8 + iA;
                i9 = i7 + iA;
            }
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(z6 ? PropertyValuesHolder.ofInt("panelWidth", rVar2.a().getLayoutParams().width, i9) : PropertyValuesHolder.ofInt("panelWidth", rVar2.a().getLayoutParams().width, 0), z6 ? PropertyValuesHolder.ofInt("videoLeftOffset", rVar2.c().getPaddingLeft(), i10) : PropertyValuesHolder.ofInt("videoLeftOffset", rVar2.c().getPaddingLeft(), 0), z6 ? PropertyValuesHolder.ofInt("videoRightOffset", rVar2.c().getPaddingLeft(), rVar2.f111710m) : PropertyValuesHolder.ofInt("videoRightOffset", rVar2.c().getPaddingLeft(), 0));
            rVar2.f111708k = valueAnimatorOfPropertyValuesHolder;
            if (valueAnimatorOfPropertyValuesHolder != null) {
                final r rVar3 = rVar2;
                final int i11 = 0;
                valueAnimatorOfPropertyValuesHolder.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(rVar3, i11) { // from class: com.bilibili.tgwt.player.processor.p

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final int f111696a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final Object f111697b;

                    {
                        this.f111696a = i11;
                        this.f111697b = rVar3;
                    }

                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        switch (this.f111696a) {
                            case 0:
                                r rVar4 = (r) this.f111697b;
                                rVar4.a().getLayoutParams().width = ((Integer) valueAnimator4.getAnimatedValue("panelWidth")).intValue();
                                rVar4.a().requestLayout();
                                int iIntValue = ((Integer) valueAnimator4.getAnimatedValue("videoLeftOffset")).intValue();
                                int iIntValue2 = ((Integer) valueAnimator4.getAnimatedValue("videoRightOffset")).intValue();
                                ((ViewGroup.MarginLayoutParams) rVar4.c().getLayoutParams()).leftMargin = iIntValue;
                                ((ViewGroup.MarginLayoutParams) rVar4.c().getLayoutParams()).rightMargin = iIntValue2;
                                rVar4.c().requestLayout();
                                break;
                            default:
                                ((View) this.f111697b).setAlpha(((Float) valueAnimator4.getAnimatedValue()).floatValue());
                                break;
                        }
                    }
                });
            }
            ValueAnimator valueAnimator4 = rVar2.f111708k;
            if (valueAnimator4 != null && (duration = valueAnimator4.setDuration(300L)) != null) {
                duration.start();
            }
            boolean z8 = rVar2.f111707j;
            CompositeDisposable compositeDisposable = rVar2.f111713p;
            ChatRoomManagerService chatRoomManagerService = rVar2.f111702d;
            if (z8) {
                compositeDisposable.add(Observable.create(new kotlinx.coroutines.rx3.c(chatRoomManagerService.f110931x, EmptyCoroutineContext.INSTANCE)).observeOn(AndroidSchedulers.mainThread()).subscribe(new W60.r(rVar2), Functions.f, Functions.c));
                chatRoomManagerService.f110932y.setValue(1);
                Neurons.reportExposure$default(false, "pgc.watch-together-fullscreen-cinema.0.0.show", (Map) null, (List) null, 12, (Object) null);
            } else {
                compositeDisposable.clear();
                rVar2.b().setPadding(0, 0, 0, 0);
                chatRoomManagerService.f110932y.setValue(0);
            }
        }
        return Unit.INSTANCE;
    }
}
