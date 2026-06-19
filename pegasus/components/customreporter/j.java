package com.bilibili.pegasus.components.customreporter;

import com.bilibili.adcommon.utils.ext.AdExtensions;
import com.bilibili.lib.dd.DeviceDecision;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/customreporter/j.class */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<EventType, Boolean> f75946a = new LinkedHashMap();

    public static final void a(@NotNull EventType eventType, @Nullable Map<String, String> map) {
        boolean zBooleanValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", eventType.getValue());
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        Map<EventType, Boolean> map2 = f75946a;
        Boolean bool = (Boolean) ((LinkedHashMap) map2).get(eventType);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
            if (Random.Default.nextInt(0, 1000) < AdExtensions.toIntOrDefault(DeviceDecision.INSTANCE.dd(eventType.getConfigKey(), "1"), 1)) {
                zBooleanValue = true;
            }
            map2.put(eventType, Boolean.valueOf(zBooleanValue));
        }
        if (zBooleanValue) {
            Neurons.trackT$default(false, "pegasus.custom.track.android", linkedHashMap, 0, (Function0) null, 24, (Object) null);
        } else {
            BLog.i("pegasus.custom.track.android", linkedHashMap.toString());
        }
    }
}
