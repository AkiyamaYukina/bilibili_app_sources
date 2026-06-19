package com.bilibili.search2.result.repo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.inline.biz.repository.InlineCardTaskRepository;
import com.bilibili.lib.sharewrapper.SocializeMedia;
import dt0.AbstractC6840c;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosBiz;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.ChronosScene;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;
import tv.danmaku.video.bilicardplayer.DataRelationShipChain;
import tv.danmaku.video.bilicardplayer.DataWorkInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/repo/SearchInlineRepository.class */
@StabilityInferred(parameters = 0)
public final class SearchInlineRepository extends InlineCardTaskRepository {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final AbstractC6840c f88512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final SearchInlineType f88513m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/repo/SearchInlineRepository$SearchInlineType.class */
    public static final class SearchInlineType {
        private static final EnumEntries $ENTRIES;
        private static final SearchInlineType[] $VALUES;
        public static final SearchInlineType UGC = new SearchInlineType("UGC", 0);
        public static final SearchInlineType OGV = new SearchInlineType("OGV", 1);
        public static final SearchInlineType LIVE = new SearchInlineType(SocializeMedia.BILI_LIVE, 2);

        private static final /* synthetic */ SearchInlineType[] $values() {
            return new SearchInlineType[]{UGC, OGV, LIVE};
        }

        static {
            SearchInlineType[] searchInlineTypeArr$values = $values();
            $VALUES = searchInlineTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(searchInlineTypeArr$values);
        }

        private SearchInlineType(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<SearchInlineType> getEntries() {
            return $ENTRIES;
        }

        public static SearchInlineType valueOf(String str) {
            return (SearchInlineType) Enum.valueOf(SearchInlineType.class, str);
        }

        public static SearchInlineType[] values() {
            return (SearchInlineType[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/result/repo/SearchInlineRepository$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f88514a;

        static {
            int[] iArr = new int[SearchInlineType.values().length];
            try {
                iArr[SearchInlineType.UGC.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[SearchInlineType.OGV.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[SearchInlineType.LIVE.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            f88514a = iArr;
        }
    }

    public SearchInlineRepository(@NotNull AbstractC6840c abstractC6840c, @NotNull SearchInlineType searchInlineType) {
        this.f88512l = abstractC6840c;
        this.f88513m = searchInlineType;
    }

    @NotNull
    public final DataRelationShipChain getChronosRelationShipChain() {
        return this.f88512l;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @NotNull
    public final Pair<ChronosScene, ChronosBiz> getChronosSceneAndBiz() throws NoWhenBranchMatchedException {
        Pair<ChronosScene, ChronosBiz> pair;
        int i7 = a.f88514a[this.f88513m.ordinal()];
        if (i7 == 1) {
            pair = new Pair<>(ChronosScene.SCENE_SEARCH_INLINE, ChronosBiz.BIZ_UGC);
        } else if (i7 == 2) {
            pair = new Pair<>(ChronosScene.SCENE_SEARCH_INLINE, ChronosBiz.BIZ_OGV);
        } else {
            if (i7 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair<>(ChronosScene.SCENE_SEARCH_INLINE, ChronosBiz.BIZ_LIVE);
        }
        return pair;
    }

    @NotNull
    public final DataWorkInfo getChronosWorkInfo() {
        return this.f88512l;
    }

    public final void onUpdateStaffFollowState(@NotNull List<UpdateVideoDetailState.FollowState> list) {
        for (UpdateVideoDetailState.FollowState followState : list) {
            AbstractC6840c abstractC6840c = this.f88512l;
            if (Intrinsics.areEqual(String.valueOf(abstractC6840c.getUpMid()), followState.getMid())) {
                abstractC6840c.setIsFollow(followState.getState());
            }
        }
    }
}
