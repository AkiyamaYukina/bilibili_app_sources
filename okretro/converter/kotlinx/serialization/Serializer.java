package com.bilibili.okretro.converter.kotlinx.serialization;

import java.lang.reflect.Type;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.StringFormat;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/kotlinx/serialization/Serializer.class */
public abstract class Serializer {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/okretro/converter/kotlinx/serialization/Serializer$a.class */
    public static final class a extends Serializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Json f73449a;

        public a(@NotNull Json json) {
            this.f73449a = json;
        }

        @Override // com.bilibili.okretro.converter.kotlinx.serialization.Serializer
        public final StringFormat a() {
            return this.f73449a;
        }
    }

    @NotNull
    public abstract StringFormat a();

    @NotNull
    public final KSerializer<Object> serializer(@NotNull Type type) {
        return SerializersKt.serializer(a().getSerializersModule(), type);
    }
}
