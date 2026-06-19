package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import eu0.C7004w;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/E.class */
@StabilityInferred(parameters = 0)
public final class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C7004w f89837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f89838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<D> f89839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final F f89840d;

    public E(@NotNull C7004w c7004w, @NotNull String str, @NotNull List<D> list, @NotNull F f7) {
        this.f89837a = c7004w;
        this.f89838b = str;
        this.f89839c = list;
        this.f89840d = f7;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e7 = (E) obj;
        return Intrinsics.areEqual(this.f89837a, e7.f89837a) && Intrinsics.areEqual(this.f89838b, e7.f89838b) && Intrinsics.areEqual(this.f89839c, e7.f89839c) && Intrinsics.areEqual(this.f89840d, e7.f89840d);
    }

    public final int hashCode() {
        return this.f89840d.hashCode() + e0.a(I.E.a(this.f89837a.hashCode() * 31, 31, this.f89838b), 31, this.f89839c);
    }

    @NotNull
    public final String toString() {
        return "PugvSeasonPublisher(nav=" + this.f89837a + ", publisherDesc=" + this.f89838b + ", cooperators=" + this.f89839c + ", skuContent=" + this.f89840d + ")";
    }
}
