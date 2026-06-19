package com.bilibili.pegasus.components;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.pegasus.BasePegasusComponent;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: renamed from: com.bilibili.pegasus.components.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/j.class */
@StabilityInferred(parameters = 0)
public final class C5629j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Class<? extends BasePegasusComponent>, BasePegasusComponent> f77065a;

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    public C5629j(@NotNull ImmutableSet immutableSet) {
        BLog.i("PluginManager", "Observers:" + CollectionsKt.p(immutableSet, (CharSequence) null, (CharSequence) null, (CharSequence) null, (Function1) new Object(), 31));
        if (Config.isDebuggable()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object obj = new Object();
            Iterator it = immutableSet.iterator();
            while (it.hasNext()) {
                BasePegasusComponent basePegasusComponent = (BasePegasusComponent) it.next();
                if (linkedHashMap.get(basePegasusComponent.getClass()) != null) {
                    throw new IllegalArgumentException("Repeated plugin type [" + basePegasusComponent.getClass() + "] is not allowed");
                }
                if (linkedHashMap2.get(basePegasusComponent.getComponentName()) != null) {
                    throw new IllegalArgumentException("Repeated plugin name, plugin:" + linkedHashMap2.get(basePegasusComponent.getComponentName()) + " and " + basePegasusComponent.getClass() + " have the same name:" + basePegasusComponent.getComponentName());
                }
                linkedHashMap.put(basePegasusComponent.getClass(), obj);
                linkedHashMap2.put(basePegasusComponent.getComponentName(), obj);
            }
        }
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(immutableSet), new Mx0.h(this, 2));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj2 : sequenceFilter) {
            linkedHashMap3.put(((BasePegasusComponent) obj2).getClass(), obj2);
        }
        this.f77065a = linkedHashMap3;
    }

    @NotNull
    public final Collection<BasePegasusComponent> a() {
        return ((LinkedHashMap) this.f77065a).values();
    }
}
