package com.bilibili.studio.videoeditor.capturev3.viewmodel;

import android.app.Application;
import android.text.TextUtils;
import com.bilibili.base.BiliContext;
import com.bilibili.droid.ToastHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/viewmodel/b.class */
public final class b extends IndependentCaptureViewModel {
    public b(@NotNull Application application) {
        super(application);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel
    public final void A1(boolean z6) {
        qB0.b bVar = this.f109302o;
        bVar.k = false;
        this.f109319i = true;
        if (z6) {
            a.P0(m1());
            if (this.f109321k) {
                a.R0();
                c1(bVar.e ? "edit" : "new");
            }
            this.f109321k = true;
        }
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.viewmodel.a
    public final void a1(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ToastHelper.cancel();
        ToastHelper.showToast(BiliContext.application(), str, 0, 17);
    }

    @Override // com.bilibili.studio.videoeditor.capturev3.viewmodel.IndependentCaptureViewModel
    public final void y1(boolean z6) {
        this.f109319i = false;
        if (z6) {
            a.Q0();
        }
    }
}
