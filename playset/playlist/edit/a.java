package com.bilibili.playset.playlist.edit;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.playset.InterfaceC5990m;
import javax.inject.Named;
import javax.inject.Singleton;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.bili.ui.watchlater.viewmodel.WatchLaterViewModel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/playlist/edit/a.class */
@Singleton
@StabilityInferred(parameters = 1)
@Named("FAVORITE_SERVICE")
public final class a implements InterfaceC5990m {
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment, com.bilibili.playset.playlist.edit.FavoriteSingleBottomSheet] */
    @Override // com.bilibili.playset.InterfaceC5990m
    public final void a(int i7, @NotNull WatchLaterViewModel.onAction.1.a aVar) {
        ?? favoriteSingleBottomSheet = new FavoriteSingleBottomSheet();
        favoriteSingleBottomSheet.f85200c = aVar;
        Bundle bundleA = com.bilibili.biligame.router.k.a(i7, 0, "key_select_num", "key_op_type");
        bundleA.putBoolean("key_from_other", true);
        favoriteSingleBottomSheet.setArguments(bundleA);
        favoriteSingleBottomSheet.show(null, FavoriteSingleBottomSheet.class.getName());
    }
}
