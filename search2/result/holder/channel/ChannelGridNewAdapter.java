package com.bilibili.search2.result.holder.channel;

import K90.c;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.api.SearchNewChannel;
import com.bilibili.search2.result.all.AbstractC6048b;
import dt0.AbstractC6839b;
import et0.C6975b;
import et0.C6977d;
import et0.ViewOnClickListenerC6974a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/channel/ChannelGridNewAdapter.class */
@StabilityInferred(parameters = 0)
public final class ChannelGridNewAdapter extends AbstractC6048b<AbstractC6839b<SearchNewChannel.ChannelMixedItem>, SearchNewChannel.ChannelMixedItem> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f87903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ViewOnClickListenerC6974a.b f87904c;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/channel/ChannelGridNewAdapter$EmptyFeedHolder.class */
    @StabilityInferred(parameters = 0)
    public static final class EmptyFeedHolder extends AbstractC6839b<c> {
        public static final int $stable = 8;

        public EmptyFeedHolder(@NotNull View view) {
            super(view);
        }

        @Override // dt0.AbstractC6839b
        public void bind() {
        }
    }

    public ChannelGridNewAdapter(int i7, @NotNull ViewOnClickListenerC6974a.b bVar) {
        this.f87903b = i7;
        this.f87904c = bVar;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b
    @NotNull
    public final AbstractC6839b P(int i7, @NotNull ViewGroup viewGroup) {
        AbstractC6839b emptyFeedHolder;
        ViewOnClickListenerC6974a.b bVar = this.f87904c;
        if (i7 == 1) {
            C6977d c6977d = new C6977d(p.a(viewGroup, 2131494761, viewGroup, false));
            c6977d.f117486c = bVar;
            emptyFeedHolder = c6977d;
        } else if (i7 != 2) {
            emptyFeedHolder = new EmptyFeedHolder(new View(viewGroup.getContext()));
        } else {
            C6975b c6975b = new C6975b(p.a(viewGroup, 2131494760, viewGroup, false));
            c6975b.f117482f = bVar;
            emptyFeedHolder = c6975b;
        }
        return emptyFeedHolder;
    }

    @Override // com.bilibili.search2.result.all.AbstractC6048b, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i7) {
        return this.f87903b;
    }
}
