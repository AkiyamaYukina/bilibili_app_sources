package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.TypeAdapter;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OgvColorNameAdapter.class */
@StabilityInferred(parameters = 0)
public final class OgvColorNameAdapter extends TypeAdapter<c> {
    public final Object e(fN0.a aVar) {
        return new c(aVar.B());
    }

    public final void f(fN0.b bVar, Object obj) {
        bVar.w(((c) obj).f94119a);
    }
}
