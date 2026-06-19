package com.bilibili.playerbizcommonv2.widget.popup;

import AT0.c;
import Pb.F;
import Pb.G;
import android.widget.PopupWindow;
import androidx.appcompat.app.n;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/FollowPopupUtil$popAndKeep$2$invokeSuspend$$inlined$awaitCancel$1.class */
public final class FollowPopupUtil$popAndKeep$2$invokeSuspend$$inlined$awaitCancel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final PopupWindow $popupWindow$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FollowPopupUtil$popAndKeep$2$invokeSuspend$$inlined$awaitCancel$1(Continuation continuation, PopupWindow popupWindow) {
        super(2, continuation);
        this.$popupWindow$inlined = popupWindow;
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.widget.PopupWindow"}, scope = {})
    private static void __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookPopupWindowDismiss(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new c(8));
            }
        }
        ((PopupWindow) obj).dismiss();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FollowPopupUtil$popAndKeep$2$invokeSuspend$$inlined$awaitCancel$1(continuation, this.$popupWindow$inlined);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (DelayKt.awaitCancellation(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            if (this.$popupWindow$inlined.isShowing()) {
                __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookPopupWindowDismiss(this.$popupWindow$inlined);
            }
            this.$popupWindow$inlined.setOnDismissListener(null);
            throw th;
        }
    }
}
