package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.ad.v1.KSubCardModule;
import com.bilibili.lib.media.resource.LanguageItem;
import com.bilibili.lib.media.resource.Languages;
import com.bilibili.ship.theseus.united.page.toolbar.MenuService;
import kntr.app.ad.base.protocol.click.IButtonClickListener;
import kntr.app.ad.base.protocol.click.IClicker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.cheese.biz.modules.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/t.class */
public final /* synthetic */ class C6134t implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f90416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f90417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f90418c;

    public /* synthetic */ C6134t(int i7, Object obj, Object obj2) {
        this.f90416a = i7;
        this.f90417b = obj;
        this.f90418c = obj2;
    }

    public final Object invoke() {
        Unit unit;
        switch (this.f90416a) {
            case 0:
                Function0 function0 = (Function0) this.f90417b;
                break;
            case 1:
                MenuService menuService = (MenuService) this.f90417b;
                menuService.getClass();
                if (MenuService.l()) {
                    menuService.e();
                    unit = Unit.INSTANCE;
                } else {
                    com.bilibili.playerbizcommonv2.service.ai.a aVar = menuService.f103265x;
                    LanguageItem languageItemN0 = aVar.n0();
                    String strC = languageItemN0 != null ? languageItemN0.c() : null;
                    boolean z6 = strC == null || strC.length() == 0;
                    if (z6) {
                        Languages languagesE0 = aVar.e0();
                        LanguageItem languageItemB = languagesE0 != null ? com.bilibili.playerbizcommon.features.ai.b.b(languagesE0) : null;
                        if (languageItemB != null && languageItemB.c() != null) {
                            aVar.o0(languageItemB);
                            Languages languagesE02 = aVar.e0();
                            String strM = null;
                            if (languagesE02 != null) {
                                strM = languagesE02.m();
                            }
                            com.bilibili.ship.theseus.united.utils.q.c(strM);
                        }
                    } else {
                        aVar.N();
                        Languages languagesE03 = aVar.e0();
                        String strC2 = null;
                        if (languagesE03 != null) {
                            strC2 = languagesE03.c();
                        }
                        com.bilibili.ship.theseus.united.utils.q.c(strC2);
                    }
                    if (!z6) {
                        menuService.e();
                    }
                    defpackage.a.b("[theseus-united-MenuService-createAiAudio$lambda$1] ", com.bilibili.app.comm.bh.x5.b.a("user click Ai Audio switch ", !z6), "MenuService-createAiAudio$lambda$1");
                    menuService.k(!z6 ? "0" : "1", ((com.bilibili.playerbizcommonv2.widget.setting.X) this.f90418c).f83174g);
                    unit = Unit.INSTANCE;
                }
                break;
            case 2:
                ((Function1) this.f90417b).invoke((KSubCardModule) this.f90418c);
                break;
            default:
                ((IButtonClickListener) this.f90417b).onCardStart(((IClicker) this.f90418c).getContext());
                break;
        }
        return Unit.INSTANCE;
    }
}
