package com.bilibili.playset.api;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import java.util.ArrayList;
import java.util.List;
import ks0.AbstractC7785a;
import ks0.InterfaceC7786b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetGroups.class */
@Keep
public class PlaySetGroups {
    public static final int GROUP_DEFAULT = 0;

    @JSONField(deserialize = false, serialize = false)
    public int curPage = 1;

    @Nullable
    @JSONField(name = "default_folder")
    public DefaultFolderGroup defaultFolderGroup;

    @JSONField(deserialize = false, serialize = false)
    public boolean isLoading;

    @Nullable
    @JSONField(name = "space_infos")
    public List<OtherFolderGroup> otherFolderGroups;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetGroups$DefaultFolderGroup.class */
    @Keep
    public static class DefaultFolderGroup extends AbstractC7785a<InterfaceC7786b> {

        @Nullable
        @JSONField(name = "folder_detail")
        public PlaySet detail;

        @JSONField(name = "has_more")
        public boolean hasMore;

        @Nullable
        @JSONField(deserialize = false, serialize = false)
        private List<InterfaceC7786b> items;

        @Nullable
        @JSONField(name = "medias")
        public List<MultitypeMedia> medias;

        @Override // ks0.AbstractC7785a
        public void addItems(@NonNull List<InterfaceC7786b> list) {
            if (this.medias == null) {
                this.medias = new ArrayList();
            }
            int size = getItems().size();
            int i7 = size;
            if (size > 0) {
                i7 = size;
                if (getItems().get(size - 1) instanceof f) {
                    i7 = size - 1;
                }
            }
            getItems().addAll(i7, list);
        }

        @Override // ks0.AbstractC7785a
        public int getGroupType() {
            return 0;
        }

        @Override // ks0.AbstractC7785a, ls0.c
        public int getItemCount() {
            List<InterfaceC7786b> list = this.items;
            return list == null ? 0 : list.size();
        }

        @Override // ls0.c
        @NonNull
        public List<InterfaceC7786b> getItems() {
            if (this.items == null) {
                ArrayList arrayList = new ArrayList();
                this.items = arrayList;
                List<MultitypeMedia> list = this.medias;
                if (list != null) {
                    arrayList.addAll(list);
                }
            }
            return this.items;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("DefaultFolderGroup{hasMore = ");
            sb.append(this.hasMore);
            sb.append(", items.size =");
            List<InterfaceC7786b> list = this.items;
            sb.append(list == null ? "null" : Integer.valueOf(list.size()));
            sb.append(", getItemCount = ");
            sb.append(getItemCount());
            sb.append('}');
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/api/PlaySetGroups$OtherFolderGroup.class */
    @Keep
    public static class OtherFolderGroup extends AbstractC7785a<InterfaceC7786b> {
        public static final int GROUP_CREATED = 1;
        public static final int GROUP_FAVORITE = 2;
        public static final int GROUP_PAY = 4;
        public static final int GROUP_WATCH_LATER = 3;

        @JSONField(deserialize = false, serialize = false)
        public int curPage = 1;

        @JSONField(name = "id")
        public long id;

        @JSONField(deserialize = false, serialize = false)
        public boolean isLoading;

        @Nullable
        @JSONField(deserialize = false, serialize = false)
        private List<InterfaceC7786b> items;

        @JSONField(name = "name")
        public String name;

        @JSONField(name = "mediaListResponse")
        public PlaySetPageData pageData;

        @JSONField(name = EditCustomizeSticker.TAG_URI)
        public String uri;

        @Override // ks0.AbstractC7785a
        @JSONField(deserialize = false, serialize = false)
        public void addItems(@NonNull List<InterfaceC7786b> list) {
            if (this.pageData == null) {
                this.pageData = new PlaySetPageData();
            }
            PlaySetPageData playSetPageData = this.pageData;
            if (playSetPageData.list == null) {
                playSetPageData.list = new ArrayList();
            }
            int size = getItems().size();
            int i7 = size;
            if (getItems().get(size - 1) instanceof f) {
                i7 = size - 1;
            }
            getItems().addAll(i7, list);
        }

        @Override // ks0.AbstractC7785a
        public int getGroupType() {
            return Long.valueOf(this.id).intValue();
        }

        @Override // ks0.AbstractC7785a, ls0.c
        @JSONField(deserialize = false, serialize = false)
        public int getItemCount() {
            return getItems().size();
        }

        @Override // ls0.c
        @JSONField(deserialize = false, serialize = false)
        public List<InterfaceC7786b> getItems() {
            List<PlaySet> list;
            if (this.items == null) {
                ArrayList arrayList = new ArrayList();
                this.items = arrayList;
                PlaySetPageData playSetPageData = this.pageData;
                if (playSetPageData != null && (list = playSetPageData.list) != null) {
                    arrayList.addAll(list);
                }
            }
            return this.items;
        }

        @Override // ks0.AbstractC7785a
        @JSONField(deserialize = false, serialize = false)
        public int getTotalCount() {
            PlaySetPageData playSetPageData = this.pageData;
            if (playSetPageData == null) {
                return 0;
            }
            return playSetPageData.totalCount;
        }

        @Override // ks0.AbstractC7785a
        @JSONField(deserialize = false, serialize = false)
        public void setTotalCount(int i7) {
            if (this.pageData == null) {
                this.pageData = new PlaySetPageData();
            }
            this.pageData.totalCount = i7;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("OtherFolderGroup{hasMore = ");
            PlaySetPageData playSetPageData = this.pageData;
            sb.append(playSetPageData == null ? "null" : Boolean.valueOf(playSetPageData.hasMore));
            sb.append(", items.size =");
            List<InterfaceC7786b> list = this.items;
            sb.append(list == null ? "null" : Integer.valueOf(list.size()));
            sb.append(", getItemCount = ");
            sb.append(getItemCount());
            sb.append('}');
            return sb.toString();
        }
    }
}
