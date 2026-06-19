package com.bilibili.ogv.secondary;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ogv.secondary.part.C5535e;
import com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/d.class */
@StabilityInferred(parameters = 1)
public final class C5523d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f72670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CreateCategoryKomponentImpl f72671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5535e f72672c;

    @Inject
    public C5523d(long j7, @NotNull CreateCategoryKomponentImpl createCategoryKomponentImpl, @NotNull C5535e c5535e) {
        this.f72670a = j7;
        this.f72671b = createCategoryKomponentImpl;
        this.f72672c = c5535e;
    }
}
