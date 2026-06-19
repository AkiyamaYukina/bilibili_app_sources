package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.bilibili.studio.videoeditor.generalrender.bean.GRUrlBean;
import kD0.InterfaceC7742a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/j.class */
public final class j implements InterfaceC7742a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2297a f109613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GRUrlBean f109614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FragmentActivity f109615c;

    public j(InterfaceC2297a interfaceC2297a, FragmentActivity fragmentActivity, GRUrlBean gRUrlBean) {
        this.f109613a = interfaceC2297a;
        this.f109614b = gRUrlBean;
        this.f109615c = fragmentActivity;
    }

    @Override // kD0.InterfaceC7742a
    public final void onCancel() {
        this.f109613a.a(k.h(-400, this.f109614b.getFileName(), "cancel save video to album"));
    }

    @Override // kD0.InterfaceC7742a
    public final void onError(int i7) {
        JSONObject jSONObjectH;
        GRUrlBean gRUrlBean = this.f109614b;
        if (i7 == 1) {
            jSONObjectH = k.h(-400, gRUrlBean.getFileName(), "param illegal");
        } else if (i7 == 2) {
            jSONObjectH = k.h(-100, gRUrlBean.getFileName(), this.f109615c.getString(2131842259));
        } else if (i7 == 3) {
            jSONObjectH = k.h(-400, gRUrlBean.getFileName(), "no enough space");
        } else if (i7 != 4) {
            jSONObjectH = k.h(-700, gRUrlBean.getFileName(), "save file to album error, error code:" + i7);
        } else {
            jSONObjectH = k.h(-400, gRUrlBean.getFileName(), "io error");
        }
        this.f109613a.a(jSONObjectH);
    }

    @Override // kD0.InterfaceC7742a
    public final void onProgress(int i7) {
    }

    @Override // kD0.InterfaceC7742a
    public final void onSuccess() {
        this.f109613a.a(k.h(0, this.f109614b.getFileName(), null));
    }
}
