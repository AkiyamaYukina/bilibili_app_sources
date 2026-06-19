package com.bilibili.ship.theseus.united.player;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.droid.DimenUtilsKt;
import com.bilibili.player.tangram.basic.CompoundPlayStateProviderKt;
import com.bilibili.playerbizcommon.gesture.IGestureService;
import com.bilibili.playerbizcommon.gesture.OnLongPressListener;
import com.bilibili.playerbizcommonv2.utils.f;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.IFunctionContainer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/TripleSpeedService$runOldTripleSpeed$1.class */
final class TripleSpeedService$runOldTripleSpeed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleSpeedService$runOldTripleSpeed$1(e eVar, Continuation<? super TripleSpeedService$runOldTripleSpeed$1> continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TripleSpeedService$runOldTripleSpeed$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        OnLongPressListener onLongPressListener;
        OnLongPressListener onLongPressListener2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final e eVar = this.this$0;
            onLongPressListener = new OnLongPressListener(eVar) { // from class: com.bilibili.ship.theseus.united.player.TripleSpeedService$runOldTripleSpeed$1$listener$1

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final e f104321a;

                {
                    this.f104321a = eVar;
                }

                @Override // com.bilibili.playerbizcommon.gesture.OnLongPressListener
                public final boolean onLongPress(MotionEvent motionEvent) {
                    Window window;
                    View decorView;
                    e eVar2 = this.f104321a;
                    if (!CompoundPlayStateProviderKt.c(eVar2.f104455g) || eVar2.f104456i != null) {
                        return false;
                    }
                    float fFloatValue = ((Number) f.h.getValue()).floatValue();
                    eVar2.f104451c.hide();
                    IFunctionContainer.LayoutParams layoutParams = new IFunctionContainer.LayoutParams(-2, -2);
                    layoutParams.setLayoutType(7);
                    layoutParams.setFunctionType(1);
                    layoutParams.setExitAnim(-1);
                    layoutParams.setEnterAnim(-1);
                    layoutParams.touchOutsideDismiss(false);
                    layoutParams.touchEnable(false);
                    com.bilibili.ship.theseus.united.page.screensize.a aVar = eVar2.h;
                    if (aVar.i()) {
                        layoutParams.setTopMargin((int) DpUtils.dp2px(eVar2.f104453e, 10.0f));
                    } else {
                        Context context = eVar2.f104453e;
                        FragmentActivity fragmentActivity = aVar.f102937a;
                        layoutParams.setTopMargin((int) DpUtils.dp2px(context, RangesKt.coerceAtLeast(144 - (((fragmentActivity == null || (window = fragmentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) ? null : ViewCompat.getRootWindowInsets(decorView)) == null ? 0 : DimenUtilsKt.pxToDp(r9.getInsets(WindowInsetsCompat.Type.statusBars() | WindowInsetsCompat.Type.displayCutout()).top)), 0)));
                    }
                    eVar2.f104456i = BuildersKt.launch$default(eVar2.f104454f, (CoroutineContext) null, (CoroutineStart) null, new TripleSpeedService$runOldTripleSpeed$1$listener$1$onLongPress$1(eVar2, fFloatValue, layoutParams, null), 3, (Object) null);
                    try {
                        Vibrator vibrator = (Vibrator) eVar2.f104453e.getSystemService("vibrator");
                        if (Build.VERSION.SDK_INT < 26) {
                            vibrator.vibrate(30L);
                        } else {
                            vibrator.vibrate(VibrationEffect.createOneShot(30L, 64));
                        }
                        return true;
                    } catch (Exception e7) {
                        BLog.e("TripleSpeedService-vibrate", "[theseus-united-TripleSpeedService-vibrate] do vibrate caused some exceptions", e7);
                        return true;
                    }
                }

                @Override // com.bilibili.playerbizcommon.gesture.OnLongPressListener
                public final void onLongPressEnd(MotionEvent motionEvent) {
                    e eVar2 = this.f104321a;
                    Job job = eVar2.f104456i;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    eVar2.f104456i = null;
                }
            };
            IGestureService.addOnLongPressListener$default(eVar.f104450b, onLongPressListener, 0, 2, null);
            try {
                this.L$0 = onLongPressListener;
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                th = th;
                onLongPressListener2 = onLongPressListener;
                this.this$0.f104450b.removeOnLongPressListener(onLongPressListener2);
                throw th;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            TripleSpeedService$runOldTripleSpeed$1$listener$1 tripleSpeedService$runOldTripleSpeed$1$listener$1 = (TripleSpeedService$runOldTripleSpeed$1$listener$1) this.L$0;
            onLongPressListener2 = tripleSpeedService$runOldTripleSpeed$1$listener$1;
            try {
                ResultKt.throwOnFailure(obj);
                onLongPressListener = tripleSpeedService$runOldTripleSpeed$1$listener$1;
            } catch (Throwable th2) {
                th = th2;
                this.this$0.f104450b.removeOnLongPressListener(onLongPressListener2);
                throw th;
            }
        }
        onLongPressListener2 = onLongPressListener;
        throw new KotlinNothingValueException();
    }
}
