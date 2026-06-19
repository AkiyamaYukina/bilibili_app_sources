package com.bilibili.live.streaming.sources;

import com.bilibili.live.streaming.FilterFactory;
import com.bilibili.live.streaming.filter.FilterBase;
import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.gl.BGLException;
import com.bilibili.live.streaming.gl.BGLMatrix;
import com.bilibili.live.streaming.gl.BGLTransState;
import com.bilibili.live.streaming.gl.BGLUtil;
import com.bilibili.live.streaming.gl.Shaders;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.source.CommonSource;
import com.bilibili.search2.result.vertical.live.report.ReporterMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/sources/SceneSource.class */
public class SceneSource extends FilterBase {
    public static final String ID = "SceneSource";
    public static final String KEY_FilterData = "Filter";
    public static final String KEY_FitMode = "FitMode";
    public static final String KEY_IsShow = "IsShow";
    public static final String KEY_ItemHeight = "ItemHeight";
    public static final String KEY_ItemLeft = "ItemLeft";
    public static final String KEY_ItemScale = "ItemScale";
    public static final String KEY_ItemTop = "ItemTop";
    public static final String KEY_ItemWidth = "ItemWidth";
    public static final String KEY_Opacity = "Opacity";
    public static final String KEY_RenderFlags = "RenderFlags";
    public static final String KEY_SceneHeight = "SceneHeight";
    public static final String KEY_SceneItems = "SceneItems";
    public static final String KEY_SceneWidth = "SceneWidth";
    public static final String KEY_XAlign = "XAlign";
    public static final String KEY_YAlign = "YAlign";
    public static final String TAG = "SceneSource";
    static final String VAL_FitModeFill = "FitFill";
    static final String VAL_FitModeHeight = "FitHeight";
    static final String VAL_FitModeInner = "FitInner";
    static final String VAL_FitModeNoFit = "NoFit";
    static final String VAL_FitModeOuter = "FitOuter";
    static final String VAL_FitModeWidth = "FitWidth";
    private int mHeight;
    private ArrayList<Item> mSceneItems;
    private int mWidth;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/sources/SceneSource$Item.class */
    public class Item {
        public static final int FIT_FORCE = 4;
        public static final int FIT_HEIGHT = 6;
        public static final int FIT_INNER = 2;
        public static final int FIT_NOFIT = 1;
        public static final int FIT_OUTER = 3;
        public static final int FIT_WIDTH = 5;
        public Integer fitMode;
        public int height;
        public boolean isShow;
        public float opacity;
        public int posX;
        public int posY;
        public int renderFlags;
        public float scale;
        public IVideoSource source;
        final SceneSource this$0;
        public int width;
        public float xAlign;
        public float yAlign;

        public Item(SceneSource sceneSource) {
            this.this$0 = sceneSource;
        }

        public boolean isPointInRect(int i7, int i8) {
            int i9;
            int i10 = this.posX;
            return i10 <= i7 && (i9 = this.posY) <= i8 && i10 + this.width > i7 && i9 + this.height > i8;
        }

        public String toItemString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.posX);
            sb.append(",");
            sb.append(this.posY);
            sb.append(" ");
            sb.append(this.width);
            sb.append("x");
            sb.append(this.height);
            sb.append(" ");
            sb.append(this.renderFlags);
            if (this.source instanceof CommonSource) {
                sb.append(" id:");
                sb.append(((CommonSource) this.source).getSourceId());
            }
            IVideoSource iVideoSource = this.source;
            if (iVideoSource instanceof FilterBase) {
                sb.append(" {");
                sb.append(((FilterBase) this.source).toSourceString());
                sb.append(ReporterMap.RIGHT_BRACES);
            } else {
                sb.append(iVideoSource.toString());
            }
            return sb.toString();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/sources/SceneSource$ItemRenderMode.class */
    public enum ItemRenderMode {
        RENDER_CONTENT,
        RENDER_BORDER
    }

    public static String FromFitMode(Integer num) {
        if (num.intValue() == 1) {
            return VAL_FitModeNoFit;
        }
        if (num.intValue() == 4) {
            return VAL_FitModeFill;
        }
        if (num.intValue() == 3) {
            return VAL_FitModeOuter;
        }
        if (num.intValue() == 5) {
            return VAL_FitModeWidth;
        }
        if (num.intValue() == 6) {
            return VAL_FitModeHeight;
        }
        return null;
    }

    public static Integer ToFitMode(String str) {
        if (str.equals(VAL_FitModeNoFit)) {
            return 1;
        }
        if (str.equals(VAL_FitModeFill)) {
            return 4;
        }
        if (str.equals(VAL_FitModeOuter)) {
            return 3;
        }
        if (str.equals(VAL_FitModeWidth)) {
            return 5;
        }
        return str.equals(VAL_FitModeHeight) ? 6 : null;
    }

    public static JSONObject generateConfig(String str, int i7, int i8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FilterFactory.KEY_FilterID, "SceneSource");
            jSONObject.put(FilterFactory.KEY_FilterName, str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(KEY_SceneWidth, i7);
            jSONObject2.put(KEY_SceneHeight, i8);
            jSONObject.put(FilterFactory.KEY_FilterConfig, jSONObject2);
            LivePusherLog.i("SceneSource", "generateConfig content: " + jSONObject, null);
            return jSONObject;
        } catch (Exception e7) {
            LivePusherLog.i("SceneSource", "generateConfig filed!!!", e7);
            return null;
        }
    }

    private Item loadItemConfig(JSONObject jSONObject) {
        IVideoSource iVideoSourceDeserializeFilter;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_FilterData);
            iVideoSourceDeserializeFilter = jSONObjectOptJSONObject != null ? FilterFactory.inst().deserializeFilter(this.mCtx, jSONObjectOptJSONObject) : null;
            try {
                Item itemCreateItem = createItem(iVideoSourceDeserializeFilter);
                itemCreateItem.scale = (float) jSONObject.optDouble(KEY_ItemScale, 1.0d);
                itemCreateItem.posX = jSONObject.getInt(KEY_ItemLeft);
                itemCreateItem.posY = jSONObject.getInt(KEY_ItemTop);
                itemCreateItem.width = jSONObject.optInt(KEY_ItemWidth, 0);
                itemCreateItem.height = jSONObject.optInt(KEY_ItemHeight, 0);
                itemCreateItem.fitMode = ToFitMode(jSONObject.optString(KEY_FitMode));
                itemCreateItem.xAlign = (float) jSONObject.optDouble(KEY_XAlign, 0.0d);
                itemCreateItem.yAlign = (float) jSONObject.optDouble(KEY_YAlign, 0.0d);
                itemCreateItem.isShow = jSONObject.optBoolean(KEY_IsShow, true);
                itemCreateItem.renderFlags = jSONObject.optInt(KEY_RenderFlags, -1);
                itemCreateItem.opacity = (float) jSONObject.optDouble("Opacity", 1.0d);
                return itemCreateItem;
            } catch (Exception e7) {
                e = e7;
                LivePusherLog.e("SceneSource", "An exception occurred while SceneSource#loadItemConfig() running,error: ", e);
                if (iVideoSourceDeserializeFilter == null) {
                    return null;
                }
                iVideoSourceDeserializeFilter.destroy();
                return null;
            }
        } catch (Exception e8) {
            e = e8;
            iVideoSourceDeserializeFilter = null;
        }
    }

    private void renderItem(Item item, int i7, ItemRenderMode itemRenderMode) throws Throwable {
        IVideoSource iVideoSource;
        BGLMatrix bGLMatrixVTransToFitRect;
        boolean z6;
        if (item == null || (iVideoSource = item.source) == null || !item.isShow || item.opacity < 0.00390625f || (item.renderFlags & i7) == 0) {
            return;
        }
        try {
            int width = iVideoSource.getWidth();
            int height = item.source.getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            float f7 = width;
            float f8 = height;
            float f9 = (1.0f * f7) / f8;
            Integer num = item.fitMode;
            int iIntValue = num != null ? num.intValue() : item.source.preferFitMode();
            if (iIntValue != 1) {
                bGLMatrixVTransToFitRect = BGLUtil.vTransToFitRect(this.mWidth, this.mHeight, Float.valueOf(f9), item.posX, item.posY, item.width, item.height, iIntValue, item.xAlign, item.yAlign);
            } else {
                float f10 = item.scale;
                int i8 = (int) (f7 * f10);
                int i9 = (int) (f8 * f10);
                if (i8 <= 0 || i9 <= 0) {
                    return;
                } else {
                    bGLMatrixVTransToFitRect = BGLUtil.vTransToFitRect(this.mWidth, this.mHeight, Float.valueOf(f9), item.posX, item.posY, i8, i9, 2);
                }
            }
            BGLTransState transState = this.mCtx.getEglContext().getTransState();
            transState.pushScissor(BGLUtil.rectToScissor(this.mWidth, this.mHeight, item.posX, item.posY, item.width, item.height));
            transState.pushVPreTrans(bGLMatrixVTransToFitRect);
            transState.pushAlphaRatio(item.opacity);
            try {
            } catch (Throwable th) {
                th = th;
                z6 = false;
            }
            try {
                if (itemRenderMode != ItemRenderMode.RENDER_CONTENT) {
                    if (itemRenderMode == ItemRenderMode.RENDER_BORDER) {
                        this.mCtx.getEglContext().getInputTexDrawer(Shaders.Transfer.SRGB, Shaders.Primaries.SRGB).drawRect(8.0f, 1.0f, 0.0f, 0.0f, 1.0f);
                    }
                    transState.popAlphaRatio();
                    transState.popVPreTrans();
                    bGLMatrixVTransToFitRect.release();
                }
                item.source.render(i7);
                transState.popScissor();
                transState.popAlphaRatio();
                transState.popVPreTrans();
                bGLMatrixVTransToFitRect.release();
            } catch (Throwable th2) {
                th = th2;
                z6 = true;
                if (z6) {
                    transState.popScissor();
                }
                transState.popAlphaRatio();
                transState.popVPreTrans();
                throw th;
            }
        } catch (BGLException e7) {
            LivePusherLog.e("SceneSource", "An exception occurred while SceneSource#renderItem() running,error: ", e7);
        }
    }

    private void renderItems(int i7) throws Throwable {
        for (Item item : this.mSceneItems) {
            if (item != null) {
                renderItem(item, i7, ItemRenderMode.RENDER_CONTENT);
            }
        }
    }

    private JSONObject saveItemConfig(Item item) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_ItemScale, item.scale);
            jSONObject.put(KEY_ItemLeft, item.posX);
            jSONObject.put(KEY_ItemTop, item.posY);
            jSONObject.put(KEY_ItemWidth, item.width);
            jSONObject.put(KEY_ItemHeight, item.height);
            Integer num = item.fitMode;
            if (num != null) {
                jSONObject.put(KEY_FitMode, FromFitMode(num));
            }
            jSONObject.put(KEY_XAlign, item.xAlign);
            jSONObject.put(KEY_YAlign, item.yAlign);
            jSONObject.put("Opacity", item.opacity);
            jSONObject.put(KEY_IsShow, item.isShow);
            jSONObject.put(KEY_RenderFlags, item.renderFlags);
            jSONObject.put(KEY_FilterData, FilterFactory.inst().serializeFilter(item.source));
        } catch (Exception e7) {
            LivePusherLog.e("SceneSource", "An exception occurred while SceneSource#saveItemConfig() running,error: ", e7);
        }
        return jSONObject;
    }

    public void RenderItemBorder(Item item) throws Throwable {
        renderItem(item, -1, ItemRenderMode.RENDER_BORDER);
    }

    public Item createItem(IVideoSource iVideoSource) {
        Item item = new Item(this);
        item.source = iVideoSource;
        item.isShow = true;
        item.posX = 0;
        item.posY = 0;
        item.scale = 1.0f;
        item.fitMode = null;
        item.opacity = 1.0f;
        item.renderFlags = -1;
        return item;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void destroy() {
        IVideoSource iVideoSource;
        LivePusherLog.i("SceneSource", "source name: " + getName() + ", destroy!!", null);
        ArrayList<Item> arrayList = this.mSceneItems;
        if (arrayList == null) {
            return;
        }
        for (Item item : arrayList) {
            if (item != null && (iVideoSource = item.source) != null) {
                iVideoSource.destroy();
            }
        }
        this.mSceneItems = new ArrayList<>();
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public IVideoSource findInnerFilter(String str) {
        IVideoSource iVideoSourceFindInnerFilter = super.findInnerFilter(str);
        IVideoSource iVideoSourceFindInnerFilter2 = iVideoSourceFindInnerFilter;
        if (iVideoSourceFindInnerFilter == null) {
            Iterator<Item> it = this.mSceneItems.iterator();
            while (true) {
                iVideoSourceFindInnerFilter2 = iVideoSourceFindInnerFilter;
                if (!it.hasNext()) {
                    break;
                }
                IVideoSource iVideoSource = it.next().source;
                if (iVideoSource != null) {
                    iVideoSourceFindInnerFilter2 = iVideoSource.findInnerFilter(str);
                    iVideoSourceFindInnerFilter = iVideoSourceFindInnerFilter2;
                    if (iVideoSourceFindInnerFilter2 != null) {
                        break;
                    }
                }
            }
        }
        return iVideoSourceFindInnerFilter2;
    }

    public Item findInnerItem(String str) {
        Item itemFindInnerItem;
        for (Item item : this.mSceneItems) {
            IVideoSource iVideoSource = item.source;
            if (iVideoSource != null) {
                if (iVideoSource.getName().equals(str)) {
                    return item;
                }
                if (item.source.getID().equals("SceneSource") && (itemFindInnerItem = ((SceneSource) item.source).findInnerItem(str)) != null) {
                    return itemFindInnerItem;
                }
            }
        }
        return null;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getHeight() {
        return this.mHeight;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public String getID() {
        return "SceneSource";
    }

    public Item getSceneItemAtPos(Item item, int i7, int i8) {
        int size = this.mSceneItems.size();
        if (item != null) {
            int i9 = 0;
            while (true) {
                size = i9;
                if (i9 >= this.mSceneItems.size()) {
                    break;
                }
                if (this.mSceneItems.get(i9) == item) {
                    size = i9;
                    break;
                }
                i9++;
            }
        }
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            Item item2 = this.mSceneItems.get(size);
            if (item2 != null && item2.isShow && item2.isPointInRect(i7, i8)) {
                return item2;
            }
        }
    }

    public ArrayList<Item> getSceneItems() {
        return this.mSceneItems;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public int getWidth() {
        return this.mWidth;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public void loadConfig(JSONObject jSONObject) {
        destroy();
        try {
            this.mWidth = jSONObject.getInt(KEY_SceneWidth);
            this.mHeight = jSONObject.getInt(KEY_SceneHeight);
            JSONArray jSONArray = jSONObject.getJSONArray(KEY_SceneItems);
            int length = jSONArray.length();
            Item[] itemArr = new Item[length];
            for (int i7 = 0; i7 < length; i7++) {
                itemArr[i7] = loadItemConfig(jSONArray.getJSONObject(i7));
            }
            setSceneItems(itemArr);
        } catch (Exception e7) {
            LivePusherLog.e("SceneSource", "loadConfig, Exception:", e7);
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render() throws BGLException {
        return render(-1);
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public boolean render(int i7) throws Throwable {
        renderItems(i7);
        return true;
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase, com.bilibili.live.streaming.filter.IVideoSource
    public JSONObject saveConfig() {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator<Item> it = this.mSceneItems.iterator();
            while (it.hasNext()) {
                jSONArray.put(saveItemConfig(it.next()));
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(KEY_SceneWidth, this.mWidth);
            jSONObject.put(KEY_SceneHeight, this.mHeight);
            jSONObject.put(KEY_SceneItems, jSONArray);
            return jSONObject;
        } catch (JSONException e7) {
            LivePusherLog.e("SceneSource", "saveConfig, JSONException:", e7);
            return new JSONObject();
        }
    }

    @Deprecated
    public void setSceneItems(Item[] itemArr) {
        ArrayList<Item> arrayList = new ArrayList<>();
        this.mSceneItems = arrayList;
        Collections.addAll(arrayList, itemArr);
    }

    public void setSceneSize(int i7, int i8) {
        this.mWidth = i7;
        this.mHeight = i8;
    }

    @Override // com.bilibili.live.streaming.filter.IVideoSource
    public void tick(long j7) throws BGLException {
        IVideoSource iVideoSource;
        for (Item item : this.mSceneItems) {
            if (item != null && (iVideoSource = item.source) != null) {
                try {
                    iVideoSource.tick(j7);
                } catch (BGLException e7) {
                    LivePusherLog.e("SceneSource", "An exception occurred while SceneSource#tick() running,sceneName is:" + item.getClass().getName() + " BGLException: ", e7);
                }
            }
        }
    }

    @Override // com.bilibili.live.streaming.filter.FilterBase
    public String toSourceString() {
        StringBuilder sb = new StringBuilder(" \n");
        ArrayList<Item> sceneItems = getSceneItems();
        sb.append(super.toSourceString());
        sb.append("\n[\n");
        if (sceneItems != null && sceneItems.size() > 0) {
            for (Item item : sceneItems) {
                sb.append("  ");
                sb.append(item.toItemString());
                sb.append("\n");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
