package com.bilibili.ship.theseus.ogv.activity;

import Pb.F;
import Pb.G;
import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import androidx.appcompat.app.n;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.ogv.activity.dialog.OgvActivityImageDialog;
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
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$showImageDialog$1.class */
public final class OgvActivityService$showImageDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final OgvActivityDialogVo $dialogVo;
    int label;
    final OgvActivityService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityService$showImageDialog$1(OgvActivityService ogvActivityService, OgvActivityDialogVo ogvActivityDialogVo, Continuation<? super OgvActivityService$showImageDialog$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvActivityService;
        this.$dialogVo = ogvActivityDialogVo;
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    private static void __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookActivityFinish(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(OgvActivityDialogVo ogvActivityDialogVo, OgvActivityService ogvActivityService, DialogInterface dialogInterface) {
        String str = ogvActivityDialogVo.f91370j;
        if (Intrinsics.areEqual(str, "close_and_quit")) {
            __Ghost$Insertion$com_bilibili_kaptbundle_BgThreadUIAccessDetectKt_hookActivityFinish(ogvActivityService.f91389b);
        } else if (Intrinsics.areEqual(str, "close_and_refresh")) {
            ogvActivityService.f91403q.a();
        }
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvActivityService$showImageDialog$1(this.this$0, this.$dialogVo, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Drawable drawable;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred<? extends Drawable> deferred = this.this$0.f91412z;
            if (deferred == null) {
                drawable = null;
                OgvActivityService ogvActivityService = this.this$0;
                OgvActivityImageDialog ogvActivityImageDialog = new OgvActivityImageDialog(ogvActivityService.f91388a, this.$dialogVo, drawable, ogvActivityService, ogvActivityService.f91395i);
                final OgvActivityDialogVo ogvActivityDialogVo = this.$dialogVo;
                final OgvActivityService ogvActivityService2 = this.this$0;
                ogvActivityImageDialog.setOnCancelListener(new DialogInterface.OnCancelListener(ogvActivityDialogVo, ogvActivityService2) { // from class: com.bilibili.ship.theseus.ogv.activity.g

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final OgvActivityDialogVo f91553a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final OgvActivityService f91554b;

                    {
                        this.f91553a = ogvActivityDialogVo;
                        this.f91554b = ogvActivityService2;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        OgvActivityService$showImageDialog$1.invokeSuspend$lambda$0(this.f91553a, this.f91554b, dialogInterface);
                    }
                });
                ogvActivityImageDialog.show();
                return Unit.INSTANCE;
            }
            this.label = 1;
            Object objAwait = deferred.await(this);
            obj = objAwait;
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        drawable = (Drawable) obj;
        OgvActivityService ogvActivityService3 = this.this$0;
        OgvActivityImageDialog ogvActivityImageDialog2 = new OgvActivityImageDialog(ogvActivityService3.f91388a, this.$dialogVo, drawable, ogvActivityService3, ogvActivityService3.f91395i);
        final OgvActivityDialogVo ogvActivityDialogVo2 = this.$dialogVo;
        final OgvActivityService ogvActivityService22 = this.this$0;
        ogvActivityImageDialog2.setOnCancelListener(new DialogInterface.OnCancelListener(ogvActivityDialogVo2, ogvActivityService22) { // from class: com.bilibili.ship.theseus.ogv.activity.g

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final OgvActivityDialogVo f91553a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final OgvActivityService f91554b;

            {
                this.f91553a = ogvActivityDialogVo2;
                this.f91554b = ogvActivityService22;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                OgvActivityService$showImageDialog$1.invokeSuspend$lambda$0(this.f91553a, this.f91554b, dialogInterface);
            }
        });
        ogvActivityImageDialog2.show();
        return Unit.INSTANCE;
    }
}
