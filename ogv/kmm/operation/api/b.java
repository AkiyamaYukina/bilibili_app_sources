package com.bilibili.ogv.kmm.operation.api;

import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/b.class */
@StabilityInferred(parameters = 0)
@Serializable(with = c.class)
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InterfaceC5118d f67980a;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/b$a.class */
    public static final class a {
        @NotNull
        public final KSerializer<b> serializer() {
            return new c();
        }
    }

    public b(@NotNull InterfaceC5118d interfaceC5118d) {
        this.f67980a = interfaceC5118d;
    }
}
