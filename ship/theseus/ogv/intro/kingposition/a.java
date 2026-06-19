package com.bilibili.ship.theseus.ogv.intro.kingposition;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.O;
import javax.inject.Inject;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/a.class */
@StabilityInferred(parameters = 0)
public final class a implements KingPositionService.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public O f93217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f93218b;

    @Inject
    public a() {
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService.b
    @Nullable
    public final O a() {
        return this.f93217a;
    }

    @Override // com.bilibili.ship.theseus.united.page.intro.module.kingposition.KingPositionService.b
    @Nullable
    public final String getLikeAnimation() {
        return this.f93218b;
    }
}
