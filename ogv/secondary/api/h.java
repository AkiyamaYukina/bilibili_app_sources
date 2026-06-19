package com.bilibili.ogv.secondary.api;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/h.class */
@StabilityInferred(parameters = 1)
@Serializable(with = i.class)
public abstract class h {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/h$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<h> serializer() {
            return i.f72653a;
        }
    }

    public abstract long a();

    @NotNull
    public abstract String b();

    @NotNull
    public abstract String c();
}
