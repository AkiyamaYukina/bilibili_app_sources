package com.bilibili.ogv.kmm.operation.api;

import androidx.compose.runtime.internal.StabilityInferred;
import bl0.InterfaceC5118d;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/api/c.class */
@StabilityInferred(parameters = 0)
public final class c implements KSerializer<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ContextualSerializer f67981a = new ContextualSerializer(Reflection.getOrCreateKotlinClass(InterfaceC5118d.class), (KSerializer) null, new KSerializer[]{new ContextualSerializer(Reflection.getOrCreateKotlinClass(Object.class))});

    public final Object deserialize(Decoder decoder) {
        return new b((InterfaceC5118d) this.f67981a.deserialize(decoder));
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return this.f67981a.getDescriptor();
    }

    public final void serialize(Encoder encoder, Object obj) {
        this.f67981a.serialize(encoder, ((b) obj).f67980a);
    }
}
