package com.bilibili.pegasus.common.inline;

import androidx.fragment.app.Fragment;
import com.bilibili.app.comm.list.widget.inline.IInlinePlayBehavior;
import com.bilibili.pegasus.data.base.BasePegasusPlayerData;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/common/inline/j.class */
public interface j extends IInlinePlayBehavior {
    @Nullable
    Fragment getFragment();

    @NotNull
    BasePegasusPlayerData getPlayerItem();
}
