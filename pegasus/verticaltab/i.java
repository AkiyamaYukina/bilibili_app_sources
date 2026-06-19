package com.bilibili.pegasus.verticaltab;

import Wi0.C3042a;
import android.os.Bundle;
import androidx.credentials.p;
import androidx.lifecycle.Observer;
import com.bilibili.inline.biz.card.ICardFollowingStateArgsItem;
import com.bilibili.music.podcast.data.MusicPlayItem;
import com.bilibili.music.podcast.data.MusicPlayVideo;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.relation.FollowStateEvent;
import gi0.C7345z;
import hi0.AbstractC7445c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/i.class */
public final /* synthetic */ class i implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f78970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f78971b;

    public /* synthetic */ i(Object obj, int i7) {
        this.f78970a = i7;
        this.f78971b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        Sequence sequenceAsSequence;
        Sequence<ICardFollowingStateArgsItem> sequenceFilter;
        MusicPlayItem.Author owner;
        Object obj2 = this.f78971b;
        switch (this.f78970a) {
            case 0:
                List list = (List) obj;
                BLog.i("VerticalTabViewModel", "followObserver:" + list);
                Iterator it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    l lVar = (l) obj2;
                    if (!zHasNext) {
                        lVar.J0();
                        break;
                    } else {
                        FollowStateEvent followStateEvent = (FollowStateEvent) it.next();
                        List<BasicIndexItem> value = lVar.f78976c.getValue();
                        if (value != null && (sequenceAsSequence = CollectionsKt.asSequence(value)) != null && (sequenceFilter = SequencesKt.filter(sequenceAsSequence, new Sa0.f(followStateEvent, 5))) != null) {
                            for (ICardFollowingStateArgsItem iCardFollowingStateArgsItem : sequenceFilter) {
                                iCardFollowingStateArgsItem.markDataChanged();
                                ICardFollowingStateArgsItem iCardFollowingStateArgsItem2 = iCardFollowingStateArgsItem instanceof ICardFollowingStateArgsItem ? iCardFollowingStateArgsItem : null;
                                if (iCardFollowingStateArgsItem2 != null) {
                                    iCardFollowingStateArgsItem2.setInnerFollowingState(0, followStateEvent.isFollow());
                                }
                            }
                        }
                    }
                }
                break;
            default:
                C3042a c3042a = (C3042a) obj;
                long j7 = c3042a.f26868a;
                C7345z c7345z = (C7345z) obj2;
                Iterator<T> it2 = c7345z.f120362a.getCurrentList().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    boolean z6 = c3042a.f26869b;
                    if (!zHasNext2) {
                        for (Map.Entry<MusicPlayVideo, AbstractC7445c> entry : c7345z.f120363b.entrySet()) {
                            MusicPlayItem.Author owner2 = entry.getKey().getOwner();
                            if (owner2 != null && owner2.getMid() == j7) {
                                AbstractC7445c value2 = entry.getValue();
                                Bundle bundleA = p.a("follow_state", "need_anim", z6, false);
                                Unit unit = Unit.INSTANCE;
                                value2.u0(bundleA, "follow");
                            }
                        }
                        break;
                    } else {
                        MusicPlayVideo musicPlayVideo = (MusicPlayVideo) it2.next();
                        MusicPlayItem.Author owner3 = musicPlayVideo.getOwner();
                        if (owner3 != null && owner3.getMid() == j7 && (owner = musicPlayVideo.getOwner()) != null) {
                            owner.setRelation(z6 ? 2 : 1);
                        }
                    }
                }
                break;
        }
    }
}
