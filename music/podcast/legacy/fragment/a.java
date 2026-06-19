package com.bilibili.music.podcast.legacy.fragment;

import Bi0.C1431a;
import android.view.View;
import com.bilibili.app.authorspace.local.service.j;
import com.bilibili.droid.ToastHelper;
import com.bilibili.music.podcast.legacy.fragment.UPSpaceFragment;
import com.bilibili.music.podcast.legacy.upspace.AudioResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/legacy/fragment/a.class */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UPSpaceFragment.b f66872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UPSpaceFragment.a f66873b;

    public a(UPSpaceFragment.a aVar, UPSpaceFragment.b bVar) {
        this.f66873b = aVar;
        this.f66872a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int adapterPosition = this.f66872a.getAdapterPosition();
        if (adapterPosition < 0) {
            return;
        }
        AudioResponse.Audio audio = (AudioResponse.Audio) ((ArrayList) this.f66873b.f66864a.f66861j).get(adapterPosition);
        C1431a c1431aB = C1431a.b();
        long j7 = audio.id;
        long j8 = audio.uid;
        c1431aB.getClass();
        C1431a.a("000153", "song_click", j7 + "", j.a(j8, ""));
        if ((audio.limitation & (-9)) != 0) {
            ToastHelper.showToastShort(this.f66873b.f66864a.getContext(), audio.limitDesc);
        } else {
            this.f66873b.f66864a.jf(audio.id);
        }
    }
}
