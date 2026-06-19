package com.bilibili.studio.videoeditor.generalrender.model;

import Ih0.InterfaceC2297a;
import androidx.fragment.app.FragmentActivity;
import com.bilibili.studio.videoeditor.generalrender.bean.GRResourceInfo;
import com.bilibili.studio.videoeditor.generalrender.model.f;
import java.util.Arrays;
import kD0.InterfaceC7742a;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/model/i.class */
public final class i implements InterfaceC7742a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f109609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GRResourceInfo f109610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2297a f109611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.ObjectRef<String> f109612d;

    public i(FragmentActivity fragmentActivity, GRResourceInfo gRResourceInfo, InterfaceC2297a interfaceC2297a, Ref.ObjectRef objectRef) {
        this.f109609a = fragmentActivity;
        this.f109610b = gRResourceInfo;
        this.f109611c = interfaceC2297a;
        this.f109612d = objectRef;
    }

    @Override // kD0.InterfaceC7742a
    public final void onCancel() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.f109611c.a(k.g(this.f109610b, -902, String.format(this.f109609a.getString(2131841856), Arrays.copyOf(new Object[]{this.f109612d.element}, 1)), null, 56));
    }

    @Override // kD0.InterfaceC7742a
    public final void onError(int i7) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.f109611c.a(k.g(this.f109610b, -902, String.format(this.f109609a.getString(2131841856), Arrays.copyOf(new Object[]{this.f109612d.element}, 1)), null, 56));
    }

    @Override // kD0.InterfaceC7742a
    public final void onProgress(int i7) {
    }

    @Override // kD0.InterfaceC7742a
    public final void onSuccess() {
        xC0.a aVarA = xC0.a.c.a(this.f109609a);
        GRResourceInfo gRResourceInfo = this.f109610b;
        aVarA.b(gRResourceInfo);
        String str = f.f109601c;
        this.f109611c.a(k.g(gRResourceInfo, 0, null, f.a.i(gRResourceInfo), 48));
    }
}
