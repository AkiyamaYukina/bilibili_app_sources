package com.bilibili.studio.editor.moudle.sticker.v1;

import C0.d;
import Mz0.b;
import android.app.Application;
import android.content.ContentValues;
import android.support.v4.media.session.a;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.autofill.r;
import com.bilibili.base.BiliContext;
import java.io.Serializable;
import java.util.Objects;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/sticker/v1/EditCustomizeSticker.class */
@Keep
public class EditCustomizeSticker implements Serializable, Comparable<EditCustomizeSticker> {
    public static String PREVIEW_FILENAME_SUFFIX = "preview";
    public static final String TAG_DURATION = "duration";
    public static final String TAG_ID = "sticker_id";
    public static final String TAG_MID = "mid";
    public static final String TAG_ORIGIN_FILE_PATH = "origin_file_path";
    public static final String TAG_PATH = "file_path";
    public static final String TAG_RANK = "rank";
    public static final String TAG_TEMPLATE_ID = "template_id";
    public static final String TAG_URI = "uri";
    public long duration;

    @Nullable
    public String filePath;
    public long mid;

    @Nullable
    public String originFilePath;

    @Nullable
    public String previewUri;
    public int rank;
    public long sticker_id;

    @Nullable
    public String templateId;
    public String uri;

    public EditCustomizeSticker() {
        this.uri = "";
        this.sticker_id = System.currentTimeMillis();
    }

    public EditCustomizeSticker(MediaFile mediaFile) {
        this();
        this.originFilePath = mediaFile.filePath;
    }

    public static String combinePreviewFileName(String str) {
        return C8770a.a(d.a(str, "_"), PREVIEW_FILENAME_SUFFIX, ".png");
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditCustomizeSticker m10138clone() {
        EditCustomizeSticker editCustomizeSticker = new EditCustomizeSticker();
        editCustomizeSticker.sticker_id = this.sticker_id;
        editCustomizeSticker.filePath = this.filePath;
        editCustomizeSticker.originFilePath = this.originFilePath;
        editCustomizeSticker.uri = this.uri;
        editCustomizeSticker.rank = this.rank;
        editCustomizeSticker.templateId = this.templateId;
        editCustomizeSticker.mid = this.mid;
        editCustomizeSticker.previewUri = this.previewUri;
        editCustomizeSticker.duration = this.duration;
        return editCustomizeSticker;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull EditCustomizeSticker editCustomizeSticker) {
        return Integer.compare(editCustomizeSticker.rank, this.rank);
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditCustomizeSticker)) {
            return false;
        }
        EditCustomizeSticker editCustomizeSticker = (EditCustomizeSticker) obj;
        if (this.sticker_id != editCustomizeSticker.sticker_id || this.rank != editCustomizeSticker.rank || this.mid != editCustomizeSticker.mid || this.duration != editCustomizeSticker.duration || !Objects.equals(this.filePath, editCustomizeSticker.filePath) || !Objects.equals(this.originFilePath, editCustomizeSticker.originFilePath) || !Objects.equals(this.uri, editCustomizeSticker.uri) || !Objects.equals(this.previewUri, editCustomizeSticker.previewUri) || !Objects.equals(this.templateId, editCustomizeSticker.templateId)) {
            z6 = false;
        }
        return z6;
    }

    public String getAvailablePreviewUri() {
        return !TextUtils.isEmpty(this.previewUri) ? this.previewUri : this.uri;
    }

    public String getPreviewFilePathNew() {
        Application application = BiliContext.application();
        if (application == null) {
            return "";
        }
        StringBuilder sbA = r.a(b.c(application));
        sbA.append(combinePreviewFileName(String.valueOf(this.sticker_id)));
        return sbA.toString();
    }

    public ContentValues toContentValues() {
        ContentValues contentValues = new ContentValues();
        contentValues.put(TAG_ID, Long.valueOf(this.sticker_id));
        contentValues.put(TAG_PATH, this.filePath);
        contentValues.put(TAG_URI, this.uri);
        contentValues.put(TAG_RANK, Integer.valueOf(this.rank));
        contentValues.put(TAG_ORIGIN_FILE_PATH, this.originFilePath);
        contentValues.put(TAG_TEMPLATE_ID, this.templateId);
        contentValues.put(TAG_DURATION, Long.valueOf(this.duration));
        return contentValues;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("sticker_id : ");
        sb.append(this.sticker_id);
        sb.append("\nfile_path : ");
        sb.append(this.filePath);
        sb.append("\nuri : ");
        sb.append(this.uri);
        sb.append("\nrank : ");
        sb.append(this.rank);
        sb.append("\norigin_file_path : ");
        sb.append(this.originFilePath);
        sb.append("\ntemplate_id : ");
        sb.append(this.templateId);
        sb.append("\nmid : ");
        sb.append(this.mid);
        sb.append("\nduration : ");
        return a.a(sb, this.duration, "\n");
    }
}
