package com.bilibili.studio.videoeditor.bgm.bgmsearch;

import com.bilibili.okretro.BiliApiCallback;
import com.bilibili.okretro.GeneralResponse;
import com.bilibili.studio.videoeditor.bgm.bgmsearch.BgmSearchHotWordBean;
import com.bilibili.studio.videoeditor.util.V;
import hB0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmsearch/b.class */
public final class b extends BiliApiCallback<GeneralResponse<BgmSearchHotWordBean>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f109048b;

    public b(d dVar) {
        this.f109048b = dVar;
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        go.b.a(new StringBuilder("request search hot words error: "), th, "HotWordsProvider");
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [com.bilibili.studio.videoeditor.bgm.bgmsearch.a, java.lang.Object] */
    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onSuccess(GeneralResponse<BgmSearchHotWordBean> generalResponse) {
        BgmSearchHotWordBean bgmSearchHotWordBean;
        GeneralResponse<BgmSearchHotWordBean> generalResponse2 = generalResponse;
        if (generalResponse2 == null || (bgmSearchHotWordBean = generalResponse2.data) == null || V.e(bgmSearchHotWordBean.hotWordList)) {
            return;
        }
        d dVar = this.f109048b;
        ((ArrayList) dVar.e).clear();
        int i7 = 0;
        for (BgmSearchHotWordBean.HotWord hotWord : generalResponse2.data.hotWordList) {
            if (i7 >= 10) {
                break;
            }
            List list = dVar.e;
            ?? obj = new Object();
            obj.f109047c = hotWord.name;
            obj.f109045a = hotWord.id;
            obj.f109046b = hotWord.rank;
            ((ArrayList) list).add(obj);
            i7++;
        }
        Collections.sort(dVar.e);
    }
}
