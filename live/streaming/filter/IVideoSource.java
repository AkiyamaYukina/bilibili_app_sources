package com.bilibili.live.streaming.filter;

import com.bilibili.live.streaming.AVContext;
import com.bilibili.live.streaming.gl.BGLException;
import org.json.JSONObject;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/filter/IVideoSource.class */
public interface IVideoSource {
    void destroy();

    IVideoSource findInnerFilter(String str);

    int getHeight();

    String getID();

    String getName();

    int getWidth();

    void init(AVContext aVContext) throws BGLException;

    void loadConfig(JSONObject jSONObject) throws BGLException;

    int preferFitMode();

    boolean render() throws BGLException;

    boolean render(int i7) throws BGLException;

    JSONObject saveConfig();

    void setName(String str);

    void tick(long j7) throws BGLException;
}
