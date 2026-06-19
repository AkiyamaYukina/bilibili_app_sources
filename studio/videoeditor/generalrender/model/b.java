package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.videoeditor.generalrender.bean.GRContribute;
import com.bilibili.studio.videoeditor.generalrender.bean.GRContributeResult;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/b.class */
public final class b extends BiliApiCallback<GeneralResponse<GRContributeResult>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f109586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentActivity f109587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2297a f109588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final GRContribute f109589e;

    public b(long j7, FragmentActivity fragmentActivity, InterfaceC2297a interfaceC2297a, GRContribute gRContribute) {
        this.f109586b = j7;
        this.f109587c = fragmentActivity;
        this.f109588d = interfaceC2297a;
        this.f109589e = gRContribute;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        v.f109656a.getClass();
        v.a(this.f109587c, true);
        GRContribute gRContribute = this.f109589e;
        this.f109588d.a(k.a(gRContribute.getTemplateId(), gRContribute.getName(), -300, th != null ? th.getMessage() : null, null, System.currentTimeMillis() - this.f109586b));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<GRContributeResult> generalResponse) {
        GeneralResponse<GRContributeResult> generalResponse2 = generalResponse;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f109586b;
        v.f109656a.getClass();
        v.a(this.f109587c, true);
        InterfaceC2297a interfaceC2297a = this.f109588d;
        GRContribute gRContribute = this.f109589e;
        if (generalResponse2 == null || generalResponse2.code != 0) {
            interfaceC2297a.a(k.a(gRContribute.getTemplateId(), gRContribute.getName(), (generalResponse2 != null ? Integer.valueOf(generalResponse2.code) : null).intValue(), generalResponse2.message, generalResponse2.data, jCurrentTimeMillis));
        } else if (generalResponse2.data == null) {
            interfaceC2297a.a(k.a(gRContribute.getTemplateId(), gRContribute.getName(), -200, "result is null", null, jCurrentTimeMillis));
        } else {
            interfaceC2297a.a(k.a(gRContribute.getTemplateId(), gRContribute.getName(), 0, null, generalResponse2.data, jCurrentTimeMillis));
        }
    }
}
