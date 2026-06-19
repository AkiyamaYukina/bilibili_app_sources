package com.bilibili.ship.theseus.ugc.play.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.e;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/f.class */
@StabilityInferred(parameters = 1)
public final class f implements UGCEpisodeListRepository.a {
    @Override // com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository.a
    @Nullable
    public final e a(@NotNull List<e> list, @Nullable Av0.a aVar) {
        if (aVar == null) {
            return null;
        }
        Iterator<e> it = list.iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (c.a(it.next(), aVar)) {
                break;
            }
            i7++;
        }
        if (i7 != -1) {
            return i7 == CollectionsKt.getLastIndex(list) ? list.size() == 1 ? new e(aVar, e.a.b.f98183a) : (e) CollectionsKt.first(list) : list.get(i7 + 1);
        }
        throw new IllegalArgumentException(android.support.v4.media.session.a.a(new StringBuilder("fetch next ep failed, current:"), aVar.f590a, " is not in videos"));
    }
}
