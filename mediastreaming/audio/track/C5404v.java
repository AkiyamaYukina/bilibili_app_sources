package com.bilibili.mediastreaming.audio.track;

import android.media.AudioRecord;
import com.bapis.bilibili.playershared.DolbyItem;
import com.bilibili.ship.theseus.ogv.intro.download.ui.DownloadFloatLayerService;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/v.class */
public final /* synthetic */ class C5404v implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f65949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f65951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f65952e;

    public /* synthetic */ C5404v(C5405w c5405w, String str, AudioRecord audioRecord, int i7) {
        this.f65950c = c5405w;
        this.f65951d = str;
        this.f65952e = audioRecord;
        this.f65949b = i7;
    }

    public /* synthetic */ C5404v(DownloadFloatLayerService downloadFloatLayerService, int i7, DolbyItem.Type type, OgvEpisode ogvEpisode) {
        this.f65950c = downloadFloatLayerService;
        this.f65949b = i7;
        this.f65951d = type;
        this.f65952e = ogvEpisode;
    }

    public final Object invoke() {
        switch (this.f65948a) {
            case 0:
                AudioRecord audioRecord = (AudioRecord) this.f65952e;
                C5405w c5405w = (C5405w) this.f65950c;
                iC.h hVar = c5405w.f65964t;
                String str = (String) this.f65951d;
                if (hVar != null) {
                    hVar.b(G.p.a(str, ": unknown..."), Integer.valueOf(audioRecord.getState()), Integer.valueOf(audioRecord.getRecordingState()));
                }
                iC.h hVar2 = c5405w.f65964t;
                if (hVar2 != null) {
                    hVar2.d(G.p.a(str, ": unknown..."), Integer.valueOf(audioRecord.getState()), Integer.valueOf(audioRecord.getRecordingState()), this.f65949b);
                }
                break;
            default:
                ((DownloadFloatLayerService) this.f65950c).h.f(3, this.f65949b, (DolbyItem.Type) this.f65951d, (OgvEpisode) this.f65952e);
                break;
        }
        return Unit.INSTANCE;
    }
}
