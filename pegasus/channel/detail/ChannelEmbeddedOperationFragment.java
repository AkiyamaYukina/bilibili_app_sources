package com.bilibili.pegasus.channel.detail;

import Mn0.b;
import Nn0.p;
import Os.f;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import com.bilibili.pegasus.api.model.ChannelDataItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channel/detail/ChannelEmbeddedOperationFragment.class */
@StabilityInferred(parameters = 0)
public final class ChannelEmbeddedOperationFragment extends BaseChannelEmbeddedOperationFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f74902U = 32;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ChannelDataItem f74903V;

    @Override // com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePegasusFragment
    public final int of() {
        return this.f74902U;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
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
            r0 = r6
            android.os.Bundle r0 = r0.getArguments()
            r7 = r0
            r0 = r7
            if (r0 == 0) goto L1e
            r0 = r7
            java.lang.String r1 = "channel_data"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = (com.bilibili.pegasus.api.model.ChannelDataItem) r0
            r8 = r0
            r0 = r8
            r7 = r0
            r0 = r8
            if (r0 != 0) goto L2b
        L1e:
            com.bilibili.pegasus.api.model.ChannelDataItem r0 = new com.bilibili.pegasus.api.model.ChannelDataItem
            r1 = r0
            r2 = -1
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r7 = r0
        L2b:
            r0 = r6
            r1 = r7
            r0.f74903V = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channel.detail.ChannelEmbeddedOperationFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.bilibili.pegasus.channel.detail.BaseChannelEmbeddedOperationFragment, com.bilibili.pegasus.promo.operation.BaseOperationFragment, com.bilibili.pegasus.promo.BasePromoFragment, com.bilibili.lib.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewJf = Jf();
        if (viewJf != null) {
            viewJf.setOnClickListener(new p(this, 0));
        }
        ChannelDataItem channelDataItem = this.f74903V;
        ChannelDataItem channelDataItem2 = channelDataItem;
        if (channelDataItem == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelDataItem2 = null;
        }
        boolean z6 = true;
        if (channelDataItem2.i != 1) {
            z6 = false;
        }
        Kf(z6);
    }

    @Override // Mn0.b
    public final void w3(@NotNull ChannelDataItem channelDataItem) {
        long j7 = channelDataItem.a;
        ChannelDataItem channelDataItem2 = this.f74903V;
        ChannelDataItem channelDataItem3 = channelDataItem2;
        if (channelDataItem2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channelDataItem3 = null;
        }
        if (j7 != channelDataItem3.a) {
            long j8 = channelDataItem.a;
            ChannelDataItem channelDataItem4 = this.f74903V;
            if (channelDataItem4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("channel");
                channelDataItem4 = null;
            }
            f.b(z.a(j8, "Channel id incompatible!! New id: ", " old id: "), channelDataItem4.a, "ChannelDetailFragment");
        }
        this.f74903V = channelDataItem;
        boolean z6 = true;
        if (channelDataItem.i != 1) {
            z6 = false;
        }
        Kf(z6);
    }
}
