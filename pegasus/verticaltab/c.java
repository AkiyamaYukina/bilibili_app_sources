package com.bilibili.pegasus.verticaltab;

import Up0.C2914c;
import Up0.C2915d;
import Up0.C2920i;
import Up0.L;
import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bilibili.biligame.api.bean.gamedetail.BiligameIntroBean;
import com.bilibili.biligame.download.dialog.GameRecodeTipsDialog;
import com.bilibili.biligame.widget.dialog.GameSixElementDialog;
import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV11Item;
import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV7Item;
import com.bilibili.pegasus.verticaltab.api.model.VerticalLargeCoverV9Item;
import com.bilibili.pegasus.verticaltab.api.model.VerticalSmallCoverV2Item;
import com.bilibili.pegasus.verticaltab.cards.VerticalLargeCoverV7Holder;
import com.bilibili.pegasus.verticaltab.cards.VerticalLargeCoverV9Holder;
import gl.B;
import gl.E;
import gl.F;
import gl.G;
import gl.J;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/verticaltab/c.class */
public final class c extends Z7.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile c f78936f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<Z7.e> f78937d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, Class> f78938e;

    public c() {
        HashMap<String, Class> map = new HashMap<>();
        this.f78938e = map;
        try {
            d(C2914c.class, "empty_view");
            d(C2915d.class, "footer_loading");
            d(C2920i.class, "vertical_large_cover_v11");
            map.put("vertical_large_cover_v11", VerticalLargeCoverV11Item.class);
            d(VerticalLargeCoverV7Holder.class, "vertical_large_cover_v7");
            map.put("vertical_large_cover_v7", VerticalLargeCoverV7Item.class);
            d(VerticalLargeCoverV9Holder.class, "vertical_large_cover_v9");
            map.put("vertical_large_cover_v9", VerticalLargeCoverV9Item.class);
            d(L.class, "vertical_small_cover_v2");
            map.put("vertical_small_cover_v2", VerticalSmallCoverV2Item.class);
        } catch (Exception e7) {
            throw new UnsupportedOperationException("create layout provider failed, ensure the LayoutProvider has a no arguments constructor", e7);
        }
    }

    public static c c() {
        if (f78936f == null) {
            synchronized (c.class) {
                try {
                    if (f78936f == null) {
                        f78936f = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f78936f;
    }

    public final Z7.c a(int i7, ViewGroup viewGroup) {
        final Z7.b bVar;
        this.f78937d.get(i7).getClass();
        this.f78937d.get(i7).getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        if (i7 == b("empty_view")) {
            gl.g gVarInflate = gl.g.inflate(layoutInflaterFrom, viewGroup, false);
            bVar = new Z7.b(gVarInflate);
            final int i8 = 0;
            gVarInflate.b.setOnClickListener(new View.OnClickListener(bVar, i8) { // from class: Up0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f24828a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final Object f24829b;

                {
                    this.f24828a = i8;
                    this.f24829b = bVar;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (this.f24828a) {
                        case 0:
                            com.bilibili.pegasus.verticaltab.l lVar = ((C2914c) this.f24829b).f24826c;
                            if (lVar != null) {
                                lVar.refresh();
                            }
                            break;
                        default:
                            GameSixElementDialog gameSixElementDialog = (GameSixElementDialog) this.f24829b;
                            BiligameIntroBean biligameIntroBean = gameSixElementDialog.e;
                            if (biligameIntroBean != null) {
                                Context context = gameSixElementDialog.getContext();
                                String recordNumber = biligameIntroBean.getRecordNumber();
                                String str = recordNumber;
                                if (recordNumber == null) {
                                    str = "";
                                }
                                String recordAgent = biligameIntroBean.getRecordAgent();
                                new GameRecodeTipsDialog(context, B0.a.a(str, "；", recordAgent != null ? recordAgent : "")).show();
                            }
                            break;
                    }
                }
            });
        } else {
            bVar = i7 == b("footer_loading") ? new Z7.b(B.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("vertical_large_cover_v11") ? new Z7.b(G.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("vertical_large_cover_v7") ? new VerticalLargeCoverV7Holder(E.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("vertical_large_cover_v9") ? new VerticalLargeCoverV9Holder(F.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("vertical_small_cover_v2") ? new L(J.inflate(layoutInflaterFrom, viewGroup, false)) : null;
        }
        return bVar != null ? bVar : super.a(i7, viewGroup);
    }

    public final void d(Class cls, String str) {
        ((Z7.g) this).b.add(str);
        this.f78937d.put(b(str), new Z7.e(str, cls));
    }
}
