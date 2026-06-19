package com.bilibili.teenagersmode.ui;

import androidx.fragment.app.FragmentActivity;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.teenagersmode.ui.TeenagersModePwdFragment;
import kotlin.jvm.functions.Function1;
import rx.functions.Action1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/t.class */
public final /* synthetic */ class t implements TeenagersModePwdFragment.f, Action1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f110688a;

    public /* synthetic */ t(Object obj) {
        this.f110688a = obj;
    }

    public void call(Object obj) {
        Throwable th = (Throwable) obj;
        Function1 function1 = (Function1) this.f110688a;
        if (function1 != null) {
            function1.invoke(th);
        }
    }

    @Override // com.bilibili.teenagersmode.ui.TeenagersModePwdFragment.f
    public void onFinished() {
        TeenagersModePwdFragment teenagersModePwdFragment = (TeenagersModePwdFragment) this.f110688a;
        FragmentActivity fragmentActivityP3 = teenagersModePwdFragment.p3();
        if (fragmentActivityP3 == null) {
            return;
        }
        Neurons.reportClick(false, "main.teenagermodel.enter-detail.logon-unclock.click");
        vD0.d.b(teenagersModePwdFragment.f110627d, teenagersModePwdFragment.lf(9), false, false, new x(teenagersModePwdFragment, new boolean[]{false}, fragmentActivityP3));
    }
}
