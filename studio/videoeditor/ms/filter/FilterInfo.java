package com.bilibili.studio.videoeditor.ms.filter;

import androidx.annotation.Keep;
import com.bilibili.pegasus.utils.C5759c;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/ms/filter/FilterInfo.class */
@Keep
public class FilterInfo implements Serializable {
    public static final float DEFAULT_FILTER_INTENSITY = 1.0f;
    public static final String FILTER_ID_CARTOON = "Cartoon";
    public static final String FILTER_ID_LUT = "Lut";
    public static final String FILTER_ID_SKETCH = "Sketch";
    public static final String FX_BUILD_IN_CARTOON = "Cartoon";
    public static final String FX_CARTOON_VALUE_GRAY_SCALE = "Grayscale";
    public static final String FX_CARTOON_VALUE_STROKE_ONLY = "Stroke Only";
    public static final int ID_NO_FILTER = -1;
    public int filterPackageDownloadStatus;
    public String filterPackageDownloadUrl;
    public int filterPackageStatus;
    public String filter_id;
    public String filter_lic;
    public String filter_lut_path;
    public String filter_name;
    public String filter_path;
    public long inPoint;
    private int mId;
    public long outPoint;
    public float filter_intensity = 1.0f;
    public int progress = 100;
    private String mCategory = "";
    private int mFilterType = -1;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public FilterInfo m10477clone() {
        FilterInfo filterInfo = new FilterInfo();
        filterInfo.update(this);
        return filterInfo;
    }

    public String getCategory() {
        return this.mCategory;
    }

    public int getFilterType() {
        return this.mFilterType;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isFilterPackageAvailable() {
        return C5759c.a(this.filterPackageStatus);
    }

    public boolean isFilterPackageDownloading() {
        return this.filterPackageDownloadStatus == 3;
    }

    public void setCategory(String str) {
        this.mCategory = str;
    }

    public void setFilterType(int i7) {
        this.mFilterType = i7;
    }

    public void setId(int i7) {
        this.mId = i7;
    }

    public void update(FilterInfo filterInfo) {
        this.filter_id = filterInfo.filter_id;
        this.filter_path = filterInfo.filter_path;
        this.filter_lut_path = filterInfo.filter_lut_path;
        this.filter_lic = filterInfo.filter_lic;
        this.filter_intensity = filterInfo.filter_intensity;
        this.filter_name = filterInfo.filter_name;
        this.inPoint = filterInfo.inPoint;
        this.outPoint = filterInfo.outPoint;
        this.progress = filterInfo.progress;
        setCategory(filterInfo.getCategory());
        setId(filterInfo.getId());
    }
}
