package com.bilibili.ship.theseus.ogv.intro.section.bean;

import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.PojoClassDescriptor;
import com.bilibili.bson.common.PojoPropertyDescriptor;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/bean/EpisodeInteraction_JsonDescriptor.class */
public final class EpisodeInteraction_JsonDescriptor extends PojoClassDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PojoPropertyDescriptor[] f93517a = {new PojoPropertyDescriptor("history_node", (String[]) null, InteractionHistoryNode.class, (Class) null, 5), new PojoPropertyDescriptor("graph_version", (String[]) null, Long.TYPE, (Class) null, 5), new PojoPropertyDescriptor(NotificationCompat.CATEGORY_MESSAGE, (String[]) null, String.class, (Class) null, 5)};

    public EpisodeInteraction_JsonDescriptor() {
        super(EpisodeInteraction.class, f93517a);
    }

    public final Object constructWith(Object[] objArr) {
        InteractionHistoryNode interactionHistoryNode = (InteractionHistoryNode) objArr[0];
        Long l7 = (Long) objArr[1];
        return new EpisodeInteraction(interactionHistoryNode, l7 == null ? 0L : l7.longValue(), (String) objArr[2]);
    }

    public final Object get(Object obj, int i7) {
        EpisodeInteraction episodeInteraction = (EpisodeInteraction) obj;
        if (i7 == 0) {
            return episodeInteraction.f93514a;
        }
        if (i7 == 1) {
            return Long.valueOf(episodeInteraction.a());
        }
        if (i7 != 2) {
            return null;
        }
        return episodeInteraction.f93516c;
    }
}
