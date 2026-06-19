package com.bilibili.upper.module.uppercenter.model;

import Hz.f;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.upper.api.bean.PageTip;
import com.bilibili.upper.api.bean.centerv4.UpperCenterIndexResV4;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/uppercenter/model/UpperCenterViewModel.class */
@StabilityInferred(parameters = 0)
public final class UpperCenterViewModel extends Yv0.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<UpperCenterIndexResV4> f114111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f114112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f114113e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public PageTip.PageTipItem f114114f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f114115g;

    public UpperCenterViewModel(@NotNull Application application) {
        super(application);
        this.f114111c = new MutableLiveData<>();
        this.f114115g = new MutableLiveData<>();
    }

    public static void J0(@NotNull Context context, @NotNull String str) {
        BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("activity://uper/transweb/")).data(Uri.parse(str)).extras(new f(2)).build(), context);
    }

    public final void K0() {
        if (this.f114113e) {
            return;
        }
        this.f114113e = true;
        BuildersKt.launch$default(((Yv0.c) this).b, (CoroutineContext) null, (CoroutineStart) null, new UpperCenterViewModel$loadUpperMain$1(this, null), 3, (Object) null);
    }
}
