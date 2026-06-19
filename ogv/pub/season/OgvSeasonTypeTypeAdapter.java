package com.bilibili.ogv.pub.season;

import com.google.gson.TypeAdapter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/season/OgvSeasonTypeTypeAdapter.class */
final class OgvSeasonTypeTypeAdapter extends TypeAdapter<a> implements com.bilibili.bson.common.b<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeAdapter<Integer> f71774a;

    public OgvSeasonTypeTypeAdapter(@NotNull TypeAdapter<Integer> typeAdapter) {
        this.f71774a = typeAdapter;
    }

    public final /* bridge */ /* synthetic */ Object d() {
        return a.f71781i;
    }

    public final Object e(fN0.a aVar) {
        Integer num = (Integer) this.f71774a.e(aVar);
        return num != null ? new a(num.intValue()) : null;
    }

    public final void f(fN0.b bVar, Object obj) {
        a aVar = (a) obj;
        if (aVar == null) {
            bVar.n();
        } else {
            this.f71774a.f(bVar, Integer.valueOf(aVar.f71782a));
        }
    }
}
