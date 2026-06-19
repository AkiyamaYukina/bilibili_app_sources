package com.bilibili.studio.videoeditor.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.studio.videoeditor.util.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/s.class */
public final class C6645s {
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    public static void a(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(Pb.F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", Pb.G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Activity) obj).finish();
    }

    public static void b(final Context context, int i7, final O80.e eVar) {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(context);
        if (activityFindActivityOrNull == null || activityFindActivityOrNull.isFinishing()) {
            return;
        }
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).setMessage(i7).setCancelable(false).setPositiveButton(2131842260, new DialogInterface.OnClickListener(eVar, context) { // from class: com.bilibili.studio.videoeditor.util.j

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final O80.e f110236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Context f110237b;

            {
                this.f110236a = eVar;
                this.f110237b = context;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                O80.e eVar2 = this.f110236a;
                Context context2 = this.f110237b;
                if (eVar2 == null) {
                    Activity activityFindActivityOrNull2 = ContextUtilKt.findActivityOrNull(context2);
                    if (activityFindActivityOrNull2 != null) {
                        C6645s.a(activityFindActivityOrNull2);
                        return;
                    }
                    return;
                }
                Contract contractAb = ConfigManager.Companion.ab();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                    Thread threadCurrentThread = Thread.currentThread();
                    if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                        IllegalStateException illegalStateException = new IllegalStateException(Pb.F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                        Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", Pb.G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                    }
                }
                ((FragmentActivity) eVar2.a).finish();
            }
        }).create();
        alertDialogCreate.show();
        fA0.a.a(alertDialogCreate);
    }
}
