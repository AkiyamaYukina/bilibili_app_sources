package com.bilibili.playset.widget.favorite.snackbar;

import Pb.F;
import Pb.G;
import android.view.View;
import android.widget.PopupWindow;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.n;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/snackbar/SnackBarManager.class */
@StabilityInferred(parameters = 0)
public final class SnackBarManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static PopupWindow f85792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b f85793b = new Object();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/favorite/snackbar/SnackBarManager$a.class */
    @StabilityInferred(parameters = 0)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ConstraintLayout f85794a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f85795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f85796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f85797d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f85798e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f85799f;

        public a(ConstraintLayout constraintLayout, View view, int i7, int i8) {
            i7 = (i8 & 32) != 0 ? 0 : i7;
            this.f85794a = constraintLayout;
            this.f85795b = view;
            this.f85796c = 4000L;
            this.f85797d = 80;
            this.f85798e = 0;
            this.f85799f = i7;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f85794a, aVar.f85794a) && Intrinsics.areEqual(this.f85795b, aVar.f85795b) && this.f85796c == aVar.f85796c && this.f85797d == aVar.f85797d && this.f85798e == aVar.f85798e && this.f85799f == aVar.f85799f;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f85799f) + I.a(this.f85798e, I.a(this.f85797d, C3554n0.a((this.f85795b.hashCode() + (this.f85794a.hashCode() * 31)) * 31, 31, this.f85796c), 31), 31);
        }

        @NotNull
        public final String toString() {
            View view = this.f85795b;
            StringBuilder sb = new StringBuilder("Params(contentView=");
            sb.append(this.f85794a);
            sb.append(", parentView=");
            sb.append(view);
            sb.append(", time=");
            sb.append(this.f85796c);
            sb.append(", gravity=");
            sb.append(this.f85797d);
            sb.append(", xOffset=");
            sb.append(this.f85798e);
            sb.append(", yOffset=");
            return C4277b.a(this.f85799f, ")", sb);
        }
    }

    public static void a() {
        PopupWindow popupWindow = f85792a;
        if (popupWindow != null && popupWindow.isShowing()) {
            PopupWindow popupWindow2 = f85792a;
            if (popupWindow2 != null) {
                Contract contractAb = ConfigManager.Companion.ab();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
                    Thread threadCurrentThread = Thread.currentThread();
                    if (!n.a(threadCurrentThread)) {
                        IllegalStateException illegalStateException = new IllegalStateException(F.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                        Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("PopupWindow.dismiss() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
                    }
                }
                popupWindow2.dismiss();
            }
            PopupWindow popupWindow3 = f85792a;
            if (popupWindow3 != null) {
                popupWindow3.setOnDismissListener(null);
            }
        }
        f85792a = null;
    }

    public static void b(@NotNull ComponentActivity componentActivity, @NotNull a aVar, @Nullable com.bilibili.playset.widget.favorite.snackbar.a aVar2) {
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(componentActivity), (CoroutineContext) null, (CoroutineStart) null, new SnackBarManager$showBar$1(aVar, componentActivity, aVar2, null), 3, (Object) null);
    }
}
