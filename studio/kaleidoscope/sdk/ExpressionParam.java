package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/ExpressionParam.class */
public interface ExpressionParam {
    public static final int TYPE_BOOLEAN = 2;
    public static final int TYPE_COLOR = 3;
    public static final int TYPE_FLOAT = 1;
    public static final int TYPE_INT = 0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/ExpressionParam$a.class */
    public interface a {
        Object getFloatParam();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/ExpressionParam$b.class */
    public interface b {
        Object getIntParam();
    }

    @Nullable
    Color getColor();

    Object getExpressionParam();

    a getFloatParam();

    b getIntParam();

    String getName();

    int getType();

    void setExpressionParam(Object obj);
}
