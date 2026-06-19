package com.bilibili.ship.theseus.cheese.biz.bottomcontainer;

import com.bilibili.app.gemini.share.t;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import java.util.List;
import kntr.common.share.core.g;
import kntr.common.share.domain.model.b;
import kntr.common.share.domain.model.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/m.class */
public final class m implements com.bilibili.app.gemini.share.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheeseBottomContainerService f89093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.app.gemini.share.i f89094b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/bottomcontainer/m$a.class */
    public static final class a implements com.bilibili.app.gemini.share.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CheeseBottomContainerService f89095a;

        public a(CheeseBottomContainerService cheeseBottomContainerService) {
            this.f89095a = cheeseBottomContainerService;
        }

        public final void c(kntr.common.share.core.g gVar) {
            if (gVar instanceof g.c) {
                List list = t.f;
                if (t.a.a(((g.c) gVar).b)) {
                    this.f89095a.f89043u.p();
                }
            }
        }
    }

    public m(CheeseBottomContainerService cheeseBottomContainerService, com.bilibili.app.gemini.share.i iVar) {
        this.f89093a = cheeseBottomContainerService;
        this.f89094b = iVar;
    }

    public final boolean a(b.a aVar) {
        String str = aVar.a;
        CheeseBottomContainerService cheeseBottomContainerService = this.f89093a;
        if (CheeseBottomContainerService.a(cheeseBottomContainerService, str)) {
            return true;
        }
        int iIntValue = 0;
        if (!Intrinsics.areEqual(aVar.a, SocializeMedia.PIC)) {
            return false;
        }
        j.a bVar = cheeseBottomContainerService.f89047y.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? j.a.a : new j.b();
        kntr.common.share.domain.model.e eVarG = yk.c.G(cheeseBottomContainerService.f89046x, "vinfo_share", (Function0) null, (Y9.b) null, 6);
        t tVar = cheeseBottomContainerService.f89048z;
        if (tVar == null) {
            return true;
        }
        Integer num = this.f89094b.g;
        if (num != null) {
            iIntValue = num.intValue();
        }
        tVar.f(eVarG, new kntr.common.share.domain.model.i(bVar, iIntValue, false, 0L, 12), new a(cheeseBottomContainerService));
        return true;
    }

    public final void c(kntr.common.share.core.g gVar) {
        if (gVar instanceof g.c) {
            List list = t.f;
            if (t.a.a(((g.c) gVar).b)) {
                this.f89093a.f89043u.p();
            }
        }
    }
}
