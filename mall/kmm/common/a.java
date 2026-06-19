package com.bilibili.mall.kmm.common;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/common/a.class */
public final class a implements KSerializer<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f65587a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f65588b = SerialDescriptorsKt.buildClassSerialDescriptor$default("Any", new SerialDescriptor[0], (Function1) null, 4, (Object) null);

    @NotNull
    public final Object deserialize(@NotNull Decoder decoder) {
        return (JsonElement) decoder.decodeSerializableValue(JsonElement.Companion.serializer());
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f65588b;
    }

    public final void serialize(@NotNull Encoder encoder, @NotNull Object obj) {
        SerializationStrategy serializationStrategySerializer = JsonElement.Companion.serializer();
        Json.Default r02 = Json.Default;
        encoder.encodeSerializableValue(serializationStrategySerializer, r02.encodeToJsonElement(SerializersKt.noCompiledSerializer(r02.getSerializersModule(), Reflection.getOrCreateKotlinClass(Object.class)), obj));
    }
}
