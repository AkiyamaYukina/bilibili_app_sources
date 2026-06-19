package com.bilibili.pegasus.components.interest.ui;

import androidx.fragment.app.Fragment;
import com.bilibili.pegasus.components.interest.m;
import com.bilibili.pegasus.components.interest.ui.reporter.InterestPageCloseReason;
import com.bilibili.pegasus.data.interestchoose.InterestChoose;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interest/ui/c.class */
public interface c {
    void T8(@NotNull InterestChoose interestChoose, @NotNull Fragment fragment);

    void c1(@Nullable String str);

    void kc(@Nullable InterestPageCloseReason interestPageCloseReason);

    void o9(@Nullable m mVar);
}
