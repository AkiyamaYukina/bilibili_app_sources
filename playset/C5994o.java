package com.bilibili.playset;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.okretro.ServiceGenerator;
import com.bilibili.playset.api.FootData;
import com.bilibili.playset.api.PlaySetGroup;
import com.bilibili.playset.api.PlaySetService;
import ls0.C7889a;

/* JADX INFO: renamed from: com.bilibili.playset.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/o.class */
public final class C5994o extends C7889a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f85171i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f85172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f85173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f85174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f85175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public com.bilibili.app.authorspace.ui.pages.y f85176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PlaySetGroup f85177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FootData f85178g;
    public a h;

    /* JADX INFO: renamed from: com.bilibili.playset.o$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/o$a.class */
    public final class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5994o f85179a;

        public a(C5994o c5994o) {
            this.f85179a = c5994o;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            C5994o c5994o = this.f85179a;
            com.bilibili.app.authorspace.ui.pages.y yVar = c5994o.f85176e;
            PlaySetGroup playSetGroup = c5994o.f85177f;
            yVar.getClass();
            long j7 = playSetGroup.id;
            Fragment fragment = yVar.c;
            if (j7 == 1) {
                if (playSetGroup.isLoading) {
                    return;
                }
                playSetGroup.isLoading = true;
                c5994o.f85178g.f84038a = 2;
                c5994o.r0();
                String accessKey = BiliAccounts.get(fragment.getContext()).getAccessKey();
                int i7 = playSetGroup.curPage + 1;
                playSetGroup.curPage = i7;
                ((PlaySetService) ServiceGenerator.createService(PlaySetService.class)).getCreatedPlaySet(accessKey, yVar.d, i7, 20, null, null).enqueue(new com.bilibili.app.authorspace.ui.pages.u<>(yVar, c5994o, playSetGroup));
                return;
            }
            if (j7 != 2 || playSetGroup.isLoading) {
                return;
            }
            playSetGroup.isLoading = true;
            c5994o.f85178g.f84038a = 2;
            c5994o.r0();
            String accessKey2 = BiliAccounts.get(fragment.getContext()).getAccessKey();
            PlaySetService playSetService = (PlaySetService) ServiceGenerator.createService(PlaySetService.class);
            int i8 = playSetGroup.curPage + 1;
            playSetGroup.curPage = i8;
            playSetService.getFavPlaySet(accessKey2, yVar.d, i8, 20).enqueue(new com.bilibili.app.authorspace.ui.pages.v(yVar, c5994o, playSetGroup));
        }
    }

    public final void p0() {
        this.f85172a.setVisibility(8);
        this.f85173b.setVisibility(8);
        this.f85174c.setVisibility(8);
        this.f85175d.setVisibility(8);
        this.itemView.setOnClickListener(null);
    }

    public final void q0() {
        this.f85172a.setVisibility(0);
        this.f85173b.setVisibility(0);
        this.f85174c.setVisibility(0);
        this.f85175d.setVisibility(8);
        this.itemView.setOnClickListener(this.h);
    }

    public final void r0() {
        this.f85172a.setVisibility(8);
        this.f85173b.setVisibility(8);
        this.f85174c.setVisibility(8);
        this.f85175d.setVisibility(0);
        this.itemView.setOnClickListener(null);
    }
}
