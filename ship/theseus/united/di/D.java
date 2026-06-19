package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.BgPlayNotice;
import com.bapis.bilibili.app.viewunite.v1.Config;
import com.bapis.bilibili.app.viewunite.v1.IconData;
import com.bapis.bilibili.app.viewunite.v1.PageControl;
import com.bapis.bilibili.app.viewunite.v1.PlayerIcon;
import com.bapis.bilibili.app.viewunite.v1.StoryEntrance;
import com.bapis.bilibili.app.viewunite.v1.ViewBase;
import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.view.Translation;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/D.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class D implements Factory<com.bilibili.ship.theseus.united.page.view.t> {
    public static com.bilibili.ship.theseus.united.page.view.t a(ViewReply viewReply) {
        com.bilibili.ship.theseus.united.page.view.p pVar;
        com.bilibili.ship.theseus.united.page.view.r rVar;
        com.bilibili.ship.theseus.united.page.view.f fVar;
        com.bilibili.ship.theseus.united.page.view.k kVar;
        com.bilibili.ship.theseus.united.page.view.k kVar2;
        ViewBase viewBase = viewReply.getViewBase();
        PageControl control = viewBase.getControl();
        com.bilibili.ship.theseus.united.page.view.o oVar = new com.bilibili.ship.theseus.united.page.view.o(new com.bilibili.ship.theseus.united.page.view.i(control.getToastShow().getLimit()), new com.bilibili.ship.theseus.united.page.view.i(control.getUpShow().getLimit()));
        Config config = viewBase.getConfig();
        com.bilibili.ship.theseus.united.page.view.n nVar = new com.bilibili.ship.theseus.united.page.view.n(config.getOnline().getOnlineShow());
        if (config.hasPlayerIcon()) {
            PlayerIcon playerIcon = config.getPlayerIcon();
            String url1 = playerIcon.getUrl1();
            String hash1 = playerIcon.getHash1();
            String url2 = playerIcon.getUrl2();
            String hash2 = playerIcon.getHash2();
            String dragLeftPng = playerIcon.getDragLeftPng();
            String middlePng = playerIcon.getMiddlePng();
            String dragRightPng = playerIcon.getDragRightPng();
            if (playerIcon.hasDragData()) {
                IconData dragData = playerIcon.getDragData();
                kVar = new com.bilibili.ship.theseus.united.page.view.k(dragData.getMetaJson(), dragData.getSpritsImg());
            } else {
                kVar = null;
            }
            if (playerIcon.hasNodragData()) {
                IconData nodragData = playerIcon.getNodragData();
                kVar2 = new com.bilibili.ship.theseus.united.page.view.k(nodragData.getMetaJson(), nodragData.getSpritsImg());
            } else {
                kVar2 = null;
            }
            pVar = new com.bilibili.ship.theseus.united.page.view.p(url1, hash1, url2, hash2, dragLeftPng, middlePng, dragRightPng, kVar, kVar2);
        } else {
            pVar = null;
        }
        if (config.hasStoryEntrance()) {
            StoryEntrance storyEntrance = config.getStoryEntrance();
            rVar = new com.bilibili.ship.theseus.united.page.view.r(storyEntrance.getStoryIcon(), storyEntrance.getLandscapeIcon(), storyEntrance.getArcPlayStory(), storyEntrance.getArcLandscapeStory(), storyEntrance.getPlayStory());
        } else {
            rVar = null;
        }
        if (config.hasBgPlayNotice()) {
            BgPlayNotice bgPlayNotice = config.getBgPlayNotice();
            fVar = new com.bilibili.ship.theseus.united.page.view.f(bgPlayNotice.getText(), bgPlayNotice.getBtnText1(), bgPlayNotice.getBtnText2(), bgPlayNotice.getAllowShow());
        } else {
            fVar = null;
        }
        com.bilibili.ship.theseus.united.page.view.h hVar = new com.bilibili.ship.theseus.united.page.view.h(nVar, pVar, rVar, fVar, config.hasImmersion() ? new com.bilibili.ship.theseus.united.page.view.l(config.getImmersion().getOpen()) : null);
        Translation translation = null;
        if (viewBase.hasTranslation()) {
            translation = (Translation) JsonUtilKt.parseJson(Pj0.e.a(viewBase.getTranslation()), new com.bilibili.ship.theseus.united.page.view.u().getType());
        }
        return (com.bilibili.ship.theseus.united.page.view.t) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.united.page.view.t(oVar, hVar, translation));
    }
}
