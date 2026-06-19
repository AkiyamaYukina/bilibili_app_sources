package com.bilibili.ogv.secondary.part;

import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import javax.inject.Inject;
import ml0.C8011b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/part/u.class */
@StabilityInferred(parameters = 0)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final C8011b f72896a;

    @Inject
    public u(@NotNull C8011b c8011b) {
        this.f72896a = c8011b;
    }

    public static String a(int i7) {
        return i7 > 0 ? i7 < 10 ? C3259x.a(i7, "0") : String.valueOf(i7) : "00";
    }
}
