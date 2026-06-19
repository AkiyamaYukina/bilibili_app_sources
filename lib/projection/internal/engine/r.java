package com.bilibili.lib.projection.internal.engine;

import com.bilibili.lib.projection.internal.api.model.ProjectionInterceptInfo;
import com.bilibili.lib.projection.internal.device.ProjectionDeviceInternal;
import com.bilibili.lib.projection.internal.projectionitem.base.ProjectionPlayRecord;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/engine/r.class */
public interface r {
    @NotNull
    Observable a(int i7, @NotNull Collection collection);

    default void b() {
    }

    @NotNull
    String c();

    int e();

    void f(int i7);

    @NotNull
    Observable<List<ProjectionDeviceInternal>> g();

    @NotNull
    Single j(@NotNull DefaultProjectionEngineManager defaultProjectionEngineManager);

    void k(int i7);

    void l(@NotNull ProjectionInterceptInfo.ProjectionInterceptType projectionInterceptType, @Nullable List<String> list);

    void m(int i7);

    @Nullable
    default Se0.a<?> n() {
        return null;
    }

    @NotNull
    Observable<ProjectionDeviceInternal> o(@NotNull ProjectionPlayRecord projectionPlayRecord);
}
