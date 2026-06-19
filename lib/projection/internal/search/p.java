package com.bilibili.lib.projection.internal.search;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Vibrator;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResultCallback;
import com.bilibili.app.comm.ResultApiExtKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.projection.internal.api.CloudDevices;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/p.class */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Vibrator f63741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static a f63742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Lazy f63743c = LazyKt.lazy(new L3.A(6));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/p$a.class */
    public interface a {
        void a();

        void b(@NotNull CloudDevices.Device device, @NotNull String str);

        void onFailed(@NotNull String str, @NotNull String str2);
    }

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "dismiss", owner = {"android.app.Dialog"}, scope = {})
    public static void a(@NotNull Object obj) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(Pb.F.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", Pb.G.b("Dialog.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        ((Dialog) obj).dismiss();
    }

    public static void b(@NotNull final Context context) {
        a aVar = f63742b;
        if (aVar != null) {
            aVar.a();
        }
        if (!ConnectivityMonitor.getInstance().isNetworkActive()) {
            ToastHelper.showToast(context, context.getString(2131846486), 0, 17);
            return;
        }
        if (!o.b()) {
            sg.s.b(context, "activity://main/login/");
            return;
        }
        Uri uriA = com.bilibili.app.authorspace.header.archive.l.a("bilibili://qrcode", "type", "1");
        final ComponentActivity componentActivity = (ComponentActivity) (context != null ? ContextUtilKt.findTypedActivityOrNull(context, ComponentActivity.class) : null);
        if (componentActivity != null) {
            ResultApiExtKt.routerForResult(componentActivity, "projection_code", Yb.a.b(uriA), new ActivityResultCallback(componentActivity, context) { // from class: com.bilibili.lib.projection.internal.search.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final Context f63728a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final ComponentActivity f63729b;

                {
                    this.f63728a = context;
                    this.f63729b = componentActivity;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
                /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
                @Override // androidx.activity.result.ActivityResultCallback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onActivityResult(java.lang.Object r9) {
                    /*
                        Method dump skipped, instruction units count: 457
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bilibili.lib.projection.internal.search.C5332k.onActivityResult(java.lang.Object):void");
                }
            });
        } else {
            BLRouter.routeTo(new RouteRequest.Builder(uriA).requestCode(1003).build(), context);
        }
    }
}
