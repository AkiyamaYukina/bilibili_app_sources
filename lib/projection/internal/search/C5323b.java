package com.bilibili.lib.projection.internal.search;

import com.bilibili.lib.projection.internal.engine.IEngineDeviceChange;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.bilibili.lib.projection.internal.search.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/search/b.class */
public final class C5323b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C5323b f63716a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final LinkedList<IEngineDeviceChange> f63717b = new LinkedList<>();

    public final void a(@NotNull IEngineDeviceChange.EngineType engineType, boolean z6) {
        synchronized (this) {
            Iterator<T> it = f63717b.iterator();
            while (it.hasNext()) {
                ((IEngineDeviceChange) it.next()).O8(z6);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void b(@NotNull IEngineDeviceChange iEngineDeviceChange) {
        synchronized (this) {
            LinkedList<IEngineDeviceChange> linkedList = f63717b;
            if (!linkedList.contains(iEngineDeviceChange)) {
                linkedList.add(iEngineDeviceChange);
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
