package com.bilibili.music.podcast.collection.data;

import androidx.annotation.Keep;
import com.bapis.bilibili.app.listener.v1.FavFolder;
import com.bapis.bilibili.app.listener.v1.FavFolderListResp;
import com.bilibili.music.podcast.collection.data.FavFolderItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/FavFolderListRespResult.class */
@Keep
public final class FavFolderListRespResult {

    @NotNull
    public static final a Companion = new Object();

    @Nullable
    private List<FavFolderItem> list;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/collection/data/FavFolderListRespResult$a.class */
    public static final class a {
        @NotNull
        public static FavFolderItem a(@NotNull FavFolder favFolder) {
            FavFolderItem favFolderItem = new FavFolderItem();
            favFolderItem.setId(favFolder.getFid());
            favFolderItem.setType(favFolder.getFolderType());
            favFolderItem.setTitle(favFolder.getName());
            favFolderItem.setCover(favFolder.getCover());
            favFolderItem.setIntro(favFolder.getDesc());
            favFolderItem.setCount(favFolder.getCount());
            favFolderItem.setAttr(favFolder.getAttr());
            favFolderItem.setValid(favFolder.getState());
            favFolderItem.setFavState(favFolder.getFavState());
            favFolderItem.setCtime(favFolder.getCtime());
            favFolderItem.setMtime(favFolder.getMtime());
            favFolderItem.setFavCount(favFolder.getStatFavCnt());
            favFolderItem.setShareCount(favFolder.getStatShareCnt());
            favFolderItem.setLikeCount(favFolder.getStatLikeCnt());
            favFolderItem.setPlayCount(favFolder.getStatPlayCnt());
            favFolderItem.setReplyCount(favFolder.getStatReplyCnt());
            FavFolderItem.Upper upper = new FavFolderItem.Upper();
            upper.setMid(favFolder.getOwner().getMid());
            upper.setName(favFolder.getOwner().getName());
            favFolderItem.setUpper(upper);
            return favFolderItem;
        }
    }

    public FavFolderListRespResult() {
    }

    public FavFolderListRespResult(@NotNull FavFolderListResp favFolderListResp) {
        ArrayList arrayList;
        List listList = favFolderListResp.getListList();
        if (listList != null) {
            List list = listList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (true) {
                arrayList = arrayList2;
                if (!it.hasNext()) {
                    break;
                }
                FavFolder favFolder = (FavFolder) it.next();
                Companion.getClass();
                arrayList2.add(a.a(favFolder));
            }
        } else {
            arrayList = null;
        }
        this.list = arrayList;
    }

    @Nullable
    public final List<FavFolderItem> getList() {
        return this.list;
    }

    public final void setList(@Nullable List<FavFolderItem> list) {
        this.list = list;
    }
}
