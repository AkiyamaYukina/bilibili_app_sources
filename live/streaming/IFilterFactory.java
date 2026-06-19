package com.bilibili.live.streaming;

import com.bilibili.live.streaming.filter.IVideoSource;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/IFilterFactory.class */
public interface IFilterFactory {
    IVideoSource create(String str);
}
