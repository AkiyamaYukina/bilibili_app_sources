package com.bilibili.mediastreaming.audio.track;

import android.media.AudioRecord;
import androidx.compose.ui.graphics.ImageBitmap;
import com.bilibili.mediastreaming.audio.track.BiliAudioRecordTrack;
import kntr.common.share.core.model.ShareMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.bilibili.mediastreaming.audio.track.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/x.class */
public final /* synthetic */ class C5406x implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f65967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f65968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f65969c;

    public /* synthetic */ C5406x(int i7, Object obj, Object obj2) {
        this.f65967a = i7;
        this.f65968b = obj;
        this.f65969c = obj2;
    }

    public final Object invoke() throws InterruptedException {
        Unit unit;
        switch (this.f65967a) {
            case 0:
                BiliAudioRecordTrack biliAudioRecordTrack = (BiliAudioRecordTrack) this.f65968b;
                BiliAudioRecordTrack.b bVar = biliAudioRecordTrack.f65788j;
                Ref.BooleanRef booleanRef = (Ref.BooleanRef) this.f65969c;
                if (bVar == null && biliAudioRecordTrack.f65789k == null) {
                    booleanRef.element = true;
                    unit = Unit.INSTANCE;
                } else {
                    if (bVar != null) {
                        bVar.f65803b.set(false);
                    }
                    BiliAudioRecordTrack.b bVar2 = biliAudioRecordTrack.f65788j;
                    if (bVar2 != null) {
                        bVar2.join();
                    }
                    biliAudioRecordTrack.f65788j = null;
                    AudioRecord audioRecord = biliAudioRecordTrack.f65789k;
                    if (audioRecord != null) {
                        audioRecord.stop();
                    }
                    AudioRecord audioRecord2 = biliAudioRecordTrack.f65789k;
                    if (audioRecord2 != null) {
                        audioRecord2.release();
                    }
                    biliAudioRecordTrack.f65789k = null;
                    biliAudioRecordTrack.clearCache();
                    biliAudioRecordTrack.D();
                    biliAudioRecordTrack.H(new I90.e(biliAudioRecordTrack, 3));
                    booleanRef.element = true;
                    unit = Unit.INSTANCE;
                }
                return unit;
            default:
                return v71.c.j((kntr.common.share.domain.model.a) this.f65968b, ShareMode.Image, (String) null, (String) null, (String) null, (String) null, (ImageBitmap) this.f65969c, (String) null, 380);
        }
    }
}
