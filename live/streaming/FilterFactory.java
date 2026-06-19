package com.bilibili.live.streaming;

import com.bilibili.live.streaming.filter.IVideoSource;
import com.bilibili.live.streaming.log.LivePusherLog;
import com.bilibili.live.streaming.source.Camera2CaptureSource;
import com.bilibili.live.streaming.source.ColorSource;
import com.bilibili.live.streaming.source.CommonSource;
import com.bilibili.live.streaming.source.CustomTexSource;
import com.bilibili.live.streaming.source.GifSource;
import com.bilibili.live.streaming.source.ImageSource;
import com.bilibili.live.streaming.source.ScreenCaptureSource;
import com.bilibili.live.streaming.source.SlideSource;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.live.streaming.source.VideoFileSource;
import com.bilibili.live.streaming.sources.SceneSource;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/FilterFactory.class */
public class FilterFactory implements IFilterFactory {
    public static final String KEY_FilterConfig = "FilterConfig";
    public static final String KEY_FilterID = "FilterID";
    public static final String KEY_FilterName = "FilterName";
    static final String TAG = "FilterFactory";
    private static FilterFactory mInstance;
    private HashSet<IFilterFactory> factories;

    private FilterFactory() {
        HashSet<IFilterFactory> hashSet = new HashSet<>();
        this.factories = hashSet;
        hashSet.add(new IFilterFactory(this) { // from class: com.bilibili.live.streaming.FilterFactory.1
            final FilterFactory this$0;

            {
                this.this$0 = this;
            }

            @Override // com.bilibili.live.streaming.IFilterFactory
            public IVideoSource create(String str) {
                str.getClass();
                switch (str) {
                    case "color_source":
                        return new ColorSource();
                    case "ScreenCaptureSource":
                        return new ScreenCaptureSource();
                    case "CameraCaptureSource":
                        return new Camera2CaptureSource();
                    case "ImageSource":
                        return new ImageSource();
                    case "TextSource":
                        return new TextSource();
                    case "CustomTexSource":
                        return new CustomTexSource();
                    case "CommonSource":
                        return new CommonSource();
                    case "SlideSource":
                        return new SlideSource();
                    case "SceneSource":
                        return new SceneSource();
                    case "GifSource":
                        return new GifSource();
                    case "VideoFileSource":
                        return new VideoFileSource();
                    default:
                        return null;
                }
            }
        });
    }

    public static FilterFactory inst() {
        if (mInstance == null) {
            mInstance = new FilterFactory();
        }
        return mInstance;
    }

    public static Boolean registerFilterFactory(IFilterFactory iFilterFactory) {
        if (iFilterFactory == null) {
            return Boolean.FALSE;
        }
        inst().factories.add(iFilterFactory);
        return Boolean.TRUE;
    }

    public static void removeFilterFactory(IFilterFactory iFilterFactory) {
        inst().factories.remove(iFilterFactory);
    }

    @Override // com.bilibili.live.streaming.IFilterFactory
    public IVideoSource create(String str) {
        Iterator<IFilterFactory> it = this.factories.iterator();
        while (it.hasNext()) {
            IVideoSource iVideoSourceCreate = it.next().create(str);
            if (iVideoSourceCreate != null) {
                return iVideoSourceCreate;
            }
        }
        LivePusherLog.e(TAG, "createEGLContext: unrecognized filter id", null);
        return null;
    }

    public IVideoSource deserializeFilter(AVContext aVContext, JSONObject jSONObject) {
        IVideoSource iVideoSourceCreate;
        try {
            String strOptString = jSONObject.optString(KEY_FilterID);
            String strOptString2 = jSONObject.optString(KEY_FilterName);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(KEY_FilterConfig);
            iVideoSourceCreate = create(strOptString);
            if (iVideoSourceCreate != null) {
                try {
                    iVideoSourceCreate.setName(strOptString2);
                    iVideoSourceCreate.init(aVContext);
                    iVideoSourceCreate.loadConfig(jSONObjectOptJSONObject);
                } catch (Exception e7) {
                    e = e7;
                    LivePusherLog.e(TAG, "deserializeFilter: ", e);
                    if (iVideoSourceCreate == null) {
                        return null;
                    }
                    iVideoSourceCreate.destroy();
                    return null;
                }
            }
            return iVideoSourceCreate;
        } catch (Exception e8) {
            e = e8;
            iVideoSourceCreate = null;
        }
    }

    public JSONObject serializeFilter(IVideoSource iVideoSource) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_FilterID, iVideoSource.getID());
            jSONObject.put(KEY_FilterName, iVideoSource.getName());
            jSONObject.put(KEY_FilterConfig, iVideoSource.saveConfig());
            return jSONObject;
        } catch (Exception e7) {
            LivePusherLog.e(TAG, "serializeFilter: ", e7);
            return null;
        }
    }
}
