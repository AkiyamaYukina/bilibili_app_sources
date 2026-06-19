package com.bilibili.studio.videoeditor.capturev3.bean;

import I.C2145f;
import IB0.b;
import androidx.annotation.Keep;
import com.bilibili.studio.videoeditor.capturev3.data.CaptureIntroBeanV3;
import com.bilibili.studio.videoeditor.capturev3.data.StickerListItemV3;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/bean/CaptureSticker.class */
@Keep
public class CaptureSticker {
    public boolean active;
    public List<CaptureIntroBeanV3> bubbleStickerList;
    public b capturePreResult;
    public long delayMillis;
    public boolean favoriteState;
    public boolean fromScheme;
    public boolean isFaceSegmentFx = false;
    public boolean isHumanFace;
    public boolean isV1;
    public ArrayList<StickerItemUpdateBean> itemUpdateList;
    public boolean needShow;
    public int operation;
    public String selectedFaceSegmentPath;
    public StickerListItemV3 selectedItem;
    public String selectedUploadPath;
    public int targetTabIndex;
    public int textResId;
    public int visibility;
    public int what;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/bean/CaptureSticker$StickerItemUpdateBean.class */
    @Keep
    public static class StickerItemUpdateBean {
        public int itemIndex;
        public Object payload;
        public int tabIndex;

        public StickerItemUpdateBean() {
        }

        public StickerItemUpdateBean(int i7, int i8) {
            this.tabIndex = i7;
            this.itemIndex = i8;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("StickerItemUpdateBean{tabIndex=");
            sb.append(this.tabIndex);
            sb.append(", itemIndex=");
            sb.append(this.itemIndex);
            sb.append(", payload=");
            return C2145f.a(sb, this.payload, '}');
        }
    }

    public CaptureSticker(int i7) {
        this.operation = i7;
    }
}
