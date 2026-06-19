package com.bilibili.ship.theseus.united.page.restrictionlayer;

import com.bilibili.bson.common.BsonTypeAdapterFactory;
import com.bilibili.bson.dsl.JsonDslKt;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TextVoTypeAdapter.class */
final class TextVoTypeAdapter extends TypeAdapter<TextVo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TypeAdapter<TextVo> f102720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypeAdapter<JsonElement> f102721b;

    public TextVoTypeAdapter(@NotNull Gson gson) {
        this.f102720a = new BsonTypeAdapterFactory(false).a(gson, TypeToken.get(TextVo.class));
        this.f102721b = gson.getAdapter(JsonElement.class);
    }

    public final Object e(fN0.a aVar) {
        TextVo textVo;
        JsonObject jsonObject = (JsonElement) this.f102721b.e(aVar);
        if (jsonObject instanceof JsonObject) {
            JsonObject jsonObject2 = jsonObject;
            JsonDslKt.set(jsonObject2, "action", jsonObject2.deepCopy());
            textVo = (TextVo) this.f102720a.b(jsonObject);
        } else {
            textVo = null;
        }
        return textVo;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.gson.JsonIOException */
    public final void f(fN0.b bVar, Object obj) throws JsonIOException {
        TextVo textVo = (TextVo) obj;
        if (textVo == null) {
            bVar.n();
            return;
        }
        TypeAdapter<TextVo> typeAdapter = this.f102720a;
        typeAdapter.getClass();
        try {
            com.google.gson.internal.bind.b bVar2 = new com.google.gson.internal.bind.b();
            typeAdapter.f(bVar2, textVo);
            JsonObject jsonObjectA = bVar2.A();
            for (Map.Entry entry : jsonObjectA.remove("action").entrySet()) {
                JsonDslKt.set(jsonObjectA, (String) entry.getKey(), (JsonElement) entry.getValue());
            }
            this.f102721b.f(bVar, jsonObjectA);
        } catch (IOException e7) {
            throw new JsonIOException(e7);
        }
    }
}
