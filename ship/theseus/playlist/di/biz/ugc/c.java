package com.bilibili.ship.theseus.playlist.di.biz.ugc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailMoreRelateService;
import com.bilibili.ship.theseus.united.player.ai.UnitedAiService;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/biz/ugc/c.class */
@StabilityInferred(parameters = 0)
public final class c {
    static {
        Lazy<List<String>> lazy = UnitedAiService.f104337o;
        int i7 = DetailMoreRelateService.f100835l;
    }

    @Inject
    public c() {
    }
}
