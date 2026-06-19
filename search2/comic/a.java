package com.bilibili.search2.comic;

import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.search2.result.all.p;
import com.bilibili.search2.result.holder.comic.ComicNewHolder;
import dt0.AbstractC6843f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/comic/a.class */
@StabilityInferred(parameters = 0)
public final class a extends p {
    @Override // com.bilibili.search2.result.all.p, com.bilibili.search2.result.all.AbstractC6048b
    @Nullable
    /* JADX INFO: renamed from: Z */
    public final AbstractC6843f P(int i7, @NotNull ViewGroup viewGroup) {
        ComicNewHolder comicNewHolderCreate = ComicNewHolder.f88082f.create(viewGroup);
        comicNewHolderCreate.bindFragment(comicNewHolderCreate.getFragment());
        return comicNewHolderCreate;
    }
}
