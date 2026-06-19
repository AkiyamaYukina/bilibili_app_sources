package com.bilibili.playset.utils;

import J3.C2330c0;
import Pb.F;
import Pb.G;
import androidx.appcompat.app.n;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.lib.ui.BaseFragment;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/utils/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final c f85657a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final Lazy f85658b = LazyKt.lazy(new C2330c0(8));

    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "finish", owner = {"android.app.Activity"}, scope = {})
    public static void a(@NotNull FragmentActivity fragmentActivity) {
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        fragmentActivity.finish();
    }

    public static void b(@NotNull BaseFragment baseFragment, @NotNull Function0 function0) {
        if (!b.d()) {
            BLog.i("FavScreenSizeUtils", "monitorWindowSizeForRedirect: feature disabled");
            return;
        }
        FragmentActivity fragmentActivityP3 = baseFragment.p3();
        if (fragmentActivityP3 == null) {
            BLog.w("FavScreenSizeUtils", "monitorWindowSizeForRedirect: activity is null");
        } else {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(baseFragment), (CoroutineContext) null, (CoroutineStart) null, new FavScreenSizeUtils$monitorWindowSizeForRedirect$1(fragmentActivityP3, baseFragment, function0, null), 3, (Object) null);
        }
    }
}
