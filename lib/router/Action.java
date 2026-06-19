package com.bilibili.lib.router;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/Action.class */
@Deprecated
public interface Action<Result> {
    public static final String PROP_IS_ACTION = "blrouter.compat.action";

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/router/Action$a.class */
    @Deprecated
    public interface a<Result> {
    }

    @Nullable
    Result act(RouteParams routeParams);
}
