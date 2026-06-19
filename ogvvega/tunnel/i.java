package com.bilibili.ogvvega.tunnel;

import com.bilibili.studio.videoeditor.bgm.BgmLocalAdapter;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BgmListLocalFragment;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvvega/tunnel/i.class */
public final /* synthetic */ class i implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f73386a;

    public /* synthetic */ i(Object obj) {
        this.f73386a = obj;
    }

    public void a(List list) {
        BgmListLocalFragment bgmListLocalFragment = (BgmListLocalFragment) this.f73386a;
        if (!bgmListLocalFragment.f109009d) {
            ay.b.a(new StringBuilder("loadData failed isAlive: "), bgmListLocalFragment.f109009d, "BgmListLocalFragment");
            return;
        }
        BgmLocalAdapter bgmLocalAdapter = bgmListLocalFragment.f109008c;
        if (bgmLocalAdapter != null) {
            boolean z6 = true;
            if (bgmLocalAdapter.getItemCount() > 1) {
                StringBuilder sb = new StringBuilder("loadData failed adapter null? ");
                if (bgmListLocalFragment.f109008c != null) {
                    z6 = false;
                }
                ay.b.a(sb, z6, "BgmListLocalFragment");
                return;
            }
        }
        if (bgmListLocalFragment.f109008c != null) {
            BLog.e("BgmListLocalFragment", "loadData success");
            bgmListLocalFragment.f109008c.P(list);
        }
    }

    public void accept(Object obj) {
        VegaGrpcBidiTunnel.connect$lambda$0$0$1((VegaGrpcBidiTunnel$connect$1$so$1) this.f73386a, (Throwable) obj);
    }
}
