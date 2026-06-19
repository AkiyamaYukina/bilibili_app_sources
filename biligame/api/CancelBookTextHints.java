package com.bilibili.biligame.api;

import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/CancelBookTextHints.class */
public class CancelBookTextHints {

    @JSONField(name = "cancel_book_main_text_cn")
    public String cnTitle = null;

    @JSONField(name = "cancel_book_sub_text_cn")
    public String cnContent = null;

    @JSONField(name = "cancel_book_main_text_tc")
    public String tcTitle = null;

    @JSONField(name = "cancel_book_sub_text_tc")
    public String tcContent = null;
}
