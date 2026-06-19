package com.bilibili.search2.ogv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.BaseSearchItem;
import com.bilibili.search2.result.all.p;
import com.bilibili.search2.result.bangumi.C6066f;
import dt0.AbstractC6843f;
import java.util.Set;
import kotlin.collections.SetsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/ogv/e.class */
@StabilityInferred(parameters = 0)
public final class e extends p {
    @Override // com.bilibili.search2.result.all.p, com.bilibili.search2.result.base.w, com.bilibili.search2.result.all.AbstractC6048b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void O(@NotNull AbstractC6843f<BaseSearchItem> abstractC6843f, int i7) {
        if (abstractC6843f instanceof C6066f) {
            ((C6066f) abstractC6843f).f87417u = this.f87670d;
        }
        super.O(abstractC6843f, i7);
    }

    @Override // com.bilibili.search2.result.base.w
    @NotNull
    public final Set<Integer> U() {
        return SetsKt.setOf(-1793498294);
    }
}
