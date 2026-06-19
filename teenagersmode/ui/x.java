package com.bilibili.teenagersmode.ui;

import Pb.F;
import Pb.G;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.bapis.bilibili.app.interfaces.v1.VerifyPwdReply;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.blconfig.Contract;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import com.bilibili.lib.neuron.api.Neurons;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/x.class */
public final class x implements MossResponseHandler<VerifyPwdReply> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f110697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentActivity f110698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TeenagersModePwdFragment f110699c;

    public x(TeenagersModePwdFragment teenagersModePwdFragment, boolean[] zArr, FragmentActivity fragmentActivity) {
        this.f110699c = teenagersModePwdFragment;
        this.f110697a = zArr;
        this.f110698b = fragmentActivity;
    }

    public final void onCompleted() {
        if (this.f110697a[0]) {
            return;
        }
        Neurons.reportClick(false, "main.teenagermodel.enter-detail.logon-limit-success.click");
        FragmentActivity fragmentActivity = this.f110698b;
        fragmentActivity.setResult(-1);
        Contract contractAb = ConfigManager.Companion.ab();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(contractAb.get("bgthread_ui_access_detect_enable", bool), bool)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!androidx.appcompat.app.n.a(threadCurrentThread)) {
                IllegalStateException illegalStateException = new IllegalStateException(F.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, ", 请联系 Jackin"));
                Neurons.trackT(false, "app.bgthread.ui.access", MapsKt.mapOf(new Pair[]{TuplesKt.to("stacktrace", G.b("Activity.finish() called from non-UI thread: ", threadCurrentThread, "BgThreadUIAccess", illegalStateException, illegalStateException)), TuplesKt.to("threadName", threadCurrentThread.getName())}), 1, new AT0.c(8));
            }
        }
        fragmentActivity.finish();
    }

    public final void onError(@Nullable MossException mossException) {
        this.f110697a[0] = true;
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110699c;
        teenagersModePwdFragment.f110625b.j0();
        teenagersModePwdFragment.nf();
        ToastHelper.showToast(this.f110698b, mossException.getMessage(), 0);
        StringBuilder sb = new StringBuilder("code is error, correct: ");
        sb.append(teenagersModePwdFragment.f110627d);
        sb.append(", current: ");
        bilibili.live.app.service.resolver.b.a(sb, teenagersModePwdFragment.f110627d, "TeenagersMode");
    }

    public final /* bridge */ /* synthetic */ void onNext(@Nullable Object obj) {
    }
}
