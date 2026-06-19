package com.bilibili.teenagersmode.ui;

import Pi0.C2779a;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bapis.bilibili.app.interfaces.v1.VerifyPwdReply;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.moss.api.MossException;
import com.bilibili.lib.moss.api.MossResponseHandler;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/teenagersmode/ui/w.class */
public final class w implements MossResponseHandler<VerifyPwdReply> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean[] f110693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f110694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentActivity f110695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TeenagersModePwdFragment f110696d;

    public w(TeenagersModePwdFragment teenagersModePwdFragment, boolean[] zArr, boolean z6, FragmentActivity fragmentActivity) {
        this.f110696d = teenagersModePwdFragment;
        this.f110693a = zArr;
        this.f110694b = z6;
        this.f110695c = fragmentActivity;
    }

    public final void onCompleted() {
        if (this.f110693a[0]) {
            return;
        }
        if (this.f110694b) {
            com.bilibili.teenagersmode.b.k(this.f110695c, false);
        }
        C2779a.a("main.teenagermodel.enter-detail.logout-limit-success.click", false);
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110696d;
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(teenagersModePwdFragment), (CoroutineContext) null, (CoroutineStart) null, new FinishActivityKt$finishActivity$1(true, teenagersModePwdFragment, null), 3, (Object) null);
    }

    public final void onError(@Nullable MossException mossException) {
        this.f110693a[0] = true;
        TeenagersModePwdFragment teenagersModePwdFragment = this.f110696d;
        teenagersModePwdFragment.f110625b.j0();
        teenagersModePwdFragment.nf();
        if (mossException != null) {
            ToastHelper.showToast(this.f110695c, mossException.getMessage(), 0);
        }
        StringBuilder sb = new StringBuilder("code is error, correct: ");
        sb.append(teenagersModePwdFragment.f110627d);
        sb.append(", current: ");
        bilibili.live.app.service.resolver.b.a(sb, teenagersModePwdFragment.f110627d, "TeenagersMode");
    }

    public final /* bridge */ /* synthetic */ void onNext(@Nullable Object obj) {
    }
}
