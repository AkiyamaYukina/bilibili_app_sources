package com.bilibili.studio.material.internal;

import com.bilibili.studio.material.MaterialTask;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Result;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/a.class */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ConcurrentHashMap<String, MaterialTask> f108541a = new ConcurrentHashMap<>();

    @Override // com.bilibili.studio.material.internal.e
    public final void a(@NotNull MaterialTask materialTask) {
        synchronized (this) {
            this.f108541a.remove(materialTask.tag());
        }
    }

    @NotNull
    public final MaterialTask b(@NotNull MaterialTask materialTask) {
        Object obj;
        Object obj2;
        MaterialTask materialTask2;
        CoroutineScope coroutineScope;
        synchronized (this) {
            try {
                Result.Companion companion = Result.Companion;
                if (this.f108541a.get(materialTask.tag()) == null) {
                    this.f108541a.put(materialTask.tag(), materialTask);
                } else {
                    MaterialTask materialTask3 = this.f108541a.get(materialTask.tag());
                    if (materialTask3 != null && (coroutineScope = materialTask3.getCoroutineScope()) != null && !CoroutineScopeKt.isActive(coroutineScope)) {
                        this.f108541a.put(materialTask.tag(), materialTask);
                    }
                }
                obj = Result.constructor-impl(this.f108541a.get(materialTask.tag()));
            } finally {
            }
            if (Result.exceptionOrNull-impl(obj) == null) {
                obj2 = obj;
            } else {
                this.f108541a.put(materialTask.tag(), materialTask);
                obj2 = materialTask;
            }
            materialTask2 = (MaterialTask) obj2;
        }
        return materialTask2;
    }
}
