package com.bilibili.ship.theseus.ugc.intro.videomentioned.module;

import com.bilibili.app.gemini.ui.UIComponent;
import com.bilibili.playerbizcommonv2.videomentioned.InterfaceC5802a;
import com.bilibili.playerbizcommonv2.videomentioned.MentionedCardItem;
import com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/videomentioned/module/m.class */
public final class m implements VideoMentionedModuleComponent.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f97905a;

    public m(n nVar) {
        this.f97905a = nVar;
    }

    @Override // com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.a
    public final void a() {
        this.f97905a.f97909d.b();
    }

    @Override // com.bilibili.ship.theseus.ugc.intro.videomentioned.module.VideoMentionedModuleComponent.a
    public final <E extends UIComponent.ViewEntry> void b(MentionedCardItem<E> mentionedCardItem) {
        n nVar = this.f97905a;
        PageReportService.i(nVar.f97910e, "united.player-video-detail.video-mention.card.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("card_id", String.valueOf(mentionedCardItem.getId())), TuplesKt.to("card_type", mentionedCardItem.getType().getType())}), 4);
        Iterator it = ((List) nVar.h.getValue()).iterator();
        while (it.hasNext()) {
            ((InterfaceC5802a) it.next()).d(mentionedCardItem);
        }
    }
}
