package com.bilibili.ship.theseus.ugc.play.schedule;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository;
import com.bilibili.ship.theseus.ugc.play.schedule.e;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/play/schedule/h.class */
@StabilityInferred(parameters = 1)
public final class h implements UGCEpisodeListRepository.a {
    @Override // com.bilibili.ship.theseus.ugc.play.schedule.UGCEpisodeListRepository.a
    @Nullable
    public final e a(@NotNull List<e> list, @Nullable Av0.a aVar) {
        if (aVar == null) {
            return null;
        }
        return new e(aVar, e.a.b.f98183a);
    }
}
