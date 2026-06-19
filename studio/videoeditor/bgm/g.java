package com.bilibili.studio.videoeditor.bgm;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/g.class */
public final class g extends BiliApiCallback<GeneralResponse<List<Bgm>>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S60.e f109077b;

    public g(S60.e eVar) {
        this.f109077b = eVar;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        ((cB0.d) this.f109077b.a).c();
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<List<Bgm>> generalResponse) {
        GeneralResponse<List<Bgm>> generalResponse2 = generalResponse;
        if (generalResponse2 != null && generalResponse2.data != null) {
            ArrayList<Bgm> arrayList = new ArrayList(generalResponse2.data);
            h hVar = h.f109078b;
            if (hVar.f109079a == null) {
                hVar.f109079a = new HashMap<>();
            }
            for (Bgm bgm : arrayList) {
                if (bgm != null) {
                    hVar.f109079a.put(String.valueOf(bgm.sid), bgm);
                }
            }
        }
        ((cB0.d) this.f109077b.a).c();
    }
}
