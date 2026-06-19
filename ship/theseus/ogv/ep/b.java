package com.bilibili.ship.theseus.ogv.ep;

import android.content.Context;
import com.bapis.bilibili.pgc.gateway.player.v2.PlayDubbingInfo;
import com.bilibili.ship.theseus.ogv.C6152d;
import com.bilibili.ship.theseus.ogv.dubbing.n;
import com.bilibili.ship.theseus.ogv.dubbing.q;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ep/b.class */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvCurrentEpisodeRepository f92157a;

    public b(OgvCurrentEpisodeRepository ogvCurrentEpisodeRepository) {
        this.f92157a = ogvCurrentEpisodeRepository;
    }

    @Override // com.bilibili.ship.theseus.ogv.dubbing.n
    public final void a(Context context, long j7) {
        C6152d c6152d = (C6152d) this.f92157a.f92120w.getValue();
        q qVar = c6152d != null ? c6152d.f91827b : null;
        if (qVar != null) {
            qVar.d(context, j7);
        }
    }

    @Override // com.bilibili.ship.theseus.ogv.dubbing.n
    public final PlayDubbingInfo b() {
        C6152d c6152d = (C6152d) this.f92157a.f92120w.getValue();
        PlayDubbingInfo playDubbingInfo = null;
        q qVar = c6152d != null ? c6152d.f91827b : null;
        if (qVar != null) {
            playDubbingInfo = qVar.f91900p;
        }
        return playDubbingInfo;
    }
}
