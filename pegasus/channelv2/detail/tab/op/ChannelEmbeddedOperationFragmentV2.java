package com.bilibili.pegasus.channelv2.detail.tab.op;

import Eg.h;
import Op0.b;
import Os.f;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import ao0.InterfaceC4806E;
import ao0.t;
import com.bilibili.pegasus.api.model.ChannelV2;
import com.bilibili.pegasus.channel.detail.BaseChannelEmbeddedOperationFragment;
import com.bilibili.pvtracker.IPvTracker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/detail/tab/op/ChannelEmbeddedOperationFragmentV2.class */
@StabilityInferred(parameters = 0)
public final class ChannelEmbeddedOperationFragmentV2 extends BaseChannelEmbeddedOperationFragment implements InterfaceC4806E, IPvTracker {

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ChannelV2 f75243V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    @Nullable
    public t f75244W;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f75242U = 36;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f75245X = true;

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final String getPvEventId() {
        return b.b("traffic.new-channel-detail-operation.0.0");
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    @NotNull
    public final Bundle getPvExtra() {
        Bundle bundle = new Bundle();
        ChannelV2 channelV2 = this.f75243V;
        ChannelV2 channelV22 = channelV2;
        if (channelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChannel");
            channelV22 = null;
        }
        bundle.putString("channel-id", String.valueOf(channelV22.id));
        bundle.putString("operation-id", this.f78509H);
        return bundle;
    }

    @Override // ao0.InterfaceC4806E
    public final void o6(@NotNull ChannelV2 channelV2) {
        long j7 = channelV2.id;
        ChannelV2 channelV22 = this.f75243V;
        ChannelV2 channelV23 = channelV22;
        if (channelV22 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChannel");
            channelV23 = null;
        }
        if (j7 != channelV23.id) {
            long j8 = channelV2.id;
            ChannelV2 channelV24 = this.f75243V;
            if (channelV24 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mChannel");
                channelV24 = null;
            }
            f.b(z.a(j8, "Channel id incompatible!! New id: ", " old id: "), channelV24.id, "ChannelDetailFragment");
        }
        this.f75243V = channelV2;
        Kf(channelV2.isActivityChannel());
    }

    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePegasusFragment
    public final int of() {
        return this.f75242U;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePegasusFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r7) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            super.onCreate(r1)
            androidx.lifecycle.ViewModelProvider r0 = new androidx.lifecycle.ViewModelProvider
            r1 = r0
            r2 = r6
            androidx.fragment.app.FragmentActivity r2 = r2.requireActivity()
            r1.<init>(r2)
            java.lang.Class<ao0.t> r1 = ao0.t.class
            androidx.lifecycle.ViewModel r0 = r0.get(r1)
            ao0.t r0 = (ao0.t) r0
            r7 = r0
            r0 = r6
            r1 = r7
            r0.f75244W = r1
            r0 = r7
            if (r0 == 0) goto L2d
            r0 = r7
            com.bilibili.pegasus.api.model.ChannelV2 r0 = r0.f53619a
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L3a
        L2d:
            com.bilibili.pegasus.api.model.ChannelV2 r0 = new com.bilibili.pegasus.api.model.ChannelV2
            r1 = r0
            r2 = -1
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r7 = r0
        L3a:
            r0 = r6
            r1 = r7
            r0.f75243V = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv2.detail.tab.op.ChannelEmbeddedOperationFragmentV2.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.pegasus.channel.detail.BaseChannelEmbeddedOperationFragment, com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewJf = Jf();
        if (viewJf != null) {
            viewJf.setOnClickListener(new h(this, 3));
        }
        ChannelV2 channelV2 = this.f75243V;
        ChannelV2 channelV22 = channelV2;
        if (channelV2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChannel");
            channelV22 = null;
        }
        Kf(channelV22.isActivityChannel());
    }

    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.lib.ui.BaseFragment
    public final void setUserVisibleCompat(boolean z6) {
        t tVar;
        this.f75245X = true;
        t tVar2 = this.f75244W;
        boolean zAreEqual = Intrinsics.areEqual(tVar2 != null ? tVar2.f53622d : null, this.f74832S);
        this.f78512K = zAreEqual;
        if (z6 && zAreEqual && (tVar = this.f75244W) != null) {
            tVar.f53622d = null;
        }
        this.f75245X = true ^ zAreEqual;
        super.setUserVisibleCompat(z6);
    }

    @Override // com.bilibili.pvtracker.IPvTracker
    public final boolean shouldReport() {
        return this.f75245X;
    }
}
