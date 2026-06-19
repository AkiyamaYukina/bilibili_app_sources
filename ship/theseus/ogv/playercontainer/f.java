package com.bilibili.ship.theseus.ogv.playercontainer;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import com.bilibili.ship.theseus.ogv.vip.rights.OgvVipRightsReminderService;
import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/f.class */
public final class f implements TheseusPlayerQualitySwitchWidget.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvVipRightsReminderService f94318a;

    public f(OgvVipRightsReminderService ogvVipRightsReminderService) {
        this.f94318a = ogvVipRightsReminderService;
    }

    @Override // com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget.a
    public final Function3<Modifier, Composer, Integer, Unit> getContent() {
        return (Function3) this.f94318a.f94895m.getValue();
    }
}
