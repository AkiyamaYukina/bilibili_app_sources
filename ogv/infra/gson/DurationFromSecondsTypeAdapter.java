package com.bilibili.ogv.infra.gson;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.b;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.d;
import com.google.gson.e;
import com.google.gson.f;
import com.google.gson.g;
import com.squareup.wire.internal.MathMethodsKt;
import java.lang.reflect.Type;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/gson/DurationFromSecondsTypeAdapter.class */
@StabilityInferred(parameters = 1)
public final class DurationFromSecondsTypeAdapter implements e<Duration>, g<Duration>, b<Duration> {
    public final JsonElement b(Object obj, f fVar) {
        long j7 = ((Duration) obj).unbox-impl();
        long j8 = Duration.getInWholeNanoseconds-impl(j7);
        return (j8 >= Long.MAX_VALUE || j8 % MathMethodsKt.NANOS_PER_SECOND != 0) ? new JsonPrimitive(Double.valueOf(Duration.toDouble-impl(j7, DurationUnit.SECONDS))) : new JsonPrimitive(Long.valueOf(j8 / MathMethodsKt.NANOS_PER_SECOND));
    }

    public final Object c(JsonElement jsonElement, Type type, d dVar) {
        Double d7 = (Double) dVar.a(jsonElement, Double.TYPE);
        Duration.Companion companion = Duration.Companion;
        return Duration.box-impl(DurationKt.toDuration(d7.doubleValue(), DurationUnit.SECONDS));
    }

    public final Object d() {
        return Duration.box-impl(Duration.Companion.getZERO-UwyO8pc());
    }
}
