package com.bilibili.studio.videoeditor.capturev3.data;

import O4.a;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureTemplateEntity.class */
@Keep
public class CaptureTemplateEntity {

    @DrawableRes
    public int coverId;
    public int id;
    public boolean isSelected;
    public String name;

    public CaptureTemplateEntity(int i7, String str, @DrawableRes int i8, boolean z6) {
        this.id = i7;
        this.name = str;
        this.coverId = i8;
        this.isSelected = z6;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (this.id != ((CaptureTemplateEntity) obj).id) {
            z6 = false;
        }
        return z6;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CaptureTemplateEntity{id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', coverId=");
        sb.append(this.coverId);
        sb.append(", isSelected=");
        return a.b(sb, this.isSelected, '}');
    }
}
