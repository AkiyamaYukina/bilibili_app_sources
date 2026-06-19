package com.bilibili.ship.theseus.ogv.intro.section.floatlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.BsonTypeAdapterFactory;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/floatlayer/WholeJsonHolderAdapterFactory.class */
@StabilityInferred(parameters = 1)
public final class WholeJsonHolderAdapterFactory implements com.google.gson.i {
    @NotNull
    public final <T> TypeAdapter<T> a(@NotNull Gson gson, @NotNull TypeToken<T> typeToken) {
        final TypeAdapter typeAdapterA = new BsonTypeAdapterFactory(false).a(gson, typeToken);
        final TypeAdapter adapter = gson.getAdapter(JsonObject.class);
        return new TypeAdapter<T>(typeAdapterA, adapter) { // from class: com.bilibili.ship.theseus.ogv.intro.section.floatlayer.WholeJsonHolderAdapterFactory$create$1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TypeAdapter<T> f93647a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TypeAdapter<JsonObject> f93648b;

            {
                this.f93647a = typeAdapterA;
                this.f93648b = adapter;
            }

            public final T e(fN0.a aVar) {
                T t7 = (T) this.f93647a.e(new com.google.gson.internal.bind.a((JsonObject) this.f93648b.e(aVar)));
                if (t7 instanceof w) {
                    ((w) t7).getClass();
                }
                return t7;
            }

            public final void f(fN0.b bVar, T t7) {
                this.f93647a.f(bVar, t7);
            }
        };
    }
}
