package com.bilibili.pegasus.channelv2.detail.tab.baike.adapter;

import Z7.g;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.holder.BaikeUgcInlineHolder;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelBaikeTitleItem;
import com.bilibili.pegasus.channelv2.detail.tab.baike.adapter.model.ChannelLargeCoverSingleV9Item;
import do0.C6827a;
import gl.v;
import gl.x;
import gl.y;
import java.util.HashMap;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/baike/adapter/b.class */
public final class b extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile b f75111f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray<Z7.e> f75112d = new SparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap<String, Class> f75113e;

    public b() {
        HashMap<String, Class> map = new HashMap<>();
        this.f75113e = map;
        try {
            d(C6827a.class, "baike_title_2");
            map.put("baike_title_2", ChannelBaikeTitleItem.class);
            d(do0.b.class, "baike_title_1");
            map.put("baike_title_1", ChannelBaikeTitleItem.class);
            d(BaikeUgcInlineHolder.class, "baike_large_cover_single_v9");
            map.put("baike_large_cover_single_v9", ChannelLargeCoverSingleV9Item.class);
        } catch (Exception e7) {
            throw new UnsupportedOperationException("create layout provider failed, ensure the LayoutProvider has a no arguments constructor", e7);
        }
    }

    public static b c() {
        if (f75111f == null) {
            synchronized (b.class) {
                try {
                    if (f75111f == null) {
                        f75111f = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f75111f;
    }

    public final Z7.c a(int i7, ViewGroup viewGroup) {
        this.f75112d.get(i7).getClass();
        this.f75112d.get(i7).getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        Z7.b bVar = i7 == b("baike_title_2") ? new Z7.b(x.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("baike_title_1") ? new Z7.b(y.inflate(layoutInflaterFrom, viewGroup, false)) : i7 == b("baike_large_cover_single_v9") ? new BaikeUgcInlineHolder(v.inflate(layoutInflaterFrom, viewGroup, false)) : null;
        return bVar != null ? bVar : super.a(i7, viewGroup);
    }

    public final void d(Class cls, String str) {
        ((g) this).b.add(str);
        this.f75112d.put(b(str), new Z7.e(str, cls));
    }
}
