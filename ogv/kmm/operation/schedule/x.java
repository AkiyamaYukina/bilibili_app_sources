package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.foundation.gestures.C3392f;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.C4340n;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.compose.resources.StringResource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/x.class */
@StabilityInferred(parameters = 0)
public final class x implements KSerializer<StringResource> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x f68838a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final SerialDescriptor f68839b = SerialDescriptorsKt.PrimitiveSerialDescriptor("NumberToWeekdaySerializer", PrimitiveKind.INT.INSTANCE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Map<Integer, StringResource> f68840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Map<StringResource, Integer> f68841d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.ogv.kmm.operation.schedule.x, java.lang.Object] */
    static {
        Map<Integer, StringResource> mapMapOf = MapsKt.mapOf(new Pair[]{TuplesKt.to(1, (StringResource) O3.a.f17690C.getValue()), TuplesKt.to(2, (StringResource) O3.a.f17691D.getValue()), TuplesKt.to(3, (StringResource) O3.a.f17692E.getValue()), TuplesKt.to(4, (StringResource) O3.a.f17693F.getValue()), TuplesKt.to(5, (StringResource) O3.a.f17694G.getValue()), TuplesKt.to(6, (StringResource) O3.a.f17695H.getValue()), TuplesKt.to(7, (StringResource) O3.a.f17696I.getValue())});
        f68840c = mapMapOf;
        Set<Map.Entry<Integer, StringResource>> setEntrySet = mapMapOf.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C4340n.a(setEntrySet, 10, 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pair = TuplesKt.to((StringResource) entry.getValue(), Integer.valueOf(((Number) entry.getKey()).intValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        f68841d = linkedHashMap;
    }

    public final Object deserialize(Decoder decoder) {
        int iDecodeInt = decoder.decodeInt();
        StringResource stringResource = f68840c.get(Integer.valueOf(iDecodeInt));
        if (stringResource != null) {
            return stringResource;
        }
        throw new IllegalArgumentException(C3392f.a(iDecodeInt, "无效的数字: ", "，请输入1-7之间的数字"));
    }

    @NotNull
    public final SerialDescriptor getDescriptor() {
        return f68839b;
    }

    public final void serialize(Encoder encoder, Object obj) {
        StringResource stringResource = (StringResource) obj;
        Integer num = (Integer) ((LinkedHashMap) f68841d).get(stringResource);
        if (num != null) {
            encoder.encodeInt(num.intValue());
        } else {
            throw new IllegalArgumentException("无效的星期值: " + stringResource);
        }
    }
}
