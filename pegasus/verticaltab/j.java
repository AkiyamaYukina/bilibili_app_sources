package com.bilibili.pegasus.verticaltab;

import androidx.lifecycle.Observer;
import com.alipay.blueshield.IDeviceColorModule;
import com.bilibili.bililive.room.ui.roomv3.gift.I;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import gi0.C7345z;
import hi0.AbstractC7445c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/j.class */
public final /* synthetic */ class j implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78973b;

    public /* synthetic */ j(Object obj, int i7) {
        this.f78972a = i7;
        this.f78973b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Sequence sequenceAsSequence;
        Sequence sequenceMapNotNull;
        Sequence sequenceFilter;
        switch (this.f78972a) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    l lVar = (l) this.f78973b;
                    if (!zHasNext) {
                        lVar.J0();
                        break;
                    } else {
                        Mq0.e eVar = (Mq0.e) it.next();
                        List<BasicIndexItem> value = lVar.f78976c.getValue();
                        if (value != null && (sequenceAsSequence = CollectionsKt.asSequence(value)) != null && (sequenceMapNotNull = SequencesKt.mapNotNull(sequenceAsSequence, (Function1) new Object())) != null && (sequenceFilter = SequencesKt.filter(sequenceMapNotNull, new I(eVar, 1))) != null) {
                            Iterator it2 = sequenceFilter.iterator();
                            while (it2.hasNext()) {
                                ((I00.a) it2.next()).updateLikeState(eVar.f16326b, eVar.f16327c);
                            }
                        }
                    }
                }
                break;
            default:
                Iterator<Map.Entry<MusicPlayVideo, AbstractC7445c>> it3 = ((C7345z) this.f78973b).f120363b.entrySet().iterator();
                while (it3.hasNext()) {
                    it3.next().getValue().x0(null, IDeviceColorModule.EDGE_MODE_KEY);
                }
                break;
        }
    }
}
