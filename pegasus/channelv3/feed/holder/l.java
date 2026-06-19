package com.bilibili.pegasus.channelv3.feed.holder;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.api.model.BasicIndexItem;
import com.bilibili.pegasus.channelv3.feed.item.ChannelDetailSmallCoverItem;
import com.bilibili.pegasus.utils.x;
import gl.A;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv3/feed/holder/l.class */
@StabilityInferred(parameters = 0)
public final class l extends a<ChannelDetailSmallCoverItem, A> {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c8  */
    @Override // com.bilibili.pegasus.channelv3.feed.holder.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.pegasus.channelv3.feed.holder.l.f():void");
    }

    public final void onBind(int i7, @NotNull List<? extends Object> list) {
        super/*Z7.c*/.onBind(i7, list);
        ChannelDetailSmallCoverItem channelDetailSmallCoverItem = (ChannelDetailSmallCoverItem) getData();
        if (channelDetailSmallCoverItem == null) {
            return;
        }
        ListExtentionsKt.setTextWithIcon$default(p0().c, channelDetailSmallCoverItem.getCoverLeftText1(), (int) channelDetailSmallCoverItem.getCoverLeftIcon1(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setTextWithIcon$default(p0().d, channelDetailSmallCoverItem.getCoverLeftText2(), (int) channelDetailSmallCoverItem.getCoverLeftIcon2(), R$color.Wh0_u, 0.0f, 0.0f, 48, (Object) null);
        ListExtentionsKt.setText(p0().e, channelDetailSmallCoverItem.getCoverRightText());
        x.i(p0().b, ((BasicIndexItem) channelDetailSmallCoverItem).cover);
        p0().f.setText(((BasicIndexItem) channelDetailSmallCoverItem).title);
    }
}
