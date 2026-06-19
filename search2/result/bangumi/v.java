package com.bilibili.search2.result.bangumi;

import Ps0.InterfaceC2789j;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.image2.view.BiliImageView;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.bilibili.search2.api.EpisodeNew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/bangumi/v.class */
@StabilityInferred(parameters = 0)
public final class v<T extends InterfaceC2789j> extends u<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TintTextView f87467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BiliImageView f87468g;

    public v(@NotNull View view) {
        super(view);
        this.f87467f = (TintTextView) view.findViewById(2131302792);
        this.f87468g = view.findViewById(2131298941);
    }

    @Override // com.bilibili.search2.result.bangumi.u
    public final void p0(@NotNull T t7, boolean z6, int i7) {
        super.p0(t7, false, i7);
        if (t7 instanceof EpisodeNew) {
            EpisodeNew episodeNew = (EpisodeNew) t7;
            com.bilibili.search2.utils.extension.c.a(this.f87468g, episodeNew.getCover(), null, false, null, null, 0, 0, 254);
            this.f87467f.setText(episodeNew.getLabel());
        }
    }
}
