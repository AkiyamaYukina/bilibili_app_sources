package com.bilibili.ship.theseus.united.page.toolbar;

import com.bilibili.app.gemini.share.t;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import java.util.List;
import kntr.common.share.core.g;
import kntr.common.share.domain.model.b;
import kntr.common.share.domain.model.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.ScreenModeType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/B.class */
public final class B implements com.bilibili.app.gemini.share.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MenuService f103219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f103220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kntr.common.share.domain.model.e f103221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.app.gemini.share.t f103222d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/toolbar/B$a.class */
    public static final class a implements com.bilibili.app.gemini.share.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuService f103223a;

        public a(MenuService menuService) {
            this.f103223a = menuService;
        }

        public final void c(kntr.common.share.core.g gVar) {
            if (gVar instanceof g.c) {
                List list = com.bilibili.app.gemini.share.t.f;
                if (t.a.a(((g.c) gVar).b)) {
                    this.f103223a.f103249g.f103417v.tryEmit(Unit.INSTANCE);
                }
            }
        }
    }

    public B(MenuService menuService, String str, kntr.common.share.domain.model.e eVar, com.bilibili.app.gemini.share.t tVar) {
        this.f103219a = menuService;
        this.f103220b = str;
        this.f103221c = eVar;
        this.f103222d = tVar;
    }

    public final boolean a(b.a aVar) {
        boolean zAreEqual = Intrinsics.areEqual(aVar.a, SocializeMedia.PIC);
        com.bilibili.app.gemini.share.t tVar = this.f103222d;
        boolean z6 = false;
        String str = aVar.a;
        if (zAreEqual) {
            MenuService menuService = this.f103219a;
            int currentPosition = menuService.f103266y.getCurrentPosition();
            boolean z7 = menuService.f103251j.getBoolean("danmaku_switch", true);
            yk.c cVarG = menuService.g();
            kntr.common.share.domain.model.e eVarG = cVarG != null ? yk.c.G(cVarG, this.f103220b, (Function0) null, (Y9.b) null, 6) : this.f103221c;
            j.a bVar = menuService.f103233A.getScreenModeType() == ScreenModeType.LANDSCAPE_FULLSCREEN ? j.a.a : new j.b();
            long j7 = currentPosition;
            yk.c cVarG2 = menuService.g();
            tVar.f(eVarG, new kntr.common.share.domain.model.i(bVar, cVarG2 != null ? cVarG2.getTemplateId() : 0, z7, j7), new a(menuService));
        } else if (Intrinsics.areEqual(str, SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
            tVar.h();
        }
        if (Intrinsics.areEqual(str, SocializeMedia.PIC) || Intrinsics.areEqual(str, SocializeMedia.MENU_ID_SYS_DOWNLOAD)) {
            z6 = true;
        }
        return z6;
    }

    public final void c(kntr.common.share.core.g gVar) {
        if (gVar instanceof g.c) {
            List list = com.bilibili.app.gemini.share.t.f;
            if (t.a.a(((g.c) gVar).b)) {
                this.f103219a.f103249g.f103417v.tryEmit(Unit.INSTANCE);
            }
        }
    }

    public final void d() {
        BLog.i("MenuService$createShareMenu$menuView$1-onPanelShowed", "[theseus-united-MenuService$createShareMenu$menuView$1-onPanelShowed] share menu data loaded, notify ready");
    }

    public final void f() {
        this.f103219a.e();
    }
}
