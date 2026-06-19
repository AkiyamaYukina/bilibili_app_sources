package com.bilibili.ogv.operation2.inlinevideo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/inlinevideo/k.class */
@StabilityInferred(parameters = 1)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final k f70950a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f70951b = 0;

    private k() {
    }

    public final void a(@Nullable String str, @NotNull Map<String, String> map, boolean z6) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(map);
        mapCreateMapBuilder.put("dm_switch", z6 ? "1" : "2");
        Neurons.reportClick(false, "pgc." + str + ".recommend.dm.click", MapsKt.build(mapCreateMapBuilder));
    }

    public final void b(@Nullable String str, @NotNull Map<String, String> map) {
        Neurons.reportExposure$default(false, android.support.v4.media.a.a("pgc.", str, ".recommend.dm.show"), map, (List) null, 8, (Object) null);
    }

    public final void c(@Nullable String str, @NotNull Map<String, String> map) {
        Neurons.reportExposure$default(false, android.support.v4.media.a.a("pgc.", str, ".recommend.fullscreen.show"), map, (List) null, 8, (Object) null);
    }

    public final void d(@Nullable String str, @NotNull Map<String, String> map, boolean z6) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.putAll(map);
        mapCreateMapBuilder.put("sound_switch", z6 ? "2" : "1");
        Neurons.reportClick(false, "pgc." + str + ".recommend.sound.click", MapsKt.build(mapCreateMapBuilder));
    }

    public final void e(@Nullable String str, @NotNull Map<String, String> map) {
        Neurons.reportExposure$default(false, android.support.v4.media.a.a("pgc.", str, ".recommend.sound.show"), map, (List) null, 8, (Object) null);
    }
}
