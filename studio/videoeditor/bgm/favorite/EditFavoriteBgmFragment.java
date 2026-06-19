package com.bilibili.studio.videoeditor.bgm.favorite;

import Xz0.d;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import com.bilibili.studio.videoeditor.bgm.Bgm;
import com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment;
import com.bilibili.studio.videoeditor.bgm.e;
import com.bilibili.studio.videoeditor.bgm.h;
import com.bilibili.studio.videoeditor.util.L;
import com.bilibili.studio.videoeditor.util.S;
import iB0.InterfaceC7538d;
import iB0.b;
import iB0.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/favorite/EditFavoriteBgmFragment.class */
public class EditFavoriteBgmFragment extends BaseBgmListFragment {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/favorite/EditFavoriteBgmFragment$a.class */
    public final class a implements InterfaceC7538d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f109076a;

        public a(c cVar) {
            this.f109076a = cVar;
        }

        @Override // iB0.InterfaceC7538d
        public final void a() {
            this.f109076a.b();
        }

        @Override // iB0.InterfaceC7538d
        public final void b(Bgm bgm) {
            this.f109076a.a(bgm);
        }
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final String hf() {
        return S.a(this.f108993e, 2131849434);
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment
    public final void nf() {
        L.a(this.f108995g, this.h, this.f108996i, getString(2131842070));
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f108991c.f109061i = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        a aVar = new a(new c(getContext(), this));
        e eVar = this.f108991c;
        if (eVar != null) {
            eVar.f109062j = aVar;
        }
    }

    public final void pf() {
        b bVar = b.d;
        Context context = getContext();
        bVar.getClass();
        ArrayList<Bgm> arrayListA = h.f109078b.a(context);
        bVar.b = arrayListA;
        b.c(2, arrayListA);
        List<Bgm> listB = bVar.b(true);
        int i7 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) listB;
            if (i7 >= arrayList.size()) {
                kf(listB);
                return;
            } else {
                ((Bgm) arrayList.get(i7)).category = "音乐库_收藏";
                i7++;
            }
        }
    }

    @Override // com.bilibili.studio.videoeditor.bgm.bgmlist.ui.fragment.BaseBgmListFragment, com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z6) {
        e eVar;
        super.setUserVisibleHint(z6);
        if (!z6 || (eVar = this.f108991c) == null) {
            return;
        }
        eVar.notifyDataSetChanged();
        d dVar = d.f28458a;
        String strHf = hf();
        dVar.getClass();
        d.C(strHf);
    }
}
