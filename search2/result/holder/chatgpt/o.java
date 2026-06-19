package com.bilibili.search2.result.holder.chatgpt;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.search2.result.holder.chatgpt.SearchChatGptHolder;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatGptItem;
import com.bilibili.search2.result.holder.chatgpt.api.SearchChatResultItem;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/holder/chatgpt/o.class */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchChatGptHolder f88028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f88029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bl.p f88030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f88031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f88032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f88033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SearchChatResultItem f88034g;

    public /* synthetic */ o(SearchChatGptHolder searchChatGptHolder, int i7, Bl.p pVar, long j7, j jVar, List list, SearchChatResultItem searchChatResultItem) {
        this.f88028a = searchChatGptHolder;
        this.f88029b = i7;
        this.f88030c = pVar;
        this.f88031d = j7;
        this.f88032e = jVar;
        this.f88033f = list;
        this.f88034g = searchChatResultItem;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LifecycleOwner viewLifecycleOwner;
        LifecycleCoroutineScope lifecycleScope;
        final SearchChatGptHolder searchChatGptHolder = this.f88028a;
        final int i7 = this.f88029b;
        final Bl.p pVar = this.f88030c;
        long j7 = this.f88031d;
        j jVar = this.f88032e;
        List list = this.f88033f;
        SearchChatResultItem searchChatResultItem = this.f88034g;
        RecyclerView recyclerView = pVar.b;
        searchChatGptHolder.getClass();
        int height = recyclerView.getHeight();
        int px = height;
        if (height > i7) {
            px = height + ListExtentionsKt.toPx(24);
        }
        pVar.c.setMaxHeight(px);
        SearchChatGptHolder.a aVar = SearchChatGptHolder.f87922q;
        if (j7 >= SearchChatGptHolder.a.a()) {
            SearchChatGptHolder.D0(pVar, (!((SearchChatGptItem) searchChatGptHolder.getData()).getAutoExpand() && px >= i7) ? i7 : px, i7, jVar, list, searchChatGptHolder.f87933b.a(((SearchChatGptItem) searchChatGptHolder.getData()).getSessionId(), searchChatResultItem) + ((long) SearchChatGptHolder.a.a()));
        } else {
            int i8 = (!((SearchChatGptItem) searchChatGptHolder.getData()).getAutoExpand() && px >= i7) ? i7 : px;
            Fragment fragment = searchChatGptHolder.getFragment();
            if (fragment != null && (viewLifecycleOwner = fragment.getViewLifecycleOwner()) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner)) != null) {
                lifecycleScope.launchWhenCreated(new SearchChatGptHolder$execAnim$1(j7, pVar, i8, px, searchChatGptHolder, i7, jVar, list, null));
            }
        }
        final int i9 = px;
        pVar.e.setOnClickListener(new View.OnClickListener(pVar, searchChatGptHolder, i7, i9) { // from class: com.bilibili.search2.result.holder.chatgpt.r

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bl.p f88040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchChatGptHolder f88041b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f88042c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f88043d;

            {
                this.f88040a = pVar;
                this.f88041b = searchChatGptHolder;
                this.f88042c = i7;
                this.f88043d = i9;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleOwner viewLifecycleOwner2;
                LifecycleCoroutineScope lifecycleScope2;
                Bl.p pVar2 = this.f88040a;
                SearchChatGptHolder searchChatGptHolder2 = this.f88041b;
                int i10 = this.f88042c;
                int i11 = this.f88043d;
                ListExtentionsKt.gone(pVar2.e);
                ListExtentionsKt.gone(pVar2.d);
                Fragment fragment2 = searchChatGptHolder2.getFragment();
                if (fragment2 != null && (viewLifecycleOwner2 = fragment2.getViewLifecycleOwner()) != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
                    lifecycleScope2.launchWhenCreated(new SearchChatGptHolder$setExpendListener$1$1(i10, i11, pVar2, null));
                }
                searchChatGptHolder2.x0("expand");
            }
        });
        final int i10 = px;
        pVar.f.setOnClickListener(new View.OnClickListener(pVar, searchChatGptHolder, i10, i7) { // from class: com.bilibili.search2.result.holder.chatgpt.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Bl.p f88036a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final SearchChatGptHolder f88037b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f88038c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f88039d;

            {
                this.f88036a = pVar;
                this.f88037b = searchChatGptHolder;
                this.f88038c = i10;
                this.f88039d = i7;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LifecycleOwner viewLifecycleOwner2;
                LifecycleCoroutineScope lifecycleScope2;
                Bl.p pVar2 = this.f88036a;
                SearchChatGptHolder searchChatGptHolder2 = this.f88037b;
                int i11 = this.f88038c;
                int i12 = this.f88039d;
                ListExtentionsKt.gone(pVar2.f);
                Fragment fragment2 = searchChatGptHolder2.getFragment();
                if (fragment2 != null && (viewLifecycleOwner2 = fragment2.getViewLifecycleOwner()) != null && (lifecycleScope2 = LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2)) != null) {
                    lifecycleScope2.launchWhenCreated(new SearchChatGptHolder$setShrinkListener$1$1(i11, i12, pVar2, null));
                }
                searchChatGptHolder2.x0("close");
            }
        });
    }
}
