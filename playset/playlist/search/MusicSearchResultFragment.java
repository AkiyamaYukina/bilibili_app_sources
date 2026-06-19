package com.bilibili.playset.playlist.search;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.comm.list.widget.utils.ListExtentionsKt;
import com.bilibili.base.connectivity.ConnectivityMonitor;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.pegasus.page.C5712a;
import com.bilibili.pegasus.page.RunnableC5717f;
import com.bilibili.playset.decoration.b;
import com.bilibili.playset.decoration.c;
import com.bilibili.playset.decoration.d;
import com.bilibili.playset.decoration.e;
import com.bilibili.playset.playlist.search.MusicSearchResultFragment;
import com.bilibili.playset.playlist.ui.LoadingErrorEmptyView;
import os0.r;
import ps0.C8351a;
import qs0.p;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/search/MusicSearchResultFragment.class */
public class MusicSearchResultFragment extends androidx_fragment_app_Fragment implements C8351a.InterfaceC1341a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f85349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RecyclerView f85351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f85352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p f85353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LoadingErrorEmptyView f85354g;

    @Override // ps0.C8351a.InterfaceC1341a
    public final boolean hasNextPage() {
        return this.f85353f.f126324e;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ps0.C8351a.InterfaceC1341a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isLoading() {
        /*
            r3 = this;
            r0 = r3
            qs0.p r0 = r0.f85353f
            androidx.lifecycle.MutableLiveData<java.lang.Integer> r0 = r0.f126322c
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r6 = r0
            r0 = r6
            if (r0 != 0) goto L15
            goto L24
        L15:
            r0 = r6
            int r0 = r0.intValue()
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L24
            goto L26
        L24:
            r0 = 0
            r5 = r0
        L26:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.playlist.search.MusicSearchResultFragment.isLoading():boolean");
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f85350c = getArguments().getString("keyword");
            this.f85349b = getArguments().getLong("playlist_id");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(2131499724, viewGroup, false);
        this.f85351d = (RecyclerView) viewInflate.findViewById(2131308035);
        this.f85354g = (LoadingErrorEmptyView) viewInflate.findViewById(2131312942);
        this.f85351d.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView = this.f85351d;
        d.a aVar = new d.a(viewInflate.getContext());
        aVar.f84240b = new b(new ColorDrawable(getResources().getColor(R$color.Ga2)));
        aVar.f84241c = new c(ListExtentionsKt.toPx(0.5f));
        aVar.f84248g = new e(ListExtentionsKt.toPx(12.0f));
        aVar.f84243e = true;
        aVar.f84244f = true;
        recyclerView.addItemDecoration(aVar.a());
        this.f85351d.addOnScrollListener(new C8351a(this));
        r rVar = new r(p3());
        this.f85352e = rVar;
        rVar.f124968c = false;
        rVar.f124969d = 2;
        this.f85351d.setAdapter(rVar);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        p pVar = (p) new ViewModelProvider(this).get(p.class);
        this.f85353f = pVar;
        long j7 = this.f85349b;
        String str = this.f85350c;
        pVar.f126325f = j7;
        pVar.f126326g = str;
        pVar.f126323d = 1;
        if (TextUtils.isEmpty(str)) {
            pVar.J0();
        } else {
            pVar.K0();
        }
        this.f85353f.f126321b.observe(getViewLifecycleOwner(), new C5712a(1, this));
        this.f85353f.f126322c.observe(getViewLifecycleOwner(), new Observer(this) { // from class: qs0.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final MusicSearchResultFragment f126313a;

            {
                this.f126313a = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                MusicSearchResultFragment musicSearchResultFragment = this.f126313a;
                if (iIntValue == 0) {
                    musicSearchResultFragment.f85354g.setVisibility(8);
                    return;
                }
                if (iIntValue == 2) {
                    musicSearchResultFragment.f85354g.setVisibility(0);
                    LoadingErrorEmptyView loadingErrorEmptyView = musicSearchResultFragment.f85354g;
                    loadingErrorEmptyView.j(loadingErrorEmptyView.getContext().getApplicationContext().getString(2131842479));
                } else {
                    if (iIntValue != 3) {
                        musicSearchResultFragment.getClass();
                        return;
                    }
                    musicSearchResultFragment.f85354g.setVisibility(0);
                    if (ConnectivityMonitor.getInstance().isNetworkActive()) {
                        musicSearchResultFragment.f85354g.l(2131841408, new RunnableC5717f(musicSearchResultFragment, 1));
                    } else {
                        musicSearchResultFragment.f85354g.l(2131841695, new RunnableC5717f(musicSearchResultFragment, 1));
                    }
                }
            }
        });
        this.f85354g.setVisibility(0);
        LoadingErrorEmptyView loadingErrorEmptyView = this.f85354g;
        loadingErrorEmptyView.n(loadingErrorEmptyView.getContext().getApplicationContext().getString(2131842620));
    }

    @Override // ps0.C8351a.InterfaceC1341a
    public final void w0() {
        p pVar = this.f85353f;
        if (TextUtils.isEmpty(pVar.f126326g)) {
            pVar.J0();
        } else {
            pVar.K0();
        }
    }
}
