package com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/ma/RadarMaCouponDialog.class */
@StabilityInferred(parameters = 0)
public final class RadarMaCouponDialog extends in0.e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f74319r = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final RadarTriggerContent f74320i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final String f74321j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final dn0.k f74322k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f74323l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final x f74324m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Activity f74325n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final LifecycleOwner f74326o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final ViewModelStoreOwner f74327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final SavedStateRegistryOwner f74328q;

    /* JADX WARN: Multi-variable type inference failed */
    public RadarMaCouponDialog(@NotNull RadarTriggerContent radarTriggerContent, @NotNull Context context, @NotNull String str, @NotNull dn0.k kVar) {
        super(radarTriggerContent, context, str);
        this.f74320i = radarTriggerContent;
        this.f74321j = str;
        this.f74322k = kVar;
        this.f74323l = CoroutineScopeKt.MainScope();
        this.f74324m = w.a(radarTriggerContent);
        this.f74325n = context instanceof Activity ? (Activity) context : null;
        this.f74326o = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        this.f74327p = context instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) context : null;
        this.f74328q = context instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) context : null;
    }

    @Override // in0.e
    @Nullable
    public final View b() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    @Override // in0.e, android.app.AlertDialog, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.ma.RadarMaCouponDialog.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        CoroutineScopeKt.cancel$default(this.f74323l, (CancellationException) null, 1, (Object) null);
    }
}
