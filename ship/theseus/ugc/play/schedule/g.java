package com.bilibili.ship.theseus.ugc.play.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.e;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/g.class */
@StabilityInferred(parameters = 1)
public final class g implements UGCEpisodeListRepository.a {
    @Override // com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository.a
    @Nullable
    public final e a(@NotNull List<e> list, @Nullable Av0.a aVar) {
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
        if (i7 >= list.size()) {
            return null;
        }
        e eVar = (e) CollectionsKt.getOrNull(list, i7 + 1);
        e eVar2 = null;
        if (eVar != null) {
            eVar2 = new e(eVar.f98180a, e.a.C0911a.f98182a);
        }
        return eVar2;
    }
}
