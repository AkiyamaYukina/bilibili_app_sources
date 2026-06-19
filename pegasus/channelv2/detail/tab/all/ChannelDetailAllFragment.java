package com.bilibili.pegasus.channelv2.detail.tab.all;

import ES0.M0;
import Op0.b;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import ao0.t;
import bo0.AbstractC5132b;
import bo0.C5131a;
import co0.C5273a;
import co0.C5274b;
import com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ro0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/all/ChannelDetailAllFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelDetailAllFragment extends BaseChannelDetailFragment {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f75045B = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f75047z = 60;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final Lazy f75046A = LazyKt.lazy(new M0(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/all/ChannelDetailAllFragment$a.class */
    public static final /* synthetic */ class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5273a f75048a;

        public a(C5273a c5273a) {
            this.f75048a = c5273a;
        }

        public final boolean equals(@Nullable Object obj) {
            boolean zAreEqual = false;
            if (obj instanceof Observer) {
                zAreEqual = false;
                if (obj instanceof FunctionAdapter) {
                    zAreEqual = Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
            }
            return zAreEqual;
        }

        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f75048a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f75048a.invoke(obj);
        }
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return b.b("traffic.new-channel-detail-all.0.0");
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final void initViewModel() {
        this.f75232p = (AbstractC5132b) new ViewModelProvider(this).get(C5274b.class);
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final C5131a lf() {
        return (C5131a) this.f75046A.getValue();
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final void nf() {
        RecyclerView mRecyclerView;
        super.nf();
        AbstractC5132b abstractC5132b = this.f75232p;
        if (abstractC5132b == null || abstractC5132b.f56842i != 1 || (mRecyclerView = getMRecyclerView()) == null) {
            return;
        }
        mRecyclerView.scrollToPosition(0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [Wn0.h, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment
    public final void of(@NotNull String str) {
        MutableLiveData mutableLiveData;
        t tVar = this.f75233q;
        if (tVar == null || (mutableLiveData = tVar.f53628k) == null) {
            return;
        }
        String tag = getTag();
        ?? obj = new Object();
        obj.f26975a = str;
        obj.f26976b = tag;
        mutableLiveData.setValue(obj);
    }

    @Override // com.bilibili.pegasus.channelv2.detail.tab.base.BaseChannelDetailFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        p<Void> pVar;
        super.onViewCreated(view, bundle);
        t tVar = this.f75233q;
        if (tVar == null || (pVar = tVar.f53629l) == null) {
            return;
        }
        pVar.observe(getViewLifecycleOwner(), new a(new C5273a(this, 0)));
    }
}
