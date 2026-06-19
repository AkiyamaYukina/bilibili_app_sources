package com.bilibili.ship.theseus.playlist.miniplayer;

import android.net.Uri;
import android.os.Bundle;
import com.bilibili.ship.theseus.playlist.PlaylistOrderEnum;
import com.bilibili.ship.theseus.playlist.PlaylistRepository;
import com.bilibili.ship.theseus.playlist.api.MultiTypeMedia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kj0.h;
import kj0.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/miniplayer/a.class */
public final class a {

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.miniplayer.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/miniplayer/a$a.class */
    public static final /* synthetic */ class C0791a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f95774a;

        static {
            int[] iArr = new int[PlaylistOrderEnum.values().length];
            try {
                iArr[PlaylistOrderEnum.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[PlaylistOrderEnum.RANDOM.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[PlaylistOrderEnum.LATEST_PUBLISH.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[PlaylistOrderEnum.MOST_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[PlaylistOrderEnum.REVERSE.ordinal()] = 5;
            } catch (NoSuchFieldError e11) {
            }
            f95774a = iArr;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public static final Bundle a(@NotNull PlaylistRepository playlistRepository) throws NoWhenBranchMatchedException {
        String str;
        Bundle bundle = new Bundle();
        int i7 = C0791a.f95774a[playlistRepository.f().ordinal()];
        if (i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4) {
            str = "1";
        } else {
            if (i7 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str = "0";
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse("bilibili://music/playlist/playpage/" + playlistRepository.f95085H).buildUpon().appendQueryParameter("page_type", String.valueOf(playlistRepository.f95087J)).appendQueryParameter("desc", str).appendQueryParameter("sort_field", String.valueOf(playlistRepository.f95086I)).appendQueryParameter("asc", String.valueOf(playlistRepository.f95090M == 1)).appendQueryParameter("only_un_view", String.valueOf(playlistRepository.f95089L == 1)).appendQueryParameter("fold_way", playlistRepository.f95100g);
        if (playlistRepository.f95092O) {
            Map<String, List<h>> map = j.f122838a;
            List<MultiTypeMedia> listD = playlistRepository.d();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add(Ou0.a.a((MultiTypeMedia) it.next()));
            }
            String strValueOf = String.valueOf(System.identityHashCode(arrayList));
            j.f122838a.put(strValueOf, arrayList);
            builderAppendQueryParameter.appendQueryParameter("offline_data_kay", strValueOf);
        }
        if (playlistRepository.f95099f) {
            builderAppendQueryParameter.appendQueryParameter("sort_way", "publish_play");
        }
        bundle.putString("play_list_mini2detail_router_url", builderAppendQueryParameter.build().toString());
        return bundle;
    }
}
