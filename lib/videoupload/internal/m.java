package com.bilibili.lib.videoupload.internal;

import androidx.annotation.Nullable;
import com.bilibili.lib.videoupload.bean.UploadRiskControlBean;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/internal/m.class */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f65099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f65100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final UploadRiskControlBean f65101e;

    public m(int i7, int i8) {
        this(i7, "", "", i8, null);
    }

    public m(int i7, String str, int i8) {
        this(i7, "", str, i8, null);
    }

    public m(int i7, String str, String str2, int i8, @Nullable UploadRiskControlBean uploadRiskControlBean) {
        this.f65097a = i7;
        this.f65098b = str;
        this.f65100d = i8;
        this.f65099c = str2;
        this.f65101e = uploadRiskControlBean;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StepResultWrap{stepResult=");
        sb.append(this.f65097a);
        sb.append(", errorMsg='");
        return C8770a.a(sb, this.f65098b, "'}");
    }
}
