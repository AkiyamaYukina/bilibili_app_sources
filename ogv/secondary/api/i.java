package com.bilibili.ogv.secondary.api;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/api/i.class */
@StabilityInferred(parameters = 0)
public final class i extends JsonContentPolymorphicSerializer<h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final i f72653a = new JsonContentPolymorphicSerializer(Reflection.getOrCreateKotlinClass(h.class));

    public final DeserializationStrategy selectDeserializer(JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        String content;
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get("link");
        return (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null || (content = jsonPrimitive.getContent()) == null || !StringsKt.Z(content, "http")) ? b.Companion.serializer() : j.Companion.serializer();
    }
}
