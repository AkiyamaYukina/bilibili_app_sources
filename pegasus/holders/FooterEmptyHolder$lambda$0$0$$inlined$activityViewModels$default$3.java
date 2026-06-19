package com.bilibili.pegasus.holders;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/FooterEmptyHolder$lambda$0$0$$inlined$activityViewModels$default$3.class */
public final class FooterEmptyHolder$lambda$0$0$$inlined$activityViewModels$default$3 extends Lambda implements Function0<ViewModelProvider.Factory> {
    final Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterEmptyHolder$lambda$0$0$$inlined$activityViewModels$default$3(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    @NotNull
    /* JADX INFO: renamed from: invoke, reason: merged with bridge method [inline-methods] */
    public final ViewModelProvider.Factory m8108invoke() {
        return this.$this_activityViewModels.requireActivity().getDefaultViewModelProviderFactory();
    }
}
