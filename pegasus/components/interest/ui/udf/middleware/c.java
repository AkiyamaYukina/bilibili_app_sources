package com.bilibili.pegasus.components.interest.ui.udf.middleware;

import Fo0.k;
import com.bilibili.pegasus.components.interest.ui.udf.actions.Actions;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/udf/middleware/c.class */
public interface c {
    @Nullable
    default Unit a(@NotNull Actions actions) {
        return Unit.INSTANCE;
    }

    @Nullable
    default Unit b(@NotNull Actions actions, @NotNull Throwable th) {
        return Unit.INSTANCE;
    }

    @Nullable
    default Unit c(@NotNull Actions actions, @NotNull k kVar, @Nullable k kVar2, @NotNull Co0.b bVar) {
        return Unit.INSTANCE;
    }
}
