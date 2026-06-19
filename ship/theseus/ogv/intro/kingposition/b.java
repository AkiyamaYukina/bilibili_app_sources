package com.bilibili.ship.theseus.ogv.intro.kingposition;

import com.bilibili.app.gemini.share.i;
import com.bilibili.app.gemini.share.l;
import com.bilibili.app.gemini.share.t;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import java.util.List;
import kntr.common.share.core.g;
import kntr.common.share.domain.model.b;
import kntr.common.share.domain.model.e;
import kntr.common.share.domain.model.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.ScreenModeType;
import yk.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/b.class */
public final class b implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvKingPositionShareService f93219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f93220b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/kingposition/b$a.class */
    public static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvKingPositionShareService f93221a;

        public a(OgvKingPositionShareService ogvKingPositionShareService) {
            this.f93221a = ogvKingPositionShareService;
        }

        public final void c(g gVar) {
            if (gVar instanceof g.c) {
                List list = t.f;
                if (t.a.a(((g.c) gVar).b)) {
                    OgvKingPositionShareService ogvKingPositionShareService = this.f93221a;
                    ogvKingPositionShareService.f93193e.p();
                    ogvKingPositionShareService.f93194f.a();
                }
            }
        }
    }

    public b(OgvKingPositionShareService ogvKingPositionShareService, i iVar) {
        this.f93219a = ogvKingPositionShareService;
        this.f93220b = iVar;
    }

    public final boolean a(b.a aVar) {
        String str = aVar.a;
        OgvKingPositionShareService ogvKingPositionShareService = this.f93219a;
        if (OgvKingPositionShareService.b(ogvKingPositionShareService, str)) {
            return true;
        }
        int iIntValue = 0;
        if (!Intrinsics.areEqual(aVar.a, SocializeMedia.PIC)) {
            return false;
        }
        e eVarG = c.G(ogvKingPositionShareService.f93206s, "new_ogv", (Function0) null, (Y9.b) null, 6);
        j.a bVar = ogvKingPositionShareService.f93207t.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? j.a.a : new j.b();
        t tVar = ogvKingPositionShareService.f93208u;
        if (tVar == null) {
            return true;
        }
        Integer num = this.f93220b.g;
        if (num != null) {
            iIntValue = num.intValue();
        }
        tVar.f(eVarG, new kntr.common.share.domain.model.i(bVar, iIntValue, false, 0L, 12), new a(ogvKingPositionShareService));
        return true;
    }

    public final void c(g gVar) {
        if (gVar instanceof g.c) {
            List list = t.f;
            if (t.a.a(((g.c) gVar).b)) {
                OgvKingPositionShareService ogvKingPositionShareService = this.f93219a;
                ogvKingPositionShareService.f93193e.p();
                ogvKingPositionShareService.f93194f.a();
            }
        }
    }
}
