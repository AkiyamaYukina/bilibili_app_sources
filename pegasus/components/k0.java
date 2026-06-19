package com.bilibili.pegasus.components;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.pegasus.BasePegasusComponent;
import com.bilibili.pegasus.data.request.OpenEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/k0.class */
@StabilityInferred(parameters = 0)
public final class k0 extends BasePegasusComponent {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f77073k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f77074l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final a f77075m = new a(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final String f77076n = "request_params_component";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/k0$a.class */
    public static final class a implements u00.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k0 f77077a;

        public a(k0 k0Var) {
            this.f77077a = k0Var;
        }

        public final void a(int i7) {
            if (i7 == 0 && r0.b(this.f77077a)) {
                BLog.i("RequestParamsComponent", "set open event cold");
                l0.f77080c = OpenEvent.COLD;
                l0.f77078a = null;
            }
        }

        public final void onVisibleCountChanged(int i7, int i8) {
            k0 k0Var = this.f77077a;
            if (i8 == 0) {
                l0.f77080c = OpenEvent.HOT;
                if (i7 > 0) {
                    BLog.i("RequestParamsComponent", "quit to background and time:" + r0.a());
                    k0Var.f77074l = r0.a();
                    k0Var.f77073k = true;
                    return;
                }
                return;
            }
            if (i7 == 0 && k0Var.f77073k) {
                BLog.i("RequestParamsComponent", "come back from the background");
                k0Var.f77073k = false;
                if (((r0.a() - k0Var.f77074l) / ((long) 1000)) / ((long) 60) > 30) {
                    l0.f77078a = null;
                    BLog.i("RequestParamsComponent", "leave app time is more then 30min");
                }
            }
        }
    }

    @NotNull
    public final String getComponentName() {
        return this.f77076n;
    }

    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i7 = 2;
        u00.b bVar = (u00.b) BLRouter.get$default(BLRouter.INSTANCE, u00.b.class, (String) null, 2, (Object) null);
        if (bVar != null) {
            bVar.a(this.f77075m, getRequireFragment().getLifecycle());
        }
        if (l0.f77080c == OpenEvent.COLD) {
            if (!BiliAccounts.get(getContext()).isLogin()) {
                i7 = 1;
            }
            l0.f77079b = i7;
        }
    }
}
