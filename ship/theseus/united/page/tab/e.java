package com.bilibili.ship.theseus.united.page.tab;

import com.bapis.bilibili.app.viewunite.v1.TabModule;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import com.bilibili.ship.theseus.united.page.view.RelationRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/tab/e.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class e implements Factory<n> {
    public static n a(final RelationRepository relationRepository, final com.bilibili.ship.theseus.keel.player.h hVar, final AutoPlayService autoPlayService) {
        return (n) Preconditions.checkNotNullFromProvides(new n(relationRepository, hVar, autoPlayService) { // from class: com.bilibili.ship.theseus.united.page.tab.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final RelationRepository f103166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.bilibili.ship.theseus.keel.player.h f103167b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AutoPlayService f103168c;

            {
                this.f103166a = relationRepository;
                this.f103167b = hVar;
                this.f103168c = autoPlayService;
            }

            @Override // com.bilibili.ship.theseus.united.page.tab.n
            public final TabPage a(TabModule tabModule) {
                return new c(this.f103166a, (CommentTab) JsonUtilKt.parseJson(Pj0.e.a(tabModule.getReply()), new d().getType()), this.f103167b, this.f103168c);
            }
        });
    }
}
