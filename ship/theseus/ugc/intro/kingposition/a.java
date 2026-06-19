package com.bilibili.ship.theseus.ugc.intro.kingposition;

import com.bilibili.app.gemini.share.l;
import com.bilibili.app.gemini.share.t;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import java.util.List;
import kntr.common.share.core.g;
import kntr.common.share.domain.model.b;
import kntr.common.share.domain.model.i;
import kntr.common.share.domain.model.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yk.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/a.class */
public final class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UgcKingPositionService f97073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f97074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f97075c;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.intro.kingposition.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/a$a.class */
    public static final class C0838a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UgcKingPositionService f97076a;

        public C0838a(UgcKingPositionService ugcKingPositionService) {
            this.f97076a = ugcKingPositionService;
        }

        public final void c(g gVar) {
            if (gVar instanceof g.c) {
                List list = t.f;
                if (t.a.a(((g.c) gVar).b)) {
                    UgcKingPositionService ugcKingPositionService = this.f97076a;
                    ugcKingPositionService.f97050f.p();
                    ugcKingPositionService.f97052i.a();
                }
            }
        }
    }

    public a(UgcKingPositionService ugcKingPositionService, t tVar, j jVar) {
        this.f97073a = ugcKingPositionService;
        this.f97074b = tVar;
        this.f97075c = jVar;
    }

    public final boolean a(b.a aVar) {
        boolean zAreEqual = Intrinsics.areEqual(aVar.a, SocializeMedia.PIC);
        t tVar = this.f97074b;
        String str = aVar.a;
        if (zAreEqual) {
            UgcKingPositionService ugcKingPositionService = this.f97073a;
            tVar.f(c.G(ugcKingPositionService.f97067x, "vinfo_share", (Function0) null, (Y9.b) null, 6), new i(this.f97075c, 0, ugcKingPositionService.f97066w.getBoolean("danmaku_switch", true), ugcKingPositionService.f97065v.getCurrentPosition(), 2), new C0838a(ugcKingPositionService));
        } else if (Intrinsics.areEqual(str, SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
            tVar.h();
        }
        boolean z6 = true;
        if (!Intrinsics.areEqual(str, SocializeMedia.PIC)) {
            z6 = Intrinsics.areEqual(str, SocializeMedia.MENU_ID_SYS_DOWNLOAD);
        }
        return z6;
    }

    public final void c(g gVar) {
        if (gVar instanceof g.c) {
            List list = t.f;
            if (t.a.a(((g.c) gVar).b)) {
                UgcKingPositionService ugcKingPositionService = this.f97073a;
                ugcKingPositionService.f97050f.p();
                ugcKingPositionService.f97052i.a();
            }
        }
    }
}
