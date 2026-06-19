package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;
import com.bilibili.lib.ui.BaseFragment;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/a.class */
@StabilityInferred(parameters = 0)
public class a<T extends BasicIndexItem, VB extends ViewBinding> extends Z7.b<T, VB> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public BaseFragment f75293b;

    public a() {
        throw null;
    }

    public void f() {
    }

    @Nullable
    public final Fragment getFragment() {
        return this.f75293b;
    }
}
