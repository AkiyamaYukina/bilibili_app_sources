package com.bilibili.playset.api;

import android.app.Activity;
import com.bilibili.app.comm.supermenu.core.MenuItemImpl;
import com.bilibili.playset.api.MultitypeMedia;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/g.class */
public final class g {
    @NotNull
    public static final List<MenuItemImpl> a(@NotNull c cVar, @NotNull Activity activity) {
        List<MenuItemImpl> listMutableListOf = CollectionsKt.mutableListOf(new MenuItemImpl[]{new MenuItemImpl(activity, "delete_favorite", 2131241730, 2131842571)});
        TranslateInfo translateInfoU = cVar.u();
        if ((translateInfoU != null ? translateInfoU.getTranslateText() : null) != null) {
            int i7 = e.a(cVar) ? 2131244378 : 2131244379;
            boolean zA = e.a(cVar);
            TranslateInfo translateInfoU2 = cVar.u();
            listMutableListOf.add(new MenuItemImpl(activity, "menu_translate", i7, zA ? translateInfoU2.getOriginText() : translateInfoU2.getTranslateText()));
        }
        return listMutableListOf;
    }

    @NotNull
    public static final MultitypeMedia b(@NotNull c cVar) {
        MultitypeMedia multitypeMedia = new MultitypeMedia();
        int iL = cVar.l();
        int i7 = 24;
        if (iL != 24) {
            i7 = 42;
            if (iL != 42) {
                i7 = 2;
            }
        }
        multitypeMedia.type = i7;
        multitypeMedia.id = cVar.k();
        multitypeMedia.title = cVar.t();
        Upper upper = new Upper();
        Upper upperW = cVar.w();
        upper.name = upperW != null ? upperW.name : null;
        multitypeMedia.upper = upper;
        MultitypeMedia.OGV ogv = new MultitypeMedia.OGV();
        h hVarJ = cVar.j();
        ogv.seasonType = hVarJ != null ? (int) hVarJ.b() : 0;
        h hVarJ2 = cVar.j();
        String strC = null;
        if (hVarJ2 != null) {
            strC = hVarJ2.c();
        }
        ogv.typeName = strC;
        h hVarJ3 = cVar.j();
        ogv.seasonId = hVarJ3 != null ? hVarJ3.a() : 0L;
        multitypeMedia.ogv = ogv;
        MultitypeMedia.UGC ugc = new MultitypeMedia.UGC();
        v vVarV = cVar.v();
        long jA = 0;
        if (vVarV != null) {
            jA = vVarV.a();
        }
        ugc.cid = jA;
        multitypeMedia.ugc = ugc;
        String strI = cVar.i();
        String str = strI;
        if (strI == null) {
            str = "";
        }
        multitypeMedia.link = str;
        String strC2 = cVar.c();
        if (strC2 == null) {
            strC2 = "";
        }
        multitypeMedia.cover = strC2;
        return multitypeMedia;
    }
}
