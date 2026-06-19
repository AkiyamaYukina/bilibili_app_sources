package com.bilibili.music.podcast.data;

import android.app.Application;
import android.content.res.Resources;
import com.bapis.bilibili.app.listener.v1.FavFolder;
import com.bapis.bilibili.app.listener.v1.FavFolderDetailReq;
import com.bapis.bilibili.app.listener.v1.FavFolderListResp;
import com.bapis.bilibili.app.listener.v1.ListenerMoss;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.moss.api.CallOptions;
import com.bilibili.music.podcast.collection.api.PlaySet;
import com.bilibili.music.podcast.collection.api.PlaySetGroups;
import java.util.ArrayList;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/data/m.class */
public final class m extends com.bilibili.music.podcast.moss.a<PlaySetGroups, FavFolderListResp> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MusicCollectionViewModel f66478c;

    public m(long j7, MusicCollectionViewModel musicCollectionViewModel) {
        this.f66477b = j7;
        this.f66478c = musicCollectionViewModel;
    }

    @Override // com.bilibili.music.podcast.moss.a
    public final PlaySetGroups d(FavFolderListResp favFolderListResp) {
        Resources resources;
        FavFolderListResp favFolderListResp2 = favFolderListResp;
        PlaySetGroups playSetGroups = null;
        if (favFolderListResp2 != null) {
            PlaySetGroups playSetGroups2 = new PlaySetGroups();
            playSetGroups2.defaultFolderGroup = new PlaySetGroups.DefaultFolderGroup();
            playSetGroups2.otherFolderGroups = new ArrayList();
            Application application = BiliContext.application();
            PlaySetGroups.OtherFolderGroup otherFolderGroup = new PlaySetGroups.OtherFolderGroup();
            otherFolderGroup.id = 1L;
            otherFolderGroup.name = (application == null || (resources = application.getResources()) == null) ? null : resources.getString(2131842467);
            List<PlaySetGroups.OtherFolderGroup> list = playSetGroups2.otherFolderGroups;
            if (list != null) {
                list.add(otherFolderGroup);
            }
            PlaySetGroups.OtherFolderGroup otherFolderGroup2 = new PlaySetGroups.OtherFolderGroup();
            String string = null;
            if (application != null) {
                Resources resources2 = application.getResources();
                string = null;
                if (resources2 != null) {
                    string = resources2.getString(2131842500);
                }
            }
            otherFolderGroup2.name = string;
            otherFolderGroup2.id = 2L;
            List<PlaySetGroups.OtherFolderGroup> list2 = playSetGroups2.otherFolderGroups;
            if (list2 != null) {
                list2.add(otherFolderGroup2);
            }
            List listList = favFolderListResp2.getListList();
            if (listList != null) {
                List<FavFolder> list3 = listList;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                for (FavFolder favFolder : list3) {
                    int attr = favFolder.getAttr();
                    long mid = favFolder.getOwner().getMid();
                    if ((attr & 2) == 0 && mid == this.f66477b) {
                        PlaySetGroups.DefaultFolderGroup defaultFolderGroup = playSetGroups2.defaultFolderGroup;
                        if (defaultFolderGroup != null) {
                            defaultFolderGroup.setTotalCount(favFolder.getCount());
                            PlaySet playSet = new PlaySet();
                            playSet.id = favFolder.getFid();
                            playSet.folderType = favFolder.getFolderType();
                            playSet.coverType = favFolder.getFolderType();
                            playSet.favorite = favFolder.getFavored();
                            playSet.intro = favFolder.getDesc();
                            playSet.title = favFolder.getName();
                            playSet.valid = favFolder.getState();
                            defaultFolderGroup.detail = playSet;
                        }
                    } else {
                        PlaySet playSet2 = new PlaySet();
                        playSet2.id = favFolder.getFid();
                        playSet2.attr = favFolder.getAttr();
                        playSet2.cover = favFolder.getCover();
                        playSet2.intro = favFolder.getDesc();
                        playSet2.title = favFolder.getName();
                        playSet2.count = favFolder.getCount();
                        playSet2.valid = favFolder.getState();
                        playSet2.favorite = favFolder.getFavored();
                        playSet2.type = favFolder.getFolderType();
                        playSet2.coverType = favFolder.getFolderType();
                        playSet2.folderType = favFolder.getFolderType();
                        playSet2.playCount = favFolder.getStatPlayCnt();
                        playSet2.isVt = favFolder.getUseViewVt();
                        playSet2.viewContent = favFolder.getViewVtText();
                        if (favFolder.hasOwner()) {
                            PlaySet.Upper upper = new PlaySet.Upper();
                            upper.mid = favFolder.getOwner().getMid();
                            upper.name = favFolder.getOwner().getName();
                            playSet2.upper = upper;
                        }
                        long jA = com.bilibili.adcommon.utils.a.a();
                        if (!favFolder.hasOwner() || favFolder.getOwner().getMid() != jA) {
                            otherFolderGroup2.addItem(playSet2);
                        } else if (favFolder.getFavored() == 1) {
                            otherFolderGroup2.addItem(playSet2);
                        } else {
                            otherFolderGroup.addItem(playSet2);
                        }
                    }
                    arrayList.add(Unit.INSTANCE);
                }
            }
            otherFolderGroup.setTotalCount(otherFolderGroup.getItemCount());
            otherFolderGroup2.setTotalCount(otherFolderGroup2.getItemCount());
            playSetGroups = playSetGroups2;
        }
        return playSetGroups;
    }

    @Override // com.bilibili.okretro.BiliApiDataCallback
    public final void onDataSuccess(Object obj) {
        PlaySet playSet;
        PlaySetGroups playSetGroups = (PlaySetGroups) obj;
        if (playSetGroups == null) {
            BLog.d("FavFolderListResp has no data !");
        }
        List<PlaySetGroups.OtherFolderGroup> list = playSetGroups != null ? playSetGroups.otherFolderGroups : null;
        MusicCollectionViewModel musicCollectionViewModel = this.f66478c;
        if (list != null) {
            PlaySetGroups.DefaultFolderGroup defaultFolderGroup = playSetGroups.defaultFolderGroup;
            PlaySet playSet2 = null;
            if (defaultFolderGroup != null) {
                playSet2 = defaultFolderGroup.detail;
            }
            if (playSet2 != null) {
                if (defaultFolderGroup == null || (playSet = defaultFolderGroup.detail) == null) {
                    return;
                }
                musicCollectionViewModel.getClass();
                long j7 = playSet.id;
                int i7 = playSet.folderType;
                l lVar = new l(musicCollectionViewModel, playSetGroups);
                new ListenerMoss((String) null, 0, (CallOptions) null, 7, (DefaultConstructorMarker) null).favFolderDetail(FavFolderDetailReq.newBuilder().setFid(j7).setFolderType(i7).build(), new com.bilibili.music.podcast.moss.d(lVar, lVar));
                return;
            }
        }
        musicCollectionViewModel.f66418b.setValue(TuplesKt.to(1, playSetGroups));
    }

    @Override // com.bilibili.okretro.BiliApiCallback
    public final void onError(Throwable th) {
        String message = null;
        this.f66478c.f66418b.setValue(TuplesKt.to(2, (Object) null));
        if (th != null) {
            message = th.getMessage();
        }
        BLog.i("MusicCollectionViewModel", message);
    }
}
