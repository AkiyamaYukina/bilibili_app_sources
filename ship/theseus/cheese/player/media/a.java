package com.bilibili.ship.theseus.cheese.player.media;

import com.bapis.bilibili.app.playerunite.v1.PlayViewUniteReply;
import com.bilibili.ship.theseus.united.page.drm.DrmType;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.Iterator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/media/a.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.SinglePlayViewScope")
@DaggerGenerated
@QualifierMetadata
public final class a implements Factory<DrmType> {
    public static DrmType a(PlayViewUniteReply playViewUniteReply) {
        Object next;
        int drmTechTypeValue = playViewUniteReply.getPlayArc().getDrmTechTypeValue();
        Iterator it = DrmType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DrmType) next).m9427getValue().intValue() == drmTechTypeValue) {
                break;
            }
        }
        DrmType drmType = (DrmType) next;
        DrmType drmType2 = drmType;
        if (drmType == null) {
            drmType2 = DrmType.NON;
        }
        return (DrmType) Preconditions.checkNotNullFromProvides(drmType2);
    }
}
